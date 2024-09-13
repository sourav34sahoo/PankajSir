package ArraysInJava;

import java.util.Scanner;
public class BankLogicalProgram {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String cdn = "Yes";
		
		while(cdn.equals("Yes")) {
			System.out.println("Enter the amount");
			int amount = sc.nextInt();
			System.out.println("please collect the case");
			System.out.println("Do you want to continue(Yes/No)?");
			cdn = sc.next();
		}
	}
}
//Using while loop