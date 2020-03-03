FROM maven:latest

WORKDIR app

COPY . .

RUN mvn install

FROM tomcat:latest

RUN ls 

COPY target/*.jar /admin

EXPOSE 8080 8081 
