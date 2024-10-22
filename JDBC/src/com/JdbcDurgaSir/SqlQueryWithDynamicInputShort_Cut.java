package com.JdbcDurgaSir;

import java.util.*;
public class SqlQueryWithDynamicInputShort_Cut {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Number");
		int eno = sc.nextInt();
		
		System.out.println("Enter Employee Name");
		String ename = sc.next();
		
		System.out.println("Enter Employee Salary");
		Double esal = sc.nextDouble();
		
		System.out.println("Enter Employee Address");
		String eaddr = sc.next();
		String sqlQuery = String.format("insert into employees values(%d,'%s',%f,%s)",eno,ename,esal,eaddr);
		System.out.println("Hello query with your dynamic input is:");
		System.out.println(sqlQuery);
		sc.close();
	}
}
// %d = decimal
// %s = String
// %f = double
