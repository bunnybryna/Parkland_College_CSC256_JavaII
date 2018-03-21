// Inheritance
// 
public class Rectangle2 extends Shape2 
{
	// Class fields ("Knows")
	private double width;
	private double height;
	final private double THRESHOLD = 1.0e-5;
	
	
	// Class methods ("Does")
	//
	// Constructor taking parameters to set the instance variables
	public Rectangle2(double width, double height)
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
	public Rectangle2()
	{
		super();
		this.width = 0.0;
		this.height = 0.0;
	}
	
	// Method that implements the abstract
	// method in the parent Shape class. Note
	// that Eclipse replaces a green arrow to 
	// the left with a gray arrow and instead refers to 
	// this as an "implementation", not an "overridden" method
	public void computeArea()
	{
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
	
	// equals method
	public boolean equals(Object arg0) 
	{
		// The parameter passed to this method
		// is the object to test with "this" 
		// object. In other words, when this method
		// is called, it looks like:
		// a.equals(b) where a is the "this" object
		// and b is the parameter passed to this
		// method. Since this object is of the 
		// class type "Object", we first cast it
		// into an object of our class type.
		Rectangle2 b = (Rectangle2)arg0;
		
		// Now we can implement what it means to test
		// for equality between this and the b object.
		// Let's simply return true if both the height
		// and the width are the same. Note that since
		// we are using double variables, we use the
		// technique we learned earlier to test for 
		// equality between floating point variables.
		if( Math.abs(this.height - b.height) <= THRESHOLD &&
		    Math.abs(this.width  - b.width)  <= THRESHOLD )
			return true;
		else
			return false;
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
