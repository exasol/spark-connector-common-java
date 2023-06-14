# Spark Connector Common Java 1.0.1, released 2023-06-14

Code name: Fixed Dependency Scope

## Summary

In this release we changed the scope of Spark dependency from `compile` to `provided`. We indented to use `provided` scope so that users of dependency could use their own version of Spark.

## Bugs

* #12: Fixed Dependency Scope

## Dependency Updates

### Compile Dependency Updates

* Added `com.exasol:error-reporting-java8:1.0.1`
* Added `com.exasol:exasol-jdbc:7.1.20`
* Added `com.exasol:sql-statement-builder-java8:4.5.4`
* Added `org.apache.spark:spark-sql_2.13:3.4.0`
* Added `org.scala-lang:scala-library:2.13.11`

### Test Dependency Updates

* Added `com.exasol:exasol-testcontainers:6.6.0`
* Added `com.exasol:hamcrest-resultset-matcher:1.6.0`
* Added `com.exasol:java-util-logging-testing:2.0.3`
* Added `com.exasol:test-db-builder-java:3.4.2`
* Added `com.fasterxml.jackson.core:jackson-core:2.15.2`
* Added `nl.jqno.equalsverifier:equalsverifier:3.14.2`
* Added `org.hamcrest:hamcrest:2.2`
* Added `org.junit.jupiter:junit-jupiter-api:5.9.3`
* Added `org.junit.jupiter:junit-jupiter:5.9.3`
* Added `org.mockito:mockito-core:5.3.1`
* Added `org.mockito:mockito-junit-jupiter:5.3.1`
* Added `org.testcontainers:junit-jupiter:1.18.3`

### Plugin Dependency Updates

* Added `com.exasol:error-code-crawler-maven-plugin:1.2.3`
* Added `com.exasol:project-keeper-maven-plugin:2.9.7`
* Added `io.github.zlika:reproducible-build-maven-plugin:0.16`
* Added `org.apache.maven.plugins:maven-clean-plugin:2.5`
* Added `org.apache.maven.plugins:maven-compiler-plugin:3.11.0`
* Added `org.apache.maven.plugins:maven-deploy-plugin:3.1.1`
* Added `org.apache.maven.plugins:maven-enforcer-plugin:3.3.0`
* Added `org.apache.maven.plugins:maven-failsafe-plugin:3.0.0`
* Added `org.apache.maven.plugins:maven-gpg-plugin:3.0.1`
* Added `org.apache.maven.plugins:maven-install-plugin:2.4`
* Added `org.apache.maven.plugins:maven-jar-plugin:2.4`
* Added `org.apache.maven.plugins:maven-javadoc-plugin:3.5.0`
* Added `org.apache.maven.plugins:maven-resources-plugin:2.6`
* Added `org.apache.maven.plugins:maven-site-plugin:3.3`
* Added `org.apache.maven.plugins:maven-source-plugin:3.2.1`
* Added `org.apache.maven.plugins:maven-surefire-plugin:3.0.0`
* Added `org.basepom.maven:duplicate-finder-maven-plugin:1.5.1`
* Added `org.codehaus.mojo:flatten-maven-plugin:1.4.1`
* Added `org.codehaus.mojo:versions-maven-plugin:2.15.0`
* Added `org.jacoco:jacoco-maven-plugin:0.8.9`
* Added `org.sonarsource.scanner.maven:sonar-maven-plugin:3.9.1.2184`
* Added `org.sonatype.ossindex.maven:ossindex-maven-plugin:3.2.0`
* Added `org.sonatype.plugins:nexus-staging-maven-plugin:1.6.13`
