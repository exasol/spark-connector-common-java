# Spark Connector Common Java 2.0.5, released 2024-05-08

Code name: Fix CVEs in compile and test dependencies

## Summary
This release fixes the following vulnerabilities in dependencies:
* CVE-2024-29025 in `io.netty:netty-codec-http:jar:4.1.96.Final:provided`
* CVE-2024-23080 in `joda-time:joda-time:jar:2.12.5:provided`
* CVE-2023-33546 in `org.codehaus.janino:janino:jar:3.1.9:provided`

## Features

* #36: Fixed CVE-2024-23080
* #35: Fixed CVE-2024-29025

## Dependency Updates

### Compile Dependency Updates

* Added `io.netty:netty-all:4.1.109.Final`
* Added `joda-time:joda-time:2.12.7`
* Added `org.codehaus.janino:janino:3.1.12`

### Plugin Dependency Updates

* Updated `com.exasol:error-code-crawler-maven-plugin:2.0.1` to `2.0.2`
* Updated `com.exasol:project-keeper-maven-plugin:4.2.0` to `4.3.0`
* Updated `org.apache.maven.plugins:maven-compiler-plugin:3.12.1` to `3.13.0`
* Updated `org.apache.maven.plugins:maven-gpg-plugin:3.1.0` to `3.2.2`
* Updated `org.jacoco:jacoco-maven-plugin:0.8.11` to `0.8.12`
* Updated `org.sonarsource.scanner.maven:sonar-maven-plugin:3.10.0.2594` to `3.11.0.3922`
