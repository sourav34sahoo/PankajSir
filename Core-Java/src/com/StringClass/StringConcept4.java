package com.StringClass;

public class StringConcept4 {
	public static void main(String[] args) {
		String s1 = "Sourav";
		System.out.println(s1.length());   // 6
		
		String s2 = "";
		System.out.println(s2.length());   // 0
		
		String s3 = null;
		System.out.println(s3);     // null
		
		String s4 = null;
		System.out.println(s4.length());  // java.lang.NullPointerException
	}

}
