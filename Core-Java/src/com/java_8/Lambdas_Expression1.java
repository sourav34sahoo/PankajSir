package com.java_8;

public class Lambdas_Expression1 {
	public static void main(String[] args) {
		Functional_Interface1 fi = (int y) -> {
			System.out.println(y);
		};
		fi.test(100);
	}

}
