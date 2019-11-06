package com.class3;

public class TemperatureCheck {

	public static void main(String[] args) {
		
		double temperature=25;
		
	if(temperature<32) {
		System.out.println("Water will freeze with temperature less than "+temperature);
	}else { System.out.println("Water will NOT freeze with temperature above" +temperature );
		
		
	}
	
	double temperature1=30;
	double temperature2=20;
	if(temperature2<temperature1) { System.out.println("Water will freeze with temperature less than temperature 20");
	}else {System.out.println("Water will Not freeze with temperature less than temperature 20");
	}
	
	}
}
