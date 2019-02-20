import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 
 */

/**
 * @author Laxmi_Gurumoorthy
 *
 */
public class TimesheetEntry {
	
	private static int NEXTID = 1;
	
	private String projectName;
	private String task;
	private int id;
	private LocalDateTime startTime;
	private LocalDateTime endTime;

	
	public TimesheetEntry(String myProject, String myTask) {
		projectName = myProject;
		task = myTask;
		startTime = LocalDateTime.now();
		id = NEXTID;
		NEXTID++;// increment
				
		// TODO Auto-generated constructor stub
	}
	
	// Methods
	
			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public String getProjName() {
				return projectName;
			}
			
			public void setProjName(String name) {
				this.projectName = name;
			}
			
			public String getTask() {
				return task;
			}
			
			public void setTask(String Task) {
				this.task = Task;
			}
			
			public LocalDateTime getStartDate ()
			{
				return startTime;
			}
			
			public void setStarttDate (LocalDateTime StartTime)
			{
				this.startTime= StartTime;
			}
			
			
			public LocalDateTime getEndDateTime ()
			{
				return startTime;
			}
			
			public void setEndDateTime (LocalDateTime EndDateTime)
			{
				this.endTime= EndDateTime;
			}
	
			public void updateEndTime () {
				startTime = LocalDateTime.now();
			}
	
	
	
}



