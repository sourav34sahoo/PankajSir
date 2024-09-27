package com.StringClass;

public class StringCharAtMethod {
	public static void main(String[] args) {
		String s1 = "aabcaudhaai";
		int count = 0;
		
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)=='a') {
				count ++;
			}
		}
		System.out.println(count);    // 5
	}
}
 // find the number of characters in the given String letter a ?
