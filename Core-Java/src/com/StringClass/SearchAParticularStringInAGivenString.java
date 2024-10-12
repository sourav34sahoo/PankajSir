package com.StringClass;

public class SearchAParticularStringInAGivenString {
	public static void main(String[] args) {
		String s = "My name is sourav";
		System.out.println(s.contains("sourav"));  // true
		System.out.println(s.contains("Name"));    // false
	}

}
