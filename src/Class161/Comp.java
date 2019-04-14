package Class161;

public class Comp {
boolean mouse; 
String ram, keyboard, brand; 
	public static void main(String[] args) {
		Comp com1=new Comp();
		com1.mouse= true;
		com1.ram= "big"; 
		com1.keyboard= "black";
		com1.brand = "Os";
		com1.watchmovie();
		Comp com2=new Comp();
		com2.mouse= true;
		com2.ram= "big"; 
		com2.keyboard= "black";
		com2.brand = "HP";
		com2.watchmovie();
		

	}
	void  watchmovie(){
		System.out.println("we will watch a movie"+ brand);
	}

}
