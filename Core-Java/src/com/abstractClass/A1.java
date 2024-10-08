package com.abstractClass;

public class A1 extends AbstractClass1{

	@Override
	public void test1() {
		System.out.println(1);
	}
	public static void main(String[] args) {
		A1 a = new A1();
		a.test1();
		a.test2();
	}
}
