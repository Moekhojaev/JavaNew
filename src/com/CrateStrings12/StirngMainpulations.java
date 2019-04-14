package com.CrateStrings12;

public class StirngMainpulations {

	public static void main(String[] args) {
		//LengthFunction- returns number of characters in the string
		String str="Suntax";
		System.out.println(str.length());
	//toUpperCase() && toLowerCase(); to upper case all your characters in the string 
		String str3 = "Hello";
			String a=str3.toUpperCase();
	   System.out.println(a);
		System.out.println(a.toLowerCase());
    // equals() - is a  boolean type, if strings are equal--> true, else-->false 
		String str4="Hello";
		String str5="hello";
		boolean equal= str4.equals(str5);
        System.out.println(equal);
        //.equalsIgnoreCase -> ignores if its a lower case or upper case
       String expectedBrowser = "Chrome";
       String actualBrowser= "chrome";
    boolean result = expectedBrowser.equalsIgnoreCase(actualBrowser);
	System.out.println(result);
     // 
	String str6= "MNOeagmagoe";
	System.out.println(str6.length());
	System.out.println(str6.toUpperCase());
	System.out.println(str6.toLowerCase());
	
	}

}
