package ConstructorsInjava;

public class ConstructorArgs {
	ConstructorArgs(int x){
		System.out.println(x);    //100
	}
	public static void main(String[] args) {
		ConstructorArgs a1 = new ConstructorArgs(100);
	}

}
//We can create with args & Constructors without args.
