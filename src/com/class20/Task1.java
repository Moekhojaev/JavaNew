package com.class20;

public class Task1 {

	public static void main(String[] args) {
		Task1 obj = new Task1();
System.out.println(obj.getGrade(90));
	}
	String getGrade(int Score) {
		
		if (Score>90){
			return "A";
		}else if (Score>80) {
			return "B";

		}else if (Score>70) {
			return "C";

		}else {
			return "F";

		}
		
	}

	
}
