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

## Test Dependencies

| Dependency                                      | License                                        |
| ----------------------------------------------- | ---------------------------------------------- |
| [mockito-core][19]                              | [MIT][20]                                      |
| [mockito-junit-jupiter][19]                     | [MIT][20]                                      |
| [JUnit Jupiter (Aggregator)][21]                | [Eclipse Public License v2.0][22]              |
| [JUnit Jupiter API][21]                         | [Eclipse Public License v2.0][22]              |
| [Hamcrest][23]                                  | [BSD License 3][24]                            |
| [Testcontainers :: JUnit Jupiter Extension][25] | [MIT][26]                                      |
| [Test containers for Exasol on Docker][27]      | [MIT License][28]                              |
| [Test Database Builder for Java][29]            | [MIT License][30]                              |
| [Matcher for SQL Result Sets][31]               | [MIT License][32]                              |
| [Test utilities for `java.util.logging`][33]    | [MIT][20]                                      |
| [EqualsVerifier \| release normal jar][34]      | [Apache License, Version 2.0][11]              |
| [Jackson-core][35]                              | [The Apache Software License, Version 2.0][11] |

## Plugin Dependencies

| Dependency                                              | License                           |
| ------------------------------------------------------- | --------------------------------- |
| [SonarQube Scanner for Maven][36]                       | [GNU LGPL 3][37]                  |
| [Apache Maven Toolchains Plugin][38]                    | [Apache License, Version 2.0][11] |
| [Apache Maven Compiler Plugin][39]                      | [Apache-2.0][11]                  |
| [Apache Maven Enforcer Plugin][40]                      | [Apache-2.0][11]                  |
| [Maven Flatten Plugin][41]                              | [Apache Software Licenese][11]    |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][42] | [ASL2][15]                        |
| [Maven Surefire Plugin][43]                             | [Apache-2.0][11]                  |
| [Versions Maven Plugin][44]                             | [Apache License, Version 2.0][11] |
| [duplicate-finder-maven-plugin Maven Mojo][45]          | [Apache License 2.0][7]           |
| [Apache Maven Deploy Plugin][46]                        | [Apache-2.0][11]                  |
| [Apache Maven GPG Plugin][47]                           | [Apache-2.0][11]                  |
| [Apache Maven Source Plugin][48]                        | [Apache License, Version 2.0][11] |
| [Apache Maven Javadoc Plugin][49]                       | [Apache-2.0][11]                  |
| [Nexus Staging Maven Plugin][50]                        | [Eclipse Public License][51]      |
| [Maven Failsafe Plugin][52]                             | [Apache-2.0][11]                  |
| [JaCoCo :: Maven Plugin][53]                            | [EPL-2.0][54]                     |
| [error-code-crawler-maven-plugin][55]                   | [MIT License][56]                 |
| [Reproducible Build Maven Plugin][57]                   | [Apache 2.0][15]                  |
| [Project Keeper Maven plugin][58]                       | [The MIT License][59]             |

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
[19]: https://github.com/mockito/mockito
[20]: https://opensource.org/licenses/MIT
[21]: https://junit.org/junit5/
[22]: https://www.eclipse.org/legal/epl-v20.html
[23]: http://hamcrest.org/JavaHamcrest/
[24]: http://opensource.org/licenses/BSD-3-Clause
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
[35]: https://github.com/FasterXML/jackson-core
[36]: http://sonarsource.github.io/sonar-scanner-maven/
[37]: http://www.gnu.org/licenses/lgpl.txt
[38]: https://maven.apache.org/plugins/maven-toolchains-plugin/
[39]: https://maven.apache.org/plugins/maven-compiler-plugin/
[40]: https://maven.apache.org/enforcer/maven-enforcer-plugin/
[41]: https://www.mojohaus.org/flatten-maven-plugin/
[42]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[43]: https://maven.apache.org/surefire/maven-surefire-plugin/
[44]: https://www.mojohaus.org/versions/versions-maven-plugin/
[45]: https://basepom.github.io/duplicate-finder-maven-plugin
[46]: https://maven.apache.org/plugins/maven-deploy-plugin/
[47]: https://maven.apache.org/plugins/maven-gpg-plugin/
[48]: https://maven.apache.org/plugins/maven-source-plugin/
[49]: https://maven.apache.org/plugins/maven-javadoc-plugin/
[50]: http://www.sonatype.com/public-parent/nexus-maven-plugins/nexus-staging/nexus-staging-maven-plugin/
[51]: http://www.eclipse.org/legal/epl-v10.html
[52]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[53]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[54]: https://www.eclipse.org/legal/epl-2.0/
[55]: https://github.com/exasol/error-code-crawler-maven-plugin/
[56]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[57]: http://zlika.github.io/reproducible-build-maven-plugin
[58]: https://github.com/exasol/project-keeper/
[59]: https://github.com/exasol/project-keeper/blob/main/LICENSE
