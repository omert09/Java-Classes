package com.class5;

import java.util.Scanner;

public class ScannerReview {

	public static void main(String[] args) {

		
		Scanner inp=new Scanner(System.in);
		
		System.out.println("Do you have a credit card true or false?");
		String creditCard=inp.nextLine();
		
		if (creditCard.equals("Yes")) {
			System.out.println("What is the balance on your card");
			int balance=inp.nextInt();
			if (balance>=1000) {
				System.out.println("Please pay your balance!");
			}
		}else {
			System.out.println("Would you like to apply?");
		}
		
		
	}
}
