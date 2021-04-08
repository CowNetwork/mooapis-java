#!/bin/bash

# loop through all folders to find pom.xml and deploy these projects
for f in $(find "." -type f -name "pom.xml"); do
    parentDir="$(dirname "$f")"

    cd "$parentDir"
    mvn deploy
done