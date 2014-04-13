ANNOUNCEMENT: Asterisk-Java 0.4.0 released

Asterisk-Java 0.4.0, a free Java library for Asterisk PBX integration,
has been released.

What is different from 0.3.1? 
I have implemented queue management in the thread executor. 
In the official 0.3.1 version, Java threads were place in unbounded queue, in this version it is possible to choose 
a bounded queue giving its size or keep the previous behaviour by providing -1. 
Most importantly it is a fork from GITHUB

The Asterisk-Java package consists of a set of Java classes that allow
you to easily build Java applications that interact with an Asterisk
PBX Server. Asterisk-Java supports both interfaces that Asterisk 
provides for this scenario: The FastAGI protocol and the Manager API.

Asterisk-Java is available under Apache 2.0 license at http://asterisk-java.org