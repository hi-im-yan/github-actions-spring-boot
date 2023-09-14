FROM openjdk:17-jdk-slim

COPY target/github-actions-0.0.1-SNAPSHOT.jar /app/app.jar
RUN rm -rf /app/.git/

WORKDIR /app

CMD ["java", "-jar", "app.jar"]
