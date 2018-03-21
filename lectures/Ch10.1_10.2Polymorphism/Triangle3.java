// Polymorphism via Inheritance
// 
public class Triangle3 extends Shape3
{
	// Class fields ("Knows")
	private double base;
	private double height;
	
	
	// Class methods ("Does")
	//
	// Constructor taking parameters to set the instance variables
	public Triangle3(double base, double height)
	{
		// Note "super" in inherited classes refers to the 
		// parent, base, or superclass. In our case, "super" refers to
		// the Shape class. We can use "super" below to call the
		// constructor of the Shape class. IIn this case, we simply 
		// call the Shape's empty constructor to allow it to initialize. 
		// Note since this constructor doesn't require arguments it is 
		// called automatically, but we include it anyway to remind us
		// that this is occurring.
		super();
		
		// Next, the parameter values are stored in the instance variables
		this.base = base;
		this.height = height;
	}
	// Empty constructor initializing the instance variables
	public Triangle3()
	{
		super();
		this.base = 0.0;
		this.height = 0.0;
	}
	
	// Method that implements the abstract
	// method in the parent Shape class. Note
	// that Eclipse replaces a green arrow to 
	// the left with a gray arrow and instead refers to 
	// this as an "implementation", not an "overridden" method
	public void computeArea()
	{
		// Compute the area of a triangle
		this.area = 0.5 * this.base * this.height;
	}

	// Below we have a simple non-abstract method
	// that prints a simple message indicating
	// the name of the class type. Note the green
	// arrow in Eclipse indicating that we are
	// overridding the base class method.
	public void whoAmI()
	{
		System.out.println("I'm a Triangle reference variable");
	}
	
	// Getters/setters
	public double getBase() 
	{
		return base;
	}
	public void setBase(double base) 
	{
		this.base = base;
	}
	public double getHeight() 
	{
		return height;
	}
	public void setHeight(double height) 
	{
		this.height = height;
	}
	
	// toString method
	public String toString()
	{
		// Note how we use "super" again to refer to the 
		// base, parent, or superclass. In this case we use it
		// to get the String from the Shape's toString method.
		String shapeString = super.toString();
		
		// We then combine it to create our final String
		// representing the Triangle class
		return shapeString + "base: " + base + "\nheight: " + height + "\n";
	}
}
