package com.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileInputStreamConcept {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\PankajSir\\B.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			A a1 = (A)ois.readObject();
			System.out.println("Name : "+a1.name);
			System.out.println("Password : "+a1.password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
