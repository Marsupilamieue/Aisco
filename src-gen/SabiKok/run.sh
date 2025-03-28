#!/bin/bash
export JAVA_HOME=/opt/homebrew/Cellar/openjdk/23.0.2/libexec/openjdk.jdk/Contents/Home
export PATH=$PATH:$JAVA_HOME/bin
cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.sabikok --module-path aisco.product.sabikok -m aisco.product.sabikok &

wait
