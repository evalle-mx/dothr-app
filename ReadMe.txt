#############################################
###     DotHrApp   				#####
#############################################

Demo Project created by initiallizr: https://start.spring.io/
* Compiles in Eclipse 2019-09 R (4.13.0)

# Terminal
$ gradle clean build
java -jar build/libs/DotHrApp__.jar 


Testing data :
[Uncommenting code in LearningSpringApplication.java]
$ curl localhost:8080/rooms


Web page:
http://localhost:8080/viewrooms


Web Service:
http://localhost:8080/api/rooms?nombre=Victoria


*** TO alternate from Embedded to Remote persistence ****
1. Activate com.h2database Dependency [pom.xml]
2. Comment DB properties in application.properties


(added to git + eclipse)

