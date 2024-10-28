package com.JdbcDurgaSir;

import java.sql.*;

public class SelectAllRowsDemo {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgasoft","root","root");
			Statement st = con.createStatement();
			System.out.println("ENo \t ENAme \t ESal \t Eddr");
			System.out.println("----------------------------");
			ResultSet rs = st.executeQuery("select * from employees");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+ rs.getString(2)+"  "+ rs.getDouble(3)+"  "+rs.getString(4));
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
