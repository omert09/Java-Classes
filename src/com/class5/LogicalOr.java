package com.class5;

public class LogicalOr {

	public static void main(String[] args) {
		
		/*7 days a weel
		 * if days 2 or 4 then sdlc class
		 * if day is 6 or 7 then java class
		 * if day 1 or 5 no class
		 * if day =3 review class
		 */
		
		int day=3;
		
		if (day==2 || day==4) {
			System.out.println("We have SDLC class");
		}else if (day==6 || day==7) {
			System.out.println("We have Java Class");
		}else if (day==1 || day==5) {
			System.out.println("We have no class");
			
		}else if (day==3){
			System.out.println("We have review class today");
		}
		
	}
}
