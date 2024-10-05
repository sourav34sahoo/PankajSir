package com.interfaceConcept;

public class InterfaceMultipleInheritanceC implements InterfaceMultipleInheritanceA,InterfaceMultipleInheritanceB{

	@Override
	public void test2() {
		System.out.println("sourav");
	}

	@Override
	public void test() {
		System.out.println("sahoo");
	}
	public static void main(String[] args) {
		InterfaceMultipleInheritanceC imc = new InterfaceMultipleInheritanceC();
		imc.test();
		imc.test2();
	}

}
