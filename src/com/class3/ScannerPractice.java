package com.class3;

import java.util.Scanner;

public class ScannerPractice {
	public static void main(String[] args) {

		Scanner mahmut=new Scanner(System.in);
		System.out.println("Please enter first number");
		int num1=mahmut.nextInt();
		
		System.out.println("Please enter second number");
		int num2=mahmut.nextInt();
		
		if (num1>num2) {
			System.out.println(num1+ " is larger than " + num2);
			
		}else if (num1==num2) {
			System.out.println(num1+" is equal to "+num2);
		}else {
			System.out.println(num1+" is smaller than "+num2);
		}
				
		
	}
}
