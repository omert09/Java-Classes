package com.class9;

public class TaskLoopss {

	public static void main(String [] args) {
		
		for (int i=5; i>=1; i--) {
			for (int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		for (int i=1; i<=9; i++) {
			if (i<=5) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
//			} else  {
//			 for (int j=0; j<=(9-i); j++) {
//				 System.out.print('*');
//			 }
//			System.out.println();
//	}
		
}}}}
