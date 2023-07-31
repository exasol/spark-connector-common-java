package com.exasol.spark.common;

import java.util.ArrayList;
import java.util.List;

import com.exasol.sql.expression.BooleanExpression;

/**
 * A class that generates an Exasol {@code SELECT} statement using selected columns and where clauses.
 */
public final class SelectStatementGenerator extends AbstractSelectStatementGenerator implements StatementGenerator {
    private final List<String> columns;

    /**
     * Creates an instance of {@link SelectStatementGenerator}.
     *
     * @param tableName table name to select from.
     */
    public SelectStatementGenerator(final String tableName) {
        super(tableName);
        this.columns = new ArrayList<>();
    }

    /**
     * Adds one or more column names.
     *
     * @param columns column name
     * @return {@code this} instance for fluent programming
     */
    public synchronized SelectStatementGenerator columns(final String... columns) {
        for (final String column : columns) {
            this.columns.add(column);
        }
        return this;
    }

    /**
     * Adds where clause predicate.
     *
     * @param predicate boolean expression that defines where clause
     * @return {@code this} for fluent programming
     */
    public synchronized SelectStatementGenerator where(final BooleanExpression predicate) {
        if (predicate != null) {
            this.select.where(predicate);
        }
        return this;
    }

    @Override
    public String render() {
        addColumns();
        return renderSelect();
    }

    private void addColumns() {
        if (this.columns.isEmpty()) {
            this.select.all();
        } else {
            this.columns.forEach(this.select::field);
        }
    }

}
