# Spark Connector Common Java 2.0.11, released 2025-02-14

Code name: Fixed CVE-2025-24970 and CVE-2025-25193

## Summary

This update fixes CVE-2025-24970 and CVE-2025-25193 in transitive `netty` dependency.
It also updates other dependencies.

## Security

* #52: Fixed CVE-2025-25193
* #53: Fixed CVE-2025-24970

## Dependency Updates

### Compile Dependency Updates

* Updated `com.exasol:exasol-jdbc:24.2.0` to `24.2.1`

### Test Dependency Updates

* Updated `com.exasol:exasol-testcontainers:7.1.1` to `7.1.3`
* Removed `com.fasterxml.jackson.core:jackson-core:2.18.1`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.17.3` to `3.19`
* Removed `org.apache.commons:commons-lang3:3.17.0`
* Updated `org.junit.jupiter:junit-jupiter-api:5.11.3` to `5.11.4`
* Updated `org.junit.jupiter:junit-jupiter:5.11.3` to `5.11.4`
* Updated `org.mockito:mockito-core:5.14.2` to `5.15.2`
* Updated `org.mockito:mockito-junit-jupiter:5.14.2` to `5.15.2`
* Updated `org.testcontainers:junit-jupiter:1.20.3` to `1.20.4`

### Plugin Dependency Updates

* Updated `com.exasol:project-keeper-maven-plugin:4.4.0` to `4.5.0`
* Updated `org.apache.maven.plugins:maven-deploy-plugin:3.1.2` to `3.1.3`
* Updated `org.apache.maven.plugins:maven-failsafe-plugin:3.5.1` to `3.5.2`
* Updated `org.apache.maven.plugins:maven-javadoc-plugin:3.10.1` to `3.11.1`
* Updated `org.apache.maven.plugins:maven-site-plugin:3.9.1` to `3.21.0`
* Updated `org.apache.maven.plugins:maven-surefire-plugin:3.5.1` to `3.5.2`
* Updated `org.codehaus.mojo:versions-maven-plugin:2.17.1` to `2.18.0`
* Updated `org.sonarsource.scanner.maven:sonar-maven-plugin:4.0.0.4121` to `5.0.0.4389`
