package com.exasol.spark.common;

public final class StatementGeneratorFactory {
    private static StatementGeneratorFactory instance;

    private StatementGeneratorFactory() {
        // prevent instantiation outside singleton
    }

    /**
     * Gets an instance of a {@link StatementGeneratorFactory}.
     *
     * @return existing instance otherwise create one.
     */
    public static synchronized StatementGeneratorFactory getInstance() {
        if (instance == null) {
            instance = new StatementGeneratorFactory();
        }
        return instance;
    }

    /**
     * Creates a {@link SelectStatementGenerator} instance.
     *
     * @param tableName name of the table from which to select data
     * @return new instance of a {@link SelectStatementGenerator}
     */
    public SelectStatementGenerator selectFrom(final String tableName) {
        return new SelectStatementGenerator(tableName);
    }

    /**
     * Creates a {@link CountStarStatementGenerator} instance.
     *
     * @param tableName name of the table from which to count star data
     * @return new instance of a {@link CountStarStatementGenerator}
     */
    public CountStarStatementGenerator countStarFrom(final String tableName) {
        return new CountStarStatementGenerator(tableName);
    }

}
