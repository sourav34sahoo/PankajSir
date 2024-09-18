package com.filehandling;

import java.io.File;

public class CreateNewFileMethod {
	public static void main(String[] args) {
		try {
			File f = new File("D:\\PankajSir\\B.txt");
			boolean val = f.createNewFile();
			System.out.println(val);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
// It createNewFile fill in given path, if created it will return true or else false
//Note : CompileTime exception is mandatory to surround in try catch block before we run the code.
