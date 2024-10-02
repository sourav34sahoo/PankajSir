package com.interfaceConcept;

interface c{
	public void addition(int a,int b);
	public void division(int a,int b);
	public void multiplication(int a,int b);
}
public class InterfaceCalculator implements c {

	@Override
	public void addition(int a, int b) {
		System.out.println(a+b);
		
	}

	@Override
	public void division(int a, int b) {
		System.out.println(a-b);
		
	}

	@Override
	public void multiplication(int a, int b) {
		System.out.println(a*b);
		
	}
	public static void main(String...args) {
		InterfaceCalculator ic = new InterfaceCalculator();
		ic.addition(4,5);
		ic.division(7,3);
		ic.multiplication(2,9);
	}

}
