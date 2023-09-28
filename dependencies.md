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

## Test Dependencies

| Dependency                                      | License                                        |
| ----------------------------------------------- | ---------------------------------------------- |
| [mockito-core][16]                              | [The MIT License][17]                          |
| [mockito-junit-jupiter][16]                     | [The MIT License][17]                          |
| [JUnit Jupiter (Aggregator)][18]                | [Eclipse Public License v2.0][19]              |
| [JUnit Jupiter API][18]                         | [Eclipse Public License v2.0][19]              |
| [Hamcrest][20]                                  | [BSD License 3][21]                            |
| [Testcontainers :: JUnit Jupiter Extension][22] | [MIT][23]                                      |
| [Test containers for Exasol on Docker][24]      | [MIT License][25]                              |
| [Test Database Builder for Java][26]            | [MIT License][27]                              |
| [Matcher for SQL Result Sets][28]               | [MIT License][29]                              |
| [Test utilities for `java.util.logging`][30]    | [MIT][31]                                      |
| [EqualsVerifier \| release normal jar][32]      | [Apache License, Version 2.0][11]              |
| [Jackson-core][33]                              | [The Apache Software License, Version 2.0][11] |

## Plugin Dependencies

| Dependency                                              | License                                        |
| ------------------------------------------------------- | ---------------------------------------------- |
| [SonarQube Scanner for Maven][34]                       | [GNU LGPL 3][35]                               |
| [Apache Maven Compiler Plugin][36]                      | [Apache-2.0][11]                               |
| [Apache Maven Enforcer Plugin][37]                      | [Apache-2.0][11]                               |
| [Maven Flatten Plugin][38]                              | [Apache Software Licenese][11]                 |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][39] | [ASL2][15]                                     |
| [Maven Surefire Plugin][40]                             | [Apache-2.0][11]                               |
| [Versions Maven Plugin][41]                             | [Apache License, Version 2.0][11]              |
| [duplicate-finder-maven-plugin Maven Mojo][42]          | [Apache License 2.0][7]                        |
| [Apache Maven Deploy Plugin][43]                        | [Apache-2.0][11]                               |
| [Apache Maven GPG Plugin][44]                           | [Apache-2.0][11]                               |
| [Apache Maven Source Plugin][45]                        | [Apache License, Version 2.0][11]              |
| [Apache Maven Javadoc Plugin][46]                       | [Apache-2.0][11]                               |
| [Nexus Staging Maven Plugin][47]                        | [Eclipse Public License][48]                   |
| [Maven Failsafe Plugin][49]                             | [Apache-2.0][11]                               |
| [JaCoCo :: Maven Plugin][50]                            | [Eclipse Public License 2.0][51]               |
| [error-code-crawler-maven-plugin][52]                   | [MIT License][53]                              |
| [Reproducible Build Maven Plugin][54]                   | [Apache 2.0][15]                               |
| [Project keeper maven plugin][55]                       | [The MIT License][56]                          |
| [Maven Clean Plugin][57]                                | [The Apache Software License, Version 2.0][15] |
| [Maven Resources Plugin][58]                            | [The Apache Software License, Version 2.0][15] |
| [Maven JAR Plugin][59]                                  | [The Apache Software License, Version 2.0][15] |
| [Maven Install Plugin][60]                              | [The Apache Software License, Version 2.0][15] |
| [Maven Site Plugin 3][61]                               | [The Apache Software License, Version 2.0][15] |

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
[16]: https://github.com/mockito/mockito
[17]: https://github.com/mockito/mockito/blob/main/LICENSE
[18]: https://junit.org/junit5/
[19]: https://www.eclipse.org/legal/epl-v20.html
[20]: http://hamcrest.org/JavaHamcrest/
[21]: http://opensource.org/licenses/BSD-3-Clause
[22]: https://java.testcontainers.org
[23]: http://opensource.org/licenses/MIT
[24]: https://github.com/exasol/exasol-testcontainers/
[25]: https://github.com/exasol/exasol-testcontainers/blob/main/LICENSE
[26]: https://github.com/exasol/test-db-builder-java/
[27]: https://github.com/exasol/test-db-builder-java/blob/main/LICENSE
[28]: https://github.com/exasol/hamcrest-resultset-matcher/
[29]: https://github.com/exasol/hamcrest-resultset-matcher/blob/main/LICENSE
[30]: https://github.com/exasol/java-util-logging-testing/
[31]: https://opensource.org/licenses/MIT
[32]: https://www.jqno.nl/equalsverifier
[33]: https://github.com/FasterXML/jackson-core
[34]: http://sonarsource.github.io/sonar-scanner-maven/
[35]: http://www.gnu.org/licenses/lgpl.txt
[36]: https://maven.apache.org/plugins/maven-compiler-plugin/
[37]: https://maven.apache.org/enforcer/maven-enforcer-plugin/
[38]: https://www.mojohaus.org/flatten-maven-plugin/
[39]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[40]: https://maven.apache.org/surefire/maven-surefire-plugin/
[41]: https://www.mojohaus.org/versions/versions-maven-plugin/
[42]: https://basepom.github.io/duplicate-finder-maven-plugin
[43]: https://maven.apache.org/plugins/maven-deploy-plugin/
[44]: https://maven.apache.org/plugins/maven-gpg-plugin/
[45]: https://maven.apache.org/plugins/maven-source-plugin/
[46]: https://maven.apache.org/plugins/maven-javadoc-plugin/
[47]: http://www.sonatype.com/public-parent/nexus-maven-plugins/nexus-staging/nexus-staging-maven-plugin/
[48]: http://www.eclipse.org/legal/epl-v10.html
[49]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[50]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[51]: https://www.eclipse.org/legal/epl-2.0/
[52]: https://github.com/exasol/error-code-crawler-maven-plugin/
[53]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[54]: http://zlika.github.io/reproducible-build-maven-plugin
[55]: https://github.com/exasol/project-keeper/
[56]: https://github.com/exasol/project-keeper/blob/main/LICENSE
[57]: http://maven.apache.org/plugins/maven-clean-plugin/
[58]: http://maven.apache.org/plugins/maven-resources-plugin/
[59]: http://maven.apache.org/plugins/maven-jar-plugin/
[60]: http://maven.apache.org/plugins/maven-install-plugin/
[61]: http://maven.apache.org/plugins/maven-site-plugin/
