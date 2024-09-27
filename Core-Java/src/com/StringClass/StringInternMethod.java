package com.StringClass;

public class StringInternMethod {
	public static void main(String[] args) {
		String s1 = "Sourav";
		String s2 = new String("Sourav").intern();
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
}
/* Intern method will help us to add the String value to String pool explicitly
 * even when the String is being created using the new keyword
 */ 
