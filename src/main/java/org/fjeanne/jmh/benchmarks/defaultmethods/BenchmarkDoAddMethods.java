package org.fjeanne.jmh.benchmarks.defaultmethods;

import org.openjdk.jmh.annotations.Benchmark;

public class BenchmarkDoAddMethods {

	@Benchmark
	public void benchmarkDepth1Default() {
		Interface child1 = new Children.Child1();
		child1.doAddDefault(Math.random(), Math.random());
	}

	@Benchmark
	public void benchmarkDepth1Overridden() {
		Interface child1 = new Children.Child1();
		child1.doAddOverridden(Math.random(), Math.random());
	}

	@Benchmark
	public void benchmarkDepth10Default() {
		Interface child10 = new Children.Child10();
		child10.doAddDefault(Math.random(), Math.random());
	}

	@Benchmark
	public void benchmarkDepth10Overridden() {
		Interface child10 = new Children.Child10();
		child10.doAddOverridden(Math.random(), Math.random());
	}
}
