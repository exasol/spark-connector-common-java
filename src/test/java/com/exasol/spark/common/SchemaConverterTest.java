package com.exasol.spark.common;

import static org.apache.spark.sql.types.DataTypes.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.startsWith;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.sql.Types;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.apache.spark.sql.AnalysisException;
import org.apache.spark.sql.types.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

class SchemaConverterTest {
    private final SchemaConverter schemaConverter = new SchemaConverter();

    @ParameterizedTest
    @NullAndEmptySource
    void testConvertNullAndEmptyThrows(final List<ColumnDescription> columns) {
        final IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> schemaConverter.convert(columns));
        assertThat(exception.getMessage(), startsWith("E-SCCJ-3: Provided list of column descriptions is empty"));
    }

    @Test
    void testConvert() {
        final List<ColumnDescription> columns = Arrays.asList( //
                columnOf("col_integer", Types.INTEGER), //
                columnOf("col_double", Types.DOUBLE), //
                columnOf("col_string", Types.VARCHAR), //
                columnOf("col_date", Types.DATE) //
        );
        final StructType expectedSchema = new StructType() //
                .add("col_integer", LongType, false) //
                .add("col_double", DoubleType, false) //
                .add("col_string", StringType, false) //
                .add("col_date", DateType, false);
        assertThat(schemaConverter.convert(columns), equalTo(expectedSchema));
    }

    @ParameterizedTest
    @ValueSource(ints = { //
            Types.ARRAY, //
            Types.DATALINK, //
            Types.DISTINCT, //
            Types.JAVA_OBJECT, //
            Types.NULL, //
            Types.REF, //
            Types.REF_CURSOR, //
            Types.ROWID, //
            Types.OTHER, //
            Types.SQLXML, //
            Types.STRUCT //
    })
    void testConvertColumnWithUnsupportedJDBCTypes(final int jdbcType) {
        final ColumnDescription column = columnOf("c1", jdbcType);
        final UnsupportedOperationException exception = assertThrows(UnsupportedOperationException.class,
                () -> schemaConverter.convertColumn(column));
        assertThat(exception.getMessage(), startsWith("E-SCCJ-4: Unsupported JDBC type"));
    }

    private ColumnDescription columnOf(final String name, final int type) {
        return ColumnDescription.builder().name(name).type(type).build();
    }

    // Field Conversions

    private final DataType LONG_DECIMAL_TYPE = DataTypes.createDecimalType(20, 0);

    private static final Stream<Arguments> mappedTypes() {
        return Stream.of(//
                Arguments.of(Types.TINYINT, ShortType), //
                Arguments.of(Types.SMALLINT, ShortType), //
                Arguments.of(Types.DOUBLE, DoubleType), //
                Arguments.of(Types.FLOAT, DoubleType), //
                Arguments.of(Types.REAL, FloatType), //
                // Strings
                Arguments.of(Types.CHAR, StringType), //
                Arguments.of(Types.NCHAR, StringType), //
                Arguments.of(Types.VARCHAR, StringType), //
                Arguments.of(Types.NVARCHAR, StringType), //
                Arguments.of(Types.LONGVARCHAR, StringType), //
                Arguments.of(Types.LONGNVARCHAR, StringType), //
                // Binaries
                Arguments.of(Types.BINARY, StringType), //
                Arguments.of(Types.VARBINARY, StringType), //
                Arguments.of(Types.LONGVARBINARY, StringType), //
                // Booleans
                Arguments.of(Types.BIT, BooleanType), //
                Arguments.of(Types.BOOLEAN, BooleanType), //
                // Datetime
                Arguments.of(Types.DATE, DateType), //
                Arguments.of(Types.TIME, TimestampType), //
                Arguments.of(Types.TIMESTAMP, TimestampType));
    }

    @ParameterizedTest
    @MethodSource("mappedTypes")
    void testTypeConversions(final int jdbcType, final DataType sparkType) {
        assertConversion(jdbcType, sparkType).verify();
    }

    @ParameterizedTest
    @MethodSource("mappedTypes")
    void testTypeConversionsWithNullable(final int jdbcType, final DataType sparkType) {
        assertConversion(jdbcType, sparkType).isNullable(true).verify();
    }

    @Test
    void testIntegerConversion() {
        assertConversion(Types.INTEGER, LongType).verify();
    }

    @Test
    void testIntegerConversionWithSigned() {
        assertConversion(Types.INTEGER, IntegerType).isSigned(true).verify();
    }

    @Test
    void testBigintConversion() {
        assertConversion(Types.BIGINT, LONG_DECIMAL_TYPE).verify();
    }

    @Test
    void testBigintConversionWithSigned() {
        assertConversion(Types.BIGINT, LongType).isSigned(true).verify();
    }

    @Test
    void testDecimalDefaultConversion() {
        for (final int jdbcType : Arrays.asList(Types.DECIMAL, Types.NUMERIC)) {
            assertConversion(jdbcType, DataTypes.createDecimalType()).verify();
        }
    }

    @ParameterizedTest
    @CsvSource({ //
            "36,36", //
            "36,2", //
            "18,6", //
            "22,1", //
            "6,6", //
            "3,0", //
    })
    void testDecimalConversion(final int precision, final int scale) {
        final DataType expectedSparkType = DataTypes.createDecimalType(precision, scale);
        for (final int jdbcType : Arrays.asList(Types.DECIMAL, Types.NUMERIC)) {
            assertConversion(jdbcType, expectedSparkType).withPrecision(precision).withScale(scale).verify();
        }
    }

    @ParameterizedTest
    @CsvSource({ //
            "39,4", // Spark's max precision is 38, Exasol's is 36
            "39,2", //
            "39,39", //
    })
    void testDecimalConversionWithExcessPrecision(final int precision, final int scale) {
        verifyDecimalExceptions(precision, scale, "E-SCCJ-5");
    }

    @ParameterizedTest
    @CsvSource({ //
            "12,40", //
            "20,39" //
    })
    void testDecimalConversionWithExcessScale(final int precision, final int scale) {
        verifyDecimalExceptions(precision, scale, "E-SCCJ-6");
    }

    @Test
    void testDecimalConversionWithScaleGreaterThanPrecision() {
        final AnalysisException exception = assertThrows(AnalysisException.class,
                () -> assertConversion(Types.DECIMAL, DataTypes.createDecimalType()) //
                        .withPrecision(0) //
                        .withScale(3) //
                        .verify());
        assertThat(exception.getMessage(), equalTo("Decimal scale (3) cannot be greater than precision (0)."));
    }

    private void verifyDecimalExceptions(final int precision, final int scale, final String errorCode) {
        for (final int jdbcType : Arrays.asList(Types.DECIMAL, Types.NUMERIC)) {
            final FieldConversionChecker conversionChecker = assertConversion(jdbcType, DataTypes.createDecimalType()) //
                    .withPrecision(precision) //
                    .withScale(scale);
            final IllegalStateException exception = assertThrows(IllegalStateException.class,
                    () -> conversionChecker.verify());
            assertThat(exception.getMessage(), startsWith(errorCode));
        }
    }

    private FieldConversionChecker assertConversion(final int jdbcType, final DataType sparkType) {
        return new FieldConversionChecker().withJdbcType(jdbcType).withSparkType(sparkType);
    }

    private static class FieldConversionChecker {
        private final String columnName = "COLUMN";
        private int jdbcType;
        private DataType sparkType;
        private boolean isNullable = false;
        private boolean isSigned = false;
        private int precision = 0;
        private int scale = 0;

        public FieldConversionChecker withJdbcType(final int jdbcType) {
            this.jdbcType = jdbcType;
            return this;
        }

        public FieldConversionChecker withSparkType(final DataType sparkType) {
            this.sparkType = sparkType;
            return this;
        }

        public FieldConversionChecker isNullable(final boolean isNullable) {
            this.isNullable = isNullable;
            return this;
        }

        public FieldConversionChecker isSigned(final boolean isSigned) {
            this.isSigned = isSigned;
            return this;
        }

        public FieldConversionChecker withPrecision(final int precision) {
            this.precision = precision;
            return this;
        }

        public FieldConversionChecker withScale(final int scale) {
            this.scale = scale;
            return this;
        }

        public void verify() {
            final ColumnDescription column = ColumnDescription.builder() //
                    .name(this.columnName) //
                    .type(this.jdbcType) //
                    .isNullable(this.isNullable) //
                    .isSigned(this.isSigned) //
                    .precision(this.precision) //
                    .scale(this.scale) //
                    .build();
            final StructField field = DataTypes.createStructField(this.columnName, this.sparkType, this.isNullable);
            assertThat(new SchemaConverter().convertColumn(column), equalTo(field));
        }
    }

}
