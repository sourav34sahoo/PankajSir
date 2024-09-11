package ArraysInJava;

import java.util.*;
public class ScannerClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		//String name = scan.next();    // sourav
		String name = scan.nextLine();  // sourav sahoo
		System.out.println(name);
		
		System.out.println("Enter your age");   // 22
		int age = scan.nextInt();
		System.out.println(age);
		
		System.out.println("Enter your weight");  //81.53
		float weight = scan.nextFloat();
		System.out.println(weight);
		
		System.out.println("Enter your ans");  // true
		boolean val = scan.nextBoolean();
		System.out.println(val);
		
	}
}
// next() methods can read only one words if we give two words next() won't able to read that.
//for multiple words then used nextline() method.
