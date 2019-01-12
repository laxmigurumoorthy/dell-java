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
	    int num = 0;
	    Random r = new Random();
	    num = r.nextInt(3);

	    System.out.println("Select: rock, paper or scissors.");
	    Scanner userChoice = new Scanner(System.in);
	    choice=userChoice.next().toLowerCase();

	    if (num==0)
	    {
	    	String num1 = "rock";
	    	System.out.println("System chose Rock"); 
	    	if (choice.matches(num1)){
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
	    else if (num==1)
	    {
	    	String num2 = "paper";
	        System.out.println("System chose Paper");
	        if (choice.matches(num2)){
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
	    else if (num==2)
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
}
