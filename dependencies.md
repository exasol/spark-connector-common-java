<!-- @formatter:off -->
# Dependencies

## Compile Dependencies

| Dependency                        | License                                        |
| --------------------------------- | ---------------------------------------------- |
| [Exasol JDBC Driver][0]           | [EXAClient License][1]                         |
| [Exasol SQL Statement Builder][2] | [MIT License][3]                               |
| [error-reporting-java8][4]        | [MIT License][5]                               |
| [Spark Project SQL][6]            | [Apache-2.0][7]                                |
| [aircompressor][8]                | [Apache License 2.0][7]                        |
| [LZ4 Java Compression][9]         | [Apache License, Version 2.0][10]              |
| [Scala Library][11]               | [Apache-2.0][10]                               |
| [Apache Ivy][12]                  | [The Apache Software License, Version 2.0][13] |
| [Apache ZooKeeper - Server][14]   | [Apache License, Version 2.0][15]              |
| [Apache Avro][16]                 | [Apache-2.0][15]                               |
| [janino][17]                      | [BSD-3-Clause][18]                             |
| [Protocol Buffers [Core]][19]     | [BSD-3-Clause][20]                             |

## Test Dependencies

| Dependency                                      | License                           |
| ----------------------------------------------- | --------------------------------- |
| [mockito-junit-jupiter][21]                     | [MIT][22]                         |
| [JUnit Jupiter Params][23]                      | [Eclipse Public License v2.0][24] |
| [Hamcrest][25]                                  | [BSD-3-Clause][26]                |
| [Testcontainers :: JUnit Jupiter Extension][27] | [MIT][28]                         |
| [Test containers for Exasol on Docker][29]      | [MIT License][30]                 |
| [Test Database Builder for Java][31]            | [MIT License][32]                 |
| [Matcher for SQL Result Sets][33]               | [MIT License][34]                 |
| [Test utilities for java-util-logging][35]      | [MIT License][36]                 |
| [EqualsVerifier \| release normal jar][37]      | [Apache License, Version 2.0][15] |

## Plugin Dependencies

| Dependency                                              | License                                        |
| ------------------------------------------------------- | ---------------------------------------------- |
| [SonarQube Scanner for Maven][38]                       | [GNU LGPL 3][39]                               |
| [Apache Maven Toolchains Plugin][40]                    | [Apache-2.0][15]                               |
| [Apache Maven Compiler Plugin][41]                      | [Apache-2.0][15]                               |
| [Apache Maven Enforcer Plugin][42]                      | [Apache-2.0][15]                               |
| [Maven Flatten Plugin][43]                              | [Apache Software License][15]                  |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][44] | [ASL2][13]                                     |
| [Maven Surefire Plugin][45]                             | [Apache-2.0][15]                               |
| [Versions Maven Plugin][46]                             | [Apache License, Version 2.0][15]              |
| [duplicate-finder-maven-plugin Maven Mojo][47]          | [Apache License 2.0][48]                       |
| [Apache Maven Artifact Plugin][49]                      | [Apache-2.0][15]                               |
| [Apache Maven Deploy Plugin][50]                        | [Apache-2.0][15]                               |
| [Apache Maven Source Plugin][51]                        | [Apache-2.0][15]                               |
| [Apache Maven Javadoc Plugin][52]                       | [Apache-2.0][15]                               |
| [spdx-maven-plugin Maven Plugin][53]                    | [The Apache Software License, Version 2.0][13] |
| [Build Helper Maven Plugin][54]                         | [The MIT License][55]                          |
| [Apache Maven GPG Plugin][56]                           | [Apache-2.0][15]                               |
| [Central Publishing Maven Plugin][57]                   | [The Apache License, Version 2.0][15]          |
| [Apache Maven Dependency Plugin][58]                    | [Apache-2.0][15]                               |
| [Maven Failsafe Plugin][59]                             | [Apache-2.0][15]                               |
| [JaCoCo :: Maven Plugin][60]                            | [EPL-2.0][61]                                  |
| [error-code-crawler-maven-plugin][62]                   | [MIT License][63]                              |
| [Git Commit Id Maven Plugin][64]                        | [GNU Lesser General Public License 3.0][65]    |
| [Project Keeper Maven plugin][66]                       | [The MIT License][67]                          |
| [Apache Maven Clean Plugin][68]                         | [Apache-2.0][15]                               |
| [Apache Maven Resources Plugin][69]                     | [Apache-2.0][15]                               |
| [Apache Maven Install Plugin][70]                       | [Apache-2.0][15]                               |
| [Apache Maven Site Plugin][71]                          | [Apache-2.0][15]                               |

