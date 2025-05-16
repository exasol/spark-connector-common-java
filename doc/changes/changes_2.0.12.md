# Spark Connector Common Java 2.0.12, released 2025-??-??

Code name: Fixed vulnerability CVE-2025-47436 in org.apache.orc:orc-core:jar:shaded-protobuf:1.9.5:provided

## Summary

This release fixes the following vulnerability:

### CVE-2025-47436 (CWE-122) in dependency `org.apache.orc:orc-core:jar:shaded-protobuf:1.9.5:provided`
Heap-based Buffer Overflow vulnerability in Apache ORC.

A vulnerability has been identified in the ORC C++ LZO decompression logic, where specially crafted malformed ORC files can cause the decompressor toÂ allocate a 250-byte buffer but then attempts to copy 295 bytes into it. It causes memory corruption.

This issue affects Apache ORC C++ library: through 1.8.8, from 1.9.0 through 1.9.5, from 2.0.0 through 2.0.4, from 2.1.0 through 2.1.1.

Users are recommended to upgrade to version 1.8.9, 1.9.6, 2.0.5, and 2.1.2, which fix the issue.
#### References
* https://ossindex.sonatype.org/vulnerability/CVE-2025-47436?component-type=maven&component-name=org.apache.orc%2Forc-core&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2025-47436
* https://orc.apache.org/security/CVE-2025-47436/

## Security

* #58: Fixed vulnerability CVE-2025-47436 in dependency `org.apache.orc:orc-core:jar:shaded-protobuf:1.9.5:provided`

## Dependency Updates

### Compile Dependency Updates

* Updated `com.exasol:exasol-jdbc:24.2.1` to `25.2.3`

### Test Dependency Updates

* Updated `com.exasol:exasol-testcontainers:7.1.3` to `7.1.5`
* Updated `com.exasol:test-db-builder-java:3.6.0` to `3.6.1`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.19` to `4.0`
* Updated `org.junit.jupiter:junit-jupiter-api:5.11.4` to `5.12.2`
* Updated `org.junit.jupiter:junit-jupiter:5.11.4` to `5.12.2`
* Updated `org.mockito:mockito-core:5.15.2` to `5.17.0`
* Updated `org.mockito:mockito-junit-jupiter:5.15.2` to `5.17.0`
* Updated `org.testcontainers:junit-jupiter:1.20.4` to `1.21.0`

### Plugin Dependency Updates

* Updated `com.exasol:project-keeper-maven-plugin:4.5.0` to `5.1.0`
