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

## Test Dependencies

| Dependency                                      | License                                        |
| ----------------------------------------------- | ---------------------------------------------- |
| [mockito-core][23]                              | [MIT][24]                                      |
| [mockito-junit-jupiter][23]                     | [MIT][24]                                      |
| [JUnit Jupiter (Aggregator)][25]                | [Eclipse Public License v2.0][26]              |
| [JUnit Jupiter API][25]                         | [Eclipse Public License v2.0][26]              |
| [Hamcrest][27]                                  | [BSD License 3][28]                            |
| [Testcontainers :: JUnit Jupiter Extension][29] | [MIT][30]                                      |
| [Test containers for Exasol on Docker][31]      | [MIT License][32]                              |
| [Test Database Builder for Java][33]            | [MIT License][34]                              |
| [Matcher for SQL Result Sets][35]               | [MIT License][36]                              |
| [Test utilities for `java.util.logging`][37]    | [MIT][24]                                      |
| [EqualsVerifier \| release normal jar][38]      | [Apache License, Version 2.0][13]              |
| [Jackson-core][39]                              | [The Apache Software License, Version 2.0][13] |

## Plugin Dependencies

| Dependency                                              | License                           |
| ------------------------------------------------------- | --------------------------------- |
| [SonarQube Scanner for Maven][40]                       | [GNU LGPL 3][41]                  |
| [Apache Maven Toolchains Plugin][42]                    | [Apache-2.0][13]                  |
| [Apache Maven Compiler Plugin][43]                      | [Apache-2.0][13]                  |
| [Apache Maven Enforcer Plugin][44]                      | [Apache-2.0][13]                  |
| [Maven Flatten Plugin][45]                              | [Apache Software Licenese][13]    |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][46] | [ASL2][16]                        |
| [Maven Surefire Plugin][47]                             | [Apache-2.0][13]                  |
| [Versions Maven Plugin][48]                             | [Apache License, Version 2.0][13] |
| [duplicate-finder-maven-plugin Maven Mojo][49]          | [Apache License 2.0][7]           |
| [Apache Maven Deploy Plugin][50]                        | [Apache-2.0][13]                  |
| [Apache Maven GPG Plugin][51]                           | [Apache-2.0][13]                  |
| [Apache Maven Source Plugin][52]                        | [Apache License, Version 2.0][13] |
| [Apache Maven Javadoc Plugin][53]                       | [Apache-2.0][13]                  |
| [Nexus Staging Maven Plugin][54]                        | [Eclipse Public License][55]      |
| [Maven Failsafe Plugin][56]                             | [Apache-2.0][13]                  |
| [JaCoCo :: Maven Plugin][57]                            | [EPL-2.0][58]                     |
| [error-code-crawler-maven-plugin][59]                   | [MIT License][60]                 |
| [Reproducible Build Maven Plugin][61]                   | [Apache 2.0][16]                  |
| [Project Keeper Maven plugin][62]                       | [The MIT License][63]             |

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
[23]: https://github.com/mockito/mockito
[24]: https://opensource.org/licenses/MIT
[25]: https://junit.org/junit5/
[26]: https://www.eclipse.org/legal/epl-v20.html
[27]: http://hamcrest.org/JavaHamcrest/
[28]: http://opensource.org/licenses/BSD-3-Clause
[29]: https://java.testcontainers.org
[30]: http://opensource.org/licenses/MIT
[31]: https://github.com/exasol/exasol-testcontainers/
[32]: https://github.com/exasol/exasol-testcontainers/blob/main/LICENSE
[33]: https://github.com/exasol/test-db-builder-java/
[34]: https://github.com/exasol/test-db-builder-java/blob/main/LICENSE
[35]: https://github.com/exasol/hamcrest-resultset-matcher/
[36]: https://github.com/exasol/hamcrest-resultset-matcher/blob/main/LICENSE
[37]: https://github.com/exasol/java-util-logging-testing/
[38]: https://www.jqno.nl/equalsverifier
[39]: https://github.com/FasterXML/jackson-core
[40]: http://sonarsource.github.io/sonar-scanner-maven/
[41]: http://www.gnu.org/licenses/lgpl.txt
[42]: https://maven.apache.org/plugins/maven-toolchains-plugin/
[43]: https://maven.apache.org/plugins/maven-compiler-plugin/
[44]: https://maven.apache.org/enforcer/maven-enforcer-plugin/
[45]: https://www.mojohaus.org/flatten-maven-plugin/
[46]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[47]: https://maven.apache.org/surefire/maven-surefire-plugin/
[48]: https://www.mojohaus.org/versions/versions-maven-plugin/
[49]: https://basepom.github.io/duplicate-finder-maven-plugin
[50]: https://maven.apache.org/plugins/maven-deploy-plugin/
[51]: https://maven.apache.org/plugins/maven-gpg-plugin/
[52]: https://maven.apache.org/plugins/maven-source-plugin/
[53]: https://maven.apache.org/plugins/maven-javadoc-plugin/
[54]: http://www.sonatype.com/public-parent/nexus-maven-plugins/nexus-staging/nexus-staging-maven-plugin/
[55]: http://www.eclipse.org/legal/epl-v10.html
[56]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[57]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[58]: https://www.eclipse.org/legal/epl-2.0/
[59]: https://github.com/exasol/error-code-crawler-maven-plugin/
[60]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[61]: http://zlika.github.io/reproducible-build-maven-plugin
[62]: https://github.com/exasol/project-keeper/
[63]: https://github.com/exasol/project-keeper/blob/main/LICENSE
