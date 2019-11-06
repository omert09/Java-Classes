package com.class2;

public class ArithmeticOperations {

	public static void main(String[] args) {
		
		/*
		 * declare 2 variables and initialize them
		 * perform addition, substraction, multiplication and division
		 */
		
		int num1, num2;
		
		num1=20;
		num2=10;
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		
		int sum=num1+num2;
		int sub=num1-num2;
		int multi=num1*num2;
		
		System.out.println(multi-sub+sum);
		
		
	}
}
