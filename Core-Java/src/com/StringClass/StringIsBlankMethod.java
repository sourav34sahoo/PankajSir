package com.StringClass;

public class StringIsBlankMethod {
	public static void main(String[] args) {
		String s1 = "   ";
		
		System.out.println(s1.isBlank());  // true
		System.out.println(s1.isEmpty());  // false
		System.out.println(s1.length());   // 3
	}
}
