package UnaryOperators;

public class PostIncrementA {
	public static void main(String[] args) {
		int x = 10;
		int y =x++ + x++;
		System.out.println(x);   //12
		System.out.println(y);   //21
	}
}
