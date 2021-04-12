#!/bin/bash

PWD=$(pwd)

# loop through all folders to find pom.xml and deploy these projects
for f in $(find "." -type f -name "pom.xml"); do
    echo "Building ${f}"
    parentDir="$(dirname "$f")"

    cd "$parentDir"
    mvn deploy
    cd "$PWD"
done
