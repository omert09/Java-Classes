package com.class5;

import java.util.Scanner;

public class MoreLogicalExamples {
 public static void main(String[] args) {
	 
	 /* ask user to enter daily sales
	  * based on sales we want to give commisson
	  * if sales is <100 commmision is 10%
	  * if sales between 100-200 commission 20%
	  */
	 
	 Scanner inp=new Scanner(System.in);
	 double salesAmount;
	 double commission;
	 
	 System.out.println("Enter daily sales");
	 salesAmount=inp.nextDouble();
	 if (salesAmount<100) {
		commission=salesAmount*0.1;
		System.out.println("Your commission is "+commission);
	 }else if (salesAmount>=100 && salesAmount<=200) {
		 commission=salesAmount*.2;
		 System.out.println("Your commission is "+commission);
	 }
	 
	 
 }
}
