package com.javaPractice;

public class Repl {
	public  static String makeThreeSubstr(String word, int startIndex, int endIndex) {
	for (int i=startIndex; i<=endIndex; i++) {
		 word.substring( startIndex, endIndex);
	}return word.substring( startIndex, endIndex);
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(makeThreeSubstr("hello",0,2)); //should be hehehe
		System.out.println(makeThreeSubstr("shenanigans",3,7)); //should be naninaninani
}
}
