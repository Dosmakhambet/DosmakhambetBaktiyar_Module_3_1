# Use a base image with Java 11
FROM openjdk:20
# Set the working directory
WORKDIR /app
# Copy the JAR file to the container
COPY target/stocks-0.0.1-SNAPSHOT.jar app.jar
# Define the command to run your application
CMD ["java", "-jar", "app.jar"]