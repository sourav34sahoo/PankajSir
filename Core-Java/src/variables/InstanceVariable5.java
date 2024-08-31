package variables;

public class InstanceVariable5 {
	int x;
	public static void main(String[] args) {
		InstanceVariable5 iv = new InstanceVariable5();
		System.out.println(iv.x);  //0
	}
}

/*non-static variable if not initialized then depending on the data type 
automatically default value will get stored in it. */