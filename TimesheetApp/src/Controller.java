import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Controller {

	private static final String Projname = null;
	/* Member variables */
	
    Timesheet timesheet;
    ConsoleUtils consoleUtils;
    
    /* Constructor */
    
    public Controller(){
        this.timesheet = new Timesheet();
        this.consoleUtils = new ConsoleUtils();
    }
    
    /* Methods */

	/*
	 * Runs the program
	 */
    public void start() {

        consoleUtils.printHelp(); // Print the action menu
        Roster	myController = new ConsoleUtils();
        Scanner reader = new Scanner(System.in);
        
        boolean quit = false;
        while(!quit) {

        	    System.out.println("Command options: add,  list, Stop [Id], delete [Id], help, quit");	
        		String input = reader.nextLine(); // Read user's input
        		String[] inputParts = input.split(" "); // Split user input into multiple strings
        		String firstCommand = inputParts[0]; // First command typed by user
        		if (firstCommand.equals("add")) {
        			// Prompt user for Project info
        			System.out.println("Please enter project name");
        			String Projname = reader.nextLine();
        			System.out.println("Please enter project task");
        			String task = reader.nextLine();
        			System.out.println("Please enter project start Date");
        			String StDate = reader.nextLine();
        			
        			System.out.println("Please enter project end Date");
        			String EndDate = reader.nextLine();
        			
        			//Date formatter for converting date into mm/dd/yyyy format
        			DateTimeFormatter Stformatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        			LocalDate ProjStDate = LocalDate.parse(StDate,Stformatter);	
        			
        			DateTimeFormatter Enformatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        			LocalDate ProjEnDate = LocalDate.parse(EndDate,Enformatter);
        			
        			
        			
//        			System.out.println("Is the employee active?");
//        			String empActive = reader.nextLine();
//        			
//        			boolean employeeActive = Boolean.parseBoolean(empActive);
        			
        	      			
        			Projectname Projname = new project(Projname, task);
        			myController.add(project);
        		} else if (firstCommand.equals("list")) {
        			if (inputParts.length == 2) { // User has input "list [i]"
        				int empId = Integer.parseInt(inputParts[1]);
        				printProject(Projname, task);
        			} else if (inputParts.length == 1) { // User has input "list"
        				printProjectList(Projname);
        			}
        		} 	
        	
        	
        	
        	
        	
        	
        	
        	
			// Prompt the user for input, collect input, parse into parts
            String input = consoleUtils.promptString("> ");
            String[] actionParts = input.split(" ");
            String action = actionParts[0].trim(); // Primary action

			// Figure out what to do depending on the user's primary action
            if (action.equals("add")) {

                processAddAction();

            } else if (action.equals("delete")) {

                processDeleteAction(actionParts);

            } else if (action.equals("stop")) {

                processStopAction(actionParts);

            } else if (action.equals("list")) {

                processListAction(actionParts);

            } else if (action.equals("quit")) {

            	processQuitAction(actionParts);

            } else if (action.equals("help")) {

            	processHelpAction(actionParts);

            } else if(action.length() ==0 ){
            
                // do nothing.
                
            } else {
            
                quit = true;
                
            }
        }

    }

	private void printProjectList(String projname2) {
		// TODO Auto-generated method stub
		
	}

	/*
	 * The user requested that a given TimesheetEntry be stopped (marked as complete)
	 * This method conveys that request to the Timesheet
	 */
    public void processStopAction(String[] actionParts){

        if(actionParts.length > 2){
            consoleUtils.error("Too many inputs to stop command");
            return;
        }

        int id = Integer.parseInt(actionParts[1]);
    	// Your code here
    }

	/*
	 * The user requested that a given TimesheetEntry be deleted
	 * This method conveys that request to the Timesheet
	 */
    public void processDeleteAction(String[] actionParts){

        if(actionParts.length > 2){
            consoleUtils.error("Too many inputs to delete command");
            return;
        }

        int id = Integer.parseInt(actionParts[1]);
		
		// Your code here
    }

	/*
	 * The user wants to view a list of timesheet entries
	 * This method conveys that request to the Timesheet,
	 * along with any special options (active-only, filter by project name)
	 */
    public void processListAction(String[] actionParts){
    
        if(actionParts.length > 3){
            consoleUtils.error("Too many inputs to list command");
            return;
        }

     // Print the entire project list
     		private static void processListAction(Roster myController) {
     			List<TimesheetEntry> projectList = myController.getProjectList();
     			for (int i = 0; i < projectList.size(); i++) {
     				TimesheetEntry currProj = projectList.get(i);
     				System.out.println("Id: " + currProj.getId()
     				+ ", Name: " + currProj.getProjName()
     				+ ", Task: " + currProj.getTask()
     				+ ", Start Date: " + currProj.getStartDate()
     				+ ", End Date: " + currProj.getEndDate());
     			}
     		}
     		
     		// Given the employee id, find them in the list and print their info
     		private static void printProject(Roster myRoster, int id) {
     			List<Project> projectList = myRoster.getProjectList();
     			for (int i = 0; i < projectList.size(); i++) {
     				Project currProj = projectList.get(i);
     				int currId = currProj.getId();
     				if (currId == id) {
     					System.out.println("Id: " + currProj.getId()
     					+ ", Name: " + currProj.getProjName()
     					+ ", Task: " + currProj.getTask()
     					+ ", Start Date: " + currProj.getStartDate()
     					+ ", End Date: " + currProj.getEndDate());
     				}
     			}
     		}
    }

	/*
	 * The user wants to add a new entry to the Timesheet
	 * This method conveys that request to the Timesheet, along with
	 * the specified project name and task description 
	 */
    public void processAddAction(){
    
        String project = consoleUtils.promptString("Project Name (one word only):");
        String description = consoleUtils.promptString("Task:");

		// Your code here
    }


public void processHelpAction(String[] actionParts){

    if(actionParts.length == 4){
        consoleUtils.error("Too many inputs to delete command");
        return;
    }

    int id = Integer.parseInt(actionParts[4]);
	
	// Your code here
}

public void processQuitAction(String[] actionParts){

    if(actionParts.length == 0){
        consoleUtils.error("Too many inputs to delete command");
        return;
    }

    int id = Integer.parseInt(actionParts[5]);
	
    else if (firstCommand.equals("quit")) {
		quit = true;
	} else {
		System.out.println("Invalid input, please try again");
	}
}
}