import java.util.ArrayList;
import java.util.List;

public class CarLot {

	public String Lotname;
	public List<Vehicle> listofVehicles;
	public CarLot() {
		// TODO Auto-generated constructor stub
		listofVehicles= new ArrayList<Vehicle>();
	}

   // Setting the lot Name
	 public void setLotName(String name) {
		 Lotname = name;
	 }

	 public String getLotName() {
		 return Lotname;
	 }
     // Adding the Vehicle
	 public void AddVehicle(Vehicle myvehicle)
	 {
		 listofVehicles.add(myvehicle);
	 }
	 //Printing the inventory of the vehicle
	 public void PrintInventory ()
	 {
		 System.out.println("------------------------------------");
		 System.out.println("Inventory of CarLot :"+ Lotname);
		 System.out.println("------------------------------------");
		 int numberOfVehicles = listofVehicles.size();
		 System.out.println("Total number of vehicles in the Lot are :"+ numberOfVehicles);
		 System.out.println("************List of vehicles********************");
		 for (int i=0;i< listofVehicles.size();i++) {
			 System.out.println("Vehicle Number# "+(i+1)+" |License: "+listofVehicles.get(i).getLicenseNumber()
					 +"| Make: "+ listofVehicles.get(i).getMake()
					 +"| Model: "+ listofVehicles.get(i).getModel()
					 +"| Price: "+ listofVehicles.get(i).getPrice());
		 }

		 
	 } 	 		 		
	 
}
