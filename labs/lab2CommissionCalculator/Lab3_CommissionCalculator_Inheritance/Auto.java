
// Auto insurance policy derived from the base/parent Policy class
public class Auto extends Policy 
{
	// Class fields (what the class "knows")
	private final double PERCENT = 0.3;
	private String make;
	private String model;
	private double liability;
	private double collision;
	
	// Class methods (what the class "does")
	// Constructor
	public Auto()
	{
		// Call parent class constructor
		super();
		
		// Initialize fields
		make = null;
		model = null;
		liability = 0.0;
		collision = 0.0;
	}
	public Auto(String firstName, String lastName, String make, String model, double liability, double collision)
	{
		// Call parent class constructor
		super(firstName, lastName);
		
		// Initialize fields
		this.make = make;
		this.model = model;
		this.liability = liability;
		this.collision = collision;
	}
	
	// Implement parent abstract class to compute commission
	public void computeCommission() {
		commission = (liability + collision) * PERCENT;
	}

	// toString overridden from Object class
	@Override
	public String toString() {
		String result = "Auto Policy" + '\n';
		result += "-----------" + '\n';
		result += super.toString();				// get parent toString result
		result += "Make: " + make + '\n';
		result += "Model: " + model + '\n';
		result += "Liability: " + fmt.format(liability) + '\n';
		result += "Collision: " + fmt.format(collision) + '\n';
		return result;
	}

	// Getters and setters
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getLiability() {
		return liability;
	}
	public void setLiability(double liability) {
		this.liability = liability;
	}
	public double getCollision() {
		return collision;
	}
	public void setCollision(double collision) {
		this.collision = collision;
	}
}
