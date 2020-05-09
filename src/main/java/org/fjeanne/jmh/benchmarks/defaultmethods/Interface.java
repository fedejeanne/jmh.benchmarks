package org.fjeanne.jmh.benchmarks.defaultmethods;

public interface Interface {

	default void doNothingDefault() {
	}

	/**
	 * This one is to be overridden by subclasses, for benchmarking purposes
	 */
	default void doNothingOverridden() {
	}

	default double doAddDefault(double a, double b) {
		return a + b;
	}

	default double doAddOverridden(double a, double b) {
		return 0;
	}
}
