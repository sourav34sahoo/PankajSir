package UnaryOperators;

public class PostDecrement {
	public static void main(String[] args) {
		int i =10;
		int j =i-- + i--;
		System.out.println(i); //8
		System.out.println(j); //19
	}
}
