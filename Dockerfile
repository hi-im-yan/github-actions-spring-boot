FROM openjdk:17-jdk-slim

COPY target/github-actions-0.0.1-SNAPSHOT.jar /app/app.jar

WORKDIR /app

CMD ["java", "-jar", "app.jar"]
