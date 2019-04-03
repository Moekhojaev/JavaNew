package Class16;


public class Comp {
	 boolean mouse, keyboard, screen;
	    int ram;
	    String os;
	
	public static void main(String[] args) {
		  
		Comp com1 = new Comp();
	        com1.mouse = true;
	        com1.keyboard = true;
	        com1.screen = true;
	        com1.ram = 8;
	        com1.os = "Windows";

	        Comp com2 = new Comp();
	        com2.mouse = false;
	        com2.keyboard = false;
	        com2.screen = true;
	        com2.ram = 6;
	        com2.os = "Mac Os";
		
		
	}	

}
