/**
 * 
 */

/**
 * @author Laxmi_Gurumoorthy
 *
 */
public abstract class Vehicle {

	public String licensenumber;
	public String make;
	public String model;
	public int price;
	
	/**
	 * 
	 */
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	
	public void setLicenseNumber(String licenseNumber) {
		 this.licensenumber = licenseNumber;
	 }

	 public String getLicenseNumber() {
		 return licensenumber;
	 }

	 public String getMake() {
		 return make;
	 }

	 public void setMake(String make) {
		 this.make = make;
	 }

	 public void setModel(String model) {
		 this.model = model;
	 }

	 public String getModel() {
		 return model;
	 }

	 public void setPrice(int price) {
		 this.price = price;
	 }

	 public int getPrice() {
		 return price;
	 }
	 //methods
	 //method to print details of the car
	 public void printDescription() {
		 System.out.println("License: "+licensenumber
				 +"Make: "+ make
				 +"Model: "+ model
				 +"Price: "+ price);
	 }

}
