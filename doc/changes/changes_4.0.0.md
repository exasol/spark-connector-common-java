# Spark Connector Common Java 4.0.0, released 2026-07-29

Code name: Fixed vulnerabilities CVE-2026-59900, CVE-2026-55831, CVE-2026-55833, CVE-2026-56745, CVE-2026-56746, CVE-2026-59898, CVE-2026-59899, CVE-2026-59949, CVE-2026-26032, CVE-2026-59901, CVE-2026-56819, CVE-2026-59921, CVE-2026-9563, CVE-2026-54512, CVE-2026-54513, CVE-2026-54514, CVE-2026-54515, CVE-2026-54518, CVE-2026-59888, CVE-2026-59889, CVE-2026-49844

## Summary

**Breaking Change:** This project now requires Java 17.

This release fixes the following 21 vulnerabilities:

### CVE-2026-59900 (CWE-444) in dependency `io.netty:netty-codec-http2:jar:4.2.15.Final:provided`
Netty - HTTP/2 Host header deduplication failure enables request routing bypass
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-59900?component-type=maven&component-name=io.netty%2Fnetty-codec-http2&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-59900
* https://github.com/netty/netty/releases/tag/netty-4.1.136.Final
* https://github.com/netty/netty/releases/tag/netty-4.2.16.Final
* https://github.com/netty/netty/security/advisories/GHSA-c69g-56f8-xwqj

### CVE-2026-55831 (CWE-400) in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:provided`
Netty is a network application framework for development of protocol servers and clients. Prior to 4.1.136.Final and 4.2.16.Final, Netty's SPDY SETTINGS decoder accepts a peer-declared SETTINGS entry count up to the 24-bit frame-length limit and materializes every unique setting ID in `DefaultSpdySettingsFrame`, allowing a remote SPDY/3.1 peer to send a syntactically valid roughly 2 MiB SETTINGS frame that creates 262144 map entries and amplifies network input into heap growth and ordered-map insertion work. This issue is fixed in versions 4.1.136.Final and 4.2.16.Final.
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-55831?component-type=maven&component-name=io.netty%2Fnetty-codec-http&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-55831
* https://github.com/netty/netty/security/advisories/GHSA-6jqx-86gh-f27w

### CVE-2026-55833 (CWE-400) in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:provided`
Netty is a network application framework for development of protocol servers and clients. Prior to 4.1.136.Final and 4.2.16.Final, Netty SPDY header decoding continues inflating zlib-compressed header blocks after the raw header parser has exceeded `maxHeaderSize` and marked the frame truncated in `SpdyFrameCodec`, allowing a remote peer to send a small compressed `HEADERS` block that expands into much larger raw header data and causes compression-amplified CPU and allocation churn. This issue is fixed in versions 4.1.136.Final and 4.2.16.Final.
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-55833?component-type=maven&component-name=io.netty%2Fnetty-codec-http&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-55833
* https://github.com/netty/netty/releases/tag/netty-4.1.136.Final
* https://github.com/netty/netty/releases/tag/netty-4.2.16.Final
* https://github.com/netty/netty/security/advisories/GHSA-mvh2-crg5-v77c

### CVE-2026-56745 (CWE-400) in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:provided`
Netty is a network application framework for development of protocol servers and clients. In versions 4.2.0.Final through 4.2.15.Final and 4.1.0.Final through 4.1.135.Final, the `SpdyHttpDecoder` handler in Netty's SPDY-to-HTTP codec allocates a pooled `ByteBuf` when processing a client-initiated `SYN_STREAM` frame with `FLAG_FIN=0` and stores the partially constructed `FullHttpRequest` in `messageMap`; when the remote peer sends `RST_STREAM` for that stream or the accumulated content exceeds `maxContentLength`, the decoder removes the entry but does not release the pooled `ByteBuf`, causing native memory exhaustion. This issue is fixed in versions 4.1.136.Final and 4.2.16.Final.
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-56745?component-type=maven&component-name=io.netty%2Fnetty-codec-http&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-56745
* https://github.com/netty/netty/security/advisories/GHSA-jppx-w49h-x2qq

