package com.jdbc;

import java.sql.*;
import java.util.Scanner;
public class DeleteRecordsUsingScannerClass {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your email");
			String email = sc.next();
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/augdb","root","root");
			System.out.println(con);
			Statement st = con.createStatement();
			st.executeUpdate("DELETE FROM registration WHERE email = '"+email+"'");
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
