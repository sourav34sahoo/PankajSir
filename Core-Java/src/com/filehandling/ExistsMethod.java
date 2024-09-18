package com.filehandling;

import java.io.File;
public class ExistsMethod {
	public static void main(String[] args) {
		File f = new File("D:\\PankajSir\\A.txt");
		boolean val = f.exists();
		System.out.println(val);
	}

}
// It checks wheather file exists in given path, if exists it will return true or else false