package com.class11;

public class Recap {

	public static void main(String[] args) {
		// let's create an array of names that will hold 5 elements and retrieve all values from it
		
		// create an array using keyword
		String [] names= new String [5];
		names[0]="Asel";
		names[1]="Moe";
		names[2]="Arif";
		names[3]="MK";
		names[4]="Weqas";
		
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		
		}	
			//2 create an array using literal 
			
			String[] studentNames= {"Ali", "Alisher", "Anna", "Farrah", "Alaiksei"};
			
			
	
		for (int i = 0; i<=studentNames.length-1; i++ ) {
			
			System.out.println(studentNames[i]);
		}
		
		//retrieve values using; advanced for loop, for each loop, enhanced loop
		
		for (String student:studentNames) {
			
			System.out.println(student);
		}
	}
}
