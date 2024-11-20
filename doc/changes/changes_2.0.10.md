# Spark Connector Common Java 2.0.10, released 2024-11-20

Code name: Fixed vulnerabilities CVE-2024-47535 and CVE-2024-51504

## Summary

This release fixes the following vulnerabilities:

### CVE-2024-47535 (CWE-400) in dependency `io.netty:netty-common:jar:4.1.114.Final:provided`
Netty is an asynchronous event-driven network application framework for rapid development of maintainable high performance protocol servers & clients. An unsafe reading of environment file could potentially cause a denial of service in Netty. When loaded on an Windows application, Netty attempts to load a file that does not exist. If an attacker creates such a large file, the Netty application crashes. This vulnerability is fixed in 4.1.115.
#### References
* https://ossindex.sonatype.org/vulnerability/CVE-2024-47535?component-type=maven&component-name=io.netty%2Fnetty-common&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2024-47535
* https://github.com/advisories/GHSA-xq3w-v528-46rv
### CVE-2024-51504 (CWE-290) in dependency `org.apache.zookeeper:zookeeper:jar:3.9.2:provided`
When using IPAuthenticationProvider in ZooKeeper Admin Server there is a possibility of Authentication Bypass by Spoofing -- this only impacts IP based authentication implemented in ZooKeeper Admin Server. Default configuration of client's IP address detection inÂ IPAuthenticationProvider, which uses HTTP request headers, is weakÂ and allows an attacker to bypass authentication via spoofing client's IP address in request headers. Default configuration honors X-Forwarded-For HTTP header to read client's IP address. X-Forwarded-For request header is mainly used by proxy servers to identify the client and can be easily spoofed by an attacker pretending that the request comes from a different IP address. Admin Server commands, such as snapshot and restore arbitrarily can be executed on successful exploitation which could potentially lead to information leakage or service availability issues. Users are recommended to upgrade to version 3.9.3, which fixes this issue.
#### References
* https://ossindex.sonatype.org/vulnerability/CVE-2024-51504?component-type=maven&component-name=org.apache.zookeeper%2Fzookeeper&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2024-51504
* https://lists.apache.org/thread/b3qrmpkto5r6989qr61fw9y2x646kqlh

## Security

* #50: Fixed vulnerability CVE-2024-47535 in dependency `io.netty:netty-common:jar:4.1.114.Final:provided`
* #48: Fixed vulnerability CVE-2024-51504 in dependency `org.apache.zookeeper:zookeeper:jar:3.9.2:provided`

## Dependency Updates

### Compile Dependency Updates

* Updated `com.exasol:exasol-jdbc:24.1.2` to `24.2.0`

### Test Dependency Updates

* Updated `com.fasterxml.jackson.core:jackson-core:2.18.0` to `2.18.1`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.17.1` to `3.17.3`
* Added `org.apache.commons:commons-lang3:3.17.0`
* Updated `org.junit.jupiter:junit-jupiter-api:5.11.2` to `5.11.3`
* Updated `org.junit.jupiter:junit-jupiter:5.11.2` to `5.11.3`
* Updated `org.testcontainers:junit-jupiter:1.20.2` to `1.20.3`

### Plugin Dependency Updates

* Updated `com.exasol:project-keeper-maven-plugin:4.3.3` to `4.4.0`
* Added `com.exasol:quality-summarizer-maven-plugin:0.2.0`
* Updated `io.github.zlika:reproducible-build-maven-plugin:0.16` to `0.17`
* Updated `org.apache.maven.plugins:maven-clean-plugin:2.5` to `3.4.0`
* Updated `org.apache.maven.plugins:maven-failsafe-plugin:3.2.5` to `3.5.1`
* Updated `org.apache.maven.plugins:maven-gpg-plugin:3.2.4` to `3.2.7`
* Updated `org.apache.maven.plugins:maven-install-plugin:2.4` to `3.1.3`
* Updated `org.apache.maven.plugins:maven-javadoc-plugin:3.7.0` to `3.10.1`
* Updated `org.apache.maven.plugins:maven-resources-plugin:2.6` to `3.3.1`
* Updated `org.apache.maven.plugins:maven-site-plugin:3.3` to `3.9.1`
* Updated `org.apache.maven.plugins:maven-surefire-plugin:3.2.5` to `3.5.1`
* Updated `org.codehaus.mojo:versions-maven-plugin:2.16.2` to `2.17.1`
