package com.class9;

public class RowsColumn1 {
	public static void main(String args[]) {
		for (int i= 1; i<5; i++) {
			
			for (int y=1; y<6; y++) {
				
				
				System.out.print("*");
			}System.out.println();
		}
		
		for (int c=1; c<5; c++) { //rows 
			
			
			for (int b=5; b>=1; b--) {
				System.out.print(b); //columns
			}
			System.out.println();
		}
		
     for (int c=5; c>=1; c--) { //rows 
			
			
			for (int b=1; b<5; b++) {
			
				System.out.print(c); //columns
			}
			System.out.println();
		}
     for (int c=1; c<5; c++) { //rows 
			
			
			for (int b=1; b<=4; b++) {
				System.out.println("*"); //columns
			}System.out.println();
     }
		
	}

}
