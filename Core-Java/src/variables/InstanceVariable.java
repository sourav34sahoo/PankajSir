package variables;

public class InstanceVariable {
	int x =10; // non-static

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(x);     // Error
	}
}
/* NonStatic variables are created outside method but inside class 
without static keyword. */

//without creating Object we can't access non-static members.