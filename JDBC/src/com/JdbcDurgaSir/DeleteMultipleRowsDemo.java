package com.JdbcDurgaSir;

import java.sql.*;
import java.util.Scanner;

public class DeleteMultipleRowsDemo {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgasoft","root","root");
			Statement st = con.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter cutoff salary");
			double cutOff = sc.nextDouble();
			int updateCount = st.executeUpdate(String.format("delete from employees where ESal = %f",cutOff));
			System.out.println("The number of rows deleted" +updateCount);
			con.close();
			sc.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
