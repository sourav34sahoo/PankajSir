package ConstructorsInjava;

public class ConstructorName {
	ConstructorName() {
		System.out.println(100);        // 100 100
	}
	public static void main(String[] args) {
		ConstructorName a1 = new ConstructorName();
		ConstructorName a2 = new ConstructorName();
	}
}
//Constructor should have same name as that of class.
//Whenever we create object constructor is being called.