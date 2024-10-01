package com.jdbc;

import java.sql.*;
import java.util.Scanner;
public class InputRecordsUsingScannerClass {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Name");
			String name = sc.next();
			
			System.out.println("Enter your Email");
			String email = sc.next();
			
			System.out.println("Enter your MobileNo");
			String mobile = sc.next();
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/augdb","root","root");
			System.out.println(con);
			Statement st = con.createStatement();
			st.executeUpdate("INSERT INTO registration values('"+name+"','"+email+"','"+mobile+"')");
			con.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
