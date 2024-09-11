package ConstructorsInjava;

public class ThisConstructor {
	
	ThisConstructor(int x){
		System.out.println(x);
	}
	ThisConstructor(){
		System.out.println(1);
	}
	public static void main(String[] args) {
		ThisConstructor a1 = new ThisConstructor();
	}
}
/* We can call a constructor using this() keyword.
 * this() keyword can call constructor from another constructor only.
 * this() keyword while calling constructor shpuld be first statement.
 */
