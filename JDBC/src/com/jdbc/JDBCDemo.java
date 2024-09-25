package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/souravdb", "root", "root");
		Statement st = con.createStatement();
		ResultSet executeQuery = st.executeQuery("select id, name,age from emp");
		
		while(executeQuery.next()) {
			System.out.println(executeQuery.getInt("id") + " " +executeQuery.getString("name")+"   "+ executeQuery.getInt("age"));
		}
		
		System.out.println("");
		
	}
}
