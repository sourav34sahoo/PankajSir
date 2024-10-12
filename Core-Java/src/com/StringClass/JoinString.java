package com.StringClass;

public class JoinString {
	public static void main(String[] args) {
		String words = "Helo World Java Programming";
		String str = String.join("_",words); 
		System.out.println(str);
	}

}
