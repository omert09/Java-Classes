package com.class7;

import java.util.Scanner;

public class LoopReview {

	public static void main(String[] args) {
		
		// you need to ask uer to pay for coffee
		//you need to keep asking user to pay for it until
		//entered price is equal to 5
		// after user paid then say enjoy your coffee
		
		
		Scanner inp=new Scanner(System.in);
		int price;
		
		do { 
			System.out.println("Can you please pay for your coffee?");
			price=inp.nextInt();
			
		} while (price!=5);
		
		System.out.println("Enjoy your coffee");
		
		int price1;
			System.out.println("Please pay for your coffe");
		price1=inp.nextInt();
				
				while(price1!=5) {
					System.out.println("Please pay for your coffee");
				}
		
		
		
		
		
		
	}
}
