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

## Test Dependencies

| Dependency                                      | License                                        |
| ----------------------------------------------- | ---------------------------------------------- |
| [mockito-core][20]                              | [MIT][21]                                      |
| [mockito-junit-jupiter][20]                     | [MIT][21]                                      |
| [JUnit Jupiter (Aggregator)][22]                | [Eclipse Public License v2.0][23]              |
| [JUnit Jupiter API][22]                         | [Eclipse Public License v2.0][23]              |
| [Hamcrest][24]                                  | [BSD License 3][25]                            |
| [Testcontainers :: JUnit Jupiter Extension][26] | [MIT][27]                                      |
| [Test containers for Exasol on Docker][28]      | [MIT License][29]                              |
| [Test Database Builder for Java][30]            | [MIT License][31]                              |
| [Matcher for SQL Result Sets][32]               | [MIT License][33]                              |
| [Test utilities for `java.util.logging`][34]    | [MIT][21]                                      |
| [EqualsVerifier \| release normal jar][35]      | [Apache License, Version 2.0][11]              |
| [Jackson-core][36]                              | [The Apache Software License, Version 2.0][11] |

## Plugin Dependencies

| Dependency                                              | License                           |
| ------------------------------------------------------- | --------------------------------- |
| [SonarQube Scanner for Maven][37]                       | [GNU LGPL 3][38]                  |
| [Apache Maven Toolchains Plugin][39]                    | [Apache License, Version 2.0][11] |
| [Apache Maven Compiler Plugin][40]                      | [Apache-2.0][11]                  |
| [Apache Maven Enforcer Plugin][41]                      | [Apache-2.0][11]                  |
| [Maven Flatten Plugin][42]                              | [Apache Software Licenese][11]    |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][43] | [ASL2][15]                        |
| [Maven Surefire Plugin][44]                             | [Apache-2.0][11]                  |
| [Versions Maven Plugin][45]                             | [Apache License, Version 2.0][11] |
| [duplicate-finder-maven-plugin Maven Mojo][46]          | [Apache License 2.0][7]           |
| [Apache Maven Deploy Plugin][47]                        | [Apache-2.0][11]                  |
| [Apache Maven GPG Plugin][48]                           | [Apache-2.0][11]                  |
| [Apache Maven Source Plugin][49]                        | [Apache License, Version 2.0][11] |
| [Apache Maven Javadoc Plugin][50]                       | [Apache-2.0][11]                  |
| [Nexus Staging Maven Plugin][51]                        | [Eclipse Public License][52]      |
| [Maven Failsafe Plugin][53]                             | [Apache-2.0][11]                  |
| [JaCoCo :: Maven Plugin][54]                            | [EPL-2.0][55]                     |
| [error-code-crawler-maven-plugin][56]                   | [MIT License][57]                 |
| [Reproducible Build Maven Plugin][58]                   | [Apache 2.0][15]                  |
| [Project Keeper Maven plugin][59]                       | [The MIT License][60]             |

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
[20]: https://github.com/mockito/mockito
[21]: https://opensource.org/licenses/MIT
[22]: https://junit.org/junit5/
[23]: https://www.eclipse.org/legal/epl-v20.html
[24]: http://hamcrest.org/JavaHamcrest/
[25]: http://opensource.org/licenses/BSD-3-Clause
[26]: https://java.testcontainers.org
[27]: http://opensource.org/licenses/MIT
[28]: https://github.com/exasol/exasol-testcontainers/
[29]: https://github.com/exasol/exasol-testcontainers/blob/main/LICENSE
[30]: https://github.com/exasol/test-db-builder-java/
[31]: https://github.com/exasol/test-db-builder-java/blob/main/LICENSE
[32]: https://github.com/exasol/hamcrest-resultset-matcher/
[33]: https://github.com/exasol/hamcrest-resultset-matcher/blob/main/LICENSE
[34]: https://github.com/exasol/java-util-logging-testing/
[35]: https://www.jqno.nl/equalsverifier
[36]: https://github.com/FasterXML/jackson-core
[37]: http://sonarsource.github.io/sonar-scanner-maven/
[38]: http://www.gnu.org/licenses/lgpl.txt
[39]: https://maven.apache.org/plugins/maven-toolchains-plugin/
[40]: https://maven.apache.org/plugins/maven-compiler-plugin/
[41]: https://maven.apache.org/enforcer/maven-enforcer-plugin/
[42]: https://www.mojohaus.org/flatten-maven-plugin/
[43]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[44]: https://maven.apache.org/surefire/maven-surefire-plugin/
[45]: https://www.mojohaus.org/versions/versions-maven-plugin/
[46]: https://basepom.github.io/duplicate-finder-maven-plugin
[47]: https://maven.apache.org/plugins/maven-deploy-plugin/
[48]: https://maven.apache.org/plugins/maven-gpg-plugin/
[49]: https://maven.apache.org/plugins/maven-source-plugin/
[50]: https://maven.apache.org/plugins/maven-javadoc-plugin/
[51]: http://www.sonatype.com/public-parent/nexus-maven-plugins/nexus-staging/nexus-staging-maven-plugin/
[52]: http://www.eclipse.org/legal/epl-v10.html
[53]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[54]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[55]: https://www.eclipse.org/legal/epl-2.0/
[56]: https://github.com/exasol/error-code-crawler-maven-plugin/
[57]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[58]: http://zlika.github.io/reproducible-build-maven-plugin
[59]: https://github.com/exasol/project-keeper/
[60]: https://github.com/exasol/project-keeper/blob/main/LICENSE
