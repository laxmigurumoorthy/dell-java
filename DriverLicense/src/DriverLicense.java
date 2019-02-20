import java.sql.Date ;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Scanner;

public class DriverLicense {

	//Attributes for the Drivers License
	 public String firstName;
	 public String lastName;  
	 public String dob;
	 public String height;
	 public String Gender;
     
   	public DriverLicense() {
	
		
	}
   	
   	//get property for first name
   	public String getFirstName ()
   	{
   		return firstName;
   		
   	}
  	//set property for first name
   	public void setFirstName(String DriversFirstName) {
		firstName = DriversFirstName;
	}
   	
   	
  //get property for Last name 	
   	public String getLastName()
   	{
   		return lastName;
   	}
   	
  //set property for Last name
   	public void setLastName(String DriversLastName) {
		lastName = DriversLastName;
	}

   	//get property for DOB 		
   	public String getDateofBirth()
   	{
   		return dob;
   		
   	}
  	//set property for DOB 	
   	public void setDateofBirth(String DriversDateofBirth) {
		dob = DriversDateofBirth;
	}
   	
 	public String getHeight()
   	{
   		return height;
   		
   	}
   	
   	public void setHeight(String DriversHeight) {
		height = DriversHeight;
	}
   	
 	public String getGender()
   	{
   		return Gender;
   		
   	}
   	
   	public void setGender(String DriversGender) {
		Gender = DriversGender;
	}
   	
   	
   	
	//Concatenates the first name and Last Name to give Full Name
	public String getFullName(String FirstName, String LastName)
	{
		String FullName= String.join(" ",FirstName,LastName);
		
		return FullName;
			
		
	}
	
	//Calculates Age
	public int getAge(LocalDate birthDate,LocalDate currentDate)
	{
		if ((birthDate !=null) && (currentDate!=null))
		{
			return Period.between(birthDate, currentDate).getYears();
		}
		else
		{
			return 0;
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
