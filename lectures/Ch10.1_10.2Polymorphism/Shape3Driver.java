import java.util.ArrayList;

// Polymorphism via Inheritance
//
// Let's return to our program to compute the areas
// of different types of shapes to study the concept
// of polymorphism using inheritance. 
//
public class Shape3Driver {

	public static void main(String[] args) {

		// To understand polymorphism, the first concept
		// we need to understand is that we can store the 
		// reference (or address) of a child (derived) object in
		// a parent (base) reference variable. 
		// Recall that when an object is created with the 'new'
		// keyword, memory is allocated at a particular 
		// address in memory. This address is then stored
		// in what we call an "object reference variable."
		// In the example below, we allocate a Rectangle
		// and store it in an object reference variable.
		// Note that we store the reference (address) of 
		// the created object in a variable of the SAME type.
		// This is what we've been doing with any type
		// of class object. Below we store the address of 
		// a Rectangle object in a Rectangle reference variable.
		Rectangle3 r1 = new Rectangle3(4, 5);
		
		// We then call methods using this reference
		// variable below as we compute the area
		// and implicitly call the 'toString' method
		// in the print statement. This is the normal 
		// way we've been working with reference
		// variables.
		r1.computeArea();
		System.out.println(r1);
		
		// As another test, we call a simple method
		// that prints the name of the class type.
		// Below, the Rectangle reference calls this method
		r1.whoAmI();
				
		// When we have classes that are inherited,
		// in addition to storing the address
		// of an object in a reference variable of
		// the same type, we can actually store the
		// address in a reference variable of the parent 
		// type, grand-parent type, or any other type
		// up the tree of our class hierarchy. Recall
		// that the Rectangle class is a child of the 
		// Shape class. Since the Rectangle is derived
		// from the base Shape type, we can store the
		// address of a Rectangle object in a Shape
		// reference variable as below.
		Shape3 s1 = new Rectangle3(3,4);
		
		// What is really interesting about storing
		// a derived object address in a base reference
		// variable is what happens when we call methods
		// using this base reference variable. To begin,
		// let's first call our test method that prints
		// the class type.
		s1.whoAmI();
	
		// Notice that the output from the statement above
		// indicates that s1 is a Rectangle reference variable
		// even though s1 is actually a Shape class type.
		// What is happening in this example is a 
		// demonstration of what is called polymorphism.
		// In this example, the Java system determines
		// as the program runs (also known as 'run-time')
		// that the Shape reference variable is actually
		// referencing a Rectangle object type. Another
		// way to say the same thing is that the Shape
		// reference variable "points to" a Rectangle
		// object in memory. When the Java system determines this
		// at run-time, we refer to this concept as
		// "dynamic binding" or "late binding" since the system 
		// associates (or 'binds') a child address as the program
		// runs (or 'dynamically') to the parent reference
		// variable. When dynamic binding occurs in this manner, 
		// we have what we call polymorphism. 
		// The reason it is called polymorphism
		// is because the Shape reference variable "acts as"
		// (or "morphs into") a Rectangle reference variable.
		// It could also take the form of a Triangle object
		// with the same demonstration below. Notice, below,
		// that we can simply store a new Triangle
		// object address in the existing Shape reference.
		s1 = new Triangle3(4, 5);
		s1.whoAmI();
		
		// When we write programs where we don't know ahead
		// of time what types of classes in a hierarchy will be 
		// created, we can leverage the concept of polymorphism.
		// Consider the computation of the areas of a variety of 
		// different types of shapes as we've been looking at in 
		// all of our recent examples. Let's imagine writing
		// a program to prompt a user to input ANY number of
		// ANY kind of shape. Our first attempt might be to
		// declare an ArrayList to store all of the different
		// types of shapes as shown below.
		ArrayList<Rectangle3> rArray = new ArrayList<Rectangle3>();
		ArrayList<Triangle3> tArray = new ArrayList<Triangle3>();
		
		// Although this would work, what would happen when we
		// later decided to add a new type of shape to our 
		// class hierarchy? The answer is we would need to 
		// modify our program and add another ArrayList. 
		// When we write programs, we want them to be scalable
		// without having to go back and re-write them when
		// we add on to a class hierarchy. More importantly,
		// within this program, we would be calling the same
		// method (computeArea) from each specific type.
		// With polymorphism, instead of storing types 
		// in individual ArrayLists above, we can simply 
		// declare ONE ArrayList of base class reference
		// variables as below.
		ArrayList<Shape3> sArray = new ArrayList<Shape3>();
		
		// As we create new shape types, we can store them 
		// in the ArrayList.
		sArray.add( new Rectangle3(4,5) );
		sArray.add( new Triangle3(5,4) );
		
		// Then instead of calling computeArea of each
		// type, we simply call the computeArea method
		// of the base type, which will, in turn, dynamically
		// refer to the type of child object and call
		// the computeArea method of this child object.
		// We can do this for all of our types created
		// using a simple for-each loop as shown. 
		// This demonstrates the power of polymorphism!
		System.out.println();
		System.out.println("Process the list of shapes:");
		for( Shape3 s : sArray )
		{
			s.whoAmI();
			s.computeArea();
			System.out.println(s);
		}
	}
}
