package com.loop;

public class NestedForLoop {
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println(j);
			}
		}
	}

}


// Whenever the outer forloop runs once inner forloop will runs completly that means when i = 0, j become 0 1 2 3 4