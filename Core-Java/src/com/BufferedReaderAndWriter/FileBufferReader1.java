package com.BufferedReaderAndWriter;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileBufferReader1 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("D:\\PankajSir\\B.txt");
			BufferedReader br = new BufferedReader(fr);
			char[] ch = new char[3];
			fr.read(ch);
			for(char x:ch) {
				System.out.println(x);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
