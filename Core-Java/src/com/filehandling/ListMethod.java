package com.filehandling;

import java.io.File;

public class ListMethod {
	public static void main(String[] args) {
		File f = new File("D:\\PankajSir\\");
		String[] val = f.list();
		for(String x:val) {
			System.out.println(x);
		}
	}

}
// it returns String Array
// it returns all file names in the given path
