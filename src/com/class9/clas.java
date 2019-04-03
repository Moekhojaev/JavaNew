package com.class9;

public class clas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int a=0; a<24; a++) {
			for (int b=0; b<60; b++) {
				if (b<10) {
					System.out.println(a+":0"+b);
					
				}else {
					
				System.out.println(a+":"+b);
				}if (a==8 && b==30) {
				
				System.out.println("We need a break");

				}	else if (a==12 && b==30) {
					
					System.out.println("We need a break");
				}else if (a==23 && b==59) {
					
					System.out.println("We need a break");

				}
			
		} 
		}
}

}