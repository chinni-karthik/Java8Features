package com.ck.java8.datetime;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;

public class Java8TemporalAdjustersTester {

	public static void main(String args[]) {
		Java8TemporalAdjustersTester java8tester = new Java8TemporalAdjustersTester();
		java8tester.testAdjusters();
	}

	public void testAdjusters() {
		// Get the current date
		LocalDate date1 = LocalDate.now();
		System.out.println("Current date: " + date1);//Current date: 2018-03-13

		// get the next Tuesday
		LocalDate nextTuesday = date1.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		System.out.println("Next Tuesday on : " + nextTuesday);//Next Tuesday on : 2018-03-20

		// get the second Saturday of next month
		LocalDate firstInYear 		= LocalDate.of(date1.getYear(), date1.getMonth(), 1);
		LocalDate secondSaturday 	= firstInYear.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY))
												 .with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("Second Saturday on : " + secondSaturday);//Second Saturday on : 2018-03-10
	}
}