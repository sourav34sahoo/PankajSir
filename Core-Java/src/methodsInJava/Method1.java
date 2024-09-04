package methodsInJava;

public class Method1 {
	public static void main(String[] args) {
		Method1 a1 = new Method1();
		int x = a1.test();
		System.out.println(x);  //100
		
	}
	public int test() {
		return 100;
	}
}
//A return value make method not a void method as shown in above program.
