/**
 * 
 */

/**
 * @author Laxmi_Gurumoorthy
 *
 */
import java.util.Arrays;
public class TryCatchRockPaper {


	public static void main(String[] args) {
		
		try {
		
		String message = "Hello World";
		System.out.println("Message Length:" + message.length());
		char myChar = message.charAt(15);
		System.out.println(myChar);
		throw new NullPointerException("message to user");
		
	}catch (Exception e) {

		System.out.println("Your code therew an exception:" + e.toString());
		
		
}finally {
	
	
}
	}
		
	
		// TODO Auto-generated method stub
	
public static void helpermethod() {
	
}
}





//class Main {
//	   public static void main(String args[]) {
//	      int a[] = new int[2];
//	      try {
//	         System.out.println("Access element three :" + a[3]);
//	      }catch(ArrayIndexOutOfBoundsException e) {
//	         System.out.println("Exception thrown  :" + e);
//	      }finally {
//	         a[0] = 6;
//	         System.out.println("First element value: " + a[0]);
//	         System.out.println("The finally statement is executed");
//	      }
//	   }
//	}