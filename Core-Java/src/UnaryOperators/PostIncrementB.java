package UnaryOperators;

public class PostIncrementB {
	public static void main(String[] args) {
		int i = 10;
		int j = i++ + i++ + i++;
		System.out.println(i);   // 13
		System.out.println(j);   // 33
	}

}
