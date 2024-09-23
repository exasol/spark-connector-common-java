<!-- @formatter:off -->
# Dependencies

## Compile Dependencies

| Dependency                        | License                                        |
| --------------------------------- | ---------------------------------------------- |
| [Exasol JDBC Driver][0]           | [EXAClient License][1]                         |
| [Exasol SQL Statement Builder][2] | [MIT License][3]                               |
| [error-reporting-java8][4]        | [MIT License][5]                               |
| [Spark Project SQL][6]            | [Apache-2.0][7]                                |
| [Scala Library][8]                | [Apache-2.0][9]                                |
| [aircompressor][10]               | [Apache License 2.0][11]                       |
| [Apache Commons Compress][12]     | [Apache-2.0][13]                               |
| [snappy-java][14]                 | [Apache-2.0][11]                               |
| [Apache Ivy][15]                  | [The Apache Software License, Version 2.0][16] |
| [Apache ZooKeeper - Server][17]   | [Apache License, Version 2.0][13]              |
| [Apache Avro][18]                 | [Apache-2.0][13]                               |
| [Joda-Time][19]                   | [Apache License, Version 2.0][13]              |
| [Netty/All-in-One][20]            | [Apache License, Version 2.0][9]               |
| [janino][21]                      | [BSD-3-Clause][22]                             |
| [Protocol Buffers [Core]][23]     | [BSD-3-Clause][24]                             |

## Test Dependencies

| Dependency                                      | License                                        |
| ----------------------------------------------- | ---------------------------------------------- |
| [mockito-core][25]                              | [MIT][26]                                      |
| [mockito-junit-jupiter][25]                     | [MIT][26]                                      |
| [JUnit Jupiter (Aggregator)][27]                | [Eclipse Public License v2.0][28]              |
| [JUnit Jupiter API][27]                         | [Eclipse Public License v2.0][28]              |
| [Hamcrest][29]                                  | [BSD License 3][30]                            |
| [Testcontainers :: JUnit Jupiter Extension][31] | [MIT][32]                                      |
| [Test containers for Exasol on Docker][33]      | [MIT License][34]                              |
| [Test Database Builder for Java][35]            | [MIT License][36]                              |
| [Matcher for SQL Result Sets][37]               | [MIT License][38]                              |
| [Test utilities for `java.util.logging`][39]    | [MIT][26]                                      |
| [EqualsVerifier \| release normal jar][40]      | [Apache License, Version 2.0][13]              |
| [Jackson-core][41]                              | [The Apache Software License, Version 2.0][13] |

## Plugin Dependencies

| Dependency                                              | License                           |
| ------------------------------------------------------- | --------------------------------- |
| [SonarQube Scanner for Maven][42]                       | [GNU LGPL 3][43]                  |
| [Apache Maven Toolchains Plugin][44]                    | [Apache-2.0][13]                  |
| [Apache Maven Compiler Plugin][45]                      | [Apache-2.0][13]                  |
| [Apache Maven Enforcer Plugin][46]                      | [Apache-2.0][13]                  |
| [Maven Flatten Plugin][47]                              | [Apache Software Licenese][13]    |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][48] | [ASL2][16]                        |
| [Maven Surefire Plugin][49]                             | [Apache-2.0][13]                  |
| [Versions Maven Plugin][50]                             | [Apache License, Version 2.0][13] |
| [duplicate-finder-maven-plugin Maven Mojo][51]          | [Apache License 2.0][7]           |
| [Apache Maven Deploy Plugin][52]                        | [Apache-2.0][13]                  |
| [Apache Maven GPG Plugin][53]                           | [Apache-2.0][13]                  |
| [Apache Maven Source Plugin][54]                        | [Apache License, Version 2.0][13] |
| [Apache Maven Javadoc Plugin][55]                       | [Apache-2.0][13]                  |
| [Nexus Staging Maven Plugin][56]                        | [Eclipse Public License][57]      |
| [Maven Failsafe Plugin][58]                             | [Apache-2.0][13]                  |
| [JaCoCo :: Maven Plugin][59]                            | [EPL-2.0][60]                     |
| [error-code-crawler-maven-plugin][61]                   | [MIT License][62]                 |
| [Reproducible Build Maven Plugin][63]                   | [Apache 2.0][16]                  |
| [Project Keeper Maven plugin][64]                       | [The MIT License][65]             |

