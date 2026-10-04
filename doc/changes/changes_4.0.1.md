# Spark Connector Common Java 4.0.1, released 2026-??-??

Code name: Fixed vulnerabilities CVE-2026-102495, CVE-2026-102496

## Summary

This release fixes the following 2 vulnerabilities:

### CVE-2026-102495 (CWE-674) in dependency `org.apache.ws.xmlschema:xmlschema-core:jar:2.3.1:provided`
Apache XmlSchema doesn't limit how deeply schema imports and includes can be nested, so a malicious schema can make parsing recurse until the stack overflows. This causes a denial of service.
Users are recommended to upgrade to version 2.3.3, which fixes this issue.
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-102495?component-type=maven&component-name=org.apache.ws.xmlschema%2Fxmlschema-core&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-102495
* https://access.redhat.com/security/cve/cve-2026-102495

### CVE-2026-102496 (CWE-674) in dependency `org.apache.ws.xmlschema:xmlschema-core:jar:2.3.1:provided`
Apache XmlSchema doesn't limit how deeply schema structures can be nested when it builds its schema model, so a malicious schema can make parsing recurse until the stack overflows. This causes a denial of service.
Users are recommended to upgrade to version 2.3.3, which fixes this issue.
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-102496?component-type=maven&component-name=org.apache.ws.xmlschema%2Fxmlschema-core&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-102496
* https://lists.apache.org/thread/9z1vg8wmvwpfw748fb2nb55w4hgbnxol
* https://access.redhat.com/security/cve/cve-2026-102496

## Security

* #161: Fixed vulnerability CVE-2026-102495 in dependency `org.apache.ws.xmlschema:xmlschema-core:jar:2.3.1:provided`
* #162: Fixed vulnerability CVE-2026-102496 in dependency `org.apache.ws.xmlschema:xmlschema-core:jar:2.3.1:provided`

## Dependency Updates

### Compile Dependency Updates

* Updated `at.yawk.lz4:lz4-java:1.11.1` to `1.12.0`
* Updated `com.exasol:exasol-jdbc:26.2.8` to `26.2.9`

### Test Dependency Updates

* Updated `com.exasol:exasol-testcontainers:8.0.1` to `8.0.2`
* Updated `com.exasol:hamcrest-resultset-matcher:1.7.3` to `1.7.4`
* Updated `com.exasol:test-db-builder-java:4.0.2` to `4.0.3`
* Updated `nl.jqno.equalsverifier:equalsverifier:4.5` to `4.5.2`
* Updated `org.junit.jupiter:junit-jupiter-params:6.1.2` to `6.1.3`
* Updated `org.mockito:mockito-junit-jupiter:5.23.0` to `5.24.0`

### Plugin Dependency Updates

* Updated `com.exasol:project-keeper-maven-plugin:5.7.4` to `5.7.6`
