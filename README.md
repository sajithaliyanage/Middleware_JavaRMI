# Java RMI Application

This is basic example for java Remote Method Invocation programme. This include  

* Remote Interface
* Implementation of the remote interface
* Stub and skeleton objects
* Registry service
* Server Implementation
* Client Implementation


[![N|Solid](https://www.javatpoint.com/images/rmi/rmiex.jpg)](https://nodesource.com/products/nsolid)

# How to run this application

1) Compile all java files


```sh
javac *.java
```
2) Create stub and skeleton object by rmic tool 
```sh
rmic AdderRemote
```
3) Start rmi registry in one command prompt  
```sh
rmiregistry 5000
```
4) Start the server in another command prompt
```sh
java MyServer
```
5) Start the client application in another command prompt 
```sh
java MyClient
```
