package com.interfaceConcept;

class A1{
	public static void test1() {
		System.out.println(100);
	}
}
class Interface5A extends A1 {
	public static void main(String[] args) {
		Interface5A.test1();  // Interface5A.test1() converted to A1.test1()
	}
}
/* in the above program inheritance doesn't happen but Interface5A.test1() is converted with A1.test1() 
 * hence we get the output. */ 
