package com.java_8;

public class LambadasExpression3 {
	public static void main(String[] args) {
		FunctionalInterface3 fi = () -> {
			return 100;
		};
		System.out.println(fi.test1());   // 100
		fi.test2();                       // 2
	}

}
