package com.class22;

public class ConstructorTypes {

	ConstructorTypes (){
		System.out.println(" Iam constructor with no parameters");
	}
	ConstructorTypes(String str){//str-is a local varibale to the constructor
		System.out.println("I am construcotr with parameters"+str);
	}
	ConstructorTypes(int a, String b){
		System.out.println("I am constructor with 2 parameters "+ a+b);
	}
	
	// If you dont create Any CONSTRUCTOR -- Complier will create default Constructor for u
	//IF YOU DO create Any Constructor --> Comiplier will NOT create any extra Constructor 
	public static void main(String[] args) {
	ConstructorTypes obj=new ConstructorTypes();
	ConstructorTypes obj1=new ConstructorTypes("String");
	ConstructorTypes obj2=new ConstructorTypes(3," Muhammad");
	}
}