### CVE-2026-56746 (CWE-284) in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:provided`
Netty is a network application framework for development of protocol servers and clients. Versions 4.2.0.Final through 4.2.15.Final and 4.1.0.Final through 4.1.135.Final, are vulnerable to security control bypass during the origin evaluation process. CorsHandler provides a shortCircuit() configuration designed to reject unauthorized cross-origin requests immediately, acting as a security control before requests reach the application. However, due to a logical operator error in the origin evaluation process, this protection can be entirely bypassed. An attacker can bypass the short-circuit mechanism by sending a request with an Origin: null header. This failure forwards unauthorized requests to the backend application, bypassing intended access controls. This issue is fixed in versions 4.1.136.Final and 4.2.16.Final.
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-56746?component-type=maven&component-name=io.netty%2Fnetty-codec-http&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-56746
* https://github.com/netty/netty/security/advisories/GHSA-6cqp-g7gg-8hr5

### CVE-2026-59898 (CWE-444) in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:provided`
Netty - WebSocket handshaker missing header validation enables smuggling
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-59898?component-type=maven&component-name=io.netty%2Fnetty-codec-http&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-59898
* https://github.com/netty/netty/security/advisories/GHSA-4mp9-239f-g9hg

### CVE-2026-59899 (CWE-770) in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:provided`
io.netty/netty-codec-http - Unbounded queue growth via HTTP/1.1 pipelining leads to DoS
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-59899?component-type=maven&component-name=io.netty%2Fnetty-codec-http&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-59899
* https://github.com/netty/netty/releases/tag/netty-4.1.136.Final
* https://github.com/netty/netty/releases/tag/netty-4.2.16.Final
* https://github.com/netty/netty/security/advisories/GHSA-q4f6-jm68-57ww

### CVE-2026-59949 (CWE-125) in dependency `at.yawk.lz4:lz4-java:jar:1.11.0:compile`
at.yawk.lz4:lz4-java - Out-of-bounds Read
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-59949?component-type=maven&component-name=at.yawk.lz4%2Flz4-java&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-59949
* https://github.com/advisories/GHSA-xx22-p4ch-683r

### CVE-2026-26032 (CWE-22) in dependency `org.apache.ivy:ivy:jar:2.5.3:provided`
The PackagerResolver of Apache Ivy is able to download online
artifacts and to (re)package them in a format defined by a
packager.xml file. This repackaging is done by an Ant script, which is
stored in a subdirectory of the configured "buildRoot" directory. This
subdirectory is calculated based on modules coordinates, like the
organisation, name or version.

If one of the coordinates contains "../" sequences - which are valid
characters for Ivy coordinates in general- it is possible to break out
of the configured "buildRoot" directory where other files can be
overwritten.

In order to exploit this vulnerability an attacker needs to have
access to a packager repository and add or modify the coordinates in
ivy.xml files to have such "../" sequences.

Users of Apache Ivy 2.0.0 to 2.5.3 (inclusive) should upgrade to Ivy 2.6.0.
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-26032?component-type=maven&component-name=org.apache.ivy%2Fivy&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-26032
* https://lists.apache.org/thread/4d9dzrlnoplvywnyj9x6w84kxg7n3jyq
* http://www.openwall.com/lists/oss-security/2026/07/15/5

### CVE-2026-59901 (CWE-835) in dependency `io.netty:netty-codec-compression:jar:4.2.15.Final:provided`
netty-codec - Bzip2Decoder infinite loop DoS via malformed stream
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-59901?component-type=maven&component-name=io.netty%2Fnetty-codec-compression&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-59901
* https://github.com/netty/netty/security/advisories/GHSA-558v-64gr-wgg4

### CVE-2026-56819 (CWE-401) in dependency `io.netty:netty-codec-http2:jar:4.2.15.Final:provided`
netty-codec-http2 - Memory leak in HTTP/2 decompressor
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-56819?component-type=maven&component-name=io.netty%2Fnetty-codec-http2&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-56819
* https://github.com/netty/netty/security/advisories/GHSA-93wv-jw9v-4972

### CVE-2026-59921 (CWE-93) in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:provided`
netty-codec-http - CRLF injection via multipart filename
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-59921?component-type=maven&component-name=io.netty%2Fnetty-codec-http&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-59921
* https://github.com/netty/netty/security/advisories/GHSA-gcjf-9mgh-3p7g

