/**
 * 
 */

/**
 * @author Laxmi_Gurumoorthy
 *
 */
//public class PigLatinString {
//
//	/**
//	 * 
//	 */
//	public PigLatinString() {
//		// TODO Auto-generated constructor stub
//	}
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}



import java.util.Scanner;



public class PigLatinString

{

    public static void main(String[] args)

    {

     Scanner stdIn=new Scanner(System.in);

        String word;
        String newWord = "";

         

        String repeatAgain = "y";

         

        while (repeatAgain.equals("Y") || repeatAgain.equals("y"))

        {

            System.out.print("\f");

            System.out.print("Enter a word: ");

            word=stdIn.nextLine().toLowerCase();

         
            
            
            if (!word.contains("a") ||  !word.contains("e") || !word.contains("i") ||  !word.contains("o")  ||  !word.contains("u"))
            {
                newWord= word + "ay";
            } 
           
            if ((word.charAt(0) =='a'  || word.charAt(0)=='e'  || word.charAt(0)=='i' || word.charAt(0)=='0' || word.charAt(0)=='u'))
            	{
            		newWord= word + "yay";
            	}
           
            else
            {
            		int index = 0;
                	for (int i=1;i<word.length();i++)
                	{
                		if(word.charAt(i) =='a' || word.charAt(i) =='e' || word.charAt(i) =='i'|| word.charAt(i) =='o'|| word.charAt(i) =='u') {
                			
                			index = i;
                			break;
                		
                		}
                		
                		
                	}
                	newWord=word.substring(index)  + word.substring(0, index) + "ay";
            	//}
            	
            }
            
            System.out.println("That word translates to " + newWord + " in Pig Latin");

             

            System.out.println("Do you want to play again? (y/n)");

            repeatAgain = stdIn.nextLine();
            
           

        }
      
        //stdIn.close();
     

}

}
