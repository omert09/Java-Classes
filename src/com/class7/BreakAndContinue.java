package com.class7;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		for (int i=1; i<=5; i++) {
			if(i==3 || i==4) {
				break;
			}
			System.out.println(i);
		}
		for (int i=1; i<=5; i++) {
			if(i==3 || i==4) {
				continue;
			}
			System.out.println(i);
		}
		
		// i want to print nu 1-20 but not 5,6,7
		
		for (int a=1; a<=20; a++) {
			if(a==5 || a==6 || a==7) {
				continue;
			}
			System.out.println(a);
		}
	}
}
