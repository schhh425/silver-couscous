## Prepare:

develop Environment:
    jdk1.8
    maven 
    

## TASK 

The sample uses Maven. It can be built and run from the command line:

----
$ mvn spring-boot:run
----

Web Services
    http://localhost:8081/sch_service/Hello?WSDL will now display the generated WSDL.



RestFul server
    http://localhost:8081/hello/{name}    replace you name
you will client me e.g  http://localhost:8081/hello/suchunhao
response is this:
    GET  i will say "you get me" 
    PUT  i will say "you put me" 
    DELETE   i will say "goodbye " 
    POST   i will say "you post me " 
    
