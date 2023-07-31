package com.exasol.spark.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.exasol.sql.dql.select.Select;
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

    /**
     * Returns select SQL statement given list of column names and predicate.
     *
     * @param table     table to query
     * @param columns   list of column names to push column projection
     * @param predicate boolean predicate to push as a where clause
     * @return select statement string
     */
    // public String getSelectStatement(final String table, final List<String> columns,
    //         final Optional<BooleanExpression> predicate) {
    //     final Select select = StatementFactory.getInstance().select();
    //     select.from().table(PLACEHOLDER_TABLE);
    //     addColumns(select, columns);
    //     addPredicate(select, predicate);
    //     final String rendered = renderSelect(select);
    //     return rendered.replace("\"" + PLACEHOLDER_TABLE + "\"", table);
    // }

    private void addColumns() {
        if (this.columns.isEmpty()) {
            this.select.all();
        } else {
            this.columns.forEach(this.select::field);
        }
    }

    private void addPredicate(final Select select, final Optional<BooleanExpression> predicate) {
        if (predicate.isPresent()) {
            select.where(predicate.get());
        }
    }


}
