package com.exasol.spark.common;

import com.exasol.sql.StatementFactory;
import com.exasol.sql.dql.select.Select;
import com.exasol.sql.dql.select.rendering.SelectRenderer;
import com.exasol.sql.rendering.StringRendererConfig;

/**
 * An abstract class for {@code SQL} statement generators.
 */
public abstract class AbstractSelectStatementGenerator {
    private static final String PLACEHOLDER_TABLE = "<PLACEHOLDER>";
    private static final StatementFactory factory = StatementFactory.getInstance();
    private final String tableOrQuery;

    /** The {@link Select} statement for this generator. */
    protected final Select select;

    /**
     * Creates an instance of an statement generator.
     *
     * @param tableOrQuery table name or inner query to select from.
     */
    protected AbstractSelectStatementGenerator(final String tableOrQuery) {
        this.tableOrQuery = tableOrQuery;
        this.select = factory.select();
    }

    /**
     * Renders the select select statement.
     *
     * The users of this API could also provide inner select query. However, the renderer cannot correctly quote
     * arbitrary user query. For that, we first use a placeholder for {@code SELECT FROM} statement and then replace it
     * with quoted table name or inner query.
     *
     * @return string select statement
     */
    protected String renderSelect() {
        this.select.from().table(PLACEHOLDER_TABLE);
        final String renderedResult = renderStatement();
        return renderedResult.replace("\"" + PLACEHOLDER_TABLE + "\"", this.tableOrQuery);
    }

    private String renderStatement() {
        final StringRendererConfig rendererConfig = StringRendererConfig.builder().quoteIdentifiers(true).build();
        final SelectRenderer renderer = new SelectRenderer(rendererConfig);
        this.select.accept(renderer);
        return renderer.render();
    }

}

