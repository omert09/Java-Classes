package com.class10;

public class ArrayTasks {

	public static void main(String[]args) {
		
		//create an array of chars and store grades into abcdef then print a grade b use 2 different ways of creating arrays
		
		//1st way
		char[] grades = {'A','B','C','D','E','F'};
		System.out.println(grades[1]);
		
		//2nd way
		char [] grades2 = new char[6];
		
				grades2 [0]= 'A';
				grades2 [1]= 'B';		
				grades2 [2]= 'C';		
				grades2 [3]= 'D';		
				grades2 [4]= 'E';
				grades2 [5]= 'F';
	
				System.out.println(grades2[1]);
				
		System.out.println("#############################################");		
				
		
		//task 2 : arrray of names and stare all names of your group then print your name from that array use 2 different ways
		
		//1st way
		String[] names1 = {"Omer","Mehmet","Ahmet","Fethullah","Seval","Fatma"};
		System.out.println(names1[0]);
		
		//2nd way
		String [] names = new String[6];
		
				names [0]= "Omer";
				names [1]= "Mehmet";		
				names [2]= "Ahmet";		
				names [3]= "Fethullah";		
				names [4]= "Seval";
				names [5]= "Fatma";
	
				System.out.println(names[0]);
				
		//task 3: create array of words java saturday day coding is and print statement "Saturday is Java coding day"
				
		String [] words = {"Java", "Saturday", "day", "coding", "is"};
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
		
}
}