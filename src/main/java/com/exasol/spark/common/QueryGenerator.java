package com.exasol.spark.common;

/**
 * An interface for Exasol {@code CSV} import or export query generators.
 */
public interface QueryGenerator {

    /**
     * Generates {@code IMPORT} or {@code EXPORT} query.
     *
     * @return generated query
     */
    default String generateQuery() {
        return new StringBuilder() //
                .append(getHeader()) //
                .append(getIdentifier()) //
                .append(getFiles()) //
                .append(getFooter()) //
                .toString();
    }

    /**
     * Creates header component of the generated query.
     *
     * @return header of a query
     */
    public String getHeader();

    /**
     * Creates identifier component of the generated query.
     *
     * @return identifer of a query
     */
    public String getIdentifier();

    /**
     * Creates files component of the generated query.
     *
     * @return files of a query
     */
    public String getFiles();

    /**
     * Creates footer component of the generated query.
     *
     * @return footer of a query
     */
    public String getFooter();

}
