
// Life insurance policy derived from the base/parent Policy class
public class Life extends Policy 
{
	// Class fields (what the class "knows")
	private final double PERCENT = 0.2;
	private int age;
	private double term;
	
	// Class methods (what the class "does")
	// Constructor
	public Life()
	{
		// Call parent class constructor
		super();
		
		// Initialize fields
		age = 0;
		term = 0.0;
	}
	public Life(String firstName, String lastName, int age, double term)
	{
		// Call parent class constructor
		super(firstName, lastName);
		
		// Initialize fields
		this.age = age;
		this.term = term;
	}
	
	// Implement parent abstract class to compute commission
	public void computeCommission() {
		commission = term * PERCENT;
	}

	// toString overridden from Object class
	@Override
	public String toString() {
		String result = "Life Policy" + '\n';
		result += "-----------" + '\n';
		result += super.toString();				// get parent toString result
		result += "Age: " + age + '\n';
		result += "Term: " + fmt.format(term) + '\n';
		return result;
	}
	
	// Getters and setters
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
}
