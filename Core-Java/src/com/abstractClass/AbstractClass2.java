package com.abstractClass;

public abstract class AbstractClass2 {
	static int x = 100;
	public static void main(String[] args) {
		System.out.println(AbstractClass2.x);
		AbstractClass2.test();
	}
	public static void test() {
		System.out.println(200);
	}

}
