package lab5Pack;

public class Task implements Priority{
	// knows
	private String thing;
	private int priorityLevel;
	
	// does
	// constructor
	public Task(String thingToDo)
	{
		thing = thingToDo;
	}
	
	// settes and getters
	public void setPriority(int level)
	{
		priorityLevel = level;
	}
	
	public int getPriority()
	{
		return priorityLevel;
	}
	
	// format the print
	public String toString()
	{
		return String.format( "%-50s", thing) + " priority: " + priorityLevel;
	}

}
