package ConstructorsInjava;

public class ThisKeyword4 {
	int x = 10;
	public static void main(String[] args) {
		ThisKeyword4 a1 = new ThisKeyword4();
		a1.Test();
	}
	public void Test() {
		System.out.println(x);    //10    x --> this.x
	}
}
/* when the method happens to be non-static,that is where you will see 
 * that this will happen to work.
 */ 
