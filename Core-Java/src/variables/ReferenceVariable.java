package variables;

public class ReferenceVariable {
	public static void main(String[] args) {
		ReferenceVariable a1 = null;
		System.out.println(a1);    // null
		
		ReferenceVariable a2 = new ReferenceVariable();
		System.out.println(a2);      // variables.ReferenceVariable@5ccd43c2
	}
}
//Reference variable can store object address or null value.
//Datatype of reference variable is class name.