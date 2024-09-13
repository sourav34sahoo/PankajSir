package ArraysInJava;

import java.util.Scanner;
public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key");
		int key = sc.nextInt();
		switch(key) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
		case 4:
			System.out.println(4);
			break;
			
		default :
			System.out.println("No match found");
		}
	}

}
