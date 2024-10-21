# Spark Connector Common Java 2.0.9, released 2024-10-21

Code name: Fixed vulnerability CVE-2024-47561 in org.apache.avro:avro:jar:1.11.3:provided, upgrade dependencies

## Summary

This release upgrades current dependencies and fixes the following vulnerability:

### CVE-2024-47561 (CWE-502) in dependency `org.apache.avro:avro:jar:1.11.3:provided`
Schema parsing in the Java SDK of Apache Avro 1.11.3 and previous versions allows bad actors to execute arbitrary code.
Users are recommended to upgrade to version 1.11.4 or 1.12.0, which fix this issue.
#### References
* https://ossindex.sonatype.org/vulnerability/CVE-2024-47561?component-type=maven&component-name=org.apache.avro%2Favro&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2024-47561
* https://lists.apache.org/thread/c2v7mhqnmq0jmbwxqq3r5jbj1xg43h5x

## Security

* #44: CVE-2024-47561: org.apache.avro:avro:jar:1.11.3:provided

## Dependency Updates

### Compile Dependency Updates

* Updated `com.exasol:exasol-jdbc:24.1.0` to `24.1.2`

### Test Dependency Updates

* Updated `com.exasol:exasol-testcontainers:7.1.0` to `7.1.1`
* Updated `com.exasol:hamcrest-resultset-matcher:1.6.5` to `1.7.0`
* Updated `com.exasol:test-db-builder-java:3.5.4` to `3.6.0`
* Updated `com.fasterxml.jackson.core:jackson-core:2.17.1` to `2.18.0`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.16.1` to `3.17.1`
* Updated `org.hamcrest:hamcrest:2.2` to `3.0`
* Updated `org.junit.jupiter:junit-jupiter-api:5.10.2` to `5.11.2`
* Updated `org.junit.jupiter:junit-jupiter:5.10.2` to `5.11.2`
* Updated `org.mockito:mockito-core:5.12.0` to `5.14.2`
* Updated `org.mockito:mockito-junit-jupiter:5.12.0` to `5.14.2`
* Updated `org.testcontainers:junit-jupiter:1.19.8` to `1.20.2`
