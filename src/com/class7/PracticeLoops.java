package com.class7;

import java.util.Scanner;

public class PracticeLoops {

	public static void main(String[] args) {
		
		
		Scanner inp=new Scanner(System.in);
		boolean raining=true;
		
		do {
			System.out.println("Is it raining?");
			raining=inp.nextBoolean();
		}while (raining); 
			System.out.println("Take an umbrella");
		
			
		
		
	}
}
