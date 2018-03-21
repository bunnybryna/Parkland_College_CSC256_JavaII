// Inheritance - overriding methods
// 
// Let's return to our program to compute the areas
// of different types of shapes to study the concept
// of overriding methods. Below we create different 
// types of shape objects and call the method to
// compute the area. Note that when this method is invoked 
// from a child object, the method in the child class
// is called. When this method is invoked during
// from a parent object, the method in the parent is called.
//
// Base class - Shape1.java
// Derived classes - Rectangle1.java, Triangle1.java
//
public class Shape1Driver {

	public static void main(String[] args) {

		// Create a Shape shape, compute area
		Shape1 s = new Shape1();
		s.computeArea();
		System.out.println(s);
		
		// Create a Rectangle shape, set dimensions, compute area
		Rectangle1 r = new Rectangle1();
		r.setHeight(4.0);
		r.setWidth(5.0);
		r.computeArea();
		System.out.println(r);
		
		// Create a Triangle shape, set dimensions, compute area
		Triangle1 t = new Triangle1();
		t.setBase(3.0);
		t.setHeight(2.0);
		t.computeArea();
		System.out.println(t);
	}
}
