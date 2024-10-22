package com.JdbcDurgaSir;

import java.sql.*;

public class CreateTableDemo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DurgaSoft","root","root");
			Statement st = con.createStatement();
			st.executeUpdate("CREATE TABLE employees(ENo int(5),EName varchar(30),ESal double(6,2),EAddr varchar(50))");
			System.out.println("Table created successfully");
			con.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
