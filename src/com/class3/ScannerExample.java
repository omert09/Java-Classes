package com.class3;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		
		//Scanner is a class in Java that can take a user input. Scanner will help us make a program more interactive 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter any number");
		//system.in means keyboard input, what the user types will come here
		// nextInt(); For receiving numbers in user imput
		//nextLine(); for receiving strings in user input
		//nextDouble(); for receiving double in user input
		
		//int number=scan.nextInt();
		//System.out.println("Entered number is " +number);
		
		//double number2=scan.nextDouble();
		//System.out.println("Entered number is "+ number);
		//System.out.println("##################################");
		int number=scan.nextInt();
		System.out.println("Entered number is " +number);
		
		double number2=scan.nextDouble();
		System.out.println("Entered number is "+ number2);
		String name=scan.nextLine();
		System.out.println(name);
		
		Scanner input=new Scanner(System.in);
		
		
	
		
	}
}
