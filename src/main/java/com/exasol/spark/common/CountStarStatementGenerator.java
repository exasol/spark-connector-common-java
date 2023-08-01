package com.exasol.spark.common;

import static com.exasol.sql.expression.ExpressionTerm.stringLiteral;
import static com.exasol.sql.expression.function.exasol.ExasolAnalyticAggregateFunctions.COUNT;

import com.exasol.sql.expression.BooleanExpression;

/**
 * A class that generates Exasol {@code COUNT(*)} statement including where clauses if available.
 */
public final class CountStarStatementGenerator extends AbstractSelectStatementGenerator implements StatementGenerator {

    /**
     * Creates an instance of {@link CountStarStatementGenerator}.
     *
     * @param tableName table name to select from.
     */
    public CountStarStatementGenerator(final String tableName) {
        super(tableName);
    }

    /**
     * Adds where clause predicate.
     *
     * @param predicate boolean expression that defines where clause
     * @return {@code this} for fluent programming
     */
    public synchronized CountStarStatementGenerator where(final BooleanExpression predicate) {
        if (predicate != null) {
            this.select.where(predicate);
        }
        return this;
    }

    @Override
    public String render() {
        this.select.function(COUNT, stringLiteral("*"));
        return renderSelect();
    }

}
