package com.filehandling;

import java.io.File;
public class LengthMethod {
	public static void main(String[] args) {
		File f = new File("D:\\PankajSir\\A.txt");
		long val = f.length();
		System.out.println(val);
	}

}
// it returns long value
// it counts number of characters in given file including white space characters
