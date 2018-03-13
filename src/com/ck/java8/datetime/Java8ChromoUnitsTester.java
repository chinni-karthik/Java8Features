package com.ck.java8.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Java8ChromoUnitsTester {

	public static void main(String args[]) {
		Java8ChromoUnitsTester java8tester = new Java8ChromoUnitsTester();
		java8tester.testChromoUnits();
	}

	public void testChromoUnits() {
		// Get the current date
		LocalDate today = LocalDate.now();
		System.out.println("Current date: " + today);//Current date: 2018-03-13

		// add 1 week to the current date
		LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
		System.out.println("Next week: " + nextWeek);//Next week: 2018-03-20

		// add 1 month to the current date
		LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
		System.out.println("Next month: " + nextMonth);//Next month: 2018-04-13

		// add 1 year to the current date
		LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
		System.out.println("Next year: " + nextYear);//Next year: 2019-03-13

		// add 10 years to the current date
		LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
		System.out.println("Date after ten year: " + nextDecade);//Date after ten year: 2028-03-13
	}
}