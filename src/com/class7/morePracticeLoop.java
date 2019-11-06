package com.class7;

public class morePracticeLoop {

	public static void main(String [] args) {
		
		/* print numbers from 1-100 in 1 line with space
		 * print numbers from 100 to 1
		 * print even numbers from 20 to 1 
		 * print odd numbers between 20 and 50 
		 */
	
	for (int i=1; i<=100; i++) {
		System.out.print(i+" ");
	}
	System.out.print("\n");
	for (int a=100; a>=1; a--) {
		System.out.print(a+" ");
	}
	System.out.print("\n");
	for (int z=20; z>=1; z--) {
		System.out.print(z+" ");
	}
	
	System.out.print("\n");
	for (int b=20; b<=50; b++) {
		if (b%2==0)
		System.out.print(b+" ");
	}
	
	}
	
}
