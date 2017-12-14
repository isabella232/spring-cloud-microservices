FROM openjdk:8-jdk-alpine
ADD target/test2-service.jar test2-service.jar
ENTRYPOINT ["java", "-jar", "/test2-service.jar"]
EXPOSE 2222