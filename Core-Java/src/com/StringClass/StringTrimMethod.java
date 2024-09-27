package com.StringClass;

public class StringTrimMethod {
	public static void main(String[] args) {
		String s1 = "  aa b  ";
		String s2 = "\n \t ACc";
		
		System.out.println(s1.trim());  // aa b
		System.err.println(s2);       //          ACc
		System.out.println(s2.trim());  //ACc
	}

}
/* Whenever we are using the trim() the trim() can remove the white 
 * spaces from left & right side and also the special character it can remove but 
 * the white space from the between String it can't be removed.  */
