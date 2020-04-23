FROM openjdk:11-jre-slim

RUN mkdir -p /opt
COPY target/*.jar /opt

EXPOSE 8081
CMD ["java", "-jar", "/opt/atomix-smr-0.0.1-SNAPSHOT.jar"]
