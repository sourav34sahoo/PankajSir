package ArraysInJava;
/* Enter the write username & password then print welcom if username is correct & passsword is wrong
 * then print password is invalid or if usrename is wrong & password is correct then print username is invalid 
 */

import java.util.Scanner;
public class BankLogicalProgram1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the username");
		String username = scan.next();
		
		System.out.println("Enter the password");
		String password = scan.next();
		
		if(username.equals("sourav")) {
			if(password.equals("sahoo")) {    // nasted if condition
				System.out.println("welcome");
			}
			else {
				System.out.println("password is invalid");
			}
		}
		else {
			System.out.println("username is invalid");
		}
		scan.close();
	}

}
