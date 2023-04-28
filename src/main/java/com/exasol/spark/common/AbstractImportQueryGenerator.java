package com.exasol.spark.common;

/**
 * An abstract generator for Exasol {@code IMPORT} queries that access {@code
 * CSV} files on intermediate cloud storage systems.
 *
 * @see <a href="https://docs.exasol.com/db/latest/sql/import.htm">Exasol Import</a>
 */
public abstract class AbstractImportQueryGenerator implements QueryGenerator {
    private static final String IMPORT_QUERY_FOOTER = "SKIP = 1";

    @Override
    public String getFooter() {
        return IMPORT_QUERY_FOOTER;
    }

}
