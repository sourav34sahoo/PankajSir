package com.jdbc;

import java.sql.*;

public class DeleteRecords {
	public static void main(String[] args) {
		 try {
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/augdb","root","root");
			 System.out.println(con);
			 
			 Statement sc = con.createStatement();
			 sc.executeUpdate("DELETE FROM registration WHERE mobile ='7978547386'");
			 
			 con.close();
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	}

}
