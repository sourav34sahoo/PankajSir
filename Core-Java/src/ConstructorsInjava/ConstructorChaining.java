package ConstructorsInjava;

public class ConstructorChaining {
	ConstructorChaining(int x){
		System.out.println(x);
	}
	
	ConstructorChaining(){
		System.out.println(100);
	}
	public static void main(String[] args) {
		ConstructorChaining c1 = new ConstructorChaining();
	}
}
