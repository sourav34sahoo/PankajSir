package com.jdbc;

import java.sql.*;

public class UpdateRecords {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/augdb","root","root");
			System.err.println(con);
			
			Statement st = con.createStatement();
			st.executeUpdate("UPDATE registration SET mobile = '7978547307' WHERE email = 'sahoo34sourav@gmail.com'");
			
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
