package com.StringClass;

public class StringComparision {
	public static void main(String[] args) {
		String s1 = "sourav";
		String s2 = "sourav";
		String s3 = "Sourav";
		
		System.out.println(s1.equals(s2));     // true
		System.out.println(s1.equals(s3));    // false
		System.out.println(s1.equalsIgnoreCase(s3));   // true
	}
}
// equalsIgnoreCase ignore the Uppercase or Lowercase does't method

