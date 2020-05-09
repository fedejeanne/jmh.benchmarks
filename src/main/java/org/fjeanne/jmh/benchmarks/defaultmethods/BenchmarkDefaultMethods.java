package org.fjeanne.jmh.benchmarks.defaultmethods;

import org.openjdk.jmh.annotations.Benchmark;

public class BenchmarkDefaultMethods {

	@Benchmark
	public void benchmarkDepth1Default() {
		Interface child1 = new Children.Child1();
		child1.doNothingDefault();
	}

	@Benchmark
	public void benchmarkDepth1Overridden() {
		Interface child1 = new Children.Child1();
		child1.doNothingOverridden();
	}

	@Benchmark
	public void benchmarkDepth10Default() {
		Interface child10 = new Children.Child10();
		child10.doNothingDefault();
	}

	@Benchmark
	public void benchmarkDepth10Overridden() {
		Interface child10 = new Children.Child10();
		child10.doNothingOverridden();
	}
}
