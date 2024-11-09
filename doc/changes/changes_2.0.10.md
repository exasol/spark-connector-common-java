# Spark Connector Common Java 2.0.10, released 2024-??-??

Code name: Fixed vulnerability CVE-2024-51504 in org.apache.zookeeper:zookeeper:jar:3.9.2:provided

## Summary

This release fixes the following vulnerability:

### CVE-2024-51504 (CWE-290) in dependency `org.apache.zookeeper:zookeeper:jar:3.9.2:provided`
When using IPAuthenticationProvider in ZooKeeper Admin Server there is a possibility of Authentication Bypass by Spoofing -- this only impacts IP based authentication implemented in ZooKeeper Admin Server. Default configuration of client's IP address detection inÂ IPAuthenticationProvider, which uses HTTP request headers, is weakÂ and allows an attacker to bypass authentication via spoofing client's IP address in request headers. Default configuration honors X-Forwarded-For HTTP header to read client's IP address. X-Forwarded-For request header is mainly used by proxy servers to identify the client and can be easily spoofed by an attacker pretending that the request comes from a different IP address. Admin Server commands, such as snapshot and restore arbitrarily can be executed on successful exploitation which could potentially lead to information leakage or service availability issues. Users are recommended to upgrade to version 3.9.3, which fixes this issue.
#### References
* https://ossindex.sonatype.org/vulnerability/CVE-2024-51504?component-type=maven&component-name=org.apache.zookeeper%2Fzookeeper&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2024-51504
* https://lists.apache.org/thread/b3qrmpkto5r6989qr61fw9y2x646kqlh

## Security

* #48: Fixed vulnerability CVE-2024-51504 in dependency `org.apache.zookeeper:zookeeper:jar:3.9.2:provided`

## Dependency Updates

### Test Dependency Updates

* Updated `com.fasterxml.jackson.core:jackson-core:2.18.0` to `2.18.1`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.17.1` to `3.17.3`
* Updated `org.junit.jupiter:junit-jupiter-api:5.11.2` to `5.11.3`
* Updated `org.junit.jupiter:junit-jupiter:5.11.2` to `5.11.3`
* Updated `org.testcontainers:junit-jupiter:1.20.2` to `1.20.3`

### Plugin Dependency Updates

* Updated `com.exasol:project-keeper-maven-plugin:4.3.3` to `4.4.0`
