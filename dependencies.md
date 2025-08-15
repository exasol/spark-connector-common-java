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
| [Apache Ivy][10]                  | [The Apache Software License, Version 2.0][11] |
| [Apache ZooKeeper - Server][12]   | [Apache License, Version 2.0][13]              |
| [Apache Avro][14]                 | [Apache-2.0][13]                               |
| [janino][15]                      | [BSD-3-Clause][16]                             |
| [Protocol Buffers [Core]][17]     | [BSD-3-Clause][18]                             |

## Test Dependencies

| Dependency                                      | License                           |
| ----------------------------------------------- | --------------------------------- |
| [mockito-core][19]                              | [MIT][20]                         |
| [mockito-junit-jupiter][19]                     | [MIT][20]                         |
| [JUnit Jupiter (Aggregator)][21]                | [Eclipse Public License v2.0][22] |
| [JUnit Jupiter API][21]                         | [Eclipse Public License v2.0][22] |
| [Hamcrest][23]                                  | [BSD-3-Clause][24]                |
| [Testcontainers :: JUnit Jupiter Extension][25] | [MIT][26]                         |
| [Test containers for Exasol on Docker][27]      | [MIT License][28]                 |
| [Test Database Builder for Java][29]            | [MIT License][30]                 |
| [Matcher for SQL Result Sets][31]               | [MIT License][32]                 |
| [Test utilities for `java.util.logging`][33]    | [MIT][20]                         |
| [EqualsVerifier \| release normal jar][34]      | [Apache License, Version 2.0][13] |

## Plugin Dependencies

| Dependency                                              | License                                     |
| ------------------------------------------------------- | ------------------------------------------- |
| [Apache Maven Clean Plugin][35]                         | [Apache-2.0][13]                            |
| [Apache Maven Install Plugin][36]                       | [Apache-2.0][13]                            |
| [Apache Maven Resources Plugin][37]                     | [Apache-2.0][13]                            |
| [Apache Maven Site Plugin][38]                          | [Apache-2.0][13]                            |
| [SonarQube Scanner for Maven][39]                       | [GNU LGPL 3][40]                            |
| [Apache Maven Toolchains Plugin][41]                    | [Apache-2.0][13]                            |
| [Apache Maven Compiler Plugin][42]                      | [Apache-2.0][13]                            |
| [Apache Maven Enforcer Plugin][43]                      | [Apache-2.0][13]                            |
| [Maven Flatten Plugin][44]                              | [Apache Software Licenese][13]              |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][45] | [ASL2][11]                                  |
| [Maven Surefire Plugin][46]                             | [Apache-2.0][13]                            |
| [Versions Maven Plugin][47]                             | [Apache License, Version 2.0][13]           |
| [duplicate-finder-maven-plugin Maven Mojo][48]          | [Apache License 2.0][7]                     |
| [Apache Maven Artifact Plugin][49]                      | [Apache-2.0][13]                            |
| [Apache Maven Deploy Plugin][50]                        | [Apache-2.0][13]                            |
| [Apache Maven GPG Plugin][51]                           | [Apache-2.0][13]                            |
| [Apache Maven Source Plugin][52]                        | [Apache License, Version 2.0][13]           |
| [Apache Maven Javadoc Plugin][53]                       | [Apache-2.0][13]                            |
| [Central Publishing Maven Plugin][54]                   | [The Apache License, Version 2.0][13]       |
| [Maven Failsafe Plugin][55]                             | [Apache-2.0][13]                            |
| [JaCoCo :: Maven Plugin][56]                            | [EPL-2.0][57]                               |
| [Quality Summarizer Maven Plugin][58]                   | [MIT License][59]                           |
| [error-code-crawler-maven-plugin][60]                   | [MIT License][61]                           |
| [Git Commit Id Maven Plugin][62]                        | [GNU Lesser General Public License 3.0][63] |
| [Project Keeper Maven plugin][64]                       | [The MIT License][65]                       |

