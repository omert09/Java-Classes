package com.class6;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
		
		Scanner inp=new Scanner(System.in);
		
		System.out.println("Please enter your gender: F or M");
		char gender=inp.next().charAt(0);
		String userGender;
		
		switch(gender) {
		
		case 'M':
			userGender= "Male";
		break;
		case 'F': 
			userGender= "Female";
		break; 
		default: userGender="Unknown";
		}
		System.out.println("Your gender is "+userGender);
	}
}
