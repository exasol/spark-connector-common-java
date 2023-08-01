package com.exasol.spark.common;

/**
 * A factory class for {@link StatementGenerator} instances.
 */
public final class StatementGeneratorFactory {

    /**
     * Creates a {@link SelectStatementGenerator} instance.
     *
     * @param tableName name of the table from which to select data
     * @return new instance of a {@link SelectStatementGenerator}
     */
    public static SelectStatementGenerator selectFrom(final String tableName) {
        return new SelectStatementGenerator(tableName);
    }

    /**
     * Creates a {@link CountStarStatementGenerator} instance.
     *
     * @param tableName name of the table from which to count star data
     * @return new instance of a {@link CountStarStatementGenerator}
     */
    public static CountStarStatementGenerator countStarFrom(final String tableName) {
        return new CountStarStatementGenerator(tableName);
    }

}
