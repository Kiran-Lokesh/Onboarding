FROM openjdk:8-jdk-alpine
EXPOSE 8080
RUN mkdir -p /app/
ADD build/libs/Onboarding-0.0.1-SNAPSHOT.jar /app/Onboarding-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/app/Onboarding-0.0.1-SNAPSHOT.jar"]