### CVE-2026-9563 (CWE-400) in dependency `org.eclipse.parsson:parsson:jar:1.1.7:test`
In Eclipse Parsson published Maven Central artifacts before version 1.1.8, the JSON parser did not enforce a default maximum on the number of characters consumed while parsing a single JSON document. Applications that parse attacker- controlled JSON can be forced to consume excessive CPU and memory by processing very large documents, including large arrays, objects, strings, numbers, whitespace, or nested structures, resulting in a denial of service. Eclipse Parsson 1.1.8 introduces a configurable maximum parsing limit with a default limit of 15 million parser-consumed characters.
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-9563?component-type=maven&component-name=org.eclipse.parsson%2Fparsson&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-9563
* https://github.com/eclipse-ee4j/parsson/pull/169
* https://gitlab.eclipse.org/security/vulnerability-reports/-/work_items/444

### CVE-2026-54512 (CWE-184) in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.15.2:provided`
jackson-databind contains the general-purpose data-binding functionality and tree-model for Jackson Data Processor. From 2.10.0 until 2.18.8, 2.21.4, and 3.1.4, jackson-databind's PolymorphicTypeValidator (PTV) is the primary safety mechanism guarding polymorphic deserialization. When polymorphic typing is enabled and a type identifier contains generic parameters (i.e. the type ID string contains <), DatabindContext._resolveAndValidateGeneric() validates only the raw container class name (the substring before <) against the configured PTV. If the container type is approved, the method parses the full canonical type string via TypeFactory.constructFromCanonical() and returns the fully parameterized type without ever validating the nested type arguments against the PTV. The nested type arguments are then resolved, instantiated, and populated as beans during deserialization. An attacker who controls the type ID can therefore place a denied class as a generic type parameter of an allowed container â for example java.util.ArrayList<com.evil.Gadget> when only java.util.ArrayList is allow-listed. The container passes the PTV check; com.evil.Gadget is loaded via Class.forName(name, true, loader), instantiated, and its properties are set from attacker-controlled JSON. This completely bypasses an explicitly configured PTV allow-list. This vulnerability is fixed in 2.18.8, 2.21.4, and 3.1.4.
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-54512?component-type=maven&component-name=com.fasterxml.jackson.core%2Fjackson-databind&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-54512
* https://github.com/FasterXML/jackson-databind/security/advisories/GHSA-j3rv-43j4-c7qm

### CVE-2026-54513 (CWE-184) in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.15.2:provided`
jackson-databind contains the general-purpose data-binding functionality and tree-model for Jackson Data Processor. From 2.10.0 until 2.18.8, 2.21.4, and 3.1.4, BasicPolymorphicTypeValidator.Builder.allowIfSubTypeIsArray() allowlists any array type based only on clazz.isArray(), without validating the array's component (element) type against the configured allowlist. A PTV built with allowIfSubTypeIsArray() plus an explicit concrete-type allowlist therefore still permits EvilType[] even though EvilType is not allowlisted. When Jackson deserializes the elements and no per-element type IDs are present, it instantiates the component type directly with no further PTV check, bypassing the allowlist. This vulnerability is fixed in 2.18.8, 2.21.4, and 3.1.4.

Sonatype's research suggests that this CVE's details differ from those defined at NVD. See https://guide.sonatype.com/vulnerability/CVE-2026-54513 for details
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-54513?component-type=maven&component-name=com.fasterxml.jackson.core%2Fjackson-databind&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-54513
* https://github.com/FasterXML/jackson-databind/security/advisories/GHSA-rmj7-2vxq-3g9f

### CVE-2026-54514 (CWE-918) in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.15.2:provided`
jackson-databind contains the general-purpose data-binding functionality and tree-model for Jackson Data Processor. From 2.0.0 until 2.18.8, 2.21.4, and 3.1.4, JDKFromStringDeserializer constructed InetSocketAddress with new InetSocketAddress(host, port), which performs eager DNS name resolution for hostname inputs at deserialization time. An application that binds untrusted JSON into a type containing an InetSocketAddress field issues an attacker-chosen DNS query during readValue, before any application-level validation or connect logic. The fix uses InetSocketAddress.createUnresolved(host, port), deferring DNS to an explicit connect. This vulnerability is fixed in 2.18.8, 2.21.4, and 3.1.4.

Sonatype's research suggests that this CVE's details differ from those defined at NVD. See https://guide.sonatype.com/vulnerability/CVE-2026-54514 for details
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-54514?component-type=maven&component-name=com.fasterxml.jackson.core%2Fjackson-databind&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-54514
* https://github.com/FasterXML/jackson-databind/security/advisories/GHSA-hgj6-7826-r7m5

