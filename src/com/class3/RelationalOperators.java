package com.class3;

public class RelationalOperators {

	public static void main(String[] args) {
		
		int num1=20;
		int num2=19;
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		
		double d=1.99;
		double d1=2.99;
		
		boolean b=d>d1;
		System.out.println(b);
		
		
		boolean b1=d<d1;
		boolean b2=d==d1;
		boolean b3=d!=d1;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println("########################");
		
		int a=70;
		int bb=300;
		
		if(a>bb) {
		System.out.println("a is larger than bb");
		}
		else {
			System.out.println("a is smaller than bb");
		}
		
		int expectedHours=15;
		int actualHours=20;
		//if expected hours are more than actual then you will succeed
		//otherwise please study more
		
		if (actualHours>expectedHours) {
			System.out.println("You will succeed");
			
		}else { System.out.println("Please study more");
		}
		
		double teaPrice=4.99;
		double allowedPrice=3.99;
		
		if (teaPrice>=teaPrice) {
			System.out.println("I will buy tea");
			System.out.println("And I will enjoy my tea");
		}else { 
			System.out.println("I cannot afford, I need to study more");
			System.out.println("I will go back to study more");
		}
		
		
		
		
	}
	
}
