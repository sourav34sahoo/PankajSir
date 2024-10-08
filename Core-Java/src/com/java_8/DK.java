package com.java_8;

public class DK implements DefaultKeyword{

	@Override
	public void test1() {
		System.out.println(1);
	}
	public static void main(String[] args) {
		DK d = new DK();
		d.test1();
		d.test2();
		d.test3();
	}
}
