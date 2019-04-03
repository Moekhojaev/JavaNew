package com.studyonyourown;
import java.util.Scanner;
public class afaeea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int [] array= new int [5];
		  array[0]=10;
		  array[1]=20;
		  array[2]=10;
		  array[3]=20;
		  array[4]=20;
		  int a,c,d,e,f;
		  Scanner num= new Scanner(System.in);
		  System.out.println("Please input 1,2,3,4,5");
			a=num.nextInt();
			c=num.nextInt();
			d=num.nextInt();
			e=num.nextInt();
			f=num.nextInt();
			for (int b:array) {
				System.out.println(b);
		
				} */
			
			int[][] r = { { 2, 6, 9, 3, 7 }, { 1, 7, 9, 4, 8 }, { 0, 4, 6, 2, 5 }, { 0, 1, 2, 3 } };
			int avg=0;
			for (int a=0; a<r[1].length; a++) {
			avg+=r[1][a];
			}System.out.println(avg/r[1].length);
			
			
			
	}

}
