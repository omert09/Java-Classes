package com.class6;

import java.util.Scanner;

public class TaskAndOr {
	public static void main(String[] args) {

		/*
		 * ask user to enter month born based on the month define the season if user is
		 * born in jan, feb, dec -> winter if mar apr may --> spring if jun jul aug -->
		 * summer
		 */

		Scanner inp = new Scanner(System.in);
		String month;
		
		System.out.println("Please enter month you were born");
		month = inp.nextLine();

		if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("february")
				|| month.equalsIgnoreCase("December")) {
			month = "Winter";
		} else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")
				|| month.equalsIgnoreCase("May")) {
			month = "Spring";
		} else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")
				|| month.equalsIgnoreCase("August")) {
			month = "Summer";
		} else {
			System.out.println("Invalid");
		}

		System.out.println(month);
	}
}
