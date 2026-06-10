# Spark Connector Common Java 3.0.0, released 2026-06-10

Code name: Fix vulnerabilities

## Summary

This release fixes the following vulnerabilities in dependencies:

| CVE | Dependency | Short description |
|---|---|---|
| CVE-2026-42577 | `io.netty:netty-transport-classes-epoll:4.2.9.Final:runtime` | Missing release of resource after effective lifetime |
| CVE-2026-42583 | `io.netty:netty-codec-compression:4.2.9.Final:provided` | Uncontrolled resource consumption / resource exhaustion |
| CVE-2026-33870 | `io.netty:netty-codec-http:4.2.9.Final:provided` | HTTP request smuggling |
| CVE-2026-41417 | `io.netty:netty-codec-http:4.2.9.Final:provided` | HTTP request smuggling |
| CVE-2026-42580 | `io.netty:netty-codec-http:4.2.9.Final:provided` | Integer overflow or wraparound |
| CVE-2026-42581 | `io.netty:netty-codec-http:4.2.9.Final:provided` | HTTP request smuggling |
| CVE-2026-42584 | `io.netty:netty-codec-http:4.2.9.Final:provided` | HTTP request smuggling |
| CVE-2026-42585 | `io.netty:netty-codec-http:4.2.9.Final:provided` | HTTP request smuggling |
| CVE-2026-42587 | `io.netty:netty-codec-http:4.2.9.Final:provided` | Uncontrolled resource consumption / resource exhaustion |
| CVE-2026-34477 | `org.apache.logging.log4j:log4j-core:2.25.3:provided` | Improper certificate validation |
| CVE-2026-34478 | `org.apache.logging.log4j:log4j-core:2.25.3:provided` | Improper output neutralization for logs |
| CVE-2026-34479 | `org.apache.logging.log4j:log4j-core:2.25.3:provided` | Improper encoding or escaping of output |
| CVE-2026-34480 | `org.apache.logging.log4j:log4j-core:2.25.3:provided` | Improper encoding or escaping of output |
| CVE-2026-24281 | `org.apache.zookeeper:zookeeper:3.9.4:provided` | Improper certificate validation |
| CVE-2026-24308 | `org.apache.zookeeper:zookeeper:3.9.4:provided` | Information exposure through log files |
| CVE-2025-67721 | `io.airlift:aircompressor:0.27:provided` | Out-of-bounds read |
| CVE-2026-44249 | `io.netty:netty-handler:4.2.9.Final:provided` | Comparison using wrong factors |
| CVE-2026-44894 | `io.netty:netty-codec-classes-quic:4.2.9.Final:runtime` | Improper access control |
| CVE-2026-42578 | `io.netty:netty-handler-proxy:4.2.9.Final:provided` | CRLF injection / HTTP response splitting |
| CVE-2026-42582 | `io.netty:netty-codec-http3:4.2.9.Final:provided` | Allocation of resources without limits or throttling |
| CVE-2026-44892 | `io.netty:netty-codec-http3:4.2.9.Final:provided` | Uncontrolled resource consumption / resource exhaustion |
| CVE-2026-33871 | `io.netty:netty-codec-http2:4.2.9.Final:provided` | Allocation of resources without limits or throttling |
| CVE-2026-42587 | `io.netty:netty-codec-http2:4.2.9.Final:provided` | Uncontrolled resource consumption / resource exhaustion |
| CVE-2026-48043 | `io.netty:netty-codec-http2:4.2.9.Final:provided` | Uncontrolled resource consumption / resource exhaustion |
| CVE-2026-50560 | `io.netty:netty-codec-http2:4.2.9.Final:provided` | Allocation of resources without limits or throttling |

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
* Updated `org.junit.jupiter:junit-jupiter-api:5.14.1` to `5.14.4`
* Added `org.junit.jupiter:junit-jupiter-params:5.14.4`
* Removed `org.junit.jupiter:junit-jupiter:5.14.1`
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
