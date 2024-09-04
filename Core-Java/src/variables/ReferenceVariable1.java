package variables;

public class ReferenceVariable1 {
	public static void main(String[] args) {
		ReferenceVariable1 a1 = new ReferenceVariable1();  //Lccal reference variable
		System.out.println(a1);    // corect
		
		public void Test() {
			System.out.println(a1);  // error
		}
	}
}