### CVE-2026-54515 (CWE-915) in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.15.2:provided`
jackson-databind contains the general-purpose data-binding functionality and tree-model for Jackson Data Processor. From 2.8.0 until 2.18.9, 2.21.5, and 3.1.4, in BeanDeserializerBase.createContextual(), per-property @JsonIgnoreProperties exclusions are applied by _handleByNameInclusion(), producing a contextual deserializer whose BeanPropertyMap has the ignored properties removed. The subsequent per-property case-insensitivity block (triggered by @JsonFormat(ACCEPT_CASE_INSENSITIVE_PROPERTIES)) rebuilds from this._beanProperties (the original, unfiltered map) instead of contextual._beanProperties, then overwrites the filtered map â restoring every property _handleByNameInclusion had just removed. The ignored property becomes writable again. This vulnerability is fixed in 2.18.9, 2.21.5, and 3.1.4.
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-54515?component-type=maven&component-name=com.fasterxml.jackson.core%2Fjackson-databind&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-54515
* https://github.com/FasterXML/jackson-databind/security/advisories/GHSA-5jmj-h7xm-6q6v

### CVE-2026-54518 (CWE-863) in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.15.2:provided`
jackson-databind contains the general-purpose data-binding functionality and tree-model for Jackson Data Processor. From 2.21.0 until 2.21.4 and 3.1.4, UnwrappedPropertyHandler.processUnwrappedCreatorProperties() replays buffered JSON into creator parameters but never consults prop.visibleInView(activeView). The normal property-based creator path gates creator properties on the active view, but this unwrapped-creator replay path bypasses that check, so a constructor parameter annotated with both @JsonView(AdminView.class) and @JsonUnwrapped is populated from attacker JSON even when a more restrictive view is active. This vulnerability is fixed in 2.21.4 and 3.1.4.

Sonatype's research suggests that this CVE's details differ from those defined at NVD. See https://guide.sonatype.com/vulnerability/CVE-2026-54518 for details
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-54518?component-type=maven&component-name=com.fasterxml.jackson.core%2Fjackson-databind&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-54518
* https://github.com/FasterXML/jackson-databind/security/advisories/GHSA-rcqc-6cw3-h962

### CVE-2026-59888 (CWE-706) in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.15.2:provided`
Jackson Databind -  JsonIgnore annotations Bypass
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-59888?component-type=maven&component-name=com.fasterxml.jackson.core%2Fjackson-databind&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-59888
* https://github.com/FasterXML/jackson-databind/pull/5974

### CVE-2026-59889 (CWE-863) in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.15.2:provided`
Jackson Databind -  Authorization bypass on JsonView Setter/Field
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-59889?component-type=maven&component-name=com.fasterxml.jackson.core%2Fjackson-databind&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-59889
* https://github.com/FasterXML/jackson-databind/issues/6060
* https://github.com/FasterXML/jackson-databind/pull/6056

### CVE-2026-49844 (CWE-116) in dependency `org.apache.logging.log4j:log4j-api:jar:2.26.0:provided`
Improper encoding of non-finite floating-point values during MapMessage JSON serialization in Apache Log4j API produces output that is not valid JSON. This issue affects Apache Log4j API versions 2.13.1 through 2.25.4 and version 2.26.0.

The fix for CVE-2026-34481 did not cover all code paths: when a MapMessage contains a non-finite IEEE 754 value (NaN, Infinity, or -Infinity), MapMessage.asJson() emits the corresponding bare token. RFC 8259 does not permit these tokens, so a conformant parser rejects the resulting document.

The defect is reachable only when both of the following conditions hold:

  *  The application uses the  message resolver https://logging.apache.org/log4j/2.x/manual/json-template-layout.html#event-template-resolver-message  of JsonTemplateLayout or any other layout that relies on MapMessage.asJson() or MapMessage.getFormattedMessage(new String[]{"JSON"}).
  *  The application logs a MapMessage that contains an attacker-controlled floating-point value.

An attacker who can supply a non-finite value can cause the affected layout to emit malformed JSON, which may corrupt the enclosing log record or disrupt downstream log ingestion and parsing.

Users are advised to upgrade to Apache Log4j API 2.25.5 or 2.26.1, both of which emit RFC 8259-compliant JSON for non-finite values.
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-49844?component-type=maven&component-name=org.apache.logging.log4j%2Flog4j-api&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-49844
* https://logging.apache.org/security.html#CVE-2026-49844

