package com.java_8;

public class Lambdas_Expression2 {
	public static void main(String[] args) {
		Functional_Interface2 le2 = () -> {
			return 100;
		};
		System.out.println(le2.test());
	}

}
