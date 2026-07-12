# Tutorials

This project contains Java tutorial programs covering language features, streams, and related examples.

## Run Java examples with Docker

A Docker image is included to compile and run Java files from the repository using OpenJDK 27 early access with preview features enabled.

### Build the image

```bash
docker build -t tutorials-java .
```

### Run a Java file

```bash
docker run --rm tutorials-java com/rc/streams/Streams1.java
```

You can run other Java examples from the repository the same way by passing the relative path to the source file.

Example:

```bash
docker run --rm tutorials-java com/rc/functional/lessons/Chapter01LambdaExpressions.java
```

The container uses preview-mode compilation and execution, so it is suitable for testing Java preview features.

## Docker command cheat sheet

These commands are useful when learning Docker with this project.

### 1. Build an image

```bash
docker build -t tutorials-java .
```

- `build` creates an image from the current folder.
- `-t tutorials-java` gives the image a name so it is easier to reference.
- `.` tells Docker to use the current directory as the build context.

### 2. Run a container from an image

```bash
docker run --rm tutorials-java com/rc/streams/Streams1.java
```

- `run` starts a container from an image.
- `--rm` removes the container automatically after it exits.
- `tutorials-java` is the image name.
- The final argument is the Java file to run inside the container.

### 3. Start an interactive shell inside a container

```bash
docker run --rm -it tutorials-java sh
```

- `-it` gives you an interactive terminal.
- `sh` starts a shell inside the container.
- This is helpful for exploring files and testing commands manually.

### 4. Mount your current folder into the container

```bash
docker run --rm -it -v "$PWD":/workspace tutorials-java sh
```

- `-v` mounts a folder from your machine into the container.
- `"$PWD":/workspace` maps the current project folder to the container's workspace directory.
- This is useful when you want to edit files locally and test them in the container.

### 5. List local images

```bash
docker images
```

- Shows all images stored locally on your machine.

### 6. List running containers

```bash
docker ps
```

- Shows containers that are currently running.

### 7. List all containers, including stopped ones

```bash
docker ps -a
```

- Useful for seeing containers that already exited.

### 8. Stop a running container

```bash
docker stop <container-name-or-id>
```

- Stops a container gracefully.
- Replace the placeholder with the real container name or ID.

### 9. Remove a container

```bash
docker rm <container-name-or-id>
```

- Deletes a container that is no longer needed.

### 10. Remove an image

```bash
docker rmi tutorials-java
```

- Deletes the local image.
- Useful when you want to rebuild it from scratch.

### 11. View container logs

```bash
docker logs <container-name-or-id>
```

- Displays output produced by a container.

### 12. Run a command in a running container

```bash
docker exec -it <container-name-or-id> sh
```

- `exec` runs a command inside an already running container.
- `-it` opens an interactive shell.

### 13. Give a container a name

```bash
docker run --name my-java-demo --rm tutorials-java com/rc/streams/Streams1.java
```

- `--name` assigns a friendly name to the container.
- This makes it easier to manage and inspect later.

### 14. Advanced: push an image to Docker Hub

```bash
docker login
docker tag tutorials-java:latest YOUR_DOCKERHUB_USERNAME/tutorials-java:latest
docker push YOUR_DOCKERHUB_USERNAME/tutorials-java:latest
```

- `docker login` signs you into Docker Hub.
- `docker tag` gives your local image a remote repository name.
- `docker push` uploads the image to Docker Hub so others can pull it.

### 15. Advanced: pull an image from Docker Hub

```bash
docker pull YOUR_DOCKERHUB_USERNAME/tutorials-java:latest
```

- `docker pull` downloads an image from Docker Hub to your local machine.
- After pulling, you can run it with:

```bash
docker run --rm YOUR_DOCKERHUB_USERNAME/tutorials-java:latest
```

### 16. Useful learning tip

Docker commands become easier to understand when you remember:

- `docker build` = create an image
- `docker run` = start a container
- `docker ps` = see running containers
- `docker exec` = run a command inside a container
- `docker rm` / `docker rmi` = clean up containers and images
