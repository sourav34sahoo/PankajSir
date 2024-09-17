package ArraysInJava;

public class ArraySort {
	public static void main(String[] args) {
		int[] arr = {32,12,36,1,27};
		int temp;
		
		 for(int j = 0; j<arr.length-1; j++) {
			 for(int i = 0; i<arr.length-1; i++) {
				 if(arr[i] > arr[i+1]) {
					 temp = arr[i];
					 arr[i] = arr[i+1];
					 arr[i+1] = temp;
				 }
			 }
		 }
		 for(int z:arr) {
			 System.out.println(z);
		 }
	}

}
