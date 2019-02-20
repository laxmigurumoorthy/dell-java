
public class CarLotProgram {

	public CarLotProgram() {
		
	}
   // Main program to print the Vehicle details
	public static void main(String[] args) {
		
		CarLot CL1 = new CarLot();
		CarLot CL2 = new CarLot();
		
		//Setting the name of the Parking lot
	    CL1.setLotName("PaidParking");
	    CL2.setLotName("EventParking");
	    //Initializing the cars with the license 
	    Car car1 = new Car();
		car1.Type = "Sedan";
		car1.Noofdoors = 2;
		car1.setLicenseNumber("REBT231");
		car1.setMake("Mercedes");
		car1.setModel("R320");
		car1.setPrice(60000);
		
		Car car2 = new Car();
		car2.Type = "SUV";
		car2.Noofdoors = 4;
		car2.setLicenseNumber("FTRD4543");
		car2.setMake("Honda");
		car2.setModel("accord");
		car2.setPrice(25000);

		Truck tk = new Truck();
		tk.bedSize=2;
		tk.setLicenseNumber("GHTY2345");
		tk.setMake("Dodge");
		tk.setModel("RAM");
		tk.setPrice(70000);
		
		//Adding the vehicle to the carlot
		CL1.AddVehicle(car1);
		CL1.AddVehicle(car2);
		//Printing the inventory
		CL1.PrintInventory();
		//Adding the truck to the car lot
		CL2.AddVehicle(tk);
		CL2.PrintInventory();
		
		
		
	}

}
