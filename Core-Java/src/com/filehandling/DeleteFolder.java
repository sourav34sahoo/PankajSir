package com.filehandling;

import java.io.File;

public class DeleteFolder {
	public static void main(String[] args) {
		File f = new File("D:\\PankajSir\\p1");
		boolean val = f.delete();
		System.out.println(val);
	}
}
