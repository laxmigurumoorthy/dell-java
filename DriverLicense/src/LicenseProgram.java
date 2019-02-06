import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Scanner;


public class LicenseProgram {

	public LicenseProgram() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Driver 1 details
		DriverLicense driver1 = new DriverLicense();
		driver1.firstName =  "AB";
		driver1.lastName =  "AC";
		driver1.dob = "05/20/1999";
		driver1.height = "5 ft";
		driver1.Gender = "Male";
		
		//Driver 2 details
		DriverLicense driver2 = new DriverLicense();
		driver2.firstName =  "XY";
		driver2.lastName =  "YZ";
		driver2.dob = "01/26/2000";
		driver2.height = "5 ft 3 inches";
		driver2.Gender = "Female";
		
		//Driver 3 details
		DriverLicense driver3 = new DriverLicense();
		driver3.firstName =  "CD";
		driver3.lastName =  "EF";
		driver3.dob = "06/11/2003";
		driver3.height = "5 ft 8 inches";
		driver3.Gender = "Male";
		
		//Date formatter for converting date into mm/dd/yyyy format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    	
		
		//Full concatenated name of Driver 1
		String FullName1 = driver1.getFullName(driver1.firstName,driver1.lastName);
		System.out.print("Full Name: " + FullName1);
		LocalDate birthDate1 = LocalDate.parse(driver1.dob,formatter);	
		//Current Date
		LocalDate currentDate1 = LocalDate.now();
		int Age1 = driver1.getAge(birthDate1, currentDate1);
		System.out.println(" Age: " + Age1);
		System.out.println(" Height: " + driver1.getHeight());
		System.out.println(" Gender: " + driver1.getGender());
		System.out.println();
		System.out.println("**********************************");
		System.out.println();
		
		//Full concatenated name of Driver 2
		String FullName2 = driver2.getFullName(driver2.firstName,driver2.lastName);
		System.out.println("Full Name: " + FullName2);
		LocalDate birthDate2 = LocalDate.parse(driver2.dob,formatter);	
		//Current Date
		LocalDate currentDate2 = LocalDate.now();
		int Age2 = driver1.getAge(birthDate2, currentDate2);
		System.out.println(" Age: " + Age1);
		System.out.println(" Height: " + driver1.getHeight());
		System.out.print(" Gender: " + driver1.getGender());
		System.out.println();
		System.out.println("**********************************");
		System.out.println();
		
		//Full concatenated name of Driver 3
		String FullName3 = driver3.getFullName(driver3.firstName,driver3.lastName);
		System.out.println("Full Name: " + FullName3);
		LocalDate birthDate = LocalDate.parse(driver3.dob,formatter);	
		//Current Date
		LocalDate currentDate = LocalDate.now();
		int Age3 = driver1.getAge(birthDate, currentDate);
		System.out.println(" Age: " + Age3);
		System.out.println(" Height: " + driver3.getHeight());
		System.out.println(" Gender: " + driver3.getGender());
		System.out.println();
		
				
	}

}
