package UnaryOperators;

public class PreIncrementB {
	public static void main(String[] args) {
		int i = 10;
		int y = ++i + i + ++i;
		System.out.println(i);  //12
		System.out.println(y);  //34
	}
}
