FROM maven:3.9-eclipse-temurin-25 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:25-jre-alpine
WORKDIR /app



COPY --from=build /app/target/*.jar app.jar


ENTRYPOINT ["java","-jar","app.jar"]
