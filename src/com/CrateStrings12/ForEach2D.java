package com.CrateStrings12;

public class ForEach2D {

	public static void main(String[] args) {
		/* 2D ARRAYS
		 * 
		 */

	String [][] Grocery= {{ "Apple", "Peach", "Orange"},
			{"Potato", "Cucumber", "Olive"},
			{"Cheese","Yogurt","SourCream"}
	};
	for (int i=0;i<Grocery.length; i++ ) {
		for (int j=0; j<Grocery[i].length; j++) {
			System.out.print(Grocery[i][j]+" ");
		}System.out.println();
	}System.out.println("-------Enhanced Loops----------------");
		
	for (String[] a:Grocery) {
		for (String b:a) {
			System.out.print(b+" ");
		}System.out.println();
	}
	}

}
