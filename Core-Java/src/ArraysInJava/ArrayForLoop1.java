package ArraysInJava;

public class ArrayForLoop1 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			if(i==2) {
				break;
			}
			System.out.println(i);  // 0 1 
		}
	}
}
// break keyword will help us to exit he loop.
