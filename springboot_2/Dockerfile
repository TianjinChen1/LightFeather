# define base docker image
FROM openjdk:17

COPY  target/springboot_2-0.0.1-SNAPSHOT.jar springboot_2.jar
EXPOSE 8080
CMD  ["java","-jar","springboot_2.jar"]