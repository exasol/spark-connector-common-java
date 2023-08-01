package com.exasol.spark.common;

/**
 * An interface for {@code SQL} statement generators.
 */
public interface StatementGenerator {

    /**
     * Renders statement to a string.
     *
     * @return rendered select statement string
     */
    public String render();
}
