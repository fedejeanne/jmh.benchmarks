package org.fjeanne.jmh.benchmarks.defaultmethods;

public class Children {

	public static class Child1 implements Interface {
		@Override
		public void doNothingAbstract() {
			// do nothing
		}

		@Override
		public void doNothingOverridden() {
			// do nothing
		}
	}

	public static class Child2 extends Child1 {
	}

	public static class Child3 extends Child2 {
	}

	public static class Child4 extends Child3 {
	}

	public static class Child5 extends Child4 {
	}

	public static class Child6 extends Child5 {
	}

	public static class Child7 extends Child6 {
	}

	public static class Child8 extends Child7 {
	}

	public static class Child9 extends Child8 {
	}

	public static class Child10 extends Child9 {
		@Override
		public void doNothingAbstract() {
			// do nothing
		}

		@Override
		public void doNothingOverridden() {
			// do nothing
		}
	}
}