FROM openjdk:11
WORKDIR app/
EXPOSE 80:8080
COPY /build/libs/ /app
CMD ["java", "-jar", "AI-1.0.0-SNAPSHOT.jar"]