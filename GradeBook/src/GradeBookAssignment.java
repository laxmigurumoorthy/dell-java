import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
/**
 * 
 */

/**
 * @author Laxmi_Gurumoorthy
 *
 */
public class GradeBookAssignment {

	/**
	 * 
	 */
	public GradeBookAssignment() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		  
		    System.out.println("Enter total number of students");
		    Scanner reader = new Scanner(System.in);
		    String totStudents = reader.nextLine();
		    int intNoofStudents= Integer.parseInt(totStudents);
		    HashMap<String, String> Studentgrades = new HashMap<String, String>();
		   
		   /* double Average =0;*/
		    //Loop to enter the name of the student with comma separated grades and inserting into the 
		    for (int i=0;i< intNoofStudents; i++)
		    {
		    	
		    	System.out.println("Please enter name of student");
		    	String name=reader.nextLine();
		    	System.out.println("Please enter comma separated grades of student");
		    	String grades= reader.nextLine();
		    	Studentgrades.put(name, grades); //Storing the value in the HashMap
		    	String[] splitLine = grades.split(",");//Split the grades from the comma separated values
		    	int[] ints = new int[splitLine.length];
		    	 double sum=0;
		    	 //Loop to parse the splitline array and calculate t he sum 
		    	for (int j=0;j< splitLine.length;j++)
		    	{
		    		ints[j]=Integer.parseInt(splitLine[j]);
		    		sum = sum + ints[j]; //Summation of grades
		    	}
		    	//Helper method to calculate the Average
		    	double Average = CalculateAverage(Studentgrades,sum,splitLine);
		    	
		    
		    	
		    	
		    }
		  		    
		
		   reader.close();	
	}
	
	//Calculates the Average from the HashMap StudentGrades. Prints the Name of the student with the Average from the 
	//Map<String,double>StudentAverage - Stores the Name and the Average and prints the same from the Map.
	//Sum is the value of adding the grades calculated above in the main method
	//splitline is an array to store the grades
	public static double CalculateAverage (HashMap<String,String> Studentgrades, double sum,String[] splitLine)
	{
		 double Average =0;
		String CurrentName="";
    	
    	ArrayList<String> Studentnames = new ArrayList<String>(Studentgrades.keySet()); 
    	  for (int ii = 0; ii < Studentnames.size(); ii++) {
    		CurrentName = Studentnames.get(ii);
    		String grade = Studentgrades.get(CurrentName);
	    	}
    	   
    	   Average = sum/splitLine.length;
		   //Map to store the name and the average
		   Map<String,Double> StudentAverage = new HashMap<String,Double>();
		   StudentAverage.put(CurrentName, Average);
		   //Print the Map
		   
		   System.out.println(StudentAverage);
		   
		   return Average;
		  
		
	}
	
	
	

}
