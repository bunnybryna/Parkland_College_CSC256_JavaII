// Inheritance
// 
// We can use our Shape class to create our Rectangle class
// since a rectangle is a "type of" shape. We "derive" our Rectangle
// class from our Shape class using the keyword "extends". This
// means that fields and methods in the Shape class are now 
// available in the Rectangle class. Fields in the Shape class
// that are "protected" allow for the Rectangle to have direct
// access just as if they were in the Rectangle class. In addition
// to "inheriting" fields and methods from the Shape class, we add 
// other fields and methods in our Rectangle class that describe 
// specifically what a Rectangle should "know" and "do".
public class Rectangle extends Shape 
{
	// Class fields ("Knows")
	private double width;
	private double height;
	
	
	// Class methods ("Does")
	//
	// Constructor taking parameters to set the instance variables
	public Rectangle(double width, double height)
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
		this.width = width;
		this.height = height;
		
		// Next, we can compute the area of the Rectangle.
		// Note how we store it in the area instance variable,
		// which because we inherited this field and it is "protected",
		// we have direct access to assign the final value.
		this.area = this.width * this.height;
	}
	// Empty constructor initializing the instance variables
	public Rectangle()
	{
		super();
		this.width = 0.0;
		this.height = 0.0;
	}
	
	// Getters/setters
	public double getWidth() 
	{
		return width;
	}
	public void setWidth(double width) 
	{
		this.width = width;
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
		// representing the Rectangle class
		return "Rectangle:\n" + shapeString + "width: " + width + "\nheight: " + height + "\n";
	}
}
