package com.class201;

public class AccessModifiers {
	protected String  reversedString (String name ) {
		String rvs= " ";
		for (int i=name.length()-1; i>=0; i--) {
			rvs+=name.charAt(i);
		}return rvs;
		
	}
	public static void main(String[] args) {
		
		AccessModifiers obj = new AccessModifiers();
		String result= obj.reversedString("MoeMoney");
System.out.println(result);
	
	}


}
