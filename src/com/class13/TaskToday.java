package com.class13;

public class TaskToday {

	public static void main(String [] args) {
		
		//Task 1 : create a string and print it in reverse order (Sunday --> yadnuS).
		
		String day = "Sunday";
		
        for (int i =day.length() - 1; i >= 0; i--) {
            System.out.print(day.charAt(i));
        }
			System.out.println("+++++++++++++");
		
		//Task2 : Create a string and if the string is not empty perform the following: if the String has an odd number
		//of characters and has 3 or more characters, print the character in the middle of the String
		
		String str= "johanna"; 
		
		if(str.isEmpty()) {
			System.out.println("This is empty");
		}else {
			if (str.length()%2!=0 && str.length() >=3) {
			System.out.println(str.charAt(str.length()/2));
		
	}
}
}
}