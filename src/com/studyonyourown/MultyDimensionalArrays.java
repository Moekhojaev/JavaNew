package com.studyonyourown;

public class MultyDimensionalArrays {

	public static void main(String[] args) {
		int[][] array = { { 10, 20, 30, 40 }, { 12, 40, 50, 60 }

		};
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + " ");
			}
			System.out.println();
		}
			/*
			 * Create an array of cars : american,german, korean, italian. 
			 * Thenretrieve all
			 * values from that array
			 */
		
		String[][] cars= {
				{"Honda", "Masserati","lambo", "Buggati"},
				{"Koreak", "Germany", "Italy", "France"}
		};
		for (int rows=0; rows<cars.length; rows++ ) {
			for (int cols=0; cols<cars[rows].length; cols++) {
				System.out.print(cars[rows][cols]+" ");
			}System.out.println();
		}
		
		double[][] a = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}};
				for (int row=0; row<a.length; row++){
				 for (int col=0; col<a[row].length; col++){
				   System.out.print(a[row][col]*2 +" ");
				 }System.out.println();
				}
				
	}
}
