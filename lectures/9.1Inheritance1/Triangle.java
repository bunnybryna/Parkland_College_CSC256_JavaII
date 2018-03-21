// Inheritance
// 
// We can use our Shape class to create our Triangle class
// since a Triangle is a "type of" shape. We "derive" our Triangle
// class from our Shape class using the keyword "extends". This
// means that fields and methods in the Shape class are now 
// available in the Triangle class. Fields in the Shape class
// that are "protected" allow for the Triangle to have direct
// access just as if they were in the Triangle class. In addition
// to "inheriting" fields and methods from the Shape class, we add 
// other fields and methods in our Triangle class that describe 
// specifically what a Triangle should "know" and "do".
public class Triangle extends Shape 
{
	// Class fields ("Knows")
	private double base;
	private double height;
	
	
	// Class methods ("Does")
	//
	// Constructor taking parameters to set the instance variables
	public Triangle(double base, double height)
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
		
		// Next, we can compute the area of the Triangle.
		// Note how we store it in the area instance variable,
		// which because we inherited this field and it is "protected",
		// we have direct access to assign the final value.
		this.area = 0.5 * this.base * this.height;
	}
	// Empty constructor initializing the instance variables
	public Triangle()
	{
		super();
		this.base = 0.0;
		this.height = 0.0;
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
		return "Triangle:\n" + shapeString + "base: " + base + "\nheight: " + height + "\n";
	}
}
