package com.exasol.spark.common;

import static com.exasol.sql.expression.ExpressionTerm.*;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.spark.sql.sources.*;

import com.exasol.errorreporting.ExaError;
import com.exasol.sql.expression.BooleanExpression;
import com.exasol.sql.expression.BooleanTerm;
import com.exasol.sql.expression.ValueExpression;
import com.exasol.sql.expression.literal.BigDecimalLiteral;
import com.exasol.sql.expression.literal.StringLiteral;

/**
 * A class that converts Spark {@link Filter} operations into Exasol {@link ValueExpression} clauses.
 */
public final class FilterConverter {
    private static final Character LIKE_FILTER_ESCAPE_CHAR = '\\';
    private static final Map<Class<? extends Filter>, OperationType> FILTERS = getMappings();

    /**
     * Converts an array of Spark {@link Filter} conditions into Exasol SQL expression.
     *
     * The function returns {@link Optional#empty()} if any of the filters cannot be converted into Exasol where clause.
     * Then, the filtering will be performed on the Spark side after getting the data without pushed filters.
     *
     * @param filters array of filters
     * @return optional {@link ValueExpression}
     */
    public Optional<BooleanExpression> convert(final Filter[] filters) {
        if (filters == null || filters.length == 0) {
            return Optional.empty();
        }
        final List<BooleanExpression> expressions = new ArrayList<>();
        for (final Filter filter : filters) {
            final BooleanExpression convertedResult = convertFilter(filter);
            if (convertedResult == null) {
                return Optional.empty();
            }
            expressions.add(convertedResult);
        }
        return Optional.of(BooleanTerm.and(expressions.toArray(new BooleanExpression[0])));
    }

    /**
     * Checks if {@link Filter} filter can be converted to an Exasol expression.
     *
     * @param filter filter to check
     * @return {@code true} if filter can be converted; {@code false} otherwise
     */
    public boolean isFilterSupported(final Filter filter) {
        return convertFilter(filter) != null;
    }

    private BooleanExpression convertFilter(final Filter filter) {
        final OperationType operationType = FILTERS.getOrDefault(filter.getClass(), OperationType.UNKNOWN);
        switch (operationType) {
        case EQUAL_TO:
            final EqualTo equalTo = (EqualTo) filter;
            return BooleanTerm.eq(column(equalTo.attribute()), getLiteralValue(equalTo.value()));

        case GREATER_THAN:
            final GreaterThan greaterThan = (GreaterThan) filter;
            return BooleanTerm.gt(column(greaterThan.attribute()), getLiteralValue(greaterThan.value()));

        case GREATER_THAN_OR_EQUAL:
            final GreaterThanOrEqual greaterThanOrEqual = (GreaterThanOrEqual) filter;
            return BooleanTerm.ge(column(greaterThanOrEqual.attribute()), getLiteralValue(greaterThanOrEqual.value()));

        case LESS_THAN:
            final LessThan lessThan = (LessThan) filter;
            return BooleanTerm.lt(column(lessThan.attribute()), getLiteralValue(lessThan.value()));

        case LESS_THAN_OR_EQUAL:
            final LessThanOrEqual lessThanOrEqual = (LessThanOrEqual) filter;
            return BooleanTerm.le(column(lessThanOrEqual.attribute()), getLiteralValue(lessThanOrEqual.value()));

        case STRING_STARTS_WITH:
            final StringStartsWith startsWith = (StringStartsWith) filter;
            return BooleanTerm.like(column(startsWith.attribute()),
                    stringLiteral(escapeLikeLiteralValue(startsWith.value()) + "%"), LIKE_FILTER_ESCAPE_CHAR);

        case STRING_CONTAINS:
            final StringContains contains = (StringContains) filter;
            return BooleanTerm.like(column(contains.attribute()),
                    stringLiteral("%" + escapeLikeLiteralValue(contains.value()) + "%"), LIKE_FILTER_ESCAPE_CHAR);

        case STRING_ENDS_WITH:
            final StringEndsWith endsWith = (StringEndsWith) filter;
            return BooleanTerm.like(column(endsWith.attribute()),
                    stringLiteral("%" + escapeLikeLiteralValue(endsWith.value())), LIKE_FILTER_ESCAPE_CHAR);

        case IS_NULL:
            return BooleanTerm.isNull(column(((IsNull) filter).attribute()));

        case IS_NOT_NULL:
            return BooleanTerm.isNotNull(column(((IsNotNull) filter).attribute()));

        case IN:
            final In in = (In) filter;
            return BooleanTerm.in(column(in.attribute()), getMappedLiteralValues(in.values()));

        case NOT:
            final Not not = (Not) filter;
            if (not.child() instanceof In) {
                final In notIn = (In) not.child();
                return BooleanTerm.notIn(column(notIn.attribute()), getMappedLiteralValues(notIn.values()));
            } else if (not.child() instanceof EqualTo) {
                final EqualTo notEqualTo = (EqualTo) not.child();
                return BooleanTerm.compare(column(notEqualTo.attribute()), "<>", getLiteralValue(notEqualTo.value()));
            }
            final BooleanExpression notResult = convertFilter(not.child());
            return notResult == null ? null : BooleanTerm.not(notResult);

        case OR:
            final Or or = (Or) filter;
            final BooleanExpression orLeft = convertFilter(or.left());
            final BooleanExpression orRight = convertFilter(or.right());
            if (orLeft != null && orRight != null) {
                return BooleanTerm.or(orLeft, orRight);
            } else {
                return null;
            }

        case AND:
            final And and = (And) filter;
            BooleanExpression andLeft = convertFilter(and.left());
            BooleanExpression andRight = convertFilter(and.right());
            if (andLeft != null && andRight != null) {
                return BooleanTerm.and(andLeft, andRight);
            } else {
                return null;
            }

        default:
            return null;
        }
    }

