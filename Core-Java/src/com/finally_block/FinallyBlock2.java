package com.finally_block;

public class FinallyBlock2 {
	public static void main(String[] args) {
		try {
			int x = 10 / 0;
		}
		finally {
			System.out.println(100);  // 100
		}
		System.out.println(200);
	}

}
// we can write try and final 
// here the catch block is missing so exception will not be handle
