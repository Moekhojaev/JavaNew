package com.class9;

public class RowsColumns2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (int c=1; c<5; c++) { //rows 
				
				
				for (int b=1; b<=c; b++) {
					System.out.print("*"); //columns
				}System.out.println();
	     }
	
		
		 for (int i=1; i<=4; i++) {
			 for (int y=1; y<=6; y++) {
				 if (i==1 || i==4 || y==1 || y==6) {
					 
					 System.out.print("*");
					 
				 }else {
					 
					 System.out.print(" ");
				 }
			 }System.out.println();
			 
		 }
		 	     }
		 
			
		}
	
