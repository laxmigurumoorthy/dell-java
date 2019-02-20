import java.util.ArrayList;
import java.util.Scanner;
public class CollectStats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a list of numbers");
		
		String[] numarray= in.nextLine().split(",");
		
		FindNumberofElements(numarray);
		
		Average (numarray);
		
		FindMinValue(numarray);
		
		FindMaxValue(numarray);
		
		Sum(numarray);
		
	}
	private static void FindMinValue(String[] intArray)
	{
		
		int min = Integer.parseInt(intArray[0]);
		for(int i=1;i< intArray.length;i++){
			
		   if (min > Integer.parseInt(intArray[i])) 
		   {
		      min = Integer.parseInt(intArray[i]);
		   }
		}
		System.out.println("Minimum Value is " + min);
		
	}
	
	private static void FindMaxValue(String[] intArray)
	{
		int max = Integer.parseInt(intArray[0]);
		for(int i=1;i< intArray.length;i++){
			
		   if (max < Integer.parseInt(intArray[i])) 
		   {
			   max = Integer.parseInt(intArray[i]);
		   }
		}
		System.out.println("Maximum Value is " + max);
		
	}
	
	private static void FindNumberofElements(String[] intArray)
	{
		int cnt=intArray.length;
		System.out.println("Count is:" + cnt);
		
	}

	
	
	private static void Average(String[] intArray)
	{
		ArrayList<Double> numbers= new ArrayList<Double>();
		int sum=0;
		double average;
		for (int i=0;i<intArray.length;i++)
		{
			
			numbers.add(Double.parseDouble(intArray[i]));
			if (numbers.size()==0)
			{
				System.out.println("Cannot find Average");
			}
			else
			{
				sum= sum + Integer.parseInt(intArray[i]);
			}
			
		}
		average= (double)sum/intArray.length;
		System.out.println("Average is:" + average);
	}
	
	private static void Sum(String[] intArray)
	{
		ArrayList<Double> numbers= new ArrayList<Double>();
		int sum=0;
		double average;
		for (int i=0;i<intArray.length;i++)
		{
			
			numbers.add(Double.parseDouble(intArray[i]));
			if (numbers.size()==0)
			{
				System.out.println("Cannot find Average");
			}
			else
			{
				sum= sum + Integer.parseInt(intArray[i]);
			}
			
		}
		
		System.out.println("Sum is:" + sum);
	}
	
	
	

}
