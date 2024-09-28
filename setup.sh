#!/bin/bash

# Get the current directory where the script is executed
SCRIPT_DIR=$(pwd)

# Copy the file to /usr/local/lib
sudo cp "$SCRIPT_DIR/antlr/antlr-4.13.2-complete.jar" /usr/local/lib

# Set the CLASSPATH
export CLASSPATH=".:/usr/local/lib/antlr-4.13.2-complete.jar:$CLASSPATH"

# Inform the user
echo "antlr-4.13.2-complete.jar copied to /usr/local/lib and CLASSPATH updated."
