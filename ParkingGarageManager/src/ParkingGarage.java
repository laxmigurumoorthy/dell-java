
	public class ParkingGarage {
        
	    // the ParkingGarage class has
	    // 2 fields
	    public int chkspot;
	    public car[] chkcar;
	    
	    	        
	    // the ParkingGarage class has one constructor
	    public ParkingGarage(int chkspot) {
	    	chkspot = chkspot;
	    	chkcar= new car[chkspot];
	    	
	      }
	        
	  // This method will show if the parking spot is filled.
	    public void Park(car car, int spot)
	    {
	    	
	    	try {
				if (chkcar[spot] == null) {
					chkcar[spot] = car;
				} else {
					System.out.println("The spot is already filled in please choose another spot");
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Parking Spot does not Exist. Please select from available spot");
			}
	    	
	    	
	    	
	    }
	    //This method is used to vacate the car for the selected spot
	    public void vacate(int spot)
	    {
	    	
	    	try
	    	{
		    	if (chkcar[spot] == null) 
		    	{
					
		    		System.out.println("There is no car at the spot");
		    		
				} 
		    	else 
		    	{
					chkcar[spot] = null;
				}
			} 
		    catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Parking Spot does not Exist.Please select from available spot ");
			}
    	
	    	
	    	
	    }
	    // This method will print the inventory of the car.
	    //This also displays the empty spot and the details about the car.
	    public void printInventory()
	    {
	    	
	    	System.out.println("Spot number:" + chkcar);
	    	
	    	
	    	for (int i=0; i< chkspot; i++)
	    	{
	    		if (chkcar[i]== null)
	    		{
	    			System.out.println ("Spot is empty:" + i);
	    		}
	    		else
	    		{
	    			System.out.println("License: " + chkcar[i].license + "Make: " + chkcar[i].make + "Color: " + chkcar[i].color + "Model: " + chkcar[i].model );
	    			
	    		}
	    		
	    		
	    	}
	    }
	    
	  	           
	}
	
	
	
	

