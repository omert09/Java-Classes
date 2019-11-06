package com.class5;

public class PracticeLogicalOperatorsBeforeClass {

	public static void main(String[] args) {
		
		
		boolean human=true;
		
		if (!human) {
			System.out.println("I am a human");
		}else {
			System.out.println("I am not a human");
		}
		//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		int num=12;
		
		if( num % 2==0 && num % 3 ==0) {
			System.out.println(num+" is completely divisible by both 2 and 3");
		}else {
			System.out.println(num+" is not completely divisible by both 2 and 3");
		}
		//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		int num1=10;
		if (num % 2==0 || num % 3==0) {
			System.out.println(num1+ " is completely divisible by 2 or 3");
		}else System.out.println(num1+ " is not completely divisible by both 2 or 3");
		//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$44
		
		if (num1 % 2==0 ^ num1 % 3==0) {
			System.out.println(num1+ " is completely divisible by 2 or 3 but not both");
		}
		
		
		
	}
	
	
	
	
	
	
}
