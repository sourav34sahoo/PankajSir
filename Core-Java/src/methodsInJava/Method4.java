package methodsInJava;

public class Method4 {
	public static void main(String[] args) {
		Method4 m1 = new Method4();
		int x = m1.Test();
		System.out.println(x);
	}
	public int Test() {
		int y = 10;
		return y;          //Unreachable code
		System.out.println(20);
	}
}
//If any code in java doesn't run 100% then we get Unreachable code error.
