package com.class3;

public class NestedIfMore {
	public static void main(String[] args) {

		/*
		 * check age, if age is less than 16 -> you are too young to drive otherwise we
		 * will check if you are older than 18 -> you can get driver license if not you
		 * can get driver permit
		 */

		int age = 90;

		if (age < 16) {
			System.out.println("You are too young to drive");
		}else if (age>81) {
				System.out.println("You are dead");
			}
		else {
			System.out.println("You are eligible to drive");
			
			if (age>=18) {
				System.out.println("You can drive alone");
				
			}else {
				System.out.println("You need your parents to drive");
			}
		}

	}
}
