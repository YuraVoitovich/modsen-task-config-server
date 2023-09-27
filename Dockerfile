FROM openjdk:20-jdk

ARG JAR_FILE=target/*.jar

COPY ./target/modsen-task-config-server-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8071

ENTRYPOINT ["java", "-jar", "/app.jar"]