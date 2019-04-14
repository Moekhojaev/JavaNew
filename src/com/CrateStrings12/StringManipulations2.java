package com.CrateStrings12;

public class StringManipulations2 {

	public static void main(String[] args) {
		//.contains checks if the String contains that case
		
		String str = "Good morning, students!";
		boolean str1= str.contains("morning");
        System.out.println(str1);
        
        
        String present = "welcome, Asel";
        String neededValue= "welcome,";
        boolean flag= present.toLowerCase().contains(neededValue); //left to right
        System.out.println(flag);
        System.out.println("-------StartsWith and EndsWith-----------");
      //startsWith && endsWith
        String str2="syntax";
       boolean s= str2.startsWith("s");
       System.out.println(s);
       System.out.println(str2.endsWith("x"));
       // isEmpty is a booleaan type, the string has to be equalt to 0 the value is true, else-> its false
       System.out.println("---------------isEmpty-----------------------");
       String str3="Hello";
       boolean isEmpty=str3.isEmpty();
       System.out.println(isEmpty);
	// .concat to concatinate strings 
       System.out.println("----------------Concatinate---------------------");
       String str4= "Hello "; 
       String str5= "World!";
	
       System.out.println(str4+str5);
       System.out.println(str4.concat(str5));
       
       //System.outprintln("________-----___________")
	String expected="You may qualify for a multi policy discount";
	String actual = "   You may qualify for a multi policy discount ";
	 actual= actual.trim();
    System.out.println(expected.equals(actual));
     
       
	}
	}

