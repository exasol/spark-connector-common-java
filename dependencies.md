<!-- @formatter:off -->
# Dependencies

## Compile Dependencies

| Dependency                        | License                 |
| --------------------------------- | ----------------------- |
| [EXASolution JDBC Driver][0]      | [EXAClient License][1]  |
| [Exasol SQL Statement Builder][2] | [MIT License][3]        |
| [error-reporting-java8][4]        | [MIT License][5]        |
| [Spark Project SQL][6]            | [Apache 2.0 License][7] |
| [Scala Library][8]                | [Apache-2.0][9]         |

## Test Dependencies

| Dependency                                      | License                           |
| ----------------------------------------------- | --------------------------------- |
| [mockito-core][10]                              | [The MIT License][11]             |
| [mockito-junit-jupiter][10]                     | [The MIT License][11]             |
| [JUnit Jupiter (Aggregator)][12]                | [Eclipse Public License v2.0][13] |
| [JUnit Jupiter API][12]                         | [Eclipse Public License v2.0][13] |
| [Hamcrest][14]                                  | [BSD License 3][15]               |
| [Testcontainers :: JUnit Jupiter Extension][16] | [MIT][17]                         |
| [Test containers for Exasol on Docker][18]      | [MIT License][19]                 |
| [Test Database Builder for Java][20]            | [MIT License][21]                 |
| [Matcher for SQL Result Sets][22]               | [MIT License][23]                 |
| [Test utilities for `java.util.logging`][24]    | [MIT][25]                         |
| [EqualsVerifier | release normal jar][26]       | [Apache License, Version 2.0][27] |
| [Apache Log4j API][28]                          | [Apache License, Version 2.0][27] |
| [Apache Log4j Core][29]                         | [Apache License, Version 2.0][27] |

## Plugin Dependencies

| Dependency                                              | License                                        |
| ------------------------------------------------------- | ---------------------------------------------- |
| [SonarQube Scanner for Maven][30]                       | [GNU LGPL 3][31]                               |
| [Apache Maven Compiler Plugin][32]                      | [Apache-2.0][27]                               |
| [Apache Maven Enforcer Plugin][33]                      | [Apache-2.0][27]                               |
| [Maven Flatten Plugin][34]                              | [Apache Software Licenese][27]                 |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][35] | [ASL2][36]                                     |
| [Maven Surefire Plugin][37]                             | [Apache-2.0][27]                               |
| [Versions Maven Plugin][38]                             | [Apache License, Version 2.0][27]              |
| [duplicate-finder-maven-plugin Maven Mojo][39]          | [Apache License 2.0][7]                        |
| [Apache Maven Deploy Plugin][40]                        | [Apache-2.0][27]                               |
| [Apache Maven GPG Plugin][41]                           | [Apache License, Version 2.0][27]              |
| [Apache Maven Source Plugin][42]                        | [Apache License, Version 2.0][27]              |
| [Apache Maven Javadoc Plugin][43]                       | [Apache-2.0][27]                               |
| [Nexus Staging Maven Plugin][44]                        | [Eclipse Public License][45]                   |
| [JaCoCo :: Maven Plugin][46]                            | [Eclipse Public License 2.0][47]               |
| [error-code-crawler-maven-plugin][48]                   | [MIT License][49]                              |
| [Reproducible Build Maven Plugin][50]                   | [Apache 2.0][36]                               |
| [Project keeper maven plugin][51]                       | [The MIT License][52]                          |
| [Maven Clean Plugin][53]                                | [The Apache Software License, Version 2.0][36] |
| [Maven Resources Plugin][54]                            | [The Apache Software License, Version 2.0][36] |
| [Maven JAR Plugin][55]                                  | [The Apache Software License, Version 2.0][36] |
| [Maven Install Plugin][56]                              | [The Apache Software License, Version 2.0][36] |
| [Maven Site Plugin 3][57]                               | [The Apache Software License, Version 2.0][36] |

