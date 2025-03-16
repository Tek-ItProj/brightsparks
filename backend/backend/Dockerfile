# Use a multi-stage build to reduce the final image size
FROM gradle:7.6.1-jdk17-alpine AS builder

# Set the working directory
WORKDIR /app

# Copy only the necessary files for dependency resolution
COPY gradlew settings.gradle build.gradle ./
COPY gradle ./gradle

# Download dependencies
RUN ./gradlew dependencies --write-locks

# Copy the source code
COPY src ./src

# Build the application
RUN ./gradlew bootJar

# Create the final image
FROM openjdk:17-jdk-alpine

# Copy the built JAR file from the builder stage
COPY --from=builder /app/build/libs/*.jar /app/app.jar

# Expose the port your Spring Boot application runs on (usually 8080)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]