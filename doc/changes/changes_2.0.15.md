# Spark Connector Common Java 2.0.15, released 2025-??-??

Code name: Fixed vulnerability CVE-2025-58057 in io.netty:netty-codec:jar:4.1.124.Final:provided

## Summary

This release fixes the following vulnerability:

### CVE-2025-58057 (CWE-409) in dependency `io.netty:netty-codec:jar:4.1.124.Final:provided`
netty-codec - Improper Handling of Highly Compressed Data (Data Amplification)
#### References
* https://ossindex.sonatype.org/vulnerability/CVE-2025-58057?component-type=maven&component-name=io.netty%2Fnetty-codec&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2025-58057
* https://github.com/netty/netty/security/advisories/GHSA-3p8m-j85q-pgmj

## Security

* #68: Fixed vulnerability CVE-2025-58057 in dependency `io.netty:netty-codec:jar:4.1.124.Final:provided`

## Dependency Updates

### Compile Dependency Updates

* Updated `com.exasol:exasol-jdbc:24.2.1` to `25.2.5`

### Test Dependency Updates

* Updated `com.exasol:exasol-testcontainers:7.1.4` to `7.1.7`
* Updated `com.exasol:hamcrest-resultset-matcher:1.7.0` to `1.7.2`
* Updated `com.exasol:test-db-builder-java:3.6.0` to `3.6.3`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.19` to `4.1`
* Updated `org.junit.jupiter:junit-jupiter-api:5.11.4` to `5.13.4`
* Updated `org.junit.jupiter:junit-jupiter:5.11.4` to `5.13.4`
* Updated `org.mockito:mockito-core:5.15.2` to `5.19.0`
* Updated `org.mockito:mockito-junit-jupiter:5.15.2` to `5.19.0`
* Updated `org.testcontainers:junit-jupiter:1.20.4` to `1.21.3`
