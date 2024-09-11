package ArraysInJava; 
/* If i enter the pin number correctly program should print welome and stop, if i enter
 * pin number 3 times incorrectly the cord should get blocked. 
 */
import java.util.Scanner;
public class LogicalProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.println("Enter the pinNumber");
			int pinNumber = sc.nextInt();
			
			if(pinNumber==1234) {
				System.out.println("welcome");
				break;
			}
			else {
				System.out.println("wrong pin");
				if(i==2) {
					System.out.println("card is blocked");
				}
			}
		}
	}

}
