package variables;

public class InstanceVariables2 {
	int x = 10;    // non-static
	int y = 20;    // non-static
	public static void main(String[] args) {
		InstanceVariables2 a = new InstanceVariables2();
		System.out.println(a.x);       // 10
		System.out.println(a.y);       // 20
	}
}
