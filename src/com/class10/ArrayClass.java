package com.class10;

public class ArrayClass {

	public static void main(String [] args) {
		
		int a;
		a=10;
		
		int a1=10;
		
		
		
	
		//1st way
		int[] b; //declare an array --> preferred way
		int c[]; 
		
		b=new int[4];
			
			
		//2 way
			int [] array = new int[4]; 
			array[0]=10;
			array[1]=20;
			array[2]=30;
			array[3]=40;
			
			System.out.println(array[2]);
			
			
			//lets create an array that will store classes that we have
			
			String[] classes= new String[4];
			classes [0]="Java";
			classes [1]="SDLC";
			classes [2]="Manual Testing";
			classes [3]="GIT";
			//today we have Java class. print that.
			
			System.out.println("Today we have "+classes[0]+" class");
			
			//how can change 1 to 100
			int[] num = new int[3];
			num[0]=1;
			num[1]=2;
			num[2]=3;
			
			num[0] = 100;
			System.out.println(num[0]); //how to find 100
			System.out.println(num[0]+num[2]); // how to find 103
			
			
			String [] names= new String[4];
			names [0] = "Diana";
			names [1] = "Seda";
			names [2] = "Jaime";
			names [3] = "Olga";
			
			System.out.println(names[3]);


		//
			int [] numbers = new int [4];
			numbers [1]=100;
			numbers [2]=200;
			
			System.out.println(numbers[0]);
	}
}
