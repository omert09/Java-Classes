package com.class10;

public class ArrayTask222 {

	public static void main(String [] args) {
		
		// i want to print all values from an array when value is dog --> I love dogs
		
		String [] animals = {"Cat", "Dog", "Cow", "Snake", "Elephant"}; 
		
		for (int i=0; i<animals.length; i++) {
			if (animals[i].equals("Dog")) {
				System.out.println("I love dogs");
			}else {System.out.println(animals[i]);
		}
		
		
	}
}
} 