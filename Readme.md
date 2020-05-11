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

```bash
Benchmark                                             Mode  Cnt  Score   Error  Units
BenchmarkDoAddMethods.benchmarkDepth10Default         avgt       0,564          ns/op
BenchmarkDoAddMethods.benchmarkDepth10Overridden      avgt       0,567          ns/op
BenchmarkDoAddMethods.benchmarkDepth1Default          avgt       0,567          ns/op
BenchmarkDoAddMethods.benchmarkDepth1Overridden       avgt       0,573          ns/op
BenchmarkDoNothingMethods.benchmarkDepth10Default     avgt       0,668          ns/op
BenchmarkDoNothingMethods.benchmarkDepth10Overridden  avgt       0,588          ns/op
BenchmarkDoNothingMethods.benchmarkDepth1Default      avgt       0,597          ns/op
BenchmarkDoNothingMethods.benchmarkDepth1Overridden   avgt       0,602          ns/op
```

### Analysis
Invoking the `Default` methods (the ones in the *interface*) vs invoking the `Overriden` methods (the ones in the *implementing classes*) has a maximum difference of **80 Nanoseconds per operation** which means the `default` methods are around 13% slower when doing nothing (the body of the method is empty):

```bash
Benchmark                                             Mode  Cnt  Score   Error  Units
BenchmarkDoNothingMethods.benchmarkDepth10Default     avgt       0,668          ns/op
BenchmarkDoNothingMethods.benchmarkDepth10Overridden  avgt       0,588          ns/op
```

In the case of *adding*, the gaps is even smaller and the `default` methods are **faster**:


```bash
Benchmark                                             Mode  Cnt  Score   Error  Units
BenchmarkDoAddMethods.benchmarkDepth10Default         avgt       0,564          ns/op
BenchmarkDoAddMethods.benchmarkDepth10Overridden      avgt       0,567          ns/op
BenchmarkDoAddMethods.benchmarkDepth1Default          avgt       0,567          ns/op
BenchmarkDoAddMethods.benchmarkDepth1Overridden       avgt       0,573          ns/op
```
