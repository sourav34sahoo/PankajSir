package com.finally_block;

public class FinallyBlock1 {
	public static void main(String[] args) {
		try {
			int x = 10 / 0;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println(100);
		}
	}
}
// Extension try catch block
// the code present in final block will run 100% 
