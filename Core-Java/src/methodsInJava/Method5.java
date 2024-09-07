package methodsInJava;

public class Method5 {
	public static void main(String[] args) {
		Method5 m1 = new Method5();
		m1.Test(10 , "Sourav");
	}
	public void Test(int x,String y) {
		//x & y are method arguments
		//they are local variable to test method
		System.out.println(x);  //10
		System.out.println(y);  //sourav
	}
}
