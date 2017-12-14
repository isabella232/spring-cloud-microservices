FROM openjdk:8-jdk-alpine
ADD target/test1-service.jar test1-service.jar
ENTRYPOINT ["java", "-jar", "/test1-service.jar"]
EXPOSE 2221