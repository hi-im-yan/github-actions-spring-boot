FROM openjdk:17-jdk-slim

COPY target/github-actions-*.jar /app/app.jar

WORKDIR /app

CMD ["java", "-jar", "app.jar"]
