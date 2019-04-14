package com.Class171;

public class EvenODD {
 void EvenoD(int a) {
	
	 if (a %2==0) {
System.out.println(a + " is even ");
		 
	 }else {
		 System.out.println(a+" is odd");
	 }
 }
	
	public static void main(String[] args) {
		EvenODD obj = new EvenODD();
		obj.EvenoD(20);
	}
}
