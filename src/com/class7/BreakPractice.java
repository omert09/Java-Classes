package com.class7;

import java.util.Scanner;

public class BreakPractice {

	public static void main(String[] args) {
		
		for (int i=1; i<=50; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("############################");
		
		//task 2
		Scanner inp=new Scanner(System.in);
		String credit; 
		
		for (int a=1; a<=10; a++) {
		System.out.println("Would you apply for a credit card");
		credit = inp.nextLine();
			if (credit.equals("yes")) {
				break;
			}
			System.out.println();
		}
	}
}
