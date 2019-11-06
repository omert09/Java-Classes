package com.class3;

import java.util.Scanner;

public class ScannerTask123 {
	public static void main(String[] args) {
		//Task1
		Scanner mahmut=new Scanner(System.in);
		
//		System.out.println("What is the loan amount you are requesting Mahmut?");
//		int num1=mahmut.nextInt();
//		
//		if (num1<200000) {
//			System.out.println("That sounds great we can lend you the money!");
//			
//		}else {
//			System.out.println("I am sorry we are not able to give you a loan at this time");
//		}
//		System.out.println("############################################3");
//		
//		//Task2
//		Scanner jenny=new Scanner(System.in);
//		
//		System.out.println("May I ask you your age so we can see if you are eligible for a DL");
//		int num2=jenny.nextInt();
//		
//		if (num2>=18) {
//			System.out.println("Good news! We can issue you a new DL! ");
//		} else {
//			System.out.println("At this time we can offer you a permit");
//		}
//			System.out.println("####################################");
//		//Task3
//		
		Scanner OMG=new Scanner(System.in);
		
		System.out.println("Which city do you live in?");
		String city=OMG.nextLine();
		
		System.out.println("What is the temperature there currently");
		int temp=OMG.nextInt();
		
		int temp2=(temp-32)*5/9;
		
		System.out.println("The temperature in "+city+" is "+temp2);
		}
	
}
