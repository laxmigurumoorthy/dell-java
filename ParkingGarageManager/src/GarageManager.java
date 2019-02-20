/**
 * 
 */

/**
 * @author Laxmi_Gurumoorthy
 *
 */
public class GarageManager {

	/**
	 * 
	 */
	public GarageManager() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Instances of the Parking Garage
		ParkingGarage pk1 = new ParkingGarage(1);
		ParkingGarage pk2 = new ParkingGarage(2);
		ParkingGarage pk3 = new ParkingGarage(3);
		

		car c1 = new car();
		c1.color="blue";
		c1.license="KJ87";
		c1.model="civic";
		c1.make="Honda";
		
		car c2 = new car();
		c2.color="brown";
		c2.license="JK87";
		c2.model="camry";
		c2.make="Toyota";
		
		car c3 = new car();
		c3.color="gray";
		c3.license="HJ434";
		c3.model="camry";
		c3.make="Toyota";
		
		car c4 = new car();
		c4.color="Silver";
		c4.license="MLK87";
		c4.model="Rav4";
		c4.make="Toyota";
		
		pk1.Park(c1, 1);
		System.out.println("Inventory for garage 1");
		pk1.printInventory();
		pk1.Park(c1, 2);
		System.out.println("Inventory for garage 1");
		pk1.printInventory();
		
		pk2.Park(c2, 1);
		System.out.println("Inventory for garage 2");
		pk2.printInventory();
		pk2.Park(c2, 2);
		System.out.println("Inventory for garage 2");
		pk2.printInventory();
		
		pk3.Park(c3, 1);
		System.out.println("Inventory for garage 3");
		pk3.printInventory();
		pk3.Park(c2, 2);
		System.out.println("Inventory for garage 3");
		pk3.printInventory();
		
		pk1.vacate(2);
		System.out.println("Inventory for garage 2");
		pk1.printInventory();
		pk2.vacate(1);
		
		System.out.println("Inventory for garage 2");
		pk2.printInventory();
	}

}
