import java.text.NumberFormat;

public class Home {

	// Class fields
	private final double PERCENT1 = 0.3;
	private final double PERCENT2 = 0.2;
	private String firstName, lastName;
	private int footage;
	private double dwelling;
	private double contents;
	private double liability;
	private double commission;
	protected NumberFormat fmt;
	
	// Class methods
	// Constructor
	public Home()
	{
		firstName = null;
		lastName = null;
		footage = 0;
		dwelling = 0.0;
		contents = 0.0;
		liability = 0.0;
		commission = 0.0;
		fmt = NumberFormat.getCurrencyInstance();
	}
	public Home(String firstName, String lastName, int footage, double dwelling, double contents, double liability)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.footage = footage;
		this.dwelling = dwelling;
		this.contents = contents;
		this.liability = liability;
		fmt = NumberFormat.getCurrencyInstance();
	}
	
	// Compute commission
	public void computeCommission() {
		commission = (liability * PERCENT1) + ((dwelling + contents) * PERCENT2);
	}
	
	// toString overridden from Object class
	@Override
	public String toString() {
		String result = "Home Policy" + '\n';
		result += "-----------" + '\n';
		result += "Name: " + firstName + ' ' + lastName + '\n';
		result += "Footage: " + footage + '\n';
		result += "Dwelling: " + fmt.format(dwelling) + '\n';
		result += "Contents: " + fmt.format(contents) + '\n';
		result += "Liability: " + fmt.format(liability) + '\n';
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
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
}
