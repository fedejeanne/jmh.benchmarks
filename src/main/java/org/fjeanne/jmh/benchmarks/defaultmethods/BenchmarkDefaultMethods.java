package org.fjeanne.jmh.benchmarks.defaultmethods;

import org.openjdk.jmh.annotations.Benchmark;

public class BenchmarkDefaultMethods {

	@Benchmark
	public void benchmarkDefaultMethod() {
		Interface a = new A();
		a.doNothingDefault();
	}

	@Benchmark
	public void benchmarkDefaultMethodOverridden() {
		Interface a = new A();
		a.doNothingOverridden();
	}
}
