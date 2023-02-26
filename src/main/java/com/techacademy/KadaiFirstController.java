package com.techacademy;

import java.util.Calendar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

	@GetMapping("dayofweek/{date}")
	public static String dispDayOfWeek(@PathVariable String date) {
		String ymd = date;
		String y = ymd.substring(0, 4);
		String m = ymd.substring(4, 6);
		String d = ymd.substring(6, 8);

		int year = Integer.parseInt(y);
		int month = Integer.parseInt(m);
		int day = Integer.parseInt(d);

		Calendar cal = Calendar.getInstance();

		cal.set(year, month - 1, day);

		switch (cal.get(Calendar.DAY_OF_WEEK)) {

		case (Calendar.MONDAY):
			date = "Monday";
			break;
		case (Calendar.TUESDAY):
			date = "Tuesday";
			break;
		case (Calendar.WEDNESDAY):
			date = "Wednesday";
			break;
		case (Calendar.THURSDAY):
			date = "Thursday";
			break;
		case (Calendar.FRIDAY):
			date = "Friday";
			break;
		case (Calendar.SATURDAY):
			date = "Saturday";
			break;
		case (Calendar.SUNDAY):
			date = "Sunday";
			break;
		}
		return date;
	}

	@GetMapping("/plus/{number1}/{number2}")
	public int calcplus(@PathVariable int number1, @PathVariable int number2) {
		int total = 0;
		total = number1 + number2;
		return total;
	}

	@GetMapping("/minus/{number1}/{number2}")
	public int calcMinus(@PathVariable int number1, @PathVariable int number2) {
		int total = 0;
		total = number1 - number2;
		return total;
	}

	@GetMapping("/times/{number1}/{number2}")
	public int calcTimes(@PathVariable int number1, @PathVariable int number2) {
		int total = 0;
		total = number1 * number2;
		return total;
	}

	@GetMapping("/divide/{number1}/{number2}")
	public int calcDivide(@PathVariable int number1, @PathVariable int number2) {
		int total = 0;
		total = number1 / number2;
		return total;
	}
}
