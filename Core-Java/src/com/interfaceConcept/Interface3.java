package com.interfaceConcept;

interface B {
	public void test();
}
class Interface3 implements B{

	@Override
	public void test() {
		System.out.println(1);
	} 
	public static void main(String...args) {
		Interface3 b = new Interface3();
		b.test();
	}
}
