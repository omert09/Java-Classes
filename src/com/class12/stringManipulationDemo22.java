package com.class12;

public class stringManipulationDemo22 {

	public static void main(String[] args) {
		
		/*
		 * .contains();
		 */
		
//		String sentence="It was raining";
//		String word = "Was";
//		System.out.println(sentence.equalsIgnoreCase(word));
//		
//		System.out.println("=============================");
//		
		//Create two strings and initialize them with some value. 
		//implement the following methods on those strings
		
//		sen.length();
//		sen.equals():
//		sen.contains(s);
//		sen.toUpperCase();
//		sen.toLowerCase();
//		sen.equalsIgnoreCase(anotherString);
		
		String cumle = "I am tired";
		String cumle2 = "I AM TIRED";
		
		System.out.println(cumle.length());
		System.err .println(cumle.equals(cumle2));
		System.out.println(cumle.toUpperCase());
		System.out.println(cumle2.toLowerCase());
		System.out.println(cumle2.equalsIgnoreCase(cumle));
		System.out.println(cumle2.toLowerCase().contains(cumle));
}
} 