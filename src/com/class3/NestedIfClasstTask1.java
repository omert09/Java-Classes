package com.class3;

public class NestedIfClasstTask1 {
	public static void main(String[] args) {

		boolean diploma = true;
		double gpa = 3.4;

		if (diploma) {
			System.out.println("Congratulations");

			if (gpa >= 3.5) {
				System.out.println("You are eligible for a scholarship");
			} else {
				System.out.println("You should have studied harder");
			}

		} else {
			System.out.println("You should definetely get a degree");

		}

		// Task 2

		double mortgageRate = 4;
		double mortgagePrice = 250000;

		if (mortgageRate > 4.5) {
			System.out.println("I will not buy a house");
		} else {
			System.out.println("I will consider buying a house");
			if (mortgagePrice > 200000) {
				System.out.println("I will take out a loan");
			} else {
				System.out.println("I will pay cash");
			}

		}
	}
}
