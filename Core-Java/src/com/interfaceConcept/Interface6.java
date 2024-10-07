package com.interfaceConcept;

class A2 {
	static int x = 10;
}
class Interface6 extends A2{
	public static void main(String[] args) {
		System.out.println(Interface6.x);    // Interface6.x converted to A2.x 
	}
}
