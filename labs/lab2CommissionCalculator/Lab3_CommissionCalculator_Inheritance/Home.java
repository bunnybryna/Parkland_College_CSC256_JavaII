
// Home insurance policy derived from the base/parent Policy class
public class Home extends Policy 
{
	// Class fields (what the class "knows")
	private final double PERCENT1 = 0.3;
	private final double PERCENT2 = 0.2;
	private int footage;
	private double dwelling;
	private double contents;
	private double liability;
	
	// Class methods (what the class "does")
	// Constructor
	public Home()
	{
		// Call parent class constructor
		super();
		
		// Initialize fields
		footage = 0;
		dwelling = 0.0;
		contents = 0.0;
		liability = 0.0;
	}
	public Home(String firstName, String lastName, int footage, double dwelling, double contents, double liability)
	{
		// Call parent class constructor
		super(firstName, lastName);
		
		// Initialize fields
		this.footage = footage;
		this.dwelling = dwelling;
		this.contents = contents;
		this.liability = liability;
	}
	
	// Implement parent abstract class to compute commission
	public void computeCommission() {
		commission = (liability * PERCENT1) + ((dwelling + contents) * PERCENT2);
	}
	
	// toString overridden from Object class
	@Override
	public String toString() {
		String result = "Home Policy" + '\n';
		result += "-----------" + '\n';
		result += super.toString();				// get parent toString result
		result += "Footage: " + footage + '\n';
		result += "Dwelling: " + fmt.format(dwelling) + '\n';
		result += "Contents: " + fmt.format(contents) + '\n';
		result += "Liability: " + fmt.format(liability) + '\n';
		return result;
	}
	
	// Getters and setters
	public int getFootage() {
		return footage;
	}
	public void setFootage(int footage) {
		this.footage = footage;
	}
	public double getDwelling() {
		return dwelling;
	}
	public void setDwelling(double dwelling) {
		this.dwelling = dwelling;
	}
	public double getContents() {
		return contents;
	}
	public void setContents(double contents) {
		this.contents = contents;
	}
	public double getLiability() {
		return liability;
	}
	public void setLiability(double liability) {
		this.liability = liability;
	}
}
