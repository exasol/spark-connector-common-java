<!-- @formatter:off -->
# Dependencies

## Compile Dependencies

| Dependency                        | License                                        |
| --------------------------------- | ---------------------------------------------- |
| [Exasol JDBC Driver][0]           | [EXAClient License][1]                         |
| [Exasol SQL Statement Builder][2] | [MIT License][3]                               |
| [error-reporting-java8][4]        | [MIT License][5]                               |
| [Spark Project SQL][6]            | [Apache-2.0][7]                                |
| [LZ4 Java Compression][8]         | [Apache License, Version 2.0][9]               |
| [Scala Library][10]               | [Apache-2.0][9]                                |
| [Apache Ivy][11]                  | [The Apache Software License, Version 2.0][12] |
| [Apache ZooKeeper - Server][13]   | [Apache License, Version 2.0][14]              |
| [Apache Avro][15]                 | [Apache-2.0][14]                               |
| [janino][16]                      | [BSD-3-Clause][17]                             |
| [Protocol Buffers [Core]][18]     | [BSD-3-Clause][19]                             |

## Test Dependencies

| Dependency                                      | License                           |
| ----------------------------------------------- | --------------------------------- |
| [mockito-core][20]                              | [MIT][21]                         |
| [mockito-junit-jupiter][20]                     | [MIT][21]                         |
| [JUnit Jupiter (Aggregator)][22]                | [Eclipse Public License v2.0][23] |
| [Hamcrest][24]                                  | [BSD-3-Clause][25]                |
| [Testcontainers :: JUnit Jupiter Extension][26] | [MIT][27]                         |
| [Test containers for Exasol on Docker][28]      | [MIT License][29]                 |
| [Test Database Builder for Java][30]            | [MIT License][31]                 |
| [Matcher for SQL Result Sets][32]               | [MIT License][33]                 |
| [Test utilities for java-util-logging][34]      | [MIT License][35]                 |
| [EqualsVerifier \| release normal jar][36]      | [Apache License, Version 2.0][14] |

## Plugin Dependencies

| Dependency                                              | License                                     |
| ------------------------------------------------------- | ------------------------------------------- |
| [SonarQube Scanner for Maven][37]                       | [GNU LGPL 3][38]                            |
| [Apache Maven Toolchains Plugin][39]                    | [Apache-2.0][14]                            |
| [Apache Maven Compiler Plugin][40]                      | [Apache-2.0][14]                            |
| [Apache Maven Enforcer Plugin][41]                      | [Apache-2.0][14]                            |
| [Maven Flatten Plugin][42]                              | [Apache Software License][14]               |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][43] | [ASL2][12]                                  |
| [Maven Surefire Plugin][44]                             | [Apache-2.0][14]                            |
| [Versions Maven Plugin][45]                             | [Apache License, Version 2.0][14]           |
| [duplicate-finder-maven-plugin Maven Mojo][46]          | [Apache License 2.0][47]                    |
| [Apache Maven Artifact Plugin][48]                      | [Apache-2.0][14]                            |
| [Apache Maven Deploy Plugin][49]                        | [Apache-2.0][14]                            |
| [Apache Maven GPG Plugin][50]                           | [Apache-2.0][14]                            |
| [Apache Maven Source Plugin][51]                        | [Apache-2.0][14]                            |
| [Apache Maven Javadoc Plugin][52]                       | [Apache-2.0][14]                            |
| [Central Publishing Maven Plugin][53]                   | [The Apache License, Version 2.0][14]       |
| [Maven Failsafe Plugin][54]                             | [Apache-2.0][14]                            |
| [JaCoCo :: Maven Plugin][55]                            | [EPL-2.0][56]                               |
| [Quality Summarizer Maven Plugin][57]                   | [MIT License][58]                           |
| [error-code-crawler-maven-plugin][59]                   | [MIT License][60]                           |
| [Git Commit Id Maven Plugin][61]                        | [GNU Lesser General Public License 3.0][62] |
| [Project Keeper Maven plugin][63]                       | [The MIT License][64]                       |
| [Apache Maven Clean Plugin][65]                         | [Apache-2.0][14]                            |
| [Apache Maven Resources Plugin][66]                     | [Apache-2.0][14]                            |
| [Apache Maven Install Plugin][67]                       | [Apache-2.0][14]                            |
| [Apache Maven Site Plugin][68]                          | [Apache-2.0][14]                            |

