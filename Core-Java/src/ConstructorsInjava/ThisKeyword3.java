package ConstructorsInjava;

public class ThisKeyword3 {
	public static void main(String[] args) {
		System.out.println(this);    // error
	}
	public void Test() {
		System.out.println(this);
	}
}
// We cannot use this keyword inside static methods
