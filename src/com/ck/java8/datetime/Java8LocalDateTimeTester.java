package com.ck.java8.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;

public class Java8LocalDateTimeTester {

	public static void main(String args[]) {
		Java8LocalDateTimeTester java8LocalDateTimeTester = new Java8LocalDateTimeTester();
		java8LocalDateTimeTester.testLocalDateTime();
	}

	public void testLocalDateTime() {
		// Get the current date and time
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("Current DateTime: " + currentTime);//Current DateTime: 2018-03-13T15:14:25.592

		LocalDate date1 = currentTime.toLocalDate();
		System.out.println("date1: " + date1);//date1: 2018-03-13

		Month month 	= currentTime.getMonth();
		int day 		= currentTime.getDayOfMonth();
		int seconds 	= currentTime.getSecond();

		System.out.println("Month: " + month + " day: " + day + " seconds: "+ seconds);//Month: MARCH day: 13 seconds: 59

		LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
		System.out.println("date2: " + date2);//date2: 2012-03-10T15:16:59.325

		// 12 december 2014
		LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
		System.out.println("date3: " + date3);//date3: 2014-12-12

		// 22 hour 15 minutes
		LocalTime date4 = LocalTime.of(22, 15);
		System.out.println("date4: " + date4);//date4: 22:15

		// parse a string
		LocalTime date5 = LocalTime.parse("20:15:30");
		System.out.println("date5: " + date5);//date5: 20:15:30
	}
}