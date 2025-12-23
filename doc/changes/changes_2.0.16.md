# Spark Connector Common Java 2.0.16, released 2025-12-23

Code name: Fixed vulnerabilities in six dependencies

## Summary

This release fixes the following vulnerabilities:
* CVE-2025-68161 in `org.apache.logging.log4j:log4j-core:jar:2.20.0:provided`
* CVE-2025-46295 in `org.apache.commons:commons-text:jar:1.10.0:provided`
* CVE-2025-67735 in `io.netty:netty-codec-http:jar:4.2.7.Final:provided`
* CVE-2025-66566 in `org.lz4:lz4-java:jar:1.8.0:provided`
* CVE-2025-12183 in `org.lz4:lz4-java:jar:1.8.0:provided`
* CVE-2025-12383 in `org.glassfish.jersey.core:jersey-client:jar:2.40:provided`

## Security

* #79: Fixed CVE-2025-68161 in `org.apache.logging.log4j:log4j-core:jar:2.20.0:provided`
* #78: Fixed CVE-2025-46295 in `org.apache.commons:commons-text:jar:1.10.0:provided`
* #77: Fixed CVE-2025-67735 in `io.netty:netty-codec-http:jar:4.2.7.Final:provided`
* #76: Fixed CVE-2025-66566 in `org.lz4:lz4-java:jar:1.8.0:provided`
* #75: Fixed CVE-2025-12183 in `org.lz4:lz4-java:jar:1.8.0:provided`
* #74: Fixed CVE-2025-12383 in `org.glassfish.jersey.core:jersey-client:jar:2.40:provided`

## Dependency Updates

### Compile Dependency Updates

* Added `at.yawk.lz4:lz4-java:1.10.2`
* Updated `com.exasol:exasol-jdbc:24.2.1` to `25.2.5`

### Test Dependency Updates

* Updated `com.exasol:exasol-testcontainers:7.1.4` to `7.2.2`
* Updated `com.exasol:hamcrest-resultset-matcher:1.7.0` to `1.7.2`
* Updated `com.exasol:java-util-logging-testing:2.0.3` to `2.0.4`
* Updated `com.exasol:test-db-builder-java:3.6.0` to `3.6.4`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.19` to `3.19.4`
* Updated `org.junit.jupiter:junit-jupiter-api:5.11.4` to `5.14.1`
* Updated `org.junit.jupiter:junit-jupiter:5.11.4` to `5.14.1`
* Updated `org.mockito:mockito-core:5.15.2` to `5.21.0`
* Updated `org.mockito:mockito-junit-jupiter:5.15.2` to `5.21.0`
* Removed `org.testcontainers:junit-jupiter:1.20.4`
* Added `org.testcontainers:testcontainers-junit-jupiter:2.0.3`

### Plugin Dependency Updates

* Updated `com.exasol:project-keeper-maven-plugin:5.4.3` to `5.4.4`
* Updated `org.apache.maven.plugins:maven-resources-plugin:3.3.1` to `3.4.0`
* Updated `org.codehaus.mojo:versions-maven-plugin:2.19.1` to `2.20.1`
* Updated `org.sonarsource.scanner.maven:sonar-maven-plugin:5.2.0.4988` to `5.5.0.6356`