    private ValueExpression[] getMappedLiteralValues(final Object[] values) {
        return Arrays.stream(values).map(this::getLiteralValue).toArray(ValueExpression[]::new);
    }

    private ValueExpression getLiteralValue(final Object value) {
        if (Objects.isNull(value)) {
            throw new ExasolValidationException(
                    ExaError.messageBuilder("E-SCCJ-11").message("Value for filter condition is null.")
                            .mitigation("Please check that filter conditions are correct.").toString());
        }
        if (value instanceof Boolean) {
            return booleanLiteral((Boolean) value);
        } else if (value instanceof String) {
            return getEscapedStringLiteral((String) value);
        } else if (value instanceof Integer) {
            return integerLiteral((Integer) value);
        } else if (value instanceof Long) {
            return longLiteral((Long) value);
        } else if (value instanceof Float) {
            return floatLiteral((Float) value);
        } else if (value instanceof Double) {
            return doubleLiteral((Double) value);
        } else if (value instanceof BigDecimal) {
            return BigDecimalLiteral.of((BigDecimal) value);
        } else {
            return getEscapedStringLiteral(value.toString());
        }
    }

    private StringLiteral getEscapedStringLiteral(final String value) {
        return stringLiteral(value.replace("'", "''"));
    }

    private String escapeLikeLiteralValue(final String value) {
        return value //
                .replace("'", "''") //
                .replace("" + LIKE_FILTER_ESCAPE_CHAR, LIKE_FILTER_ESCAPE_CHAR + "" + LIKE_FILTER_ESCAPE_CHAR) //
                .replace("%", LIKE_FILTER_ESCAPE_CHAR + "%") //
                .replace("_", LIKE_FILTER_ESCAPE_CHAR + "_");
    }

    private enum OperationType {
        UNKNOWN, //
        EQUAL_TO, //
        GREATER_THAN, //
        GREATER_THAN_OR_EQUAL, //
        LESS_THAN, //
        LESS_THAN_OR_EQUAL, //
        STRING_STARTS_WITH, //
        STRING_CONTAINS, //
        STRING_ENDS_WITH, //
        IS_NULL, //
        IS_NOT_NULL, //
        IN, //
        NOT, //
        OR, //
        AND,
    }

    private static Map<Class<? extends Filter>, OperationType> getMappings() {
        final Map<Class<? extends Filter>, OperationType> map = Stream.of(//
                getEntry(EqualTo.class, OperationType.EQUAL_TO), //
                getEntry(GreaterThan.class, OperationType.GREATER_THAN), //
                getEntry(GreaterThanOrEqual.class, OperationType.GREATER_THAN_OR_EQUAL), //
                getEntry(LessThan.class, OperationType.LESS_THAN), //
                getEntry(LessThanOrEqual.class, OperationType.LESS_THAN_OR_EQUAL), //
                getEntry(IsNull.class, OperationType.IS_NULL), //
                getEntry(IsNotNull.class, OperationType.IS_NOT_NULL), //
                getEntry(StringStartsWith.class, OperationType.STRING_STARTS_WITH), //
                getEntry(StringContains.class, OperationType.STRING_CONTAINS), //
                getEntry(StringEndsWith.class, OperationType.STRING_ENDS_WITH), //
                getEntry(In.class, OperationType.IN), //
                getEntry(And.class, OperationType.AND), //
                getEntry(Or.class, OperationType.OR), //
                getEntry(Not.class, OperationType.NOT) //
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return Collections.unmodifiableMap(map);
    }

    private static AbstractMap.SimpleImmutableEntry<Class<? extends Filter>, OperationType> getEntry(
            final Class<? extends Filter> clazz, final OperationType operationType) {
        return new AbstractMap.SimpleImmutableEntry<>(clazz, operationType);
    }

}
