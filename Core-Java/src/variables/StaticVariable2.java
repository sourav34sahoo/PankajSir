package variables;

public class StaticVariable2 {
	static int x=10;
	public static void main(String[] args) {
		StaticVariable2 a1 = new StaticVariable2();
		System.out.println(a1.x);         // 10
	}
}

/* In the below program a1.x is automatically replaced with StaticVariable2.x and hence 
it will print the output 10. */

