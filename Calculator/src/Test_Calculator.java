import java.util.Scanner;

/**
 * 
 */

/**
 * @author Laxmi_Gurumoorthy
 *
 */

public class Test_Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This is a Java Calculator");
		System.out.println("Please type a number to the console.");
		Scanner reader = new Scanner(System.in);
		int num1 = reader.nextInt();
		int num2 = reader.nextInt();
		reader.close();
		int sum = addition(num1 , num2);
		System.out.println(sum);
		int mult = multiplication(num1, num2);
		System.out.println(mult);
		float div = division(num1, num2);
		System.out.println(div);
		int sub = substraction(num1, num2);
		System.out.println(sub);
		// TODO Auto-generated method stub
	}

	
	public static int addition(int num1, int num2) {
		int Total = num1 + num2;
		return Total;
		// TODO Auto-generated method stub
	}

	public static int multiplication(int num1, int num2) {
		int result = (num1 * num2);
		return result;
		// TODO Auto-generated method stub
	}
	
	public static int substraction(int num1, int num2) {
		int result = (num1 - num2);
		return result;
		// TODO Auto-generated method stub
	}
	public static float division(int num1, int num2) {
		int result = (num1 / num2);
		return result;
		// TODO Auto-generated method stub
	}
	
//	public static int addition(num1, num2 ) {
//		int num1 = 1;
//		int num2 = 2;
//		int result = num1 + num2;
//		
//		// TODO Auto-generated method stub
//
//	}

}
