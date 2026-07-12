#!/bin/sh
# Use a POSIX shell for portability inside the container.
set -eu

# Exit with an error if no Java file was provided.
if [ "$#" -eq 0 ]; then
  echo "Usage: docker run <image> <relative/java/file> [args...]" >&2
  echo "Example: docker run --rm tutorials-java com/rc/streams/Streams1.java" >&2
  exit 1
fi

# The first argument is the Java source file to compile and run.
SOURCE=$1
shift

# Make sure the file exists before trying to compile it.
if [ ! -f "$SOURCE" ]; then
  echo "File not found: $SOURCE" >&2
  exit 1
fi

# Convert a file path like com/rc/streams/Streams1.java into a Java class name.
# Example: com/rc/streams/Streams1.java -> com.rc.streams.Streams1
MAIN_CLASS=$(echo "$SOURCE" | sed 's#^\./##; s#\.java$##; s#/#.#g')

# Create a temporary directory for compiled class files.
mkdir -p /tmp/java-classes

# Compile the Java file with preview support enabled for Java 27.
javac --enable-preview --release 27 -d /tmp/java-classes "$SOURCE"

# Run the compiled class with preview support enabled.
java --enable-preview -cp /tmp/java-classes "$MAIN_CLASS"

# Useful Docker options you can try later:
# --rm            Remove the container automatically after it exits.
# -it             Start an interactive terminal session.
# -v $(pwd):/workspace  Mount the current folder into the container.
# --name demo     Give the container a custom name.
# docker run --rm -it tutorials-java sh
# docker run --rm -it -v "$PWD":/workspace tutorials-java sh
