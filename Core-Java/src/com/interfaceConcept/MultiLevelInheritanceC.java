package com.interfaceConcept;

public class MultiLevelInheritanceC implements MultiLevelInheritanceB{

	@Override
	public void test1() {
		System.out.println(1);
		
	}

	@Override
	public void test2() {
		System.out.println(2);
		
	}
	public static void main(String[] args) {
		MultiLevelInheritanceC mli = new MultiLevelInheritanceC();
		mli.test1();
		mli.test2();
	}
}
