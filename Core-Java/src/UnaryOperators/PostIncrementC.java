package UnaryOperators;

public class PostIncrementC {
	public static void main(String[] args) {
		int i =10;
		int y = i++ + i + i++;
		System.out.println(i);   //12
		System.out.println(y);   //32
	}
}
