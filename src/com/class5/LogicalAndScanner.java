package com.class5;

import java.util.Scanner;

public class LogicalAndScanner {

	public static void main(String [] args) {
		
		/* ask user to enter age
		 * if age is from 1-3 you are a baby
		 * if age is from 3-5 you are toddler
		 * if age from 5-12 you are a kid 
		 * if age from 12-19 you are a teenager
		 * if age 20> you are an adult 
		 */
		
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age=inp.nextInt();
		
		if(age>=1 && age<3) {
			System.out.println("You are a baby");
		}else if (age>=3 && age<5) {
			System.out.println("You are a toddler");
		}else if (age>=5 && age<12) {
			System.out.println("You are a kid");
		}else if (age>=12 && age<=19) {
			System.out.println("You are a teenager");
		}else if (age>=20 ) {
			System.out.println("You are an adult");
		}
		
		
	}
}
