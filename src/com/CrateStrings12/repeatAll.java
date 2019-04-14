package com.CrateStrings12;

public class repeatAll {
public static void main(String[] args) {
	
	int [][] a= {
			
			{1,2,3,4,5,6},
			{12,12,1,34,141},
			{31232,1421412,142144,4412}
			
	};
	for (int b=0; b<a.length; b++) {
		for (int c=0; c<a[b].length; c++) {
			System.out.print(a[b][c]+" ");
		}System.out.println();
	}
	
	for (int[] rows :a) {
		for (int nums:rows) {
			System.out.print(nums);
		}System.out.println();
	}
	/*
	 * 
	 */
	
}
}
