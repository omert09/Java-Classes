package com.class13;

public class Recap3 {

	public static void main(String [] args) {
		
		String str1="johnny"; 
		
		System.out.println(str1.contains("ll"));
		
		String str6= "    It is sunny   ";
		System.out.println("Before triming:"+str6);
		System.out.println("After trimming:"+str6.trim());
		
		System.out.println("+++++++++++++++++INdex of and CharA============");
		String str7="Tomorrow we will be done with String Manipulation";
		
		System.out.println(str7.indexOf('e'));
		System.out.println(str7.indexOf('e',11));
		
		System.out.println(str7.charAt(10));
	}
}
