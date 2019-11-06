package com.class3;

public class NestedClassPractice1 {

	public static void main(String[] args) {
		
		boolean quiz=true;
		int score=99;
		
		if (quiz) { 
			System.out.println("Good job!");
			
			if (score>=90) {
				System.out.println("You got an A");
			}else if (score>=80) {
				System.out.println("You got a B");
			}
		} else {
			System.out.println("That is not good");
		}
		
	}
}
