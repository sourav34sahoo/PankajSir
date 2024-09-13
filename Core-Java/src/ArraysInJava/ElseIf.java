package ArraysInJava;
// Condition is 35 to 60 mark is 2nd class, 60 to 80 mark is 1st class and 80 to 100 mark is distintion.

import java.util.Scanner;
public class ElseIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your percentage");
		float percentage = sc.nextFloat();
		
		if(percentage >= 35 && percentage <60) {
			System.out.println("2nd Division");
		}
		else if(percentage >= 60 && percentage < 80) {
			System.out.println("1st Division");
		}
		else if(percentage >= 80 && percentage <= 100) {
			System.out.println("Distintion");
		}
		else {
			System.out.println("Fail");
		}
	}

}
