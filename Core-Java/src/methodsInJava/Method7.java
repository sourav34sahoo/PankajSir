package methodsInJava;

public class Method7 {
	public static void main(String[] args) {
		Method7 m1 = new Method7();
		m1.Test(10,20,30,40);
	}
	public void Test(int... x) {
	System.out.println(x[0]);  // 10
	System.out.println(x[1]);  // 20
	System.out.println(x[2]);  // 30
	System.out.println(x[3]);  // 40
	}
}

