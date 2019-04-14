package com.Class151;

public class Fabbinaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =1;
		int b=0;
		int c=0;
		for (int i=2; i<10; i++) {
			c=a+b;
			a=b;
			b=c; 
			System.out.println(c);
		}
	}

}
