package variables;

public class LocalVariable3 {
	public static void main(String[] args) {
		LocalVariable1 lv = new LocalVariable1();
		lv.Test();       //Error
	}
	public void Test() {
		int x = 10;
		System.out.println(x);
	}

}
