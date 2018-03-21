import java.text.NumberFormat;

public class Auto {

	// Class fields
	private final double PERCENT = 0.3;
	private String firstName, lastName;
	private String make;
	private String model;
	private double liability;
	private double collision;
	private double commission;
	protected NumberFormat fmt;
	
	// Class methods
	// Constructor
	public Auto()
	{
		firstName = null;
		lastName = null;
		make = null;
		model = null;
		liability = 0.0;
		collision = 0.0;
		commission = 0.0;
		fmt = NumberFormat.getCurrencyInstance();
	}
	public Auto(String firstName, String lastName, String make, String model, double liability, double collision)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.make = make;
		this.model = model;
		this.liability = liability;
		this.collision = collision;
		fmt = NumberFormat.getCurrencyInstance();
	}
	
	// Compute commission
	public void computeCommission() {
		commission = (liability + collision) * PERCENT;
	}

	// toString overridden from Object class
	@Override
	public String toString() {
		String result = "Auto Policy" + '\n';
		result += "-----------" + '\n';
		result += "Name: " + firstName + ' ' + lastName + '\n';
		result += "Make: " + make + '\n';
		result += "Model: " + model + '\n';
		result += "Liability: " + fmt.format(liability) + '\n';
		result += "Collision: " + fmt.format(collision) + '\n';
		result += "Commission: " + fmt.format(commission) + '\n';
		return result;
	}

	// Getters and setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
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
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
}
