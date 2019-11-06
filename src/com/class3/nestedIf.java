package com.class3;

public class nestedIf {

	public static void main(String[] args) {

		// nested if: if statement inside another if statement
		// if (boolean expression) {
		// System.out.println("Hello");
		// if (boolean expression) {
		// system.out.println("Hello m friends");
		// }

		boolean b =true;
		boolean classToday = false;

		if (b) {
			System.out.println("Hi");
			if (classToday) {
				System.out.println("Hello my friends");

			}
		} else {
			System.out.println("Bye");
		}
		System.out.println("Why");
		
		
		boolean isFriday=false;
		int day=13;
				
				if (isFriday) {
					System.out.println("Today is Friday");
					
					if (day==13)
						System.out.println("I will watch a scary movie");}
				
					
				else {
					System.out.println("Today is Not Friday");
				}
		System.out.println(" with my friends");
				}
	}


