package ConstructorsInjava;

public class ThisKeyword1 {
	int x = 10;
	public static void main(String[] args) {
		ThisKeyword1 a1 = new ThisKeyword1();
		System.out.println(a1.x);     //10
		a1.Test();
	}
	public void Test() {
		System.out.println(this.x);  //10
	}
}
//using this keyword we can access non-static members of the class.
