package com.class22;

public class Task2 {

	String  StudentName;
	int grade,grade1,grade2;
	
      
Task2  (String name, int a, int b, int c) {
	 StudentName=name;
		grade=a;
		grade1=b;
		grade2=c;
	}
	public void avarageGrade() {
	  int avg = (grade+grade1+grade2)/3;
	  System.out.println(StudentName + " Avarage grade is "+avg );
	
	}
	

}