package UnaryOperators;

public class PostIncrementAndPreIncrement1 {
	public static void main(String[] args) {
		int i =10;
		int j = ++i + i + i++ + ++i + i++;
		System.out.println(i);  // 14
		System.out.println(j);  // 59
	}

}
