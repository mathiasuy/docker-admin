FROM maven:latest

RUN mvn install

FROM tomcat:latest

COPY target/*.jar /admin

EXPOSE 8080 80