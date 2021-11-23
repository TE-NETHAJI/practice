package com.te.java8features;

import java.time.LocalDate;

public class LocalDateTime {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.now();

		LocalDate date2 = LocalDate.parse("1997-08-13");

		System.out.println(date1);

		System.out.println(date1.getYear());
		
		System.out.println(date2.getDayOfWeek());

		System.out.println(date1.getDayOfMonth());

		System.out.println(date1.isLeapYear());

		System.out.println(date1.isAfter(date2));

		System.out.println(date1.isBefore(date2));
		
		System.out.println(date1.plusDays(10));
		
		System.out.println();
	}

}
