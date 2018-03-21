// Inheritance - overriding methods
// 
// Let's return to our program to compute the areas
// of different types of shapes to study the concept
// of overriding methods. Note in our Rectangle1 class 
// below we implement a method named EXACTLY the same
// as the method that is in our base (parent) class, Shape1.
// The name of the method is the same, the return
// type is the same, and the parameters passed to 
// the method (in this case, no parameters) are the
// same. When all of these things are the same, we
// say that the two methods have the same "signature".
// When a child class implements a method with the
// same "signature" as the parent class, the child 
// "overrides" the method in the parent class. When
// this method is invoked during program execution
// from a child object, the method in the child class
// will be called. When this method is invoked during
// program execution from a parent object, the method
// in the parent class will be called. In our overriden
// "computeArea" method below, we compute the area
// of a Rectangle1 and thus "override" this method
// from the Shape1 class. Note the green arrow to 
// the left that Eclipse places on the line of the
// method declaration. This is an indication that the
// method is overriding a method in the parent class.
// Note we've removed computing the area from the
// constructor for this example. Instead we compute
// it only when we call the computeArea method.
public class Rectangle1 extends Shape1 
{
	// Class fields ("Knows")
	private double width;
	private double height;
	
	
	// Class methods ("Does")
	//
	// Constructor taking parameters to set the instance variables
	public Rectangle1(double width, double height)
	{
		// Note "super" in inherited classes refers to the 
		// parent, base, or superclass. In our case, "super" refers to
		// the Shape class. We can use "super" below to call the
		// constructor of the Shape class. In this case, we simply 
		// call the Shape's empty constructor to allow it to initialize. 
		// Note since this constructor doesn't require arguments it is 
		// called automatically, but we include it anyway to remind us
		// that this is occurring.
		super();
		
		// Next, the parameter values are stored in the instance variables
		this.width = width;
		this.height = height;
	}
	// Empty constructor initializing the instance variables
	public Rectangle1()
	{
		super();
		this.width = 0.0;
		this.height = 0.0;
	}
	
	// Overriden method to compute the area
	public void computeArea()
	{
		System.out.println("Computing area in Rectangle1 class");
		
		// Compute the area of a rectangle
		this.area = this.width * this.height;
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
		return shapeString + "width: " + width + "\nheight: " + height + "\n";
	}
}