[0]: http://www.exasol.com
[1]: https://repo1.maven.org/maven2/com/exasol/exasol-jdbc/7.1.19/exasol-jdbc-7.1.19-license.txt
[2]: https://github.com/exasol/sql-statement-builder/
[3]: https://github.com/exasol/sql-statement-builder/blob/main/LICENSE
[4]: https://github.com/exasol/error-reporting-java/
[5]: https://github.com/exasol/error-reporting-java/blob/main/LICENSE
[6]: https://spark.apache.org/
[7]: http://www.apache.org/licenses/LICENSE-2.0.html
[8]: https://www.scala-lang.org/
[9]: https://www.apache.org/licenses/LICENSE-2.0
[10]: https://github.com/mockito/mockito
[11]: https://github.com/mockito/mockito/blob/main/LICENSE
[12]: https://junit.org/junit5/
[13]: https://www.eclipse.org/legal/epl-v20.html
[14]: http://hamcrest.org/JavaHamcrest/
[15]: http://opensource.org/licenses/BSD-3-Clause
[16]: https://testcontainers.org
[17]: http://opensource.org/licenses/MIT
[18]: https://github.com/exasol/exasol-testcontainers/
[19]: https://github.com/exasol/exasol-testcontainers/blob/main/LICENSE
[20]: https://github.com/exasol/test-db-builder-java/
[21]: https://github.com/exasol/test-db-builder-java/blob/main/LICENSE
[22]: https://github.com/exasol/hamcrest-resultset-matcher/
[23]: https://github.com/exasol/hamcrest-resultset-matcher/blob/main/LICENSE
[24]: https://github.com/exasol/java-util-logging-testing/
[25]: https://opensource.org/licenses/MIT
[26]: https://www.jqno.nl/equalsverifier
[27]: https://www.apache.org/licenses/LICENSE-2.0.txt
[28]: https://logging.apache.org/log4j/2.x/log4j-api/
[29]: https://logging.apache.org/log4j/2.x/log4j-core/
[30]: http://sonarsource.github.io/sonar-scanner-maven/
[31]: http://www.gnu.org/licenses/lgpl.txt
[32]: https://maven.apache.org/plugins/maven-compiler-plugin/
[33]: https://maven.apache.org/enforcer/maven-enforcer-plugin/
[34]: https://www.mojohaus.org/flatten-maven-plugin/
[35]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[36]: http://www.apache.org/licenses/LICENSE-2.0.txt
[37]: https://maven.apache.org/surefire/maven-surefire-plugin/
[38]: https://www.mojohaus.org/versions/versions-maven-plugin/
[39]: https://github.com/basepom/duplicate-finder-maven-plugin
[40]: https://maven.apache.org/plugins/maven-deploy-plugin/
[41]: https://maven.apache.org/plugins/maven-gpg-plugin/
[42]: https://maven.apache.org/plugins/maven-source-plugin/
[43]: https://maven.apache.org/plugins/maven-javadoc-plugin/
[44]: http://www.sonatype.com/public-parent/nexus-maven-plugins/nexus-staging/nexus-staging-maven-plugin/
[45]: http://www.eclipse.org/legal/epl-v10.html
[46]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[47]: https://www.eclipse.org/legal/epl-2.0/
[48]: https://github.com/exasol/error-code-crawler-maven-plugin/
[49]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[50]: http://zlika.github.io/reproducible-build-maven-plugin
[51]: https://github.com/exasol/project-keeper/
[52]: https://github.com/exasol/project-keeper/blob/main/LICENSE
[53]: http://maven.apache.org/plugins/maven-clean-plugin/
[54]: http://maven.apache.org/plugins/maven-resources-plugin/
[55]: http://maven.apache.org/plugins/maven-jar-plugin/
[56]: http://maven.apache.org/plugins/maven-install-plugin/
[57]: http://maven.apache.org/plugins/maven-site-plugin/
