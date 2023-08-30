# syntax=docker/dockerfile:1

# FROM ubuntu:22.04
FROM openjdk:11
COPY target/project-management-0.0.1-SNAPSHOT.jar message-server-1.0.0.jar
ENTRYPOINT ["java","-jar","/message-server-1.0.0.jar"]


