package ConstructorsInjava;

public class ThisKeyword {
	public static void main(String[] args) {
		ThisKeyword tw = new ThisKeyword();
		System.out.println(tw);
		tw.Test();
	}
	public void Test() {
		System.out.println(this);   
	}
}
// This keyword holds object address