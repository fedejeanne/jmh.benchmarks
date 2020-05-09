#!/bin/sh

mvn clean package

JVM_OPTS='-Xms8G'
WU_IT='-wi 1'		#Warm-up iterations
WU_TIME_IT='-w 1'	#Warm-up time per iteration (in seconds). Default: 10
FORKS='-f 1'		#How many forks
IT='-i 1' 		#Measurement iterations
TO='-to 1'		#Timeout (in minutes) to wait before ending an iteration. Default: 10
BM='-bm avgt'		#Benchmark mode. Available modes are: [Throughput/thrpt, 
                	     # AverageTime/avgt, SampleTime/sample, SingleShotTime/ss, 
                	     # All/all]. (default: Throughput)
TU='-tu ns'		#Available time units are: [m, s, ms, us, ns]. (default: SECONDS)
THREADS='-t 2' 		#Threads to use. 'max' means 1 thread per CPU
INCLUDE=''		#Search for the @Benchmark methods in all classes in the project
EXCLUDE='-e Exclude'	#Exclude classes whose names contain the word "Exclude"

java $JVM_OPTS -jar target/benchmarks.jar $INCLUDE $EXCLUDE $WU_IT $WU_TIME_IT $FORKS $IT $TO $BM $TU $THREADS
