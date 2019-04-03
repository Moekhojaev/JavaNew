package com.class11;

public class MultiDimensionalArrays {
	public static void main(String[] args) {
		//creating 2D array
		
		int [][] d=new int[4][4]; //4*4=16
		
		
		//row1
		d[0][0]=12;
		d[0][1]=13;
		d[0][2]=14;
		d[0][3]=15;
		//row2
		d[1][0]=1;
		d[1][1]=20;
		d[1][2]=141;
		d[1][3]=140;
         //row3
		d[2][0]=121;
		d[2][1]=131;
		d[2][2]=142;
		d[2][3]=153;
        //row4
		d[2][0]=129;
		d[2][1]=1445;
		d[2][2]=1453523;
		d[2][3]=153352626;
			
		
			System.out.println(d[0][1]);
			
//////////////////////////////////////////////////////////////////////////
		int [][] c= {    // integers 
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{12,13,14,15}
								};
				
		System.out.println(c[2][3]);
		
		String[][] group= {   //names with string 2D ARRAY
				{ "andre", "aleksei", "alex"}, 
				{"amina", "munisa", "kamran"}
				
		};
		System.out.println(group[0][1]);
		System.out.println(group[1][1]);
		
	}
	

}