[0]: https://www.exasol.com/
[1]: https://repo1.maven.org/maven2/com/exasol/exasol-jdbc/26.2.7/exasol-jdbc-26.2.7-license.txt
[2]: https://github.com/exasol/sql-statement-builder/
[3]: https://github.com/exasol/sql-statement-builder/blob/main/LICENSE
[4]: https://github.com/exasol/error-reporting-java/
[5]: https://github.com/exasol/error-reporting-java/blob/main/LICENSE
[6]: https://spark.apache.org/
[7]: https://www.apache.org/licenses/LICENSE-2.0.html
[8]: https://github.com/yawkat/lz4-java
[9]: https://www.apache.org/licenses/LICENSE-2.0
[10]: https://www.scala-lang.org/
[11]: http://ant.apache.org/ivy/
[12]: http://www.apache.org/licenses/LICENSE-2.0.txt
[13]: http://zookeeper.apache.org/zookeeper
[14]: https://www.apache.org/licenses/LICENSE-2.0.txt
[15]: https://avro.apache.org
[16]: http://janino-compiler.github.io/janino/
[17]: https://spdx.org/licenses/BSD-3-Clause.html
[18]: https://developers.google.com/protocol-buffers/protobuf-java/
[19]: https://opensource.org/licenses/BSD-3-Clause
[20]: https://github.com/mockito/mockito
[21]: https://opensource.org/licenses/MIT
[22]: https://junit.org/
[23]: https://www.eclipse.org/legal/epl-v20.html
[24]: http://hamcrest.org/JavaHamcrest/
[25]: https://raw.githubusercontent.com/hamcrest/JavaHamcrest/master/LICENSE
[26]: https://java.testcontainers.org
[27]: http://opensource.org/licenses/MIT
[28]: https://github.com/exasol/exasol-testcontainers/
[29]: https://github.com/exasol/exasol-testcontainers/blob/main/LICENSE
[30]: https://github.com/exasol/test-db-builder-java/
[31]: https://github.com/exasol/test-db-builder-java/blob/main/LICENSE
[32]: https://github.com/exasol/hamcrest-resultset-matcher/
[33]: https://github.com/exasol/hamcrest-resultset-matcher/blob/main/LICENSE
[34]: https://github.com/exasol/java-util-logging-testing/
[35]: https://github.com/exasol/java-util-logging-testing/blob/main/LICENSE
[36]: https://www.jqno.nl/equalsverifier
[37]: https://docs.sonarsource.com/sonarqube-server/latest/extension-guide/developing-a-plugin/plugin-basics/sonar-scanner-maven/sonar-maven-plugin/
[38]: http://www.gnu.org/licenses/lgpl.txt
[39]: https://maven.apache.org/plugins/maven-toolchains-plugin/
[40]: https://maven.apache.org/plugins/maven-compiler-plugin/
[41]: https://maven.apache.org/enforcer/maven-enforcer-plugin/
[42]: https://www.mojohaus.org/flatten-maven-plugin/
[43]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[44]: https://maven.apache.org/surefire/maven-surefire-plugin/
[45]: https://www.mojohaus.org/versions/versions-maven-plugin/
[46]: https://basepom.github.io/duplicate-finder-maven-plugin
[47]: http://www.apache.org/licenses/LICENSE-2.0.html
[48]: https://maven.apache.org/plugins/maven-artifact-plugin/
[49]: https://maven.apache.org/plugins/maven-deploy-plugin/
[50]: https://maven.apache.org/plugins/maven-gpg-plugin/
[51]: https://maven.apache.org/plugins/maven-source-plugin/
[52]: https://maven.apache.org/plugins/maven-javadoc-plugin/
[53]: https://central.sonatype.org
[54]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[55]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[56]: https://www.eclipse.org/legal/epl-2.0/
[57]: https://github.com/exasol/quality-summarizer-maven-plugin/
[58]: https://github.com/exasol/quality-summarizer-maven-plugin/blob/main/LICENSE
[59]: https://github.com/exasol/error-code-crawler-maven-plugin/
[60]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[61]: https://github.com/git-commit-id/git-commit-id-maven-plugin
[62]: http://www.gnu.org/licenses/lgpl-3.0.txt
[63]: https://github.com/exasol/project-keeper/
[64]: https://github.com/exasol/project-keeper/blob/main/LICENSE
[65]: https://maven.apache.org/plugins/maven-clean-plugin/
[66]: https://maven.apache.org/plugins/maven-resources-plugin/
[67]: https://maven.apache.org/plugins/maven-install-plugin/
[68]: https://maven.apache.org/plugins/maven-site-plugin/
