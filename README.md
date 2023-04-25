# Spark Connector Common Java Library

[![Build Status](https://github.com/exasol/spark-connector-common-java/actions/workflows/ci-build.yml/badge.svg)](https://github.com/exasol/spark-connector-common-java/actions/workflows/ci-build.yml)
[![Maven Central &ndash; spark-connector-common-java](https://img.shields.io/maven-central/v/com.exasol/spark-connector-common-java)](https://search.maven.org/artifact/com.exasol/spark-connector-common-java)

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Aspark-connector-common-java&metric=alert_status)](https://sonarcloud.io/dashboard?id=com.exasol%3Aspark-connector-common-java)

[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Aspark-connector-common-java&metric=security_rating)](https://sonarcloud.io/dashboard?id=com.exasol%3Aspark-connector-common-java)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Aspark-connector-common-java&metric=reliability_rating)](https://sonarcloud.io/dashboard?id=com.exasol%3Aspark-connector-common-java)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Aspark-connector-common-java&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=com.exasol%3Aspark-connector-common-java)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Aspark-connector-common-java&metric=sqale_index)](https://sonarcloud.io/dashboard?id=com.exasol%3Aspark-connector-common-java)

[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Aspark-connector-common-java&metric=code_smells)](https://sonarcloud.io/dashboard?id=com.exasol%3Aspark-connector-common-java)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Aspark-connector-common-java&metric=coverage)](https://sonarcloud.io/dashboard?id=com.exasol%3Aspark-connector-common-java)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Aspark-connector-common-java&metric=duplicated_lines_density)](https://sonarcloud.io/dashboard?id=com.exasol%3Aspark-connector-common-java)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Aspark-connector-common-java&metric=ncloc)](https://sonarcloud.io/dashboard?id=com.exasol%3Aspark-connector-common-java)

## Overview

This is a common library for Exasol Apache Spark based connectors.

## Features

- Describes `JDBC` column metadata
- Converts Exasol query column descriptions into a Spark schema
- Generates Exasol import and export queries of cloud storage systems

## Usage

For example, to create column descriptions from `JDBC` query result:

```java
final ResultSetMetaData metadata = jdbcQueryResultSet.getMetaData();
final int numberOfColumns = metadata.getColumnCount();
final List<ColumnDescription> columns = new ArrayList<>(numberOfColumns);
for (int i = 1; i <= numberOfColumns; i++) {
    columns.add(ColumnDescription.builder() //
            .name(metadata.getColumnLabel(i)) //
            .type(metadata.getColumnType(i)) //
            .precision(metadata.getPrecision(i)) //
            .scale(metadata.getScale(i)) //
            .isSigned(metadata.isSigned(i)) //
            .isNullable(metadata.isNullable(i) != columnNoNulls) //
            .build());

}
```
And then to generate Spark schema from column descriptions:

```java
final StructType schema = new SchemaConverter().convert(columns);
```

## Information for Users

Users are developers including this library into their Spark connectors.

* [Changelog](doc/changes/changelog.md)

## Information for Developers

Developers in this context are building or modifying this library.

* [Developer Guide](doc/developer-guide/developer-guide.md)
* [Dependencies](dependencies.md)
* [License (MIT)](LICENSE)
