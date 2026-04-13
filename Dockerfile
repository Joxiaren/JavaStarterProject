FROM eclipse-temurin:25-jdk-alpine

COPY /backend/target/backend-1.0.0.jar app.jar


ENTRYPOINT ["java","-jar","/app.jar"]
