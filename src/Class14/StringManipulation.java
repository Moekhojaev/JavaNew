package Class14;

public class StringManipulation {

	public static void main(String[] args) {
		//replace function
		String str = "I am good tester";
		System.out.println(str.replace("o","r"));
        System.out.println(str.replace("good", "great"));
	//2.ReplaceAll([0-9], [a-z], [^A-Za-z])
        String str1= "12Hello 335135 World 465%%&@$&@&";
      String str2 = str1.replaceAll("[0-9]","");
	  String str3 = str1.replaceAll("[A-Za-z]", "");
      String str4= str1.replaceAll("[^A-Za-z]","");
	  System.out.println(str2);
      System.out.println(str3);
      System.out.println(str4.length());
    
	
	}

}
