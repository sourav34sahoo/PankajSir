package variables;

public class InstanceVariables3 {
	int x = 10;  //non-static
	public static void main(String[] args) {
		InstanceVariables3 a = new InstanceVariables3();
		InstanceVariables3 a1 = new InstanceVariables3();
		System.out.println(a.x);
		System.out.println(a1.x);
	}
}
