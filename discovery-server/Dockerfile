FROM eclipse-temurin:11-jre
VOLUME /tmp
COPY target/discovery-server-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]