package variables;

public class StaticVariable3 {
	static int y = 20;
	public static void main(String[] args) {
		int x = 10;
		System.out.println(x);
		System.out.println(StaticVariable3.y);
	}
	public void Test() {
		System.out.println(x);      // Error
		System.out.println(StaticVariable3.y);
	}
}

// static variable has global access.
