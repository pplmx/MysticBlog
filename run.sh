#!/usr/bin/env bash

# loop 1024
for ((i = 0; i < 2 << 9; i++)); do
    echo "hello, world"
done