## Security

* #84: Fixed vulnerability CVE-2026-9563 in dependency `org.eclipse.parsson:parsson:jar:1.1.7:test`
* #85: Fixed vulnerability CVE-2026-54512 in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.15.2:provided`
* #86: Fixed vulnerability CVE-2026-54513 in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.15.2:provided`
* #87: Fixed vulnerability CVE-2026-54514 in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.15.2:provided`
* #88: Fixed vulnerability CVE-2026-54515 in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.15.2:provided`
* #89: Fixed vulnerability CVE-2026-54518 in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.15.2:provided`
* #90: Fixed vulnerability CVE-2026-59888 in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.15.2:provided`
* #91: Fixed vulnerability CVE-2026-59889 in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.15.2:provided`
* #92: Fixed vulnerability CVE-2026-49844 in dependency `org.apache.logging.log4j:log4j-api:jar:2.26.0:provided`
* #94: Fixed vulnerability CVE-2026-59901 in dependency `io.netty:netty-codec-compression:jar:4.2.15.Final:provided`
* #95: Fixed vulnerability CVE-2026-56819 in dependency `io.netty:netty-codec-http2:jar:4.2.15.Final:provided`
* #96: Fixed vulnerability CVE-2026-59921 in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:provided`
* #98: Fixed vulnerability CVE-2026-59900 in dependency `io.netty:netty-codec-http2:jar:4.2.15.Final:provided`
* #99: Fixed vulnerability CVE-2026-55831 in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:provided`
* #100: Fixed vulnerability CVE-2026-55833 in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:provided`
* #101: Fixed vulnerability CVE-2026-56745 in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:provided`
* #102: Fixed vulnerability CVE-2026-56746 in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:provided`
* #103: Fixed vulnerability CVE-2026-59898 in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:provided`
* #104: Fixed vulnerability CVE-2026-59899 in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:provided`
* #105: Fixed vulnerability CVE-2026-59949 in dependency `at.yawk.lz4:lz4-java:jar:1.11.0:compile`
* #106: Fixed vulnerability CVE-2026-26032 in dependency `org.apache.ivy:ivy:jar:2.5.3:provided`

## Dependency Updates

### Compile Dependency Updates

* Updated `at.yawk.lz4:lz4-java:1.11.0` to `1.11.1`
* Updated `com.exasol:exasol-jdbc:26.2.7` to `26.2.8`

### Test Dependency Updates

* Updated `com.exasol:exasol-testcontainers:7.3.0` to `8.0.1`
* Updated `com.exasol:hamcrest-resultset-matcher:1.7.2` to `1.7.3`
* Updated `com.exasol:test-db-builder-java:4.0.0` to `4.0.2`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.19.4` to `4.5`
* Removed `org.junit.jupiter:junit-jupiter-api:5.14.4`
* Updated `org.junit.jupiter:junit-jupiter-params:5.14.4` to `6.1.1`
* Removed `org.mockito:mockito-core:5.23.0`

### Plugin Dependency Updates

* Updated `com.exasol:error-code-crawler-maven-plugin:2.0.7` to `2.1.0`
* Updated `com.exasol:project-keeper-maven-plugin:5.6.2` to `5.7.4`
* Removed `com.exasol:quality-summarizer-maven-plugin:0.2.1`
* Updated `org.apache.maven.plugins:maven-enforcer-plugin:3.6.2` to `3.6.3`
* Updated `org.apache.maven.plugins:maven-failsafe-plugin:3.5.5` to `3.5.6`
* Updated `org.apache.maven.plugins:maven-site-plugin:3.21.0` to `3.22.0`
* Updated `org.apache.maven.plugins:maven-surefire-plugin:3.5.5` to `3.5.6`
* Added `org.codehaus.mojo:build-helper-maven-plugin:3.6.1`
* Updated `org.jacoco:jacoco-maven-plugin:0.8.14` to `0.8.15`
* Updated `org.sonarsource.scanner.maven:sonar-maven-plugin:5.5.0.6356` to `5.7.0.6970`
* Updated `org.sonatype.central:central-publishing-maven-plugin:0.10.0` to `0.11.0`
* Added `org.spdx:spdx-maven-plugin:1.0.4`
