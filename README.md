IO. Home Work 2
===============
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