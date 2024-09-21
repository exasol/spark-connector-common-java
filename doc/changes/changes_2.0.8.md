# Spark Connector Common Java 2.0.8, released 2024-??-??

Code name: Fixed vulnerability CVE-2024-7254 in com.google.protobuf:protobuf-java:jar:3.19.6:provided

## Summary

This release fixes the following vulnerability:

### CVE-2024-7254 (CWE-20) in dependency `com.google.protobuf:protobuf-java:jar:3.19.6:provided`
Any project that parses untrusted Protocol Buffers dataÂ containing an arbitrary number of nested groups / series of SGROUPÂ tags can corrupted by exceeding the stack limit i.e. StackOverflow. Parsing nested groups as unknown fields with DiscardUnknownFieldsParser or Java Protobuf Lite parser, or against Protobuf map fields, creates unbounded recursions that can be abused by an attacker.
#### References
* https://ossindex.sonatype.org/vulnerability/CVE-2024-7254?component-type=maven&component-name=com.google.protobuf%2Fprotobuf-java&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2024-7254
* https://github.com/advisories/GHSA-735f-pc8j-v9w8

## Security

* #41: Fixed vulnerability CVE-2024-7254 in dependency `com.google.protobuf:protobuf-java:jar:3.19.6:provided`

## Dependency Updates

### Compile Dependency Updates

* Updated `com.exasol:exasol-jdbc:24.1.0` to `24.1.2`
* Updated `io.netty:netty-all:4.1.111.Final` to `4.1.113.Final`
* Updated `joda-time:joda-time:2.12.7` to `2.13.0`
* Updated `org.apache.avro:avro:1.11.3` to `1.12.0`
* Updated `org.apache.commons:commons-compress:1.26.2` to `1.27.1`
* Updated `org.xerial.snappy:snappy-java:1.1.10.5` to `1.1.10.7`

### Test Dependency Updates

* Updated `com.exasol:exasol-testcontainers:7.1.0` to `7.1.1`
* Updated `com.exasol:hamcrest-resultset-matcher:1.6.5` to `1.7.0`
* Updated `com.fasterxml.jackson.core:jackson-core:2.17.1` to `2.17.2`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.16.1` to `3.16.2`
* Updated `org.hamcrest:hamcrest:2.2` to `3.0`
* Updated `org.junit.jupiter:junit-jupiter-api:5.10.2` to `5.11.0`
* Updated `org.junit.jupiter:junit-jupiter:5.10.2` to `5.11.0`
* Updated `org.mockito:mockito-core:5.12.0` to `5.13.0`
* Updated `org.mockito:mockito-junit-jupiter:5.12.0` to `5.13.0`
* Updated `org.testcontainers:junit-jupiter:1.19.8` to `1.20.1`
