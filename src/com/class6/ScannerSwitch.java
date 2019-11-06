package com.class6;

import java.util.Scanner;

public class ScannerSwitch {
	public static void main(String[] args) {

		
	/* askuser  where they are from
	 * based on the country we will specify favorite food	
	 */
		
		
		String country, foodName;
		Scanner inp=new Scanner(System.in);
		
		System.out.println("Please enter your country");
		country=inp.nextLine();
		
		switch(country) {
		
		case "Turkey":
			foodName="kebab";
			break;
			
		case "Ethiopia":
			foodName="Tibs";
			break;
		
		case "Morocco":
			foodName="Tajin";
			break;
			
		case "Kazakhstan":
			foodName="Kumis";
			break;
			
		case "Pakistan":
			foodName="Beryani";
			break;
			default: foodName="Unknown";
		}
		
		System.out.println("You are from " +country+ " and your favorite food is " +foodName);
	}
}
