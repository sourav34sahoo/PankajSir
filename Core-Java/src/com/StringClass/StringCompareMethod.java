package com.StringClass;

public class StringCompareMethod {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "python";
		
		String s3 = "java";
		String s4 = "java";
		
		String s5 = "dog";
		String s6 = "cat";
		
		System.out.println(s1.compareTo(s2));     //  if after return negative  -6
		System.out.println(s3.compareTo(s4));     // if equals return 0
		System.out.println(s5.compareTo(s6));     // if before return possetive  1
	}

}
