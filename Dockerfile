# base docker image
FROM openjdk:17
LABEL maintainer="luv2code99.tech"
ADD target/a-student-management-system-0.0.1-SNAPSHOT.jar student-management-system.jar
ENTRYPOINT ["java", "-jar", "student-management-system.jar"]