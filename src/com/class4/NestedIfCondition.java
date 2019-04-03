package com.class4;

public class NestedIfCondition {

public static void main(String[] args) {
	 double gpa = 3.0;
	 double expectedGpa=3.7;
	 boolean hasDiploma= (gpa > expectedGpa);
	 
	 if (hasDiploma) {
		 
		 System.out.println("Congratilations");
		 if (gpa>expectedGpa) {
			 
			 System.out.println("You are hired");
		 }
		 
	 }else {
	
		 System.out.println("You need diploma to if you want the Job");
	 }
	
	}

}
// Done