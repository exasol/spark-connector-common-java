package com.exasol.spark.common;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.stream.Stream;

import org.apache.spark.sql.sources.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import com.exasol.sql.expression.BooleanExpression;
import com.exasol.sql.expression.ValueExpression;
import com.exasol.sql.expression.rendering.ValueExpressionRenderer;
import com.exasol.sql.rendering.StringRendererConfig;

class FilterConverterTest {
    private final FilterConverter filterConverter = new FilterConverter();

    @Test
    void testEmptyFilters() {
        assertThat(render(), equalTo(""));
    }

    @Test
    void testNullAndEmptyFilters() {
        assertAll(() -> assertThat(filterConverter.convert(null), equalTo(Optional.empty())),
                () -> assertThat(filterConverter.convert(new Filter[0]), equalTo(Optional.empty())));
    }

    @Test
    void testEmptyOptionalIfUnknownFilter() {
        assertThat(filterConverter.convert(new Filter[] { new EqualNullSafe("c1", "nullValue") }),
                equalTo(Optional.empty()));
    }

    private static final Stream<Arguments> unknownFilters() {
        return Stream.of(//
                Arguments.of(
                        (Object) new Filter[] { new And(new EqualNullSafe("c1", "nullValue"), new EqualTo("c2", 1)) }), //
                Arguments.of((Object) new Filter[] { new And(new LessThan("c2", 1), new EqualNullSafe("c1", "null")) }), //
                Arguments.of((Object) new Filter[] { new Or(new EqualNullSafe("c1", "nv"), new EqualTo("c2", 1)) }), //
                Arguments.of(
                        (Object) new Filter[] { new Or(new GreaterThan("c2", 1), new EqualNullSafe("c1", "null")) }), //
                Arguments.of((Object) new Filter[] { new Not(new EqualNullSafe("c1", "null")) }), //
                Arguments.of((Object) new Filter[] { new LessThan("c2", "a"), new EqualNullSafe("c1", "nullValue") }) //
        );
    }

    @ParameterizedTest
    @MethodSource("unknownFilters")
    void testEmptyOptionalIfOneOfFiltersUnknown(final Filter[] filters) {
        assertThat(filterConverter.convert(filters), equalTo(Optional.empty()));
    }

    private static final Stream<Arguments> nullLiterals() {
        return Stream.of(//
                Arguments.of(new EqualTo("c1", null)), //
                Arguments.of(new LessThan("c1", null)), //
                Arguments.of(new LessThanOrEqual("c1", null)), //
                Arguments.of(new GreaterThan("c1", null)), //
                Arguments.of(new GreaterThanOrEqual("c1", null)) //
        );
    }

    @ParameterizedTest
    @MethodSource("nullLiterals")
    void testThrowsOnNullLiterals(final Filter filter) {
        final ExasolValidationException exception = assertThrows(ExasolValidationException.class,
                () -> filterConverter.convert(new Filter[] { filter }));
        assertThat(exception.getMessage(), startsWith("E-SCCJ-11"));
    }

    @ParameterizedTest
    @CsvSource({ //
            "a,                      (\"c1\" = 'a')", //
            "XYZ,                    (\"c1\" = 'XYZ')", //
            "\u00d6,                 (\"c1\" = 'Ö')", //
            "He said 'good morning', (\"c1\" = 'He said ''good morning''')" //
    })
    void testEqualToStringValue(final String value, final String expected) {
        assertThat(render(new EqualTo("c1", value)), equalTo(expected));
    }

    @Test
    void testEqualToBooleanValue() {
        assertAll(() -> assertThat(render(new EqualTo("c1", false)), equalTo("(\"c1\" = FALSE)")),
                () -> assertThat(render(new EqualTo("c1", true)), equalTo("(\"c1\" = TRUE)")));
    }

    @Test
    void testEqualToIntegerValue() {
        assertThat(render(new EqualTo("c1", 1337)), equalTo("(\"c1\" = 1337)"));
    }

    @Test
    void testEqualToDoubleValue() {
        assertThat(render(new EqualTo("c1", 3.14)), equalTo("(\"c1\" = 3.14)"));
    }

    @Test
    void testEqualToDateValue() {
        assertThat(render(new EqualTo("c1", "2022-05-30")), equalTo("(\"c1\" = '2022-05-30')"));
    }

    @Test
    void testEqualToDateTimeValue() {
        assertThat(render(new EqualTo("c1", "2022-05-30 10:10:01.111")),
                equalTo("(\"c1\" = '2022-05-30 10:10:01.111')"));
    }

    @Test
    void testNotEqualTo() {
        assertThat(render(new Not(new EqualTo("c1", 2022))), equalTo("(\"c1\" <> 2022)"));
    }

    @Test
    void testGreaterThan() {
        assertThat(render(new GreaterThan("c1", 2)), equalTo("(\"c1\" > 2)"));
    }

