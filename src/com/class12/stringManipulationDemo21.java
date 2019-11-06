package com.class12;

public class stringManipulationDemo21 {

	public static void main(String [] args) {
		
		/* this method hecks whether a string is empty or not.
		 * this method retrusn true if the given string is empty else it returns false
		 */
		
		String str="";
		System.out.println("Is this string empty= "+str.isEmpty());
		String str2="Hello";
		System.out.println("Is this string empty= "+str2.isEmpty());
		
		if(!str.isEmpty()) {
			System.out.println("This is not empty");
		}else {
			System.out.println("This is empty String");
		}
		
		/* 
		 * this method appends one String to the end of another.
		 * the method returns a string with the value of
		 * string passed in to the method appended to the end of
		 * the string used to invoke this method
		 */
		
		String str3="Helloo";
		String str4= "World";
		String str5= "Players";
		
		System.out.println(str3+str4);
		System.out.println(str3.concat(" "+str4));
		System.out.println(str3.concat(str4).concat(str5));
		
		/* trim method removes space beginning or at end from String
		 *
		 */
		
		String str6= " How are you? ";
		System.out.println(str6);
		System.out.println(str6.trim());
	}
}
