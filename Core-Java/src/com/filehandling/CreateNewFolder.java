package com.filehandling;

import java.io.File;
public class CreateNewFolder {
	public static void main(String[] args) {
		File f = new File("D:\\PankajSir\\p1");
		boolean val = f.mkdir();
		System.out.println(val);
	}
}
// it creates new folder in given path, if created it will return true or else false

