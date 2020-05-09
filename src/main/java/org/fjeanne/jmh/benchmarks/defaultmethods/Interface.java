package org.fjeanne.jmh.benchmarks.defaultmethods;

public interface Interface {
	void doNothingAbstract();

	default void doNothingDefault() {
	}

	/**
	 * This one is to be overridden by subclasses, for benchmarking purposes
	 */
	default void doNothingOverridden() {
	}
}
