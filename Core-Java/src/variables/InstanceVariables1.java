package variables;

public class InstanceVariables1 {
	int x = 10;  // non-static
	public static void main(String[] args) {
		InstanceVariables1 a = new InstanceVariables1();
		System.out.println(a.x);
	}
}
