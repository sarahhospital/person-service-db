FROM openjdk:8-jdk-alpine
COPY ./build/libs/dbservice-0.0.1.jar dbservice.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/dbservice.jar"]