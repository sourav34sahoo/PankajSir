package com.fileReader;
import java.io.FileWriter;
import java.io.IOException;
public class WriteContentToFile {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\PankajSir\\A.txt");    //(, true/ false after txt")
			fw.write(97);
			fw.write("mike");
			fw.write("100");
			char[] ch = {'e','f','g'};
			fw.write(ch);
			fw.close(); // save & closing it
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
