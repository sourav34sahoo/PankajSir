package com.finally_block;

import java.io.FileWriter;
import java.io.IOException;
public class FinallyBlock3 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("D://PankajSir/A.txt");
			int x = 10/0; 
			fw.write("sourav");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(200);
	}

}
