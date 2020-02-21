FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
Volume /tmp
EXPOSE 80
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]