package com.class13;

public class regularExpression {

	public static void main(String [] args)  {
		
		/*
		 * print only text and not numbers
		 */
		
		
		String str="12345Hel12345lo12345";
		
		System.out.println(str.replaceAll("[0-9]", ""));
		
		System.out.println(str.replaceAll("[a-zA-Z]", ""));
		
		String str2="hsadjhasjdn1232@#@$How";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", "")); //using ^ states replace everything else but whats inside box
		
		
				
	}
}
