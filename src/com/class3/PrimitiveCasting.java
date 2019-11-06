package com.class3;

public class PrimitiveCasting {
	
	public static void main(String[] args) {
		
		double d=12;
		System.out.println(d);
		
		//what is casting? Casting is trying to change a type to another type. Changing or converting one type to another. 

		byte b=127;
		int i=b;
		int num=123;
		double d1=num;
		
		//the above examples re widening (automatic) method of casting.
		// putting smaller items into larges boxes is the example used for this casting
		System.out.println(d1);
		
		double d2=123.56;
		int num2=(int)d2;
		System.out.println(num2);
		
		//bigger boxes to smaller. has to be done manually so java does not give an error.
		
		int num3=256;
		byte b1=(byte)num3;
		System.out.println(b1);

		
		
	}

}
