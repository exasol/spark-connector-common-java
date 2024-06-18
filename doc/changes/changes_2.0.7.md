# Spark Connector Common Java 2.0.7, released 2024-06-18

Code name: Test with Exasol v8

## Summary

This release verifies that this project works with Exasol v8 by running integration tests with the latest Exasol Docker DB version.

## Features

* #34: Added integration tests with Exasol v8

## Dependency Updates

### Compile Dependency Updates

* Updated `com.exasol:exasol-jdbc:24.0.0` to `24.1.0`
* Updated `io.netty:netty-all:4.1.109.Final` to `4.1.111.Final`
* Updated `org.apache.commons:commons-compress:1.26.1` to `1.26.2`

### Test Dependency Updates

* Updated `com.exasol:exasol-testcontainers:7.0.1` to `7.1.0`
* Updated `com.fasterxml.jackson.core:jackson-core:2.17.0` to `2.17.1`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.15.8` to `3.16.1`
* Updated `org.mockito:mockito-core:5.11.0` to `5.12.0`
* Updated `org.mockito:mockito-junit-jupiter:5.11.0` to `5.12.0`
* Updated `org.testcontainers:junit-jupiter:1.19.7` to `1.19.8`

### Plugin Dependency Updates

* Updated `com.exasol:project-keeper-maven-plugin:4.3.2` to `4.3.3`
