package com.fileReader;
import java.io.FileWriter;
import java.io.IOException;
public class WriteContentToNewLine {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\PankajSir\\A.txt");
			fw.write(97);
			fw.write("\n mike \\n");
			fw.write("\n");
			fw.write("100");
			fw.write("\n");
			char[] ch = {'e','f','g'};
			fw.write(ch);
			fw.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
