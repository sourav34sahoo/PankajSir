package variables;

public class LocalVariable {
	public static void main(String[] args) {
		int x = 10;
		System.out.println(x);
	}
	public void Test() {
		//System.out.println(x);  Error
	}
}
// These variables are created inside the method & should be used only within the created method only.