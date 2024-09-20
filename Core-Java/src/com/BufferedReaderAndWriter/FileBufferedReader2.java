package com.BufferedReaderAndWriter;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileBufferedReader2 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("D:\\PankajSir\\B.txt");
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
