#!/bin/bash

for ((i=0 ; 16 - $i ; i+=1)) do
    echo "Executing for i = ${i}"
    START_TIME=`echo $(($(date +%s%N)/1000000))`
    ./test1 -i 2 -i ${i} &> /dev/null
    END_TIME=`echo $(($(date +%s%N)/1000000))`
    ELAPSED_TIME=$(($END_TIME - $START_TIME))
    echo "$i,$ELAPSED_TIME" >> ./res.csv
done