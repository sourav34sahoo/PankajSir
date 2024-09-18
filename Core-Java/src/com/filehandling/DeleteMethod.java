package com.filehandling;

import java.io.File;
public class DeleteMethod {
	public static void main(String[] args) {
		File f = new File("D:\\PankajSir\\B.txt");
		boolean val = f.delete();
		System.out.println(val);
	}
}

// it deletes the file in given path, if deleted it will return true or else false
