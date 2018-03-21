import java.text.NumberFormat;

// Base/Parent class for ANY type of insurance policy
public abstract class Policy {

	// Class fields (common to all insurance policies)
	// Note these are protected so these are visible to child classes
	protected String firstName, lastName;
	protected double commission;
	protected NumberFormat fmt;
	
	// Class methods
	// Constructor
	public Policy()
	{
		// Initialize fields
		firstName = null;
		lastName = null;
		commission = 0.0;
		fmt = NumberFormat.getCurrencyInstance();
	}
	public Policy(String firstName, String lastName)
	{
		// Initialize fields
		this.firstName = firstName;
		this.lastName = lastName;
		commission = 0.0;
		fmt = NumberFormat.getCurrencyInstance();
	}
	
	// Abstract method to compute commission
	// Derived/Child classes must provide the implementation for this method
	abstract public void computeCommission();

	// toString overridden from Object class
	@Override
	public String toString() {
		String result = "Commission: " + fmt.format(commission) + '\n';
		result += "Name: " + firstName + ' ' + lastName + '\n';
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
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
}
