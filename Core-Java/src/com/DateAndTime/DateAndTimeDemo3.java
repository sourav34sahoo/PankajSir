package com.DateAndTime;

import java.util.*;
public class DateAndTimeDemo3 {

	public static void main(String[] args) {
		Date d = new Date();
		long time = d.getTime();
		Date futureDate = new Date(time+86400000);
		System.out.println(futureDate);
	}
}

/* O/P
current time is: Thu Dec 26 17:41:39 IST 2024

future time is: Fri Dec 27 18:02:06 IST 2024 
*/