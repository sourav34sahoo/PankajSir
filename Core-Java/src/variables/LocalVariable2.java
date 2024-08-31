package variables;

public class LocalVariable2 {
	public static void main(String[] args) {
		System.out.println(x);  // Error
	}
	public void Test() {
		int x = 10;       // Created
		System.out.println(x);  // using
	}

}
