FROM openjdk:17-jdk-slim

RUN #mkdir /app

WORKDIR /app
COPY target/github-actions-*.jar /app/app.jar


CMD ["java", "-jar", "app.jar"]
