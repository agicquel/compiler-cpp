#!/bin/bash

mkdir -p ./results2/
mkdir -p ./sources2/
rm -f ./results2/*
rm -f ./sources2/*

generateFile() {
    source=$1
    mult=$2
    dest=$3

    echo "" > $3
    for i in `seq 1 $mult`
    do
        cat $1 >> $3
    done
}

for ((i=2 ; 262144 - $i ; i*=2))
    do generateFile ./sources/test9.wh $i ./sources2/test${i}.wh
done


for testFile in `ls -S -r ./sources2/*.wh`; do
    echo "Executing ${testFile}"
    /usr/bin/time -o ./results2/`echo $testFile | cut -d\/ -f3`.time -f "%e" java -Xmx12G -jar ./whpp.jar $testFile -o ./results2/`echo $testFile | cut -d\/ -f3`pp
done

echo "Size,Time" > ./results2/all_times.csv
for resultFile in ./results2/*.time; do
    echo "$(wwc -l ${resultFile/.time/pp} | cut -d' ' -f1),$(cat $resultFile)" >> ./results2/all_times.csv
done
