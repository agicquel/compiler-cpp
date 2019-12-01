#!/bin/bash

mkdir -p ./results3/
mkdir -p ./sources3/
rm -f ./results3/*
rm -f ./sources3/*

generateFile() {
    mult=$1
    dest=$2

    echo -n "function test: read X % nop" > $dest
    
    for i in `seq 1 $mult`
    do
        echo -n "; while X do nop" >> $dest
    done

    for i in `seq 1 $mult`
    do
        echo -n " od" >> $dest
    done

    echo -n "% write X" >> $dest
}

for ((i=2 ; 2048 - $i ; i*=2))
    do generateFile $i ./sources3/test${i}.wh
done

for testFile in `ls -S -r ./sources3/*.wh`; do
    echo "Executing ${testFile}"
    /usr/bin/time -o ./results3/`echo $testFile | cut -d\/ -f3`.time -f "%e" java -Xmx12G -jar ./whpp.jar $testFile -o ./results3/`echo $testFile | cut -d\/ -f3`pp
done

echo "Size,Time" > ./results3/all_times.csv
for resultFile in ./results3/*.time; do
    echo "$(wc -l ${resultFile/.time/pp} | cut -d' ' -f1),$(cat $resultFile)" >> ./results3/all_times.csv
done