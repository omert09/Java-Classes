package com.class11;

public class TwoDArraysDemo2 {

	public static void main(String [] args) {
		
		
		String [][] names= {
				{"Khan","Yusuf","Alex","Zeyneb","jjj"},
				{"Faruk","Jose","Bernardo","Rosy","asad","asdasdd","asdasd"},
				{"Kiro","Keko","Hirto","pejmurdo"}
			
		};	
				
		int lengthOfRows=names.length; 
		System.out.println(lengthOfRows);
		
		int lengthOfElements=names[1].length;
		System.out.println(lengthOfElements);
		
		for (String getArrays[]: names) {
			for (String getName: getArrays) {
				System.out.print(getName +" ");
			}
			System.out.println();
		}
	}
}
