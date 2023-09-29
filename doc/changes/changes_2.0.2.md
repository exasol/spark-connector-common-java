# Spark Connector Common Java 2.0.2, released 2023-09-29

Code name: Update dependencies to fix CVEs

## Summary

Update transitive dependencies to fix CVE-2023-42503, CVE-2023-43642, CVE-2022-46751 and CVE-2022-46751.

## Security

* #23: Updated deps to fix CVE-2023-42503, CVE-2023-43642, CVE-2022-46751 and CVE-2022-46751

## Dependency Updates

### Compile Dependency Updates

* Added `org.apache.commons:commons-compress:1.24.0`
* Added `org.apache.ivy:ivy:2.5.2`
* Added `org.xerial.snappy:snappy-java:1.1.10.5`

### Test Dependency Updates

* Updated `com.exasol:exasol-testcontainers:6.6.1` to `6.6.2`
* Updated `com.exasol:hamcrest-resultset-matcher:1.6.0` to `1.6.1`
* Updated `com.exasol:test-db-builder-java:3.4.2` to `3.5.1`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.15` to `3.15.2`
* Updated `org.mockito:mockito-core:5.4.0` to `5.5.0`
* Updated `org.mockito:mockito-junit-jupiter:5.4.0` to `5.5.0`
* Updated `org.testcontainers:junit-jupiter:1.18.3` to `1.19.0`

### Plugin Dependency Updates

* Updated `com.exasol:project-keeper-maven-plugin:2.9.10` to `2.9.12`
* Updated `org.apache.maven.plugins:maven-enforcer-plugin:3.3.0` to `3.4.0`
