package com.class10;

public class countryArraytask {

	public static void main(String [] args) {
		
		String [] country = {"Turkey", "Germany", "USA", "Japan"};
		String capital; 
		
		for (int i=0; i<4; i++) {
			if (country[i].equals("Turkey")){
				System.out.println("Ankara");
			}else if(country[i].equals("Germany")){
				System.out.println("Frankfurt");
			}else if(country[i].equals("USA")){
					System.out.println("DC");
			}else if(country[i].equals("Japan")){
				System.out.println("Tokyo");
			}else {
				System.out.println(country[i]);
			}
		}
		
		
		
		
	}
}
