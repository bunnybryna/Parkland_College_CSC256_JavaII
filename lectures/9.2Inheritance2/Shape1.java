// Inheritance - overriding methods
// 
// Let's return to our program to compute the areas
// of different types of shapes to study the concept
// of overriding methods. Note in our Shape1 class below
// we implement a method to compute the area. Since
// this class defines a general type of shape, there
// really isn't anything to compute, so we simply
// assign the value zero to the area instance variable.
public class Shape1 
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
	// Constructor taking a parameter to set the instance variable
	public Shape1(double area)
	{
		this.area = area;
	}
	// Empty constructor initializing the instance variable
	public Shape1()
	{
		area = 0.0;
	}
	
	// Compute the area
	public void computeArea()
	{
		System.out.println("Computing area in Shape1 class");
		
		// This is a general shape class that doesn't define
		// a specific type of shape, so we'll just initialize
		// the area to zero here.
		area = 0.0;
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
