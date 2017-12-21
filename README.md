# Spring Cloud With Spring Boot Microservices, Eureka & Zuul

This version includes the following features:

To Build & Deploy through Maven and docker run the following commands:

a) mvn clean install from root directory

b) $ docker-compose up

All should be set till this point. Wait for all containers to up and you can now test the deployments by hitting following URLs.

<b>Eureka:</b> http://localhost:8761/

<b>Zuul:</b> http://localhost:8765/

<b>Test1 Service:</b> http://localhost:8765/api/test1

<b>Test2 Service:</b> http://localhost:8765/api/test2

<b>Test3 Service:</b> http://localhost:8765/api/test3

To stop & shut down,  run the following command:

$ docker-compose down --rmi all

<b>Hystrix Circuit Breaker:-</b> It is the implementation of Circuit Breaker Patter and has been configured to provide fallback response when circuit is brake. There is a dashboard available at below URL to monitor the circuits. 

<b>Hystrix Dashboard:</b> http://localhost:8765/hystrix

You can find the Hystrix Stream at below URL:

<b>Hystrix Stream:</b> http://localhost:8765/hystrix.stream

<b>Load Balancing (Ribbon)</b> - Ribbon Load Balancer is configured with Zuul.

<b>Zipkin with Sleuth:</b> These frameworks have been integrated to enable distributed logging & tracing.

<b>Zipkin access URL:</b> http://localhost:9411