    @Test
    void testGreaterThanOrEqual() {
        assertThat(render(new GreaterThanOrEqual("c1", 2.71)), equalTo("(\"c1\" >= 2.71)"));
    }

    @Test
    void testLessThan() {
        assertThat(render(new LessThan("c1", "a")), equalTo("(\"c1\" < 'a')"));
    }

    @Test
    void testLessThanOrEqualTo() {
        assertThat(render(new LessThanOrEqual("c1", 13L)), equalTo("(\"c1\" <= 13)"));
    }

    @Test
    void testIsNull() {
        assertThat(render(new IsNull("c1")), equalTo("(\"c1\" IS NULL)"));
    }

    @Test
    void testIsNotNull() {
        assertThat(render(new IsNotNull("c1")), equalTo("(\"c1\" IS NOT NULL)"));
    }

    @Test
    void testStringStartsWith() {
        assertThat(render(new StringStartsWith("c1", "start")), equalTo("(\"c1\" LIKE 'start%' ESCAPE '\\')"));
    }

    @Test
    void testStringContains() {
        assertThat(render(new StringContains("c1", "contains")), equalTo("(\"c1\" LIKE '%contains%' ESCAPE '\\')"));
    }

    @Test
    void testStringEndsWith() {
        assertThat(render(new StringEndsWith("c1", "end")), equalTo("(\"c1\" LIKE '%end' ESCAPE '\\')"));
    }

    private static final Stream<Arguments> likeFilters() {
        return Stream.of(//
                Arguments.of(new StringContains("c", "cont_ai%ns"), "(\"c\" LIKE '%cont\\_ai\\%ns%' ESCAPE '\\')"), //
                Arguments.of(new StringStartsWith("c", "s\\t'ar't"), "(\"c\" LIKE 's\\\\t''ar''t%' ESCAPE '\\')") //
        );
    }

    @ParameterizedTest
    @MethodSource("likeFilters")
    void testStringLikeLiteralEscaped(final Filter filter, final String expectedLikePredicate) {
        assertThat(render(filter), equalTo(expectedLikePredicate));
    }

    @Test
    void testIn() {
        assertThat(render(new In("c1", new Object[] { 1, 2, 3 })), equalTo("(\"c1\" IN (1, 2, 3))"));
    }

    @Test
    void testNotIn() {
        assertThat(render(new Not(new In("c1", new Object[] { 1.2f, 3.0f }))), equalTo("(\"c1\" NOT IN (1.2, 3.0))"));
    }

    @Test
    void testNot() {
        assertThat(render(new Not(new StringEndsWith("c1", "e"))), equalTo("NOT((\"c1\" LIKE '%e' ESCAPE '\\'))"));
    }

    @Test
    void testAnd() {
        final Filter and = new And(new LessThan("c1", 1), new GreaterThanOrEqual("c2", "a"));
        assertThat(render(and), equalTo("((\"c1\" < 1) AND (\"c2\" >= 'a'))"));
    }

    @Test
    void testOr() {
        final Filter or = new Or(new GreaterThan("c1", 10), new Not(new EqualTo("c2", "abc")));
        assertThat(render(or), equalTo("((\"c1\" > 10) OR (\"c2\" <> 'abc'))"));
    }

    @Test
    void testMultiple() {
        final String rendered = render(//
                new Or(new EqualTo("c1", "abc"), new EqualTo("c2", 5)), //
                new And(new LessThan("c1", "xyz"), new GreaterThan("c3", 3.12)), //
                new EqualTo("c4", "tnt") //
        );
        final String expected = "((\"c1\" = 'abc') OR (\"c2\" = 5)) " //
                + "AND ((\"c1\" < 'xyz') AND (\"c3\" > 3.12)) " //
                + "AND (\"c4\" = 'tnt')";
        assertThat(rendered, equalTo(expected));
    }

    @Test
    void testBigDecimalLiteral() {
        assertThat(render(new LessThan("c1", BigDecimal.valueOf(1.1))), equalTo("(\"c1\" < 1.1)"));
    }

    @Test
    void testValueToStringLiteral() {
        assertThat(render(new EqualTo("c1", new Point(1, 3))), equalTo("(\"c1\" = 'Point{1,3}')"));
    }

    private static class Point {
        final int x;
        final int y;

        public Point(final int x, final int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" + this.x + "," + this.y + "}";
        }
    }

    private String render(final Filter... filters) {
        final Optional<BooleanExpression> andExpression = filterConverter.convert(filters);
        if (!andExpression.isPresent()) {
            return "";
        }
        final StringRendererConfig rendererConfig = StringRendererConfig.builder().quoteIdentifiers(true).build();
        final ValueExpressionRenderer renderer = new ValueExpressionRenderer(rendererConfig);
        ((ValueExpression) andExpression.get()).accept(renderer);
        return renderer.render();
    }

}
