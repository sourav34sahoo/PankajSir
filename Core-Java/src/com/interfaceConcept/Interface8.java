package com.interfaceConcept;

interface A3{
	public int test();
}
public class Interface8 implements A3{
	public int test() {
		return 100;
	}
	public static void main(String[] args) {
		Interface8 i8 = new Interface8();
		System.out.println(i8.test());    // 100
	}

}
