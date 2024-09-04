package methodsInJava;

public class Method {
	public static void main(String[] args) {
		return 200;     // error
	}
	public void Test() {
		return 100;     // error
	}
}
//A void method can never return any value.
