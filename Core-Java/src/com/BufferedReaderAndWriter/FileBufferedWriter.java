package com.BufferedReaderAndWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileBufferedWriter {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\PankajSir\\B.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(100);
			bw.write("//n mike //n");
			char[] ch = {'b','d'};
			bw.write(ch);
			bw.close();
			fw.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
