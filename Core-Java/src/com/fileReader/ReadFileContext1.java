package com.fileReader;

import java.io.File;
import java.io.FileReader;
public class ReadFileContext1 {
	public static void main(String[] args) {
		try {
			File f = new File("D:\\PankajSir\\A.txt");
			FileReader fr = new FileReader(f);
			char[] ch = new char[(int)f.length()];
			fr.read(ch);
			for(char x : ch) {
				System.out.println(x);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
