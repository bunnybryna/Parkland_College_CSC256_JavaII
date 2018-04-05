// Below we define a class that describes a car.
// Note that since a car needs to implement the
// functionality to "move", we implement the 
// Moveable interface as shown on the first line
// of the class description. We then "override"

public class Car implements Moveable {

	// Fields
	private int numCylinders;
	
	
	// Methods
	//
	// Constructor
	public Car(int nc)
	{
		numCylinders = nc;
	}
	
	// The following methods fill in the necessary
	// statements to implement the Moveable interface
	public boolean start() 
	{
		System.out.println("Key in ignition, turn to Start");
		return true;
	}
	public void stop() 
	{
		System.out.println("Foot on brake, turn engine off");
	}
	public void forward(double speed) 
	{
		System.out.println("Step on gas to speed " + speed);
	}
	public void reverse() 
	{
		System.out.println("Slight gas on pedal, shift to reverse");
	}

	// Getters/setters
	public int getNumCylinders() {
		return numCylinders;
	}

	public void setNumCylinders(int numCylinders) {
		this.numCylinders = numCylinders;
	}

	// toString method
	public String toString() {
		return "Car [numCylinders=" + numCylinders + "]";
	}
}
