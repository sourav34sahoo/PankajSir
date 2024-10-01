package com.jdbc;

import java.sql.*;

public class ReadRecords {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/augdb","root","root");
			System.out.println(con);
			
			Statement st = con.createStatement();
			ResultSet result = st.executeQuery("SELECT * FROM registration");
			
			while(result.next()) {
				System.out.println(result.getString(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
