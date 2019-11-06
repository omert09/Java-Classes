package com.class11;

public class twoArrayTaskAgain {

	public static void main(String [] args) {
		
		//Task 1
		// create a 2d array or integer type where you will store
		//odd and even numbers in 3 rows and 4 columns. Develop a program which will identify / print the even numbers only. 
		
		
		int [][] numbers = {
				{ 1,2,3,4 },
				{ 5,6,7,8 },
				{ 9,10,11,12 }
				
		};
			
			for (int arrays[] : numbers) {
				for (int getEvenNumbers : arrays) {
					if (getEvenNumbers%2==0)
					System.out.print(getEvenNumbers+" ");
				}
				System.out.println();
			}
				


	/*
	 * Task 2: create a 2d array or integer type and store numbers in 3 rows and 3
	 * columns. Print sum of all numbers
	 */

int [][] numbers2 = {
		{ 1,2,3 },
		{ 5,6,7 },
		{ 9,10,11 }
};

int sum =0; 
for (int arrays[] : numbers2) {
	for (int getNumbersSum : arrays) {
		sum +=getNumbersSum;
	}
	
} System.out.print(sum);

	}






		
}
