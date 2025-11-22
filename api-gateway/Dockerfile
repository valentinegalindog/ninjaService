FROM eclipse-temurin:11-jre
VOLUME /tmp
COPY target/api-gateway-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]