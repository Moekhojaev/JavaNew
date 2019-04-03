package com.class11;

public class RetrieveAllValues {

	public static void main(String[] args) {
	//	Ritreve All Values

		int [][] c= {    // integers 
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{12,13,14,15}
								};
	//	int rows=c.length;
	//	System.out.println(rows);
		
	//	int cols=c[0].length;
		 
		//System.out.println(cols);
		for (int row=0; row<c.length; row++) {
			
			for (int col=0; col<c[row].length; col++) {
				System.out.print(c[row][col]);
				
				
			}
			System.out.println();
		}
	}

}
