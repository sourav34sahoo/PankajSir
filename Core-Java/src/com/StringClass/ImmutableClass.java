package com.StringClass;

final class A{
	private final int x;
	A(int x){
		this.x = x;
	}
	public int getx(){
		return x;
	}
}
class  ImmutableClass
{
	public static void main(String[] args) {
		A a1 = new A(10);
		System.out.println(a1.getx());   // 10
	}
}
// Declare the class as final
// make variable private & final
// Initialize the variable using constructor
// read variable value using getter method