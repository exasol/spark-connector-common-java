# Spark Connector Common Java 4.0.1, released 2026-??-??

Code name:

## Summary

## Features

* ISSUE_NUMBER: description

## Security

* #139: Fixed CVE-2026-15432 (timing side channel) in dependency `com.google.crypto.tink:tink:jar:1.20.0:provided`
* #132: Fixed CVE-2026-68498 (unbounded resource allocation) in dependency `com.fasterxml.jackson.core:jackson-core:jar:2.22.1:provided`
* #158: Fixed CVE-2026-89407 (regex denial of service) in dependency `com.fasterxml.jackson.core:jackson-core:jar:2.22.1:provided`
* #159: Fixed CVE-2026-89425 (oversized error token allocation) in dependency `com.fasterxml.jackson.core:jackson-core:jar:2.22.1:provided`
* #120: Fixed CVE-2026-86231 (certificate revocation check bypass) in dependency `com.github.mwiede:jsch:jar:2.28.5:test`
* #123: Fixed CVE-2026-73334 (untrusted KMS URL forwarding) in dependency `org.apache.parquet:parquet-hadoop:jar:1.17.0:provided`
* #116: Fixed CVE-2026-62380 (null byte handling error) in dependency `io.netty:netty-codec-socks:jar:4.2.16.Final:provided`
* #117: Fixed CVE-2026-75595 (mutual TLS requirement bypass) in dependency `io.netty:netty-handler:jar:4.2.16.Final:provided`
* #114: Fixed CVE-2026-75596 (inefficient algorithmic complexity) in dependency `io.netty:netty-handler:jar:4.2.16.Final:provided`
* #118: Fixed CVE-2026-62243 (certificate hostname validation failure) in dependency `io.netty:netty-handler:jar:4.2.16.Final:provided`
* #161: Fixed CVE-2026-102495 (recursive schema imports) in dependency `org.apache.ws.xmlschema:xmlschema-core:jar:2.3.1:provided`
* #162: Fixed CVE-2026-102496 (recursive schema structures) in dependency `org.apache.ws.xmlschema:xmlschema-core:jar:2.3.1:provided`
* #169: Fixed CVE-2026-108104 (double release of pooled buffers) in dependency `org.xerial.snappy:snappy-java:jar:1.1.10.8:provided`
* #170: Fixed CVE-2026-108106 (unbounded memory allocation) in dependency `org.xerial.snappy:snappy-java:jar:1.1.10.8:provided`
* #131: Fixed CVE-2026-90559 (out-of-bounds buffer write) in dependency `org.xerial.snappy:snappy-java:jar:1.1.10.8:provided`
* #156: Fixed CVE-2026-93451 (out-of-bounds array write) in dependency `org.xerial.snappy:snappy-java:jar:1.1.10.8:provided`
* #157: Fixed CVE-2026-93452 (out-of-bounds buffer write) in dependency `org.xerial.snappy:snappy-java:jar:1.1.10.8:provided`
* #122: Fixed CVE-2026-89044 (HTTP request smuggling) in dependency `io.netty:netty-codec-http2:jar:4.2.16.Final:provided`
* #152: Fixed CVE-2026-93492 (excessive HPACK header allocation) in dependency `io.netty:netty-codec-http2:jar:4.2.16.Final:provided`
* #153: Fixed CVE-2026-93567 (CONNECT authority validation bypass) in dependency `io.netty:netty-codec-http2:jar:4.2.16.Final:provided`
* #154: Fixed CVE-2026-93568 (extended CONNECT protocol confusion) in dependency `io.netty:netty-codec-http2:jar:4.2.16.Final:provided`
* #155: Fixed CVE-2026-93579 (invalid HTTP/2 header acceptance) in dependency `io.netty:netty-codec-http2:jar:4.2.16.Final:provided`
* #109: Fixed CVE-2026-59903 (sensitive data in cache) in dependency `io.netty:netty-codec-http:jar:4.2.16.Final:provided`
* #121: Fixed CVE-2026-89044 (HTTP request smuggling) in dependency `io.netty:netty-codec-http:jar:4.2.16.Final:provided`
* #144: Fixed CVE-2026-93488 (unbounded resource allocation) in dependency `io.netty:netty-codec-http:jar:4.2.16.Final:provided`
* #145: Fixed CVE-2026-93491 (unbounded resource allocation) in dependency `io.netty:netty-codec-http:jar:4.2.16.Final:provided`
* #146: Fixed CVE-2026-93558 (unbounded WebSocket request queue growth) in dependency `io.netty:netty-codec-http:jar:4.2.16.Final:provided`
* #147: Fixed CVE-2026-93562 (HTTP request smuggling) in dependency `io.netty:netty-codec-http:jar:4.2.16.Final:provided`
* #148: Fixed CVE-2026-93565 (RTSP method token smuggling) in dependency `io.netty:netty-codec-http:jar:4.2.16.Final:provided`
* #149: Fixed CVE-2026-93574 (HTTP request smuggling) in dependency `io.netty:netty-codec-http:jar:4.2.16.Final:provided`
* #150: Fixed CVE-2026-93566 (HTTP request smuggling) in dependency `io.netty:netty-codec-http:jar:4.2.16.Final:provided`
* #151: Fixed CVE-2026-93573 (protocol interpretation conflict) in dependency `io.netty:netty-codec-http:jar:4.2.16.Final:provided`
* #143: Fixed CVE-2026-100666 (HTTP request smuggling) in dependency `io.netty:netty-codec-http:jar:4.2.16.Final:provided`
* #124: Fixed CVE-2026-87795 (out-of-bounds read) in dependency `com.github.luben:zstd-jni:jar:1.5.7-7:provided`
* #125: Fixed CVE-2026-87823 (integer overflow in bounds checks) in dependency `com.github.luben:zstd-jni:jar:1.5.7-7:provided`
* #126: Fixed CVE-2026-89045 (infinite loop in stream reading) in dependency `com.github.luben:zstd-jni:jar:1.5.7-7:provided`
* #133: Fixed CVE-2026-59739 (missing authorization check) in dependency `org.apache.zookeeper:zookeeper:jar:3.9.5:provided`
* #134: Fixed CVE-2026-59969 (certificate hostname validation failure) in dependency `org.apache.zookeeper:zookeeper:jar:3.9.5:provided`
* #135: Fixed CVE-2026-79993 (missing authorization check) in dependency `org.apache.zookeeper:zookeeper:jar:3.9.5:provided`
* #136: Fixed CVE-2026-84439 (improper log output handling) in dependency `org.apache.zookeeper:zookeeper:jar:3.9.5:provided`
* #137: Fixed CVE-2026-84501 (improper log output handling) in dependency `org.apache.zookeeper:zookeeper:jar:3.9.5:provided`
* #164: Fixed CVE-2026-106449 (uncontrolled recursive parsing) in dependency `at.yawk.lz4:lz4-java:jar:1.11.1:compile`
* #165: Fixed CVE-2026-106450 (excessive frame allocation) in dependency `at.yawk.lz4:lz4-java:jar:1.11.1:compile`
* #166: Fixed CVE-2026-106451 (temporary library file race) in dependency `at.yawk.lz4:lz4-java:jar:1.11.1:compile`
* #167: Fixed CVE-2026-106452 (unbounded compressed input allocation) in dependency `at.yawk.lz4:lz4-java:jar:1.11.1:compile`
* #168: Fixed CVE-2026-106453 (unbounded decompressed output allocation) in dependency `at.yawk.lz4:lz4-java:jar:1.11.1:compile`
* #111: Fixed CVE-2026-19032 (unrestricted URI schemes in path deserialization) in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.22.1:provided`
* #112: Fixed CVE-2026-68497 (unbounded resource allocation) in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.22.1:provided`
* #128: Fixed CVE-2026-91776 (unbounded type ID cache growth) in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.22.1:provided`
* #129: Fixed CVE-2026-91777 (inefficient algorithmic complexity) in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.22.1:provided`
* #130: Fixed CVE-2026-83557 (unsafe deserialization) in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.22.1:provided`
* Fixed CVE-2026-110879 (unsafe deserialization) in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.22.1:provided`
## Dependency Updates

### Compile Dependency Updates

* Updated `at.yawk.lz4:lz4-java:1.11.1` to `1.12.1`
* Updated `com.exasol:exasol-jdbc:26.2.8` to `26.2.10`

### Test Dependency Updates

* Updated `com.exasol:exasol-testcontainers:8.0.1` to `8.0.2`
* Updated `com.exasol:hamcrest-resultset-matcher:1.7.3` to `1.7.4`
* Updated `com.exasol:test-db-builder-java:4.0.2` to `4.0.3`
* Updated `nl.jqno.equalsverifier:equalsverifier:4.5` to `4.5.2`
* Updated `org.junit.jupiter:junit-jupiter-params:6.1.2` to `6.1.3`
* Updated `org.mockito:mockito-junit-jupiter:5.23.0` to `5.24.0`

### Plugin Dependency Updates

* Updated `com.exasol:error-code-crawler-maven-plugin:2.1.0` to `2.1.2`
* Updated `com.exasol:project-keeper-maven-plugin:5.7.4` to `5.8.0`
* Updated `io.github.git-commit-id:git-commit-id-maven-plugin:10.0.0` to `10.0.1`
* Updated `org.apache.maven.plugins:maven-artifact-plugin:3.6.1` to `3.7.0`
* Updated `org.apache.maven.plugins:maven-compiler-plugin:3.15.0` to `3.16.0`
* Updated `org.apache.maven.plugins:maven-deploy-plugin:3.1.4` to `3.2.0`
* Updated `org.apache.maven.plugins:maven-failsafe-plugin:3.5.6` to `3.6.0`
* Updated `org.apache.maven.plugins:maven-install-plugin:3.1.4` to `3.2.0`
* Updated `org.apache.maven.plugins:maven-surefire-plugin:3.5.6` to `3.6.0`
* Updated `org.apache.maven.plugins:maven-toolchains-plugin:3.2.0` to `3.3.0`
* Updated `org.codehaus.mojo:build-helper-maven-plugin:3.6.1` to `3.6.2`
* Updated `org.codehaus.mojo:flatten-maven-plugin:1.7.3` to `1.8.0`
* Updated `org.codehaus.mojo:versions-maven-plugin:2.21.0` to `2.23.0`
* Updated `org.sonarsource.scanner.maven:sonar-maven-plugin:5.7.0.6970` to `5.8.0.7211`
* Updated `org.sonatype.central:central-publishing-maven-plugin:0.11.0` to `0.12.0`
