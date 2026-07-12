# Base image: use the Java 27 early-access JDK so preview features are available.
FROM openjdk:27-ea-jdk

# Set the working directory inside the container.
WORKDIR /workspace

# Copy the project files into the container.
COPY . /workspace

# Normalize line endings and make the entrypoint executable.
# This helps when the script was created on Windows and copied into Linux.
RUN sed -i 's/\r$//' /workspace/docker-entrypoint.sh && chmod +x /workspace/docker-entrypoint.sh

# Run the helper script by default whenever the container starts.
ENTRYPOINT ["/workspace/docker-entrypoint.sh"]

# Optional: you can override the default command at runtime.
# Example:
# docker run --rm tutorials-java sh
# This would start a shell instead of running the Java entrypoint.
