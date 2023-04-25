<!-- @formatter:off -->
# Dependencies

## Compile Dependencies

| Dependency                        | License                |
| --------------------------------- | ---------------------- |
| [EXASolution JDBC Driver][0]      | [EXAClient License][1] |
| [Exasol SQL Statement Builder][2] | [MIT License][3]       |
| [error-reporting-java8][4]        | [MIT License][5]       |

## Test Dependencies

| Dependency                                      | License                           |
| ----------------------------------------------- | --------------------------------- |
| [mockito-core][6]                               | [The MIT License][7]              |
| [mockito-junit-jupiter][6]                      | [The MIT License][7]              |
| [JUnit Jupiter (Aggregator)][8]                 | [Eclipse Public License v2.0][9]  |
| [JUnit Jupiter API][8]                          | [Eclipse Public License v2.0][9]  |
| [Hamcrest][10]                                  | [BSD License 3][11]               |
| [Testcontainers :: JUnit Jupiter Extension][12] | [MIT][13]                         |
| [Test containers for Exasol on Docker][14]      | [MIT License][15]                 |
| [Test Database Builder for Java][16]            | [MIT License][17]                 |
| [Matcher for SQL Result Sets][18]               | [MIT License][19]                 |
| [Test utilities for `java.util.logging`][20]    | [MIT][21]                         |
| [EqualsVerifier | release normal jar][22]       | [Apache License, Version 2.0][23] |
| [Apache Log4j API][24]                          | [Apache License, Version 2.0][23] |
| [Apache Log4j Core][25]                         | [Apache License, Version 2.0][23] |

## Plugin Dependencies

| Dependency                                              | License                                        |
| ------------------------------------------------------- | ---------------------------------------------- |
| [SonarQube Scanner for Maven][26]                       | [GNU LGPL 3][27]                               |
| [Apache Maven Compiler Plugin][28]                      | [Apache-2.0][23]                               |
| [Apache Maven Enforcer Plugin][29]                      | [Apache-2.0][23]                               |
| [Maven Flatten Plugin][30]                              | [Apache Software Licenese][23]                 |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][31] | [ASL2][32]                                     |
| [Maven Surefire Plugin][33]                             | [Apache-2.0][23]                               |
| [Versions Maven Plugin][34]                             | [Apache License, Version 2.0][23]              |
| [duplicate-finder-maven-plugin Maven Mojo][35]          | [Apache License 2.0][36]                       |
| [Apache Maven Deploy Plugin][37]                        | [Apache-2.0][23]                               |
| [Apache Maven GPG Plugin][38]                           | [Apache License, Version 2.0][23]              |
| [Apache Maven Source Plugin][39]                        | [Apache License, Version 2.0][23]              |
| [Apache Maven Javadoc Plugin][40]                       | [Apache-2.0][23]                               |
| [Nexus Staging Maven Plugin][41]                        | [Eclipse Public License][42]                   |
| [JaCoCo :: Maven Plugin][43]                            | [Eclipse Public License 2.0][44]               |
| [error-code-crawler-maven-plugin][45]                   | [MIT License][46]                              |
| [Reproducible Build Maven Plugin][47]                   | [Apache 2.0][32]                               |
| [Project keeper maven plugin][48]                       | [The MIT License][49]                          |
| [Maven Clean Plugin][50]                                | [The Apache Software License, Version 2.0][32] |
| [Maven Resources Plugin][51]                            | [The Apache Software License, Version 2.0][32] |
| [Maven JAR Plugin][52]                                  | [The Apache Software License, Version 2.0][32] |
| [Maven Install Plugin][53]                              | [The Apache Software License, Version 2.0][32] |
| [Maven Site Plugin 3][54]                               | [The Apache Software License, Version 2.0][32] |

[0]: http://www.exasol.com
[1]: https://repo1.maven.org/maven2/com/exasol/exasol-jdbc/7.1.19/exasol-jdbc-7.1.19-license.txt
[2]: https://github.com/exasol/sql-statement-builder/
[3]: https://github.com/exasol/sql-statement-builder/blob/main/LICENSE
[4]: https://github.com/exasol/error-reporting-java/
[5]: https://github.com/exasol/error-reporting-java/blob/main/LICENSE
[6]: https://github.com/mockito/mockito
[7]: https://github.com/mockito/mockito/blob/main/LICENSE
[8]: https://junit.org/junit5/
[9]: https://www.eclipse.org/legal/epl-v20.html
[10]: http://hamcrest.org/JavaHamcrest/
[11]: http://opensource.org/licenses/BSD-3-Clause
[12]: https://testcontainers.org
[13]: http://opensource.org/licenses/MIT
[14]: https://github.com/exasol/exasol-testcontainers/
[15]: https://github.com/exasol/exasol-testcontainers/blob/main/LICENSE
[16]: https://github.com/exasol/test-db-builder-java/
[17]: https://github.com/exasol/test-db-builder-java/blob/main/LICENSE
[18]: https://github.com/exasol/hamcrest-resultset-matcher/
[19]: https://github.com/exasol/hamcrest-resultset-matcher/blob/main/LICENSE
[20]: https://github.com/exasol/java-util-logging-testing/
[21]: https://opensource.org/licenses/MIT
[22]: https://www.jqno.nl/equalsverifier
[23]: https://www.apache.org/licenses/LICENSE-2.0.txt
[24]: https://logging.apache.org/log4j/2.x/log4j-api/
[25]: https://logging.apache.org/log4j/2.x/log4j-core/
[26]: http://sonarsource.github.io/sonar-scanner-maven/
[27]: http://www.gnu.org/licenses/lgpl.txt
[28]: https://maven.apache.org/plugins/maven-compiler-plugin/
[29]: https://maven.apache.org/enforcer/maven-enforcer-plugin/
[30]: https://www.mojohaus.org/flatten-maven-plugin/
[31]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[32]: http://www.apache.org/licenses/LICENSE-2.0.txt
[33]: https://maven.apache.org/surefire/maven-surefire-plugin/
[34]: https://www.mojohaus.org/versions/versions-maven-plugin/
[35]: https://github.com/basepom/duplicate-finder-maven-plugin
[36]: http://www.apache.org/licenses/LICENSE-2.0.html
[37]: https://maven.apache.org/plugins/maven-deploy-plugin/
[38]: https://maven.apache.org/plugins/maven-gpg-plugin/
[39]: https://maven.apache.org/plugins/maven-source-plugin/
[40]: https://maven.apache.org/plugins/maven-javadoc-plugin/
[41]: http://www.sonatype.com/public-parent/nexus-maven-plugins/nexus-staging/nexus-staging-maven-plugin/
[42]: http://www.eclipse.org/legal/epl-v10.html
[43]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[44]: https://www.eclipse.org/legal/epl-2.0/
[45]: https://github.com/exasol/error-code-crawler-maven-plugin/
[46]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[47]: http://zlika.github.io/reproducible-build-maven-plugin
[48]: https://github.com/exasol/project-keeper/
[49]: https://github.com/exasol/project-keeper/blob/main/LICENSE
[50]: http://maven.apache.org/plugins/maven-clean-plugin/
[51]: http://maven.apache.org/plugins/maven-resources-plugin/
[52]: http://maven.apache.org/plugins/maven-jar-plugin/
[53]: http://maven.apache.org/plugins/maven-install-plugin/
[54]: http://maven.apache.org/plugins/maven-site-plugin/
