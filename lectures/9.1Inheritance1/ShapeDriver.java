// Inheritance
//
// We test creating different types of shapes in our driver below
// Base class - Shape.java
// Derived classes - Rectangle.java, Triangle.java
//
public class ShapeDriver {

	public static void main(String[] args) {

		// Create a Rectangle shape
		Rectangle r = new Rectangle(4.0, 5.0);
		System.out.println(r);
		
		// Create a Triangle shape
		Triangle t = new Triangle(2.0,3.0);
		System.out.println(t);
	}
}
