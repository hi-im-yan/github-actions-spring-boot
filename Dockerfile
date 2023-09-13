FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/github-actions-*.jar /app/app.jar

CMD ["java", "-jar", "app.jar"]
