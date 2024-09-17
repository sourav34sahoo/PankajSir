package ArraysInJava;

public class ArrayBrackets {
	public static void main(String[] args) {
		int m = 0;
		int n = 0; 
		String[] x = {"(", "(", "(", ")", ")"};
		for (int i = 0; i < x.length; i++) {
			if (x[i].equals("(")) {
				m++;
			}
			else if(x[i].equals(")")) {
				n++;
			}
		}
		if(m == n) {
			System.out.println("equals");
		}else {
			System.out.println("not equals");
		}
	}
}
