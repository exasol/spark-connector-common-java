package com.exasol.spark.common.it;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.testcontainers.junit.jupiter.Container;

import com.exasol.containers.ExasolContainer;
import com.exasol.dbbuilder.dialects.exasol.ExasolObjectFactory;
import com.exasol.dbbuilder.dialects.exasol.ExasolSchema;

public class IntegrationTestSetup {
    private static final Logger LOGGER = Logger.getLogger(IntegrationTestSetup.class.getName());
    private static final String DEFAULT_DOCKER_IMAGE_VERSION = "7.1.22";

    @Container
    private static final ExasolContainer<? extends ExasolContainer<?>> EXASOL =
        new ExasolContainer<>(getExasolDockerImage()).withReuse(true);

    protected static Connection connection;
    protected static ExasolObjectFactory factory;
    protected static ExasolSchema exasolDatabase;

    @BeforeAll
    public static void beforeAll() throws SQLException {
        EXASOL.purgeDatabase();
        connection = EXASOL.createConnection();
        factory = new ExasolObjectFactory(connection);
        exasolDatabase = factory.createSchema("DEFAULT_SCHEMA");
    }

    @AfterAll
    public static void afterAll() throws SQLException {
        dropDatabase();
        connection.close();
    }

    public void createExasolSchema(final String schemaName) {
        LOGGER.fine(() -> "Creating a new Exasol schema '" + schemaName + '"');
        dropDatabase();
        exasolDatabase = factory.createSchema(schemaName);
    }

    public String getJdbcUrl() {
        return EXASOL.getJdbcUrl();
    }

    public String getUsername() {
        return EXASOL.getUsername();
    }

    public String getPassword() {
        return EXASOL.getPassword();
    }

    private static void dropDatabase() {
        if (exasolDatabase != null) {
            LOGGER.fine(() -> "Dropping Exasol schema '" + exasolDatabase.getName() + '"');
            exasolDatabase.drop();
            exasolDatabase = null;
        }
    }

    private static String getExasolDockerImage() {
        return System.getProperty("com.exasol.dockerdb.image", DEFAULT_DOCKER_IMAGE_VERSION);
    }

}
