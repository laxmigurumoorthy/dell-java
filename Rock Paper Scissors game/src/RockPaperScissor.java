/**
 * 
 */

/**
 * @author Laxmi_Gurumoorthy
 *
 */


import java.util.Scanner; 
import java.util.Random; 

public class RockPaperScissor {

	/**
	 * 
	 */
	
	public RockPaperScissor() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]){

	    String choice;
	    int num1 = 0;
	    Random r = new Random();
	    num1 = r.nextInt(3);

	    System.out.println("Select: rock, paper or scissors.");
	    try
	    {
	    Scanner userChoice = new Scanner(System.in);
	    choice=userChoice.next().toLowerCase();
	    switch (num1)
	    {
		    case 0:
		    	ChoosePlayer1(choice);
		    	break;
		    case 1:
		    	ChoosePlayer2 (choice);
		    	break;
		    case 2:
		    	ChoosePlayer3(choice);
		    	break;
	    }
	    }
	    catch (Exception e)
	    {  
	    	System.out.println("Exception:" + e.toString());
	    }
	    
	      

	}

	private static void ChoosePlayer1(String choice) {
		// TODO Auto-generated method stub
		
	    	String num2 = "rock";
	    	System.out.println("System chose Rock"); 
	    	if (choice.matches(num2)){
	            System.out.println("Its a tie!");

	            }
	        else if (choice.matches("paper")){
	            System.out.println("You win!");

	        }
	        else if (choice.matches("scissors")){
	            System.out.println("You lose!");
	        }
	        else {
	            System.out.println();
	            System.out.println("ERROR: Please choose Rock, Paper or Scissors");
	        }
	    	
	 
	}
	private static void ChoosePlayer2(String choice)
	{
	 
	    	String num3 = "paper";
	        System.out.println("System chose Paper");
	        if (choice.matches(num3)){
	            System.out.println("Its a tie!");

	        }
	        else if (choice.matches("scissors")){
	            System.out.println("You win!");

	        }
	        else if (choice.matches("rock")){
	            System.out.println("You lose!");
	        }
	        else {
	            System.out.println();
	            System.out.println("ERROR: Please choose Rock, Paper or Scissors");
	        }
	 
	}
	private static void ChoosePlayer3(String choice)
	{
	 
	    	String num3 = "scissors";
	        System.out.println("System chose Scissors");
	        if (choice.matches(num3)){
	            System.out.println("Its a tie!");

	        }
	        else if (choice.matches("rock")){
	            System.out.println("You win!");

	        }
	        else if (choice.matches("paper")){
	            System.out.println("You lose!");
	        }
	        else {
	            System.out.println();
	            System.out.println("ERROR: Please choose Rock, Paper or Scissors");
	        }
	 
	}

	
	

	
}
