package Class14;

public class StringManipulation1 {

	public static void main(String[] args) {
		//toCharArray()- converts to array of character
		
		String str= "Saturday";
		char [] array = str.toCharArray();
	for (int i=0; i<array.length; i++) {
		System.out.print(array[i]+ " ");
	} System.out.println();
	System.out.println("Printing in reverse");
	for (int i=array.length-1; i>=0; i--) {
		System.out.print(array[i]);
	}
	
	}
	
	

}
