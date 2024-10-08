package com.java_8;

public class FunctionalInterface1 implements A1{

	@Override
	public void test1() {
		System.out.println(100);
	}
	public static void main(String[] args) {
		FunctionalInterface1 fi = new FunctionalInterface1();
		fi.test1();
	}

}
