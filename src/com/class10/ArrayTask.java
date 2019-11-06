package com.class10;

public class ArrayTask {

	public static void main(String [] args) {
		
		// create an array to store 5 double values, print all elemnts in one line
		
		double [] arrayDouble = {1.0,2.0,3.0,4.0,5.0};
//		
//		System.out.print(arrayDouble[0]+" "+ arrayDouble[1]);
//		
		//or use loop
	
		int sizeArray = arrayDouble.length; 
		
		for (int i =0; i<sizeArray; i++ ) {
		System.out.print(arrayDouble[i]+" ");
		
		}
	}
}
