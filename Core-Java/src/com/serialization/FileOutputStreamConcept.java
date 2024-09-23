package com.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FileOutputStreamConcept {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("D:\\PankajSir\\B.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			A a1 = new A();
			oos.writeObject(a1);
			oos.close();
			fos.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
