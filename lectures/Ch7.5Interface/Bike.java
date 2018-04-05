// Below we define a class that describes a bike.
// Note that since a bike needs to implement the
// functionality to "move", we implement the 
// Moveable interface as shown on the first line
// of the class description. We then "override"

public class Bike implements Moveable {
		
	// Fields
	private int npedals;
	private double tirePressure;
	
	// Methods
	//
	// Constructor
	public Bike(int np, double tp)
	{
		npedals = np;
		tirePressure = tp;
	}	
	
	// The following methods fill in the necessary
	// statements to implement the Moveable interface
	public boolean start()
	{
		if(tirePressure <= 0.0)
		{
			System.out.println("Cannot start");
			return false;
		}
		else
		{
			System.out.println("Started successfully");
			return true;
		}
	}
	public void stop()
	{
		System.out.println("Apply hand brake to stop");
	}
	public void forward(double speed)
	{
		System.out.println("Pedal at rate of " + speed);
	}
	public void reverse()
	{
		System.out.println("Pedal backwards slowly");
	}
	
	// Getters/setters
	public int getNpedals() {
		return npedals;
	}
	public void setNpedals(int npedals) {
		this.npedals = npedals;
	}
	public double getTirePressure() {
		return tirePressure;
	}
	public void setTirePressure(double tirePressure) {
		this.tirePressure = tirePressure;
	}

	// toString method
	public String toString() {
		return "Bike [npedals=" + npedals + ", tirePressure=" + tirePressure
				+ "]";
	}
}
