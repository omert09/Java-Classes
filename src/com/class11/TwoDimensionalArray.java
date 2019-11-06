package com.class11;

public class TwoDimensionalArray {

	public static void main(String [] args) {
		
		int [] [] array = new int [3] [4] ; 
		// first bracket is row, second one is column
		
		//1st row 
		array[0][0] = 44;
		array [0][1] =80;
		array [0][2] = 33; 
		array [0][3] = 20; 
		
		//2nd row
		array[1][0] = 10;
		array [1][1] =5;
		array [1][2] = 7; 
		array [1][3] = 8;
		
		array[2][0] = 10;
		array [2][1] =9;
		array [2][2] = 70; 
		array [2][3] = 6;
		System.out.println(array[1][3]);
		
		// task create 2d array of String with 2 and 3 columns. and print value in second row and 3rd column
		
		String [] [] array2 = new String [2] [3];
		
		array2[0][0] = "Bu";
		array2 [0][1] ="Adam";
		array2 [0][2] = "Tam";
		
		array2[1][0] = "Bir";
		array2 [1][1] ="Geri";
		array2 [1][2] = "Zekali"; 
	
		System.out.println(array2[1][1]);
		
		int [] [] numbers = {
				{1,2,3,4,7},
				{2,3,4,5,6}
		};
		
		System.out.println(numbers[1][2]);
		
		System.out.println("The value in index 1 and 4 is "+ numbers [1][4]);
		
		//to identif the number of rows
		System.out.println("The numbers of Rows are:= "+numbers.length);
		
		//to identify columns/elements in a row
		System.out.println("The numbers of Columns in a row are:= "+numbers[0].length);
		
		
	}
}
