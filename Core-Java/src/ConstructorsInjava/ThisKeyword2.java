package ConstructorsInjava;

public class ThisKeyword2 {
	public static void main(String[] args) {
		ThisKeyword2 a1 = new ThisKeyword2();
		a1.Test();
		ThisKeyword2 a2 = new ThisKeyword2();
		a2.Test();
		a1.Test();
	}
	public void Test() {
		System.out.println(this);
	}
}
// this keyword holds current objects address in it.
