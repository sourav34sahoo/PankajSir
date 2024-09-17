package ConstructorsInjava;

public class ConstructorChaining1 {
	ConstructorChaining1(){
		System.out.println(1);   // 1
	}
	public static void main(String[] args) {
		ConstructorChaining1 c1 = new ConstructorChaining1();
		c1.Test();
	}
	public void Test() {
		System.out.println(2);   // 2
	}

}