[0]: http://www.exasol.com/
[1]: https://repo1.maven.org/maven2/com/exasol/exasol-jdbc/25.2.4/exasol-jdbc-25.2.4-license.txt
[2]: https://github.com/exasol/sql-statement-builder/
[3]: https://github.com/exasol/sql-statement-builder/blob/main/LICENSE
[4]: https://github.com/exasol/error-reporting-java/
[5]: https://github.com/exasol/error-reporting-java/blob/main/LICENSE
[6]: https://spark.apache.org/
[7]: http://www.apache.org/licenses/LICENSE-2.0.html
[8]: https://www.scala-lang.org/
[9]: https://www.apache.org/licenses/LICENSE-2.0
[10]: http://ant.apache.org/ivy/
[11]: http://www.apache.org/licenses/LICENSE-2.0.txt
[12]: http://zookeeper.apache.org/zookeeper
[13]: https://www.apache.org/licenses/LICENSE-2.0.txt
[14]: https://avro.apache.org
[15]: http://janino-compiler.github.io/janino/
[16]: https://spdx.org/licenses/BSD-3-Clause.html
[17]: https://developers.google.com/protocol-buffers/protobuf-java/
[18]: https://opensource.org/licenses/BSD-3-Clause
[19]: https://github.com/mockito/mockito
[20]: https://opensource.org/licenses/MIT
[21]: https://junit.org/
[22]: https://www.eclipse.org/legal/epl-v20.html
[23]: http://hamcrest.org/JavaHamcrest/
[24]: https://raw.githubusercontent.com/hamcrest/JavaHamcrest/master/LICENSE
[25]: https://java.testcontainers.org
[26]: http://opensource.org/licenses/MIT
[27]: https://github.com/exasol/exasol-testcontainers/
[28]: https://github.com/exasol/exasol-testcontainers/blob/main/LICENSE
[29]: https://github.com/exasol/test-db-builder-java/
[30]: https://github.com/exasol/test-db-builder-java/blob/main/LICENSE
[31]: https://github.com/exasol/hamcrest-resultset-matcher/
[32]: https://github.com/exasol/hamcrest-resultset-matcher/blob/main/LICENSE
[33]: https://github.com/exasol/java-util-logging-testing/
[34]: https://www.jqno.nl/equalsverifier
[35]: https://maven.apache.org/plugins/maven-clean-plugin/
[36]: https://maven.apache.org/plugins/maven-install-plugin/
[37]: https://maven.apache.org/plugins/maven-resources-plugin/
[38]: https://maven.apache.org/plugins/maven-site-plugin/
[39]: http://docs.sonarqube.org/display/PLUG/Plugin+Library/sonar-scanner-maven/sonar-maven-plugin
[40]: http://www.gnu.org/licenses/lgpl.txt
[41]: https://maven.apache.org/plugins/maven-toolchains-plugin/
[42]: https://maven.apache.org/plugins/maven-compiler-plugin/
[43]: https://maven.apache.org/enforcer/maven-enforcer-plugin/
[44]: https://www.mojohaus.org/flatten-maven-plugin/
[45]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[46]: https://maven.apache.org/surefire/maven-surefire-plugin/
[47]: https://www.mojohaus.org/versions/versions-maven-plugin/
[48]: https://basepom.github.io/duplicate-finder-maven-plugin
[49]: https://maven.apache.org/plugins/maven-artifact-plugin/
[50]: https://maven.apache.org/plugins/maven-deploy-plugin/
[51]: https://maven.apache.org/plugins/maven-gpg-plugin/
[52]: https://maven.apache.org/plugins/maven-source-plugin/
[53]: https://maven.apache.org/plugins/maven-javadoc-plugin/
[54]: https://central.sonatype.org
[55]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[56]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[57]: https://www.eclipse.org/legal/epl-2.0/
[58]: https://github.com/exasol/quality-summarizer-maven-plugin/
[59]: https://github.com/exasol/quality-summarizer-maven-plugin/blob/main/LICENSE
[60]: https://github.com/exasol/error-code-crawler-maven-plugin/
[61]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[62]: https://github.com/git-commit-id/git-commit-id-maven-plugin
[63]: http://www.gnu.org/licenses/lgpl-3.0.txt
[64]: https://github.com/exasol/project-keeper/
[65]: https://github.com/exasol/project-keeper/blob/main/LICENSE
