package ConstructorsInjava;

public class ThisKeyword5 {
	public static void main(String[] args) {
		ThisKeyword5 a1 = new ThisKeyword5();
		a1.Test1();
	}
	public void Test1() {
		this.Test2();
	}
	public void Test2() {
		System.out.println(2);
	}

}
