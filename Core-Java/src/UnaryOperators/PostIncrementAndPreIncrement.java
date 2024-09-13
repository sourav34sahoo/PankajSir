package UnaryOperators;

public class PostIncrementAndPreIncrement {
	public static void main(String[] args) {
		int i =10;
		int j = ++i + i++;  
	    System.out.println(i); //12
	    System.out.println(j);  //22
	}
}
