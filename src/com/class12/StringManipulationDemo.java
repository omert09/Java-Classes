package com.class12;

public class StringManipulationDemo {

	public static void main (String [] args) {
		
		//1st way
		String name = "John"; 
		
		System.out.println(name);
		System.out.println(name.length());
		System.out.println("The length of name is= "+name.length());
		
		
		//or
		
		//2nd way : creating string with new key word
		String name1=new String("John"); 
				
				
		////
		
		int name1John=name1.length();
		System.out.println("The length of name1John is= "+name1John);
		System.out.println(name1.length());
		
		String str1="Hello WORLD";
		System.out.println("before:: "+str1 );
		str1 = str1.toLowerCase();
		System.out.println("After:: "+str1);
		str1=str1.toUpperCase();
		System.out.println("After upper:: "+str1);
		System.out.println("=================");
		
		//.equals
		String str2="HeLlo WorlD";
		boolean isEqual=str1.contentEquals(str2);
		System.out.println(isEqual);
		
		//.equalsIgnoreCase();
		System.out.println(str1.equalsIgnoreCase(str2));
		
		String str3="Mohammad";
		str3=str3.toUpperCase();
		System.out.println(str3);
	}
}
