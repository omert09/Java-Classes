package com.class9;

import java.util.Scanner;

public class Task2 {

	/* write a guessing game where the user has to guess a secret number betwee 1-20. after every imput scanner tells them whether their number
	 * was too large or too small. the program will keep asking until they find the right number. when the orrect number is displayed it should say 
	 * congratulatsion! 
	 */
	
	public static void main(String[] args) {
		
		Scanner scan;
		int secretNumber, guessNumber;
		
		scan=new Scanner(System.in);
				secretNumber=12; 
		do { System.out.println("Please guess my number between 1-20");
		guessNumber=scan.nextInt();
			
		if (guessNumber<secretNumber) {
			System.out.println("Your number is too small");
		}else if (guessNumber>secretNumber) {
			System.out.println("Your number is too large");
		}else {
			System.out.println("Congratulations you got it!");
		}
		
		}while (guessNumber!=secretNumber);
	}
	
}
