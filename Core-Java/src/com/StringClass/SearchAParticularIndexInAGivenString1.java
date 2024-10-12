package com.StringClass;

public class SearchAParticularIndexInAGivenString1 {
	public static void main(String[] args) {
		String s = "Hello World Where are you";
		System.out.println(s.indexOf('W'));    // 6
		System.out.println(s.indexOf('W',7));   // 12
	}

}