[0]: https://www.exasol.com/
[1]: https://repo1.maven.org/maven2/com/exasol/exasol-jdbc/26.2.8/exasol-jdbc-26.2.8-license.txt
[2]: https://github.com/exasol/sql-statement-builder/
[3]: https://github.com/exasol/sql-statement-builder/blob/main/LICENSE
[4]: https://github.com/exasol/error-reporting-java/
[5]: https://github.com/exasol/error-reporting-java/blob/main/LICENSE
[6]: https://spark.apache.org/
[7]: https://www.apache.org/licenses/LICENSE-2.0.html
[8]: https://github.com/airlift/aircompressor
[9]: https://github.com/yawkat/lz4-java
[10]: https://www.apache.org/licenses/LICENSE-2.0
[11]: https://www.scala-lang.org/
[12]: http://ant.apache.org/ivy/
[13]: http://www.apache.org/licenses/LICENSE-2.0.txt
[14]: http://zookeeper.apache.org/zookeeper
[15]: https://www.apache.org/licenses/LICENSE-2.0.txt
[16]: https://avro.apache.org
[17]: http://janino-compiler.github.io/janino/
[18]: https://spdx.org/licenses/BSD-3-Clause.html
[19]: https://developers.google.com/protocol-buffers/protobuf-java/
[20]: https://opensource.org/licenses/BSD-3-Clause
[21]: https://github.com/mockito/mockito
[22]: https://opensource.org/licenses/MIT
[23]: https://junit.org/
[24]: https://www.eclipse.org/legal/epl-v20.html
[25]: http://hamcrest.org/JavaHamcrest/
[26]: https://raw.githubusercontent.com/hamcrest/JavaHamcrest/master/LICENSE
[27]: https://java.testcontainers.org
[28]: http://opensource.org/licenses/MIT
[29]: https://github.com/exasol/exasol-testcontainers/
[30]: https://github.com/exasol/exasol-testcontainers/blob/main/LICENSE
[31]: https://github.com/exasol/test-db-builder-java/
[32]: https://github.com/exasol/test-db-builder-java/blob/main/LICENSE
[33]: https://github.com/exasol/hamcrest-resultset-matcher/
[34]: https://github.com/exasol/hamcrest-resultset-matcher/blob/main/LICENSE
[35]: https://github.com/exasol/java-util-logging-testing/
[36]: https://github.com/exasol/java-util-logging-testing/blob/main/LICENSE
[37]: https://www.jqno.nl/equalsverifier
[38]: https://docs.sonarsource.com/sonarqube-server/latest/extension-guide/developing-a-plugin/plugin-basics/sonar-scanner-maven/sonar-maven-plugin/
[39]: http://www.gnu.org/licenses/lgpl.txt
[40]: https://maven.apache.org/plugins/maven-toolchains-plugin/
[41]: https://maven.apache.org/plugins/maven-compiler-plugin/
[42]: https://maven.apache.org/enforcer/maven-enforcer-plugin/
[43]: https://www.mojohaus.org/flatten-maven-plugin/
[44]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[45]: https://maven.apache.org/surefire/maven-surefire-plugin/
[46]: https://www.mojohaus.org/versions/versions-maven-plugin/
[47]: https://basepom.github.io/duplicate-finder-maven-plugin
[48]: http://www.apache.org/licenses/LICENSE-2.0.html
[49]: https://maven.apache.org/plugins/maven-artifact-plugin/
[50]: https://maven.apache.org/plugins/maven-deploy-plugin/
[51]: https://maven.apache.org/plugins/maven-source-plugin/
[52]: https://maven.apache.org/plugins/maven-javadoc-plugin/
[53]: https://github.com/spdx/spdx-maven-plugin
[54]: https://www.mojohaus.org/build-helper-maven-plugin/
[55]: https://spdx.org/licenses/MIT.txt
[56]: https://maven.apache.org/plugins/maven-gpg-plugin/
[57]: https://central.sonatype.org
[58]: https://maven.apache.org/plugins/maven-dependency-plugin/
[59]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[60]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[61]: https://www.eclipse.org/legal/epl-2.0/
[62]: https://github.com/exasol/error-code-crawler-maven-plugin/
[63]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[64]: https://github.com/git-commit-id/git-commit-id-maven-plugin
[65]: http://www.gnu.org/licenses/lgpl-3.0.txt
[66]: https://github.com/exasol/project-keeper/
[67]: https://github.com/exasol/project-keeper/blob/main/LICENSE
[68]: https://maven.apache.org/plugins/maven-clean-plugin/
[69]: https://maven.apache.org/plugins/maven-resources-plugin/
[70]: https://maven.apache.org/plugins/maven-install-plugin/
[71]: https://maven.apache.org/plugins/maven-site-plugin/
