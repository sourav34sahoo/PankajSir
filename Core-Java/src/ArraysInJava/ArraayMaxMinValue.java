package ArraysInJava;

public class ArraayMaxMinValue {
	public static void main(String[] args) {
		int[] arr = {63,34,2,38,58,49};
		int temp;
		
		for(int j = 0; j < arr.length-1; j++) {
			for(int i = 0; i < arr.length-1; i++) {
				if(arr[i] > arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		System.out.println(arr[arr.length-1]);  //max value
		System.out.println(arr[0]);     // min value
	}

}
