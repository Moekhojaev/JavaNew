package Class14;
import java.util.Scanner;
public class Interview {

	public static void main(String[] args) {
		System.out.println("Your moms first name?");
		Scanner inpt= new Scanner(System.in);
		String momName=inpt.nextLine();
 		System.out.println("Your dads first name?");
         String dadName=inpt.nextLine();
        System.out.println("Boy or Girl");
        String gender=inpt.nextLine();
        if(gender.contains("Boy")) {
        	System.out.println(momName.substring(0,dadName.length()/2)+dadName.substring(3,5));
        	
        }
        
        
	}

}
