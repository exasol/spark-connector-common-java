# Spark Connector Common Java 3.0.0, released 2026-??-??

Code name: Fix vulnerabilities

## Summary

## Breaking Change

Starting with this release, this project no longer supports Exasol 7.1. The supported versions are the current release and the LTS release line `2025.1.x`.

## Security

* #82: Fix dependency check

## Dependency Updates

### Compile Dependency Updates

* Updated `at.yawk.lz4:lz4-java:1.10.2` to `1.11.0`
* Updated `com.exasol:exasol-jdbc:25.2.5` to `26.2.7`

### Test Dependency Updates

* Updated `com.exasol:exasol-testcontainers:7.2.2` to `7.3.0`
* Updated `com.exasol:test-db-builder-java:3.6.4` to `4.0.0`
* Removed `org.junit.jupiter:junit-jupiter-api:5.14.1`
* Updated `org.junit.jupiter:junit-jupiter:5.14.1` to `5.14.4`
* Updated `org.mockito:mockito-core:5.21.0` to `5.23.0`
* Updated `org.mockito:mockito-junit-jupiter:5.21.0` to `5.23.0`
* Updated `org.testcontainers:testcontainers-junit-jupiter:2.0.3` to `2.0.5`

### Plugin Dependency Updates

* Updated `com.exasol:error-code-crawler-maven-plugin:2.0.5` to `2.0.7`
* Updated `com.exasol:project-keeper-maven-plugin:5.4.4` to `5.6.2`
* Updated `io.github.git-commit-id:git-commit-id-maven-plugin:9.0.2` to `10.0.0`
* Updated `org.apache.maven.plugins:maven-compiler-plugin:3.14.1` to `3.15.0`
* Updated `org.apache.maven.plugins:maven-failsafe-plugin:3.5.4` to `3.5.5`
* Updated `org.apache.maven.plugins:maven-resources-plugin:3.4.0` to `3.5.0`
* Updated `org.apache.maven.plugins:maven-source-plugin:3.2.1` to `3.4.0`
* Updated `org.apache.maven.plugins:maven-surefire-plugin:3.5.4` to `3.5.5`
* Updated `org.codehaus.mojo:versions-maven-plugin:2.20.1` to `2.21.0`
* Updated `org.sonatype.central:central-publishing-maven-plugin:0.9.0` to `0.10.0`