[0]: http://www.exasol.com/
[1]: https://repo1.maven.org/maven2/com/exasol/exasol-jdbc/24.1.0/exasol-jdbc-24.1.0-license.txt
[2]: https://github.com/exasol/sql-statement-builder/
[3]: https://github.com/exasol/sql-statement-builder/blob/main/LICENSE
[4]: https://github.com/exasol/error-reporting-java/
[5]: https://github.com/exasol/error-reporting-java/blob/main/LICENSE
[6]: https://spark.apache.org/
[7]: http://www.apache.org/licenses/LICENSE-2.0.html
[8]: https://www.scala-lang.org/
[9]: https://www.apache.org/licenses/LICENSE-2.0
[10]: https://github.com/airlift/aircompressor
[11]: https://www.apache.org/licenses/LICENSE-2.0.html
[12]: https://commons.apache.org/proper/commons-compress/
[13]: https://www.apache.org/licenses/LICENSE-2.0.txt
[14]: https://github.com/xerial/snappy-java
[15]: http://ant.apache.org/ivy/
[16]: http://www.apache.org/licenses/LICENSE-2.0.txt
[17]: http://zookeeper.apache.org/zookeeper
[18]: https://avro.apache.org
[19]: https://www.joda.org/joda-time/
[20]: https://netty.io/netty-all/
[21]: http://janino-compiler.github.io/janino/
[22]: https://spdx.org/licenses/BSD-3-Clause.html
[23]: https://developers.google.com/protocol-buffers/protobuf-java/
[24]: https://opensource.org/licenses/BSD-3-Clause
[25]: https://github.com/mockito/mockito
[26]: https://opensource.org/licenses/MIT
[27]: https://junit.org/junit5/
[28]: https://www.eclipse.org/legal/epl-v20.html
[29]: http://hamcrest.org/JavaHamcrest/
[30]: http://opensource.org/licenses/BSD-3-Clause
[31]: https://java.testcontainers.org
[32]: http://opensource.org/licenses/MIT
[33]: https://github.com/exasol/exasol-testcontainers/
[34]: https://github.com/exasol/exasol-testcontainers/blob/main/LICENSE
[35]: https://github.com/exasol/test-db-builder-java/
[36]: https://github.com/exasol/test-db-builder-java/blob/main/LICENSE
[37]: https://github.com/exasol/hamcrest-resultset-matcher/
[38]: https://github.com/exasol/hamcrest-resultset-matcher/blob/main/LICENSE
[39]: https://github.com/exasol/java-util-logging-testing/
[40]: https://www.jqno.nl/equalsverifier
[41]: https://github.com/FasterXML/jackson-core
[42]: http://sonarsource.github.io/sonar-scanner-maven/
[43]: http://www.gnu.org/licenses/lgpl.txt
[44]: https://maven.apache.org/plugins/maven-toolchains-plugin/
[45]: https://maven.apache.org/plugins/maven-compiler-plugin/
[46]: https://maven.apache.org/enforcer/maven-enforcer-plugin/
[47]: https://www.mojohaus.org/flatten-maven-plugin/
[48]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[49]: https://maven.apache.org/surefire/maven-surefire-plugin/
[50]: https://www.mojohaus.org/versions/versions-maven-plugin/
[51]: https://basepom.github.io/duplicate-finder-maven-plugin
[52]: https://maven.apache.org/plugins/maven-deploy-plugin/
[53]: https://maven.apache.org/plugins/maven-gpg-plugin/
[54]: https://maven.apache.org/plugins/maven-source-plugin/
[55]: https://maven.apache.org/plugins/maven-javadoc-plugin/
[56]: http://www.sonatype.com/public-parent/nexus-maven-plugins/nexus-staging/nexus-staging-maven-plugin/
[57]: http://www.eclipse.org/legal/epl-v10.html
[58]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[59]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[60]: https://www.eclipse.org/legal/epl-2.0/
[61]: https://github.com/exasol/error-code-crawler-maven-plugin/
[62]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[63]: http://zlika.github.io/reproducible-build-maven-plugin
[64]: https://github.com/exasol/project-keeper/
[65]: https://github.com/exasol/project-keeper/blob/main/LICENSE
