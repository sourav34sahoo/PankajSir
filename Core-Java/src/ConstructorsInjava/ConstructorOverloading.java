package ConstructorsInjava;

public class ConstructorOverloading {
	ConstructorOverloading(){
		System.out.println(1);  //1
	}
	ConstructorOverloading(int x){
		System.out.println(x);  // 1
	}
	ConstructorOverloading(int x,int y){
		System.out.println(x);  //2
		System.out.println(y);  //3
	}
	public static void main(String...args) {
		ConstructorOverloading a1 = new ConstructorOverloading();
		ConstructorOverloading a2 = new ConstructorOverloading(1);
		ConstructorOverloading a3 = new ConstructorOverloading(2,3);
	}
}
/* Here we create more than one constructor in same class provided they have different
number of argument or different type of arguments. */
