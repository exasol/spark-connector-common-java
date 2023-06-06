# Developer Guide

## Spark Dependencies with Provided Scope

We set the scope of Apache Spark dependencies such as `spark-sql` to `provided`.
The users of this common library should themselves define what version of the
Spark they want to use.
