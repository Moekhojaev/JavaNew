package Class14;

public class StringSplit {

	public static void main(String[] args) {
		//Splits the array 
		
		String str= "Welcome Syntax Students";
	   String [] array= str.split(" ");
	   System.out.println(array.length);
	for (String a:array) {
		System.out.println(a);
	}System.out.println("--------------------------------------");
	for (int i=0 ; i<array.length; i++) {
	System.out.println(array[i]);
	}
	}

}
