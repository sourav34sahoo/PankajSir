package com.java_8;
@FunctionalInterface
public interface FunctionalInterface3 {
	public int test1();
	default void test2() {
		System.out.println(2);
	}
}
