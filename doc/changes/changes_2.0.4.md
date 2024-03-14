# Spark Connector Common Java 2.0.4, released 2024-03-14

Code name: Fix CVE-2024-25710 and CVE-2024-26308 in compile dependency

## Summary

This release fixes CVE-2024-25710 and CVE-2024-26308 in compile dependency `org.apache.commons:commons-compress:1.24.0`.

## Security

* #30: Fixed CVE-2024-25710 in `org.apache.commons:commons-compress:jar:1.24.0:compile`
* #32: Fixed CVE-2024-26308 in `org.apache.commons:commons-compress:jar:1.24.0:compile`

## Dependency Updates

### Compile Dependency Updates

* Updated `com.exasol:exasol-jdbc:7.1.20` to `24.0.0`
* Updated `org.apache.commons:commons-compress:1.24.0` to `1.26.1`
* Updated `org.apache.zookeeper:zookeeper:3.7.2` to `3.9.2`

### Test Dependency Updates

* Updated `com.exasol:exasol-testcontainers:7.0.0` to `7.0.1`
* Updated `com.exasol:hamcrest-resultset-matcher:1.6.1` to `1.6.5`
* Updated `com.exasol:test-db-builder-java:3.5.1` to `3.5.4`
* Updated `com.fasterxml.jackson.core:jackson-core:2.15.2` to `2.17.0`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.15.2` to `3.15.8`
* Updated `org.junit.jupiter:junit-jupiter-api:5.10.0` to `5.10.2`
* Updated `org.junit.jupiter:junit-jupiter:5.10.0` to `5.10.2`
* Updated `org.mockito:mockito-core:5.5.0` to `5.11.0`
* Updated `org.mockito:mockito-junit-jupiter:5.5.0` to `5.11.0`
* Updated `org.testcontainers:junit-jupiter:1.19.0` to `1.19.7`

### Plugin Dependency Updates

* Updated `com.exasol:error-code-crawler-maven-plugin:1.3.1` to `2.0.1`
* Updated `com.exasol:project-keeper-maven-plugin:2.9.16` to `4.2.0`
* Updated `org.apache.maven.plugins:maven-compiler-plugin:3.11.0` to `3.12.1`
* Updated `org.apache.maven.plugins:maven-failsafe-plugin:3.2.2` to `3.2.5`
* Updated `org.apache.maven.plugins:maven-javadoc-plugin:3.6.2` to `3.6.3`
* Updated `org.apache.maven.plugins:maven-surefire-plugin:3.2.2` to `3.2.5`
* Added `org.apache.maven.plugins:maven-toolchains-plugin:3.1.0`
* Updated `org.codehaus.mojo:flatten-maven-plugin:1.5.0` to `1.6.0`
* Updated `org.codehaus.mojo:versions-maven-plugin:2.16.1` to `2.16.2`
