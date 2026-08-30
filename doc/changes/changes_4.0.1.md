# Spark Connector Common Java 4.0.1, released 2026-??-??

Code name: Fixed vulnerabilities CVE-2026-62380, CVE-2026-75595, CVE-2026-62243

## Summary

This release fixes the following 3 vulnerabilities:

### CVE-2026-62380 (CWE-626) in dependency `io.netty:netty-codec-socks:jar:4.2.16.Final:provided`
io.netty:netty-codec-socks - Null Byte Interaction Error (Poison Null Byte)
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-62380?component-type=maven&component-name=io.netty%2Fnetty-codec-socks&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-62380
* https://github.com/netty/netty/security/advisories/GHSA-cc6x-ffm5-83wf

### CVE-2026-75595 (CWE-754) in dependency `io.netty:netty-handler:jar:4.2.16.Final:provided`
Netty is an asynchronous, event-driven network application framework. Prior to 4.1.137.Fina and 4.2.17.Final, io.netty.handler.ssl.SslClientHelloHandler#decode checks the wrong offset before reading the four-byte TLS handshake header, so a ClientHello whose handshake header spans records can cause an IndexOutOfBoundsException and invoke select(ctx, null). This selects the default SslContext instead of the SNI-specific context. In deployments where per-SNI clientAuth=REQUIRE is the sole mutual TLS gate, the default SslContext uses clientAuth=NONE or clientAuth=OPTIONAL, and no application-layer certificate verification exists, an unauthenticated remote attacker can bypass the protected route's mutual TLS requirement. This issue is fixed in versions 4.1.137.Final and 4.2.17.Final.
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-75595?component-type=maven&component-name=io.netty%2Fnetty-handler&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-75595
* https://github.com/netty/netty/pull/17213
* https://github.com/netty/netty/pull/17217
* https://github.com/netty/netty/security/advisories/GHSA-c4c3-7fpv-j4q5

### CVE-2026-62243 (CWE-297) in dependency `io.netty:netty-handler:jar:4.2.16.Final:provided`
io.netty:netty-handler - Improper Validation of Certificate with Host Mismatch
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-62243?component-type=maven&component-name=io.netty%2Fnetty-handler&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-62243
* https://github.com/netty/netty/security/advisories/GHSA-p85m-gvr3-788c

## Security

* #116: Fixed vulnerability CVE-2026-62380 in dependency `io.netty:netty-codec-socks:jar:4.2.16.Final:provided`
* #117: Fixed vulnerability CVE-2026-75595 in dependency `io.netty:netty-handler:jar:4.2.16.Final:provided`
* #118: Fixed vulnerability CVE-2026-62243 in dependency `io.netty:netty-handler:jar:4.2.16.Final:provided`

## Dependency Updates

### Compile Dependency Updates

* Updated `at.yawk.lz4:lz4-java:1.11.1` to `1.11.2`

### Test Dependency Updates

* Updated `nl.jqno.equalsverifier:equalsverifier:4.5` to `4.5.2`
* Updated `org.junit.jupiter:junit-jupiter-params:6.1.2` to `6.1.3`
