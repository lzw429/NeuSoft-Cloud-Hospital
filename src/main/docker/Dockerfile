FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD medical-0.0.3-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]