#!/bin/bash

rm -f ./results/*
for testFile in ./sources/*.wh; do
    java -jar ./whpp.jar $testFile -o ./results/`echo $testFile | cut -d\/ -f3`pp
    DIFF=$(diff $testFile"pp" "./results/"$(echo $testFile | cut -d\/ -f3)"pp")
    if [ "$DIFF" = "" ]
    then
        echo "[OK] " $(echo $testFile | cut -d\/ -f3)
    else
        echo "[FAILED] " $(echo $testFile | cut -d\/ -f3)
    fi
done