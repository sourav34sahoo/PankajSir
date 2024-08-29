package variables;
//using class name

public class StaticVariable {
	static int x = 10;
	public static void main(String[] args) {
		System.out.println(StaticVariable.x);  //10
	}
}
// Static variables are created outside method inside class using static keyword.
// we can access static variables in 3 ways 1-using class name,2-variable name,3-(wrong) reference variable
