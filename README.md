IO. Home Work 2
===============

[![Join the chat at https://gitter.im/changerequest/io.hw2](https://badges.gitter.im/changerequest/io.hw2.svg)](https://gitter.im/changerequest/io.hw2?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
1\. FileCopyUtil

Create 4 implementations of `FileCopyUtil` interface that implements `copy`
method in the following way:
* Copy using byte-per-byte flow
* Copy using buffered streams
* Copy using Channels
* Copy using suitable methods from NIO


Generate demo file with size >= 1GB and perform performance testing
of your implementations.

Create Demo class, that will print amount of time needed by each of
implementation to copy demo file.

Be sure to handle possible exceptions properly.

Create jUnit tests for each of your implementation.


#### Performance testing

The easiest way to make some performance testing is to measure time used for execution of your functionality using timestamps "before" and "after" execution of your code:
```java
public static void main(String[] args){
  long before = System.currentTimeMillis();
  // do some stuff
  long after = System.currentTimeMillis();
  System.out.println("Result:"+(after-before));
}
```

But such measurment won't be very accurate, due to possible JVM optimizations. To be sure that JVM have already perform all its bytecode optimizations and prepare more accurate result try to measure execution time of your code 1000-10000 times and calculate average execution time.

Additionally, add `-server` JVM option while executing your performance test.
