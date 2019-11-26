#!/bin/bash

mkdir -p ./results2/
rm -f ./results2/*
for testFile in ./sources2/*.wh; do
    echo "Executing ${testFile}"
    /usr/bin/time -o ./results2/`echo $testFile | cut -d\/ -f3`.time -f "%e" java -jar ./whpp.jar $testFile -o ./results2/`echo $testFile | cut -d\/ -f3`pp
done

echo "Size,Time" > ./results2/all_times.csv
for resultFile in ./results2/*.time; do
    echo "$(echo $resultFile | cut -d\/ -f3 | egrep -o [0-9]+),$(cat $resultFile)" >> ./results2/all_times.csv
done
