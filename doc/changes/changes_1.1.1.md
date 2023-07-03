# Spark Connector Common Java 1.1.1, released 2023-07-03

Code name: Refactored `ExasolOptions` class to be `Serializable`.

## Summary

Update the `ExasolOptions` to be serializable since Spark 3.3 with Scala 2.12 version requires the class to implement `Serializable` interface.

## Features

* #16: Refactored `ExasolOptions` class to be serializable
