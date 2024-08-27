package variables;

public class InstanceVariables4 {
	int x =10;  // non-static
	public static void main(String[] args) {
		InstanceVariables4 a = new InstanceVariables4();
		InstanceVariables4 a1 = new InstanceVariables4();
		a1.x = 20;
		System.out.println(a.x);
		System.out.println(a1.x);
	}

}
