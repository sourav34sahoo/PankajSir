package com.jdbc;

import java.sql.*;
import java.util.Scanner;
public class UpdateRecordsUsingScannerClass {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Email");
			String email = sc.next();
			
			System.out.println("Enter your MobileNo");
			String mobile = sc.next();
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/augdb","root","root");
			System.out.println(con);
			Statement st = con.createStatement();
			st.executeUpdate("UPDATE registration SET mobile = '"+mobile+"' WHERE email = '"+email+"'");
			con.close();
			sc.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
