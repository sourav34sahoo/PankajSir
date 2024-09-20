package com.BufferedReaderAndWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterNewLine {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\PankajSir\\B.txt");
			BufferedWriter br = new BufferedWriter(fw);
			br.write(100);
			br.newLine();
			br.write("sourav");
			br.newLine();
			char[] ch = {'a','b'};
			br.write(ch);
			br.close();
			fw.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
