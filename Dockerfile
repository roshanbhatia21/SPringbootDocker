FROM openjdk:11
EXPOSE 8085
ADD target/SimpleApplication-0.0.1-SNAPSHOT.jar SimpleApplication-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/SimpleApplication-0.0.1-SNAPSHOT.jar"]
