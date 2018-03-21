// Polymorphism via Inheritance
//
// Note the addition of the abstract keyword in 
// the definition of the class below. This is necessary
// if we plan to design any methods in this class that
// are abstract. In our class below instead of providing
// a definition for the "computeArea" method, we make this
// method abstract since it really doesn't make sense
// to compute the area for a Shape since it depends on
// the specific type (e.g. Rectangle, Triangle). We've
// also removed the constructor that accepts an area
// since again it doesn't make sense to assign an area
// to a general Shape class.
public abstract class Shape3 
{
	// Class fields ("Knows")
	//
	// Note the visibility modifier "protected" below.
	// This is a visibility modifier providing security between
	// public and private. This modifier allows any derived class
	// access, but still restricts general public access such as users
	// of objects created from this class.
	protected double area;

	
	// Class methods ("Does")
	//
	// Empty constructor initializing the instance variable
	public Shape3()
	{
		area = 0.0;
	}
	
	// Abstract method to compute the area.
	// Note the keyword abstract and the absence
	// of a body of statements in this method.
	// This is just a "placeholder" method that
	// derived classes must override.
	public abstract void computeArea();
	
	// Below we have a simple non-abstract method
	// that prints a simple message indicating
	// the name of the class type
	public void whoAmI()
	{
		System.out.println("I'm a Shape reference variable");
	}
	
	// Getters/setters
	public double getArea() 
	{
		return this.area;
	}
	public void setArea(double area) 
	{
		this.area = area;
	}
	
	// toString method
	public String toString()
	{
		return "area: " + area + "\n";
	}
}
