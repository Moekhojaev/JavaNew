package com.class3;

public class Modulus {

	public static void main(String[] args) {

		int a = 12;
		int b = 3;

		int div = a / b;

		System.out.println(div);// 4

		// modulus operator

		int mod = a % b;
		System.out.println(mod); // find the reminder

		int c = 225;
		int k = 10;

		System.out.println(c % k);

		int e = -5 + 4 * 6;
		System.out.println(e); // 19

		int y = 20 + -3 * 5 / 8; 
		System.out.println(y); //19

		int z = 5 + 15 / 3 * 2 - 8 % 3;
		System.out.println(z); //13

		int q=(22+9)%7;
		System.out.println(q); //3
			
	}

}
