package com.Class12;
import java.io.*;
public class StringManipulations {
public static void main(String[] args) {
	
	String  s1=new String("Hello World"); // .LENGTH TO FIND THE LENGTH IN THE STRING 
	String s2=new String("Tutorial");
	System.out.print("String Length:");
	System.out.println(s1.length());
	System.out.print("String 2 Length:");
	System.out.println(s2.length());
	
	/*
	 * 
	 */
	String str= new String("  Whats Up Man");
	System.out.print("Return Value: ");
	System.out.println(str.toLowerCase()); // String.toLowerCase to print in Lower Case 
	System.out.println(str.trim()); // String.trim to trim any extra space
    /*
     * 
     */
	String str1=new String("heyy everyone");
	System.out.print("Return Value: ");
    System.out.println(str1.toUpperCase().concat(str)); // String.toUpperCase to print with Upper Case 
	System.out.println(str1.charAt(1)); //  String.charAt(index) to write any particilar letter in the String 
   /*
    * 
    * 
    */
	String Str2="This is not immutable"; // Boolean equal or not 
	String Str3=Str2;
	String Str4="This is not immutable";
	boolean retVal;
	retVal=Str2.equals(Str3);
	System.out.println("Value ="+retVal);
	retVal=Str2.equals(Str4);
	System.out.println("Value ="+retVal);
    retVal=Str3.equals(Str4);
    System.out.println("Value ="+ retVal);
    /*
     * 
     */
    String inpt="Good morning";   // Look to see if String contains certain  word
    boolean contains=inpt.contains("morning");
    System.out.println(contains);
    /*
     * startsWith(String prefix)
     */
    String wrs="Welcome to the World";
    System.out.print("Return Value: ");
    System.out.println(wrs.startsWith("Welcome"));
    System.out.print("Return Value: ");
    System.out.println(wrs.startsWith("World"));
    /*
     * startsWith(String prefix)
     */
    
    String ops="This is not immutable";
    boolean retur;
    retur=ops.endsWith("immutable");
    System.out.println("Value:"+ retur);
    retur=ops.endsWith("imuu");
    System.out.println("Value:"+ retur);
    /*
     * boolean isEmpty()
     */
    String qwe="";
    boolean b=qwe.isEmpty();
    System.out.println(b);
    /*
     * int indexOf(int ch)
     */
    
}

}
