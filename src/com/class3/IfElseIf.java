package com.class3;

public class IfElseIf {

	public static void main(String[] args) {

		int num1 = 100;
		int num2 = 100;

		if (num1 > num2) {
			System.out.println("Num1 is larger than num2");
		} else if (num1 == num2) {
			System.out.println("Num 1 is equal to num2");
		} else {
			System.out.println("Num1 is smaller than num2");
		}

		int day = 6;

		if (day == 1) {
			System.out.println("Today is Monday");
		} else if (day == 2) {
			System.out.println("Today is Tuesday");
		} else if (day == 6) {
			System.out.println("Today is Saturday");

		}
	}
}
