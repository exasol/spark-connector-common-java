package com.exasol.spark.common;

/**
 * An abstract generator for Exasol {@code EXPORT} queries that access {@code
 * CSV} files on intermediate cloud storage systems.
 *
 * @see <a href="https://docs.exasol.com/db/latest/sql/export.htm">Exasol Export</a>
 */
public abstract class AbstractExportQueryGenerator implements QueryGenerator {
    private static final String EXPORT_QUERY_FOOTER = "WITH COLUMN NAMES\nBOOLEAN = 'true/false'";

    @Override
    public String getFooter() {
        return EXPORT_QUERY_FOOTER;
    }

}
