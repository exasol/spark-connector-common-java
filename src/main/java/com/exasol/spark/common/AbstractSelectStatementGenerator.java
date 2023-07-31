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
    private final String tableName;
    protected final Select select;

    /**
     * Creates an instance of an statement generator.
     *
     * @param tableName table name to select from.
     */
    protected AbstractSelectStatementGenerator(final String tableName) {
        this.tableName = tableName;
        this.select = factory.select();
    }

    /**
     * Renders the select select statement.
     *
     * @return string select statement
     */
    protected String renderSelect() {
        this.select.from().table(PLACEHOLDER_TABLE);
        final StringRendererConfig rendererConfig = StringRendererConfig.builder().quoteIdentifiers(true).build();
        final SelectRenderer renderer = new SelectRenderer(rendererConfig);
        this.select.accept(renderer);
        final String renderedResult = renderer.render();
        return renderedResult.replace("\"" + PLACEHOLDER_TABLE + "\"", this.tableName);
    }

}

