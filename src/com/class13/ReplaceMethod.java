package com.class13;

public class ReplaceMethod {

	public static void main(String [] args) {
		
		/*.replace()
		 * this method returns a new string resulting from replacing all occurances of oldChar
		 * in this string with newChar
		 */
		
		String str="Hello Dear, how are you Dear, can you call me at 469-248-2241?";
		
		System.out.println(str.replace("Dear", "Honey"));
		System.out.println("============================");
		
		System.out.println(str.replace(' ', '+')); 
		System.out.println("============================");
		
		System.out.println(str.replaceFirst("Dear", "Love"));
		System.out.println("============================");
		
		
		
		
		
		
	}
}
