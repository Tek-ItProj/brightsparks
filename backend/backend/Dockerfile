# Use a multi-stage build to optimize image size
FROM openjdk:17-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy the entire build folder from the local machine
COPY ./build ./build

# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "./build/libs/backend-0.0.1-SNAPSHOT.jar"]