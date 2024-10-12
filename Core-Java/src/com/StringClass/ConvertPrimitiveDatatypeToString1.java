package com.StringClass;

public class ConvertPrimitiveDatatypeToString1 {
	public static void main(String[] args) {
		int i = 10;
		String s1 = String.valueOf(i);
		
		float f = 26.28f;
		String s2 = String.valueOf(f);
		
		char ch = 'a';
		String s3 = String.valueOf(ch);
		
		double d = 37.272;
		String s4 = String.valueOf(d);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
