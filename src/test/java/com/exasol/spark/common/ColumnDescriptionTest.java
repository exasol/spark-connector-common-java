package com.exasol.spark.common;

import static java.sql.Types.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

class ColumnDescriptionTest {
    @Test
    void testValidateNameThrowsExceptionOnMissingColumnName() {
        final ColumnDescription.Builder builder = ColumnDescription.builder().type(-1);
        final IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> builder.build());
        assertThat(exception.getMessage(), startsWith("E-SCJ-1"));
    }

    @Test
    void testValidateTypeThrowsExceptionOnMissingColumnType() {
        final ColumnDescription.Builder builder = ColumnDescription.builder().name("c1");
        final IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> builder.build());
        assertThat(exception.getMessage(), startsWith("E-SCJ-2"));
    }

    @Test
    void testCreateDefaultColumn() {
        final ColumnDescription column = ColumnDescription //
            .builder() //
            .name("c1") //
            .type(CHAR) //
            .build();
        assertAll( //
                () -> assertThat(column.getName(), equalTo("c1")), //
                () -> assertThat(column.getType(), equalTo(CHAR)), //
                () -> assertThat(column.getPrecision(), equalTo(0)), //
                () -> assertThat(column.getScale(), equalTo(0)), //
                () -> assertThat(column.isSigned(), equalTo(false)), //
                () -> assertThat(column.isNullable(), equalTo(false)) //
        );
    }

    @Test
    void testCreateColumnWithPrecisionAndScale() {
        final ColumnDescription column = ColumnDescription //
            .builder() //
            .name("decimalColumn") //
            .type(DECIMAL) //
            .precision(18) //
            .scale(2) //
            .isSigned(true) //
            .isNullable(true) //
            .build();
        assertAll( //
                () -> assertThat(column.getPrecision(), equalTo(18)), //
                () -> assertThat(column.getScale(), equalTo(2)), //
                () -> assertThat(column.isSigned(), equalTo(true)), //
                () -> assertThat(column.isNullable(), equalTo(true)) //
        );
    }
}
