FROM openjdk:17-jdk-alpine
LABEL maintainer="trungpt.dev@gmail.com"
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080 8081
ENTRYPOINT ["java","-jar","/app.jar"]