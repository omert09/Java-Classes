package com.class6;

public class Practice {

	public static void main(String[] args) {

		/*
		 * declare the time (1-24) based on the timing identify whether it morning
		 * afternoon evening or 1-11 morning 12-15 noon 16-20 evening 20> night
		 * 
		 */

		int time = 34;
		String timeOfDay=null;

		if (time >= 1 && time <= 11) {
			timeOfDay = "Morning";
		} else if (time >= 12 && time <= 15) {
			timeOfDay = "Noon";
		} else if (time >= 16 && time <= 20) {
			timeOfDay = "Evening";
		} else if (time > 20 && time<=24) {
			timeOfDay = "Night";
		} else {
			System.out.println("Invalid");
		}
		
			System.out.println("Time of day "+timeOfDay);
	
	
}
}