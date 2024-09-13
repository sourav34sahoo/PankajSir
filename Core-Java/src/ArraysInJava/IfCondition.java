package ArraysInJava;
// write correct username & password to get welcome nor print invalid credentials.

import java.util.*;
public class IfCondition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username");
		String username = sc.next();
		
		System.out.println("Enter Password");
		String password = sc.next();
		
		if(username.equals("sourav") && password.equals("sahoo")) {
			System.out.println("Welcome");
		}
		else {
			System.out.println("Invalid Credentials");
		}
	}

}
