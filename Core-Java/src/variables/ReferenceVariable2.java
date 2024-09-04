package variables;

public class ReferenceVariable2 {
	static ReferenceVariable2 a1 = new ReferenceVariable2();
	public static void main(String[] args) {
		System.out.println(a1); // corect
	}
	public void Test() {
		System.out.println(a1);  //corect
	}

}
