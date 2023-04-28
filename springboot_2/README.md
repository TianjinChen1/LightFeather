Spring Boot Dockerization Readme
This document outlines the steps to Dockerize a Spring Boot application. 
Dockerizing a Spring Boot application makes it easy to deploy and run the 
application on any environment that supports Docker.

Prerequisites
Docker installed on your machine
A Spring Boot application to Dockerize



cd into the repo and run the following commands:

docker build -t springboot  . 

docker run -p 8080:8080 springboot

