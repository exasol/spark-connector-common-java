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
| [Apache Commons Compress][10]     | [Apache-2.0][11]                               |
| [snappy-java][12]                 | [Apache-2.0][13]                               |
| [Apache Ivy][14]                  | [The Apache Software License, Version 2.0][15] |
| [Apache ZooKeeper - Server][16]   | [Apache License, Version 2.0][11]              |
| [Apache Avro][17]                 | [Apache-2.0][11]                               |
| [Joda-Time][18]                   | [Apache License, Version 2.0][11]              |
| [Netty/All-in-One][19]            | [Apache License, Version 2.0][9]               |
| [janino][20]                      | [BSD-3-Clause][21]                             |

## Test Dependencies

| Dependency                                      | License                                        |
| ----------------------------------------------- | ---------------------------------------------- |
| [mockito-core][22]                              | [MIT][23]                                      |
| [mockito-junit-jupiter][22]                     | [MIT][23]                                      |
| [JUnit Jupiter (Aggregator)][24]                | [Eclipse Public License v2.0][25]              |
| [JUnit Jupiter API][24]                         | [Eclipse Public License v2.0][25]              |
| [Hamcrest][26]                                  | [BSD License 3][27]                            |
| [Testcontainers :: JUnit Jupiter Extension][28] | [MIT][29]                                      |
| [Test containers for Exasol on Docker][30]      | [MIT License][31]                              |
| [Test Database Builder for Java][32]            | [MIT License][33]                              |
| [Matcher for SQL Result Sets][34]               | [MIT License][35]                              |
| [Test utilities for `java.util.logging`][36]    | [MIT][23]                                      |
| [EqualsVerifier \| release normal jar][37]      | [Apache License, Version 2.0][11]              |
| [Jackson-core][38]                              | [The Apache Software License, Version 2.0][11] |

## Plugin Dependencies

| Dependency                                              | License                           |
| ------------------------------------------------------- | --------------------------------- |
| [SonarQube Scanner for Maven][39]                       | [GNU LGPL 3][40]                  |
| [Apache Maven Toolchains Plugin][41]                    | [Apache License, Version 2.0][11] |
| [Apache Maven Compiler Plugin][42]                      | [Apache-2.0][11]                  |
| [Apache Maven Enforcer Plugin][43]                      | [Apache-2.0][11]                  |
| [Maven Flatten Plugin][44]                              | [Apache Software Licenese][11]    |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][45] | [ASL2][15]                        |
| [Maven Surefire Plugin][46]                             | [Apache-2.0][11]                  |
| [Versions Maven Plugin][47]                             | [Apache License, Version 2.0][11] |
| [duplicate-finder-maven-plugin Maven Mojo][48]          | [Apache License 2.0][7]           |
| [Apache Maven Deploy Plugin][49]                        | [Apache-2.0][11]                  |
| [Apache Maven GPG Plugin][50]                           | [Apache-2.0][11]                  |
| [Apache Maven Source Plugin][51]                        | [Apache License, Version 2.0][11] |
| [Apache Maven Javadoc Plugin][52]                       | [Apache-2.0][11]                  |
| [Nexus Staging Maven Plugin][53]                        | [Eclipse Public License][54]      |
| [Maven Failsafe Plugin][55]                             | [Apache-2.0][11]                  |
| [JaCoCo :: Maven Plugin][56]                            | [EPL-2.0][57]                     |
| [error-code-crawler-maven-plugin][58]                   | [MIT License][59]                 |
| [Reproducible Build Maven Plugin][60]                   | [Apache 2.0][15]                  |
| [Project Keeper Maven plugin][61]                       | [The MIT License][62]             |

[0]: http://www.exasol.com/
[1]: https://repo1.maven.org/maven2/com/exasol/exasol-jdbc/24.0.0/exasol-jdbc-24.0.0-license.txt
[2]: https://github.com/exasol/sql-statement-builder/
[3]: https://github.com/exasol/sql-statement-builder/blob/main/LICENSE
[4]: https://github.com/exasol/error-reporting-java/
[5]: https://github.com/exasol/error-reporting-java/blob/main/LICENSE
[6]: https://spark.apache.org/
[7]: http://www.apache.org/licenses/LICENSE-2.0.html
[8]: https://www.scala-lang.org/
[9]: https://www.apache.org/licenses/LICENSE-2.0
[10]: https://commons.apache.org/proper/commons-compress/
[11]: https://www.apache.org/licenses/LICENSE-2.0.txt
[12]: https://github.com/xerial/snappy-java
[13]: https://www.apache.org/licenses/LICENSE-2.0.html
[14]: http://ant.apache.org/ivy/
[15]: http://www.apache.org/licenses/LICENSE-2.0.txt
[16]: http://zookeeper.apache.org/zookeeper
[17]: https://avro.apache.org
[18]: https://www.joda.org/joda-time/
[19]: https://netty.io/netty-all/
[20]: http://janino-compiler.github.io/janino/
[21]: https://spdx.org/licenses/BSD-3-Clause.html
[22]: https://github.com/mockito/mockito
[23]: https://opensource.org/licenses/MIT
[24]: https://junit.org/junit5/
[25]: https://www.eclipse.org/legal/epl-v20.html
[26]: http://hamcrest.org/JavaHamcrest/
[27]: http://opensource.org/licenses/BSD-3-Clause
[28]: https://java.testcontainers.org
[29]: http://opensource.org/licenses/MIT
[30]: https://github.com/exasol/exasol-testcontainers/
[31]: https://github.com/exasol/exasol-testcontainers/blob/main/LICENSE
[32]: https://github.com/exasol/test-db-builder-java/
[33]: https://github.com/exasol/test-db-builder-java/blob/main/LICENSE
[34]: https://github.com/exasol/hamcrest-resultset-matcher/
[35]: https://github.com/exasol/hamcrest-resultset-matcher/blob/main/LICENSE
[36]: https://github.com/exasol/java-util-logging-testing/
[37]: https://www.jqno.nl/equalsverifier
[38]: https://github.com/FasterXML/jackson-core
[39]: http://sonarsource.github.io/sonar-scanner-maven/
[40]: http://www.gnu.org/licenses/lgpl.txt
[41]: https://maven.apache.org/plugins/maven-toolchains-plugin/
[42]: https://maven.apache.org/plugins/maven-compiler-plugin/
[43]: https://maven.apache.org/enforcer/maven-enforcer-plugin/
[44]: https://www.mojohaus.org/flatten-maven-plugin/
[45]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[46]: https://maven.apache.org/surefire/maven-surefire-plugin/
[47]: https://www.mojohaus.org/versions/versions-maven-plugin/
[48]: https://basepom.github.io/duplicate-finder-maven-plugin
[49]: https://maven.apache.org/plugins/maven-deploy-plugin/
[50]: https://maven.apache.org/plugins/maven-gpg-plugin/
[51]: https://maven.apache.org/plugins/maven-source-plugin/
[52]: https://maven.apache.org/plugins/maven-javadoc-plugin/
[53]: http://www.sonatype.com/public-parent/nexus-maven-plugins/nexus-staging/nexus-staging-maven-plugin/
[54]: http://www.eclipse.org/legal/epl-v10.html
[55]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[56]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[57]: https://www.eclipse.org/legal/epl-2.0/
[58]: https://github.com/exasol/error-code-crawler-maven-plugin/
[59]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[60]: http://zlika.github.io/reproducible-build-maven-plugin
[61]: https://github.com/exasol/project-keeper/
[62]: https://github.com/exasol/project-keeper/blob/main/LICENSE
