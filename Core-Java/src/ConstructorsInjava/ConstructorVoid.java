package ConstructorsInjava;

public class ConstructorVoid {
	ConstructorVoid() {
		return 100;     //Error
	}
	public static void main(String[]args) {
		ConstructorVoid a1 = new ConstructorVoid();
	}
}
// Constructors can never return any value,they are always void. 