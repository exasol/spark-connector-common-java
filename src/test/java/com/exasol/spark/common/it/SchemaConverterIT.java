package com.exasol.spark.common.it;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructType;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.testcontainers.junit.jupiter.Testcontainers;

import com.exasol.dbbuilder.dialects.Table;
import com.exasol.spark.common.ColumnDescription;
import com.exasol.spark.common.SchemaConverter;

@Tag("integration")
@Testcontainers
class SchemaConverterIT extends IntegrationTestSetup {

    @Test
    void testConvertSchemaFromMultiColumnTable() {
        final Table table = exasolDatabase.createTable("multi_column_table", //
                Arrays.asList("c1", "c2", "c3", "c4"), //
                Arrays.asList("VARCHAR(10)", "INTEGER", "DATE", "DOUBLE"));
        final StructType expectedSchema = new StructType() //
                .add("c1", DataTypes.StringType, true) //
                .add("c2", DataTypes.LongType, true) //
                .add("c3", DataTypes.DateType, true) //
                .add("c4", DataTypes.DoubleType, true);
        final StructType schema = convertSchema(table);
        assertThat(schema, equalTo(expectedSchema));
    }

    @ParameterizedTest
    @CsvSource(value = { //
            "BOOLEAN;          BOOLEAN", //
            "CHAR(1);          STRING", //
            "CHAR(20);         STRING", //
            "CHAR(2000);       STRING", //
            "VARCHAR(5);       STRING", //
            "VARCHAR(20);      STRING", //
            "VARCHAR(2000000); STRING", //
            "DECIMAL(3,2);     DECIMAL(3,2)", //
            "DECIMAL(18,0);    LONG", //
            "DECIMAL(30,20);   DECIMAL(30,20)", //
            "DECIMAL(36,36);   DECIMAL(36,36)", //
            "DOUBLE PRECISION; DOUBLE", //
            "DATE;             DATE", //
            "TIMESTAMP;        TIMESTAMP", //
    }, delimiter = ';')
    void testConvertSchemaFromSingleColumnTableWithBaseType(final String exasolType, final String sparkType) {
        final Table table = createTableMatchingTypeName(exasolType);
        final StructType expectedSchema= StructType.fromDDL("c1 " + sparkType);
        assertThat(convertSchema(table), equalTo(expectedSchema));
    }

    @ParameterizedTest
    @CsvSource(value = { //
            "BOOL;                            BOOLEAN", //
            "CHAR;                            STRING", //
            "CHAR VARYING(1);                 STRING", //
            "CHAR VARYING(12);                STRING", //
            "CHAR VARYING(2000000);           STRING", //
            "CHARACTER;                       STRING", //
            "CHARACTER VARYING(3);            STRING", //
            "CHARACTER VARYING(2000000);      STRING", //
            "CHARACTER LARGE OBJECT;          STRING", //
            "CHARACTER LARGE OBJECT(1);       STRING", //
            "CHARACTER LARGE OBJECT(2000000); STRING", //
            "CLOB;                            STRING", //
            "CLOB(2);                         STRING", //
            "CLOB(27);                        STRING", //
            "CLOB(2000000);                   STRING", //
            "DEC;                             LONG", //
            "DEC(18);                         LONG", //
            "DEC(29);                         DECIMAL(29,0)", //
            "DEC(36);                         DECIMAL(36,0)", //
            "DEC(6,2);                        DECIMAL(6,2)", //
            "DEC(36,5);                       DECIMAL(36,5)", //
            "DEC(36,36);                      DECIMAL(36,36)", //
            "DECIMAL;                         LONG", //
            "DECIMAL(18);                     LONG", //
            "DECIMAL(23);                     DECIMAL(23,0)", //
            "DECIMAL(36);                     DECIMAL(36,0)", //
            "DOUBLE;                          DOUBLE", //
            "FLOAT;                           DOUBLE", //
            "REAL;                            DOUBLE", //
            "BIGINT;                          DECIMAL(36,0)", //
            "INT;                             LONG", //
            "INTEGER;                         LONG", //
            "SHORTINT;                        INT", //
            "SMALLINT;                        INT", //
            "TINYINT;                         SHORT", //
            "LONG VARCHAR;                    STRING", //
            "NCHAR(1);                        STRING", //
            "NCHAR(2000);                     STRING", //
            "NVARCHAR(1337);                  STRING", //
            "NVARCHAR2(1337);                 STRING", //
            "VARCHAR2(13);                    STRING", //
            "VARCHAR2(2000000);               STRING", //
            "NUMBER;                          DOUBLE", //
            "NUMBER(18);                      LONG", //
            "NUMBER(36);                      DECIMAL(36,0)", //
            "NUMBER(13,11);                   DECIMAL(13,11)", //
            "NUMERIC;                         LONG", //
            "NUMERIC(18);                     LONG", //
            "NUMERIC(22);                     DECIMAL(22,0)", //
            "NUMERIC(22,14);                  DECIMAL(22,14)", //
            "NUMERIC(36,18);                  DECIMAL(36,18)", //
    }, delimiter = ';')
    void testConvertSchemaFromSingleColumnTableWithAliasTypes(final String exasolType, final String sparkType) {
        final Table table = createTableMatchingTypeName(exasolType);
        final StructType expectedSchema = StructType.fromDDL("c1 " + sparkType);
        assertThat(convertSchema(table), equalTo(expectedSchema));
    }

    private Table createTableMatchingTypeName(final String exasolType) {
        final String tableName = exasolType.replaceAll("[(, )]", "_") + "_TABLE";
        return exasolDatabase.createTable(tableName, "c1", exasolType);
    }

    private StructType convertSchema(final Table table) {
        final ResultSet exasolResultSet = runSelectQuery("SELECT * FROM" + table.getFullyQualifiedName() + " LIMIT 5");
        final List<ColumnDescription> columns = getColumnMetadata(exasolResultSet);
        return new SchemaConverter().convert(columns);
    }

    private ResultSet runSelectQuery(final String limitedQuery) {
        try (final Statement statement = connection.createStatement()) {
            return statement.executeQuery(limitedQuery);
        } catch (final SQLException exception) {
            throw new RuntimeException("Failed to run the query.");
        }
    }

    private List<ColumnDescription> getColumnMetadata(final ResultSet resultSet) {
        try {
            final ResultSetMetaData metadata = resultSet.getMetaData();
            final int numberOfColumns = metadata.getColumnCount();
            final List<ColumnDescription> columns = new ArrayList<>(numberOfColumns);
            for (int i = 1; i <= numberOfColumns; i++) {
                columns.add(ColumnDescription.builder() //
                        .name(metadata.getColumnLabel(i)) //
                        .type(metadata.getColumnType(i)) //
                        .precision(metadata.getPrecision(i)) //
                        .scale(metadata.getScale(i)) //
                        .isSigned(metadata.isSigned(i)) //
                        .isNullable(metadata.isNullable(i) != ResultSetMetaData.columnNoNulls) //
                        .build());

            }
            return columns;
        } catch (final SQLException exception) {
            throw new RuntimeException("Failed to get column metadata.");
        }
    }

}
