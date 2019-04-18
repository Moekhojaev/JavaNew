package com.class22;

public class CallingStaticVsNonStaticClass {

	public static void main(String[] args) {
		StaticVsNonStatic  obj= new StaticVsNonStatic ();
	//----------------ACCESSING NON STATIC METHOD ----
		System.out.println(obj.name);
	obj.getInfo();
	////----------------ACCESSING NON STATIC METHOD ---------
	//it can be an OBJ.StaticVarible() but prefered way isClassName + StaticVariable
	System.out.println(StaticVsNonStatic.lastName);
	StaticVsNonStatic.getInfo1();
	
	}

}
