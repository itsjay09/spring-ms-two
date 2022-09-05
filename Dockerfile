FROM openjdk:11
EXPOSE 8082
ADD target/spring-ms-two.jar ms-two-docker.jar
ENTRYPOINT ["java", "-jar", "ms-two-docker.jar"]