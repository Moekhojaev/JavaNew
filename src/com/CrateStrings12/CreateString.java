package com.CrateStrings12;

public class CreateString {

	public static void main (String [] args) {
		
		int [][] arr = {
				{1,2,3}, 
				 {10,20,30},
				{100,200,300}
		};
	
	for (int i=0; i<arr.length; i++) {
		for (int j=0; j<arr[i].length; j++) {
			System.out.print(arr[i][j]+" ");
			
			
			
		}System.out.println();
		
	}	System.out.println("----------------Enhanced Loop---------------");
	for (int[] singleArray:arr) {
		
		for(int numbers: singleArray) {
			System.out.print(numbers+ " ");
			
		}System.out.println();
	}
	System.out.println("-------------------");
	
	for (int rows=0; rows<arr.length; rows++) {
		for (int cols=0; cols<arr[rows].length; cols++) {
			System.out.print(arr[rows][cols]+" ");
		}System.out.println();
	}System.out.println("----------------------------");
		for (int [] SinArr:arr) {
			for (int nums:SinArr) {
				System.out.print(nums+" ");
			}System.out.println();
		}
		int [] [] array = {
				{1,2,3,4,5},
				{10,20,40,50},
				{100,200,300,400,500,600}
		};
		for (int a= 0; a<array.length; a++) {
for (int b=0; b<array[a].length; b++) {
System.out.print(array[a][b]+ " ");
		}System.out.println();
		
	}
		for (int [] q:array) {
			for (int c:q) {
				System.out.print(c+ " ");
			}System.out.println();
		}
	}
}
