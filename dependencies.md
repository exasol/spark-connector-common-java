<!-- @formatter:off -->
# Dependencies

## Compile Dependencies

| Dependency                        | License                                        |
| --------------------------------- | ---------------------------------------------- |
| [EXASolution JDBC Driver][0]      | [EXAClient License][1]                         |
| [Exasol SQL Statement Builder][2] | [MIT License][3]                               |
| [error-reporting-java8][4]        | [MIT License][5]                               |
| [Spark Project SQL][6]            | [Apache 2.0 License][7]                        |
| [Scala Library][8]                | [Apache-2.0][9]                                |
| [Apache Commons Compress][10]     | [Apache-2.0][11]                               |
| [snappy-java][12]                 | [Apache-2.0][13]                               |
| [Apache Ivy][14]                  | [The Apache Software License, Version 2.0][15] |
| [Apache ZooKeeper - Server][16]   | [Apache License, Version 2.0][11]              |
| [Apache Avro][17]                 | [Apache-2.0][11]                               |

## Test Dependencies

| Dependency                                      | License                                        |
| ----------------------------------------------- | ---------------------------------------------- |
| [mockito-core][18]                              | [The MIT License][19]                          |
| [mockito-junit-jupiter][18]                     | [The MIT License][19]                          |
| [JUnit Jupiter (Aggregator)][20]                | [Eclipse Public License v2.0][21]              |
| [JUnit Jupiter API][20]                         | [Eclipse Public License v2.0][21]              |
| [Hamcrest][22]                                  | [BSD License 3][23]                            |
| [Testcontainers :: JUnit Jupiter Extension][24] | [MIT][25]                                      |
| [Test containers for Exasol on Docker][26]      | [MIT License][27]                              |
| [Test Database Builder for Java][28]            | [MIT License][29]                              |
| [Matcher for SQL Result Sets][30]               | [MIT License][31]                              |
| [Test utilities for `java.util.logging`][32]    | [MIT][33]                                      |
| [EqualsVerifier \| release normal jar][34]      | [Apache License, Version 2.0][11]              |
| [Jackson-core][35]                              | [The Apache Software License, Version 2.0][11] |

## Plugin Dependencies

| Dependency                                              | License                           |
| ------------------------------------------------------- | --------------------------------- |
| [SonarQube Scanner for Maven][36]                       | [GNU LGPL 3][37]                  |
| [Apache Maven Compiler Plugin][38]                      | [Apache-2.0][11]                  |
| [Apache Maven Enforcer Plugin][39]                      | [Apache-2.0][11]                  |
| [Maven Flatten Plugin][40]                              | [Apache Software Licenese][11]    |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][41] | [ASL2][15]                        |
| [Maven Surefire Plugin][42]                             | [Apache-2.0][11]                  |
| [Versions Maven Plugin][43]                             | [Apache License, Version 2.0][11] |
| [duplicate-finder-maven-plugin Maven Mojo][44]          | [Apache License 2.0][7]           |
| [Apache Maven Deploy Plugin][45]                        | [Apache-2.0][11]                  |
| [Apache Maven GPG Plugin][46]                           | [Apache-2.0][11]                  |
| [Apache Maven Source Plugin][47]                        | [Apache License, Version 2.0][11] |
| [Apache Maven Javadoc Plugin][48]                       | [Apache-2.0][11]                  |
| [Nexus Staging Maven Plugin][49]                        | [Eclipse Public License][50]      |
| [Maven Failsafe Plugin][51]                             | [Apache-2.0][11]                  |
| [JaCoCo :: Maven Plugin][52]                            | [Eclipse Public License 2.0][53]  |
| [error-code-crawler-maven-plugin][54]                   | [MIT License][55]                 |
| [Reproducible Build Maven Plugin][56]                   | [Apache 2.0][15]                  |
| [Project keeper maven plugin][57]                       | [The MIT License][58]             |

[0]: http://www.exasol.com
[1]: https://repo1.maven.org/maven2/com/exasol/exasol-jdbc/7.1.20/exasol-jdbc-7.1.20-license.txt
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
[18]: https://github.com/mockito/mockito
[19]: https://github.com/mockito/mockito/blob/main/LICENSE
[20]: https://junit.org/junit5/
[21]: https://www.eclipse.org/legal/epl-v20.html
[22]: http://hamcrest.org/JavaHamcrest/
[23]: http://opensource.org/licenses/BSD-3-Clause
[24]: https://java.testcontainers.org
[25]: http://opensource.org/licenses/MIT
[26]: https://github.com/exasol/exasol-testcontainers/
[27]: https://github.com/exasol/exasol-testcontainers/blob/main/LICENSE
[28]: https://github.com/exasol/test-db-builder-java/
[29]: https://github.com/exasol/test-db-builder-java/blob/main/LICENSE
[30]: https://github.com/exasol/hamcrest-resultset-matcher/
[31]: https://github.com/exasol/hamcrest-resultset-matcher/blob/main/LICENSE
[32]: https://github.com/exasol/java-util-logging-testing/
[33]: https://opensource.org/licenses/MIT
[34]: https://www.jqno.nl/equalsverifier
[35]: https://github.com/FasterXML/jackson-core
[36]: http://sonarsource.github.io/sonar-scanner-maven/
[37]: http://www.gnu.org/licenses/lgpl.txt
[38]: https://maven.apache.org/plugins/maven-compiler-plugin/
[39]: https://maven.apache.org/enforcer/maven-enforcer-plugin/
[40]: https://www.mojohaus.org/flatten-maven-plugin/
[41]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[42]: https://maven.apache.org/surefire/maven-surefire-plugin/
[43]: https://www.mojohaus.org/versions/versions-maven-plugin/
[44]: https://basepom.github.io/duplicate-finder-maven-plugin
[45]: https://maven.apache.org/plugins/maven-deploy-plugin/
[46]: https://maven.apache.org/plugins/maven-gpg-plugin/
[47]: https://maven.apache.org/plugins/maven-source-plugin/
[48]: https://maven.apache.org/plugins/maven-javadoc-plugin/
[49]: http://www.sonatype.com/public-parent/nexus-maven-plugins/nexus-staging/nexus-staging-maven-plugin/
[50]: http://www.eclipse.org/legal/epl-v10.html
[51]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[52]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[53]: https://www.eclipse.org/legal/epl-2.0/
[54]: https://github.com/exasol/error-code-crawler-maven-plugin/
[55]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[56]: http://zlika.github.io/reproducible-build-maven-plugin
[57]: https://github.com/exasol/project-keeper/
[58]: https://github.com/exasol/project-keeper/blob/main/LICENSE
