package com.class11;

public class ExerciseWith2DArray {

	public static void main(String[] args) {
		//2D Array connect together 
		String[][] names= {
				{"Mr","Mrs","Ms","Miss"},
				{" Smith"," Jordan"," Jackson", " Obama"}
				
			};
		System.out.println(names[0][1]+names[1][0]);
		System.out.println(names[0][0]+names[1][3]);
		System.out.println(names[0][2]+names[1][2]);
		System.out.println(names[0][3]+names[1][1]);

	
	///////////////////////////////////////////////////////////////
		String[][] students= {
				
				{"Moe","Ali"},
				{" A"," B"}
				
		};
		System.out.println(students[0][0]+" has a grade of"+students[1][0]);
		System.out.println(students[0][1]+" has a grade of"+students[1][1]);
	}

}
