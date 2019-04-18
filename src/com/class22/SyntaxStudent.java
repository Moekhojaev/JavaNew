package com.class22;

public class SyntaxStudent {

/* schoolName 
 * batchNumber
 * studentName 
 * StudentLastName
 * 
 * method to printStudentDetails	
 */
	public static String SchoolName= "Syntax";
	public static int batchNumber = 4;
	public String StudentName; 
	public String StudentLastName;
	
	public SyntaxStudent (String name, String LastName ) {
		StudentName=name;
		StudentLastName= LastName;
		
	}
	public void getStudentDetails() {
	String details= "I am a student at "+SchoolName+" from bathch "+ batchNumber + 
	" and my name is " + StudentName+ " " + StudentLastName;
	System.out.println(details);
	 }
	

}

