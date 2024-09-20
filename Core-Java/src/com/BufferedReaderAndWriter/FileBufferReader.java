package com.BufferedReaderAndWriter;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileBufferReader {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("D:\\PankajSir\\B.txt");
			BufferedReader br = new BufferedReader(fr);
			System.out.println((char)br.read());            // with char print (char)value  without char print (int) value
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
