package methodsInJava;

public class Method3 {
	public static void main(String[] args) {
		Method3 m1 = new Method3();
		int x = m1.Test();
		System.out.println(x);       //100
	}
	public int Test() {
		int y = 100;
		System.out.println(200);     //200
		return y;
	}
}

