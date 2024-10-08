package com.java_8;

public interface DefaultKeyword {
	public void test1();
	
	default public void test2() {
		System.out.println(2);
	}
	default void test3() {
		System.out.println(3);
	}

}
// This was introduced in java 8
// Default keyword help us to develop complete methods in an interface
