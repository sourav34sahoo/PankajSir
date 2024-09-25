package com.jdbc;

import java.sql.*;
public class InsertRecords {
	public static void main(String[] args) {
		try {
			//Connect to Database
			//Use augdb --- sql
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/augdb","root","root");
			System.out.println(con);
			
			// Execute sql query
			Statement sc = con.createStatement();
			sc.executeUpdate("insert into registration values ('som','som@gmail.com','7978547386')");
			
			// close Database
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
