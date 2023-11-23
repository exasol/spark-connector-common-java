# Spark Connector Common Java 2.0.3, released 2023-11-23

Code name: Update transitive dependecies to fix CVEs

## Summary
Updated transitive dependencies to fix:
* zookeeper: CVE-2023-44981, severity CWE-639: Authorization Bypass Through User-Controlled Key (9.1)
* exasol-testcontainers: CVE-2023-4043, severity CWE-20: Improper Input Validation (7.5)
* arvo: CVE-2023-39410, severity CWE-502: Deserialization of Untrusted Data (7.5)

## Features

* #27: Fixed vulnerabilities in zookeeper, parsson, avro

## Dependency Updates

### Compile Dependency Updates

* Added `org.apache.avro:avro:1.11.3`
* Added `org.apache.zookeeper:zookeeper:3.7.2`

### Test Dependency Updates

* Updated `com.exasol:exasol-testcontainers:6.6.2` to `7.0.0`

### Plugin Dependency Updates

* Updated `com.exasol:error-code-crawler-maven-plugin:1.3.0` to `1.3.1`
* Updated `com.exasol:project-keeper-maven-plugin:2.9.12` to `2.9.16`
* Updated `org.apache.maven.plugins:maven-enforcer-plugin:3.4.0` to `3.4.1`
* Updated `org.apache.maven.plugins:maven-failsafe-plugin:3.1.2` to `3.2.2`
* Updated `org.apache.maven.plugins:maven-javadoc-plugin:3.5.0` to `3.6.2`
* Updated `org.apache.maven.plugins:maven-surefire-plugin:3.1.2` to `3.2.2`
* Updated `org.codehaus.mojo:versions-maven-plugin:2.16.0` to `2.16.1`
* Updated `org.jacoco:jacoco-maven-plugin:0.8.10` to `0.8.11`
* Updated `org.sonarsource.scanner.maven:sonar-maven-plugin:3.9.1.2184` to `3.10.0.2594`
