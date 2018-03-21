// Inheritance
// 
// Suppose we were writing a program to compute the areas
// of different types of shapes (e.g. rectangle, triangle). In our
// design, we would recognize that a rectangle and a triangle are
// each a different "type of" shape. Or that a rectangle and a triangle
// each "is a" shape. Whenever we see "type of" or "is a" in the 
// description of our classes, we can use the object-oriented concept
// of inheritance when designing and developing our classes. Instead of
// creating a completely distinct Rectangle and Triangle class, we can
// list what each class has in common including what they "know" and what 
// they "do". Using this design, we can then create a base class that
// encapsulates what both shapes (and all shapes) know and do. In our
// example, we create a class called Shape that stores what all types
// of shapes "know" and "do".

public class Shape 
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
	public Shape(double area)
	{
		this.area = area;
	}
	// Empty constructor initializing the instance variable
	public Shape()
	{
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
