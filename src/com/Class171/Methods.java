package com.Class171;

public class Methods {
	// methods and variables are member of the class 
	String str;
    int num;
	public static void main (String [] args) { //Method Signature
		Methods obj= new Methods(); //Method Body. Anything inside the main method
	obj. hello(); // we calling a method hello 
		//JVM always looks for main method for it execute the code.
String str = obj.whatDay();
System.out.println("Today is " + str);
	}
	
	void hello(){
		System.out.println("Hello");
		System.out.println("World");
	
	}
	String whatDay() {
		return "Thursday";
	}
}

