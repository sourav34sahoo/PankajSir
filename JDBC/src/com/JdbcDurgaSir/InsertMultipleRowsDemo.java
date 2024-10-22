package com.JdbcDurgaSir;

import java.sql.*;
import java.util.*;
public class InsertMultipleRowsDemo {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DurgaSoft","root","root");
			Statement st = con.createStatement();
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("Enter employee number");
				int ENo = sc.nextInt();
				
				System.out.println("Enter employee name");
				String EName = sc.next();
				
				System.out.println("Enter employee salary");
				double ESal = sc.nextDouble();
				
				System.out.println("Enter employee address");
				String EAddr = sc.next();
				String sqlQuery = String.format("insert into employees values(%d,'%s',%f,'%s')" ,ENo,EName,ESal,EAddr);
				st.executeUpdate(sqlQuery);
				System.out.println("Record insert successfully");
				System.out.println("Do you want to insert one more record[Yes/No]");
				String option = sc.next();
				if(option.equalsIgnoreCase("No")) {
					break;
				} 
			}
			con.close();
			sc.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
