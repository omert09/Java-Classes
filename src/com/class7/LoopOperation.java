package com.class7;

public class LoopOperation {

	public static void main(String[] args) {
		int sumOdd=0;
		int sumEven=0;
		for (int i=0; i<=20; i++) {
			if(i%2!=0)
			sumOdd+=i;
		}
		
		System.out.println(sumOdd);
		
		
		for (int i=0; i<=20; i++) {
			if(i%2==0)
				sumEven+=i;
		}
		
		System.out.println(sumEven);
	} 
	
	
	
}
