#!/bin/bash

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

for ((i=2 ; 10000000 - $i ; i*=2))
    do generateFile ./sources/test9.wh $i ./sources2/test${i}.wh
done
