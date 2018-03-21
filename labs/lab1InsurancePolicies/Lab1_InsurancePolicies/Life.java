import java.text.NumberFormat;

public class Life {

	// Class fields
	private final double PERCENT = 0.2;
	private String firstName, lastName;
	private int age;
	private double term;
	private double commission;
	protected NumberFormat fmt;
	
	// Class methods
	// Constructor
	public Life()
	{
		firstName = null;
		lastName = null;
		age = 0;
		term = 0.0;
		commission = 0.0;
		fmt = NumberFormat.getCurrencyInstance();
	}
	public Life(String firstName, String lastName, int age, double term)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.term = term;
		fmt = NumberFormat.getCurrencyInstance();
	}
	
	// Compute commission
	public void computeCommission() {
		commission = term * PERCENT;
	}

	// toString overridden from Object class
	@Override
	public String toString() {
		String result = "Life Policy" + '\n';
		result += "-----------" + '\n';
		result += "Name: " + firstName + ' ' + lastName + '\n';
		result += "Age: " + age + '\n';
		result += "Term: " + fmt.format(term) + '\n';
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getTerm() {
		return term;
	}
	public void setTerm(double term) {
		this.term = term;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
}
