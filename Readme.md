# Java benchmarks with JMH

Do some benchmarks using [JMH](https://openjdk.java.net/projects/code-tools/jmh/)

## How to run
* Install Maven 3+
* Open the **console** and run the script `build_and_benchmark.sh`. 

HINT: Seriously, do it from the **console**. I ran it from Eclipse and it died on me... my poor Eclipse, so young, so full of hope :'( 

## Tweaking the benchmarking
Check the documentation on JMH's [modes](http://tutorials.jenkov.com/java-performance/jmh.html#jmh-benchmark-modes), [time units](http://tutorials.jenkov.com/java-performance/jmh.html#benchmark-time-units) and other and change the parameters in `build_and_benchmark.sh` as you please.

## Some results
Just for reference, to see if there is a gap between the performance when invoking `default` methods compared to invoking their implementations in implementing classes.