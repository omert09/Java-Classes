package com.class5;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
//		int day=12;
//		
//		if(day>=1 && day<=5) {
//			System.out.println("It is a weekday");
//		}else if (day>=6 && day<=7) {
//			System.out.println("It is the weekend");
//		}else {
//			System.out.println("Invalid day ");
//		}
				
		// Task 2
		
		Scanner inp=new Scanner(System.in);
		
		System.out.println("What is your height in feet");
		int height=inp.nextInt();
		
		if (height<5) {
			System.out.println("You are short size");
			
		}else if(height>=5 && height<6) {
			System.out.println("You are medium size");
		}else if (height>=6) {
			System.out.println("You are tall");
		}
		
	}
}
