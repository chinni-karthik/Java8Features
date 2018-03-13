package com.ck.java8.datetime;

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class Java8ZonedDateTimeTester {

	public static void main(String args[]) {
		Java8ZonedDateTimeTester java8tester = new Java8ZonedDateTimeTester();
		java8tester.testZonedDateTime();
	}

	public void testZonedDateTime() {
		// Get the current date and time
		ZonedDateTime date1 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
		System.out.println("date1: " + date1);//date1: 2007-12-03T10:15:30+05:00[Asia/Karachi] --->>> +05:00[Asia/Karachi] this is the difference

		ZoneId id = ZoneId.of("Europe/Paris");
		System.out.println("ZoneId: " + id);//ZoneId: Europe/Paris

		ZoneId currentZone = ZoneId.systemDefault();
		System.out.println("CurrentZone: " + currentZone);//CurrentZone: Asia/Calcutta
	}
}