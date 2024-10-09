package com.java_8;

public interface InterfaceObjectCreation {
	public static void main(String[] args) {
		InterfaceObjectCreation.test();
		//InterfaceObjectCreation ioc = new InterfaceObjectCreation();
	}
	public static void test() {
		System.out.println(2);        // 2
	}

}
// we can't create objects inside interface
