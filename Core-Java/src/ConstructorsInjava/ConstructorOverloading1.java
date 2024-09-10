package ConstructorsInjava;

public class ConstructorOverloading1 {
	ConstructorOverloading1(char x){
		System.out.println(x);     // a
	}
	ConstructorOverloading1(int x){
		System.out.println(x);    // 10
	}
	public static void main(String...args) {
		ConstructorOverloading1 a1 = new ConstructorOverloading1('a');
		ConstructorOverloading1 a2 = new ConstructorOverloading1(10);
	}

}
