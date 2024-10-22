package com.JdbcDurgaSir;

import java.util.*;
public class SqlQueryWithDynamicInput {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Number");
		int ENo = sc.nextInt();
		
		System.out.println("Enter Employee Name");
		String EName = sc.next();
		
		System.out.println("Enter Employee Salary");
		double ESal = sc.nextDouble();
		
		System.out.println("Enter Employee Address");
		String EAddr = sc.next();
		String sqlQuerry =("insert into employees values("+ENo+","+EName+","+ESal+","+EAddr+")");
		System.out.println("Hello Query with your dynamic input:");
		System.out.println(sqlQuerry);
		sc.close();
	}

}
