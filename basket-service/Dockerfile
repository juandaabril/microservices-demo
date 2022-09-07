#Build Stage
FROM openjdk:17-jdk-alpine as builder
WORKDIR /app

COPY gradle/ gradle/
COPY src/ src/
COPY build.gradle .
COPY gradlew .
COPY gradlew.bat .
COPY settings.gradle .

RUN ./gradlew build

#Server Stage
FROM eclipse-temurin:17-jdk-focal
COPY --from=builder ./app/build/libs/*.jar api.jar
ENV PORT ''
ENV DATABASE_HOST ''
ENV DATABASE_PORT ''
ENV DATABASE_NAME ''
ENV DATABASE_USERNAME ''
ENV DATABASE_PASSWORD ''

EXPOSE $PORT
ENTRYPOINT ["java", "-jar", "api.jar"]




