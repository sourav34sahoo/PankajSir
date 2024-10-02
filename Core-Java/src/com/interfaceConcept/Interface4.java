package com.interfaceConcept;

interface A {
	public void test1();
	public void test2();
}
class Interface4 implements A {

	@Override
	public void test1() {
		System.out.println(1);     // 1
		
	}

	@Override
	public void test2() {
		System.out.println(2);     // 2
	}
	public static void main(String[] args) {
		Interface4 i4 = new Interface4();
		i4.test1();
		i4.test2();
	}

}
