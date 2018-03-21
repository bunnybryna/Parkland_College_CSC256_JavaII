// Inheritance
//
// Let's return to our program to compute the areas
// of different types of shapes to study more concepts
// involving inheritance. In Java all classes derive 
// from a single class named "Object". Each time we
// we create a class and do not derive it from another 
// class, the default parent is the Object class. As such, 
// there are methods in this Object class that we can and 
// often should override to make our class more robust. 
//
// toString method
//
// One of the methods we can (and have been) overriding
// in the Object class is the toString method. This method in 
// the Object class simply prints the name of the class 
// followed by a unique id. To see what this looks like, 
// simply comment the toString method in this Shape class
// and the other classes we've derived from the Shape
// class (e.g. Rectangle, Triangle) and try printing 
// out the objects. You should see something like:
//		Shape2@8dc8569
//		Rectangle2@64c3c749
//		Triangle2@6bbc4459
//
// equals method
//
// In addition to the toString method, the Object has 
// another method called "equals" which we should override 
// in order to properly test for equality between two 
// objects created from a class we develop. The method in 
// the Object class simply compares the addresses of two
// objects returning true if they are the same and false
// if they are different. To test for equality between
// two objects, you'll typically want to test for 
// equality between values of some of the instance
// variables, not the addresses where the objects live.
// It is completely up to the class designer to determine
// how to implement the test for equality. Consider, for
// example, our Rectangle class. Instead of using the default 
// Object method, we'll override the equals method. We will
// NOT, however, override this method in the Triangle class.
// As a result, look closely at the consequences in our
// example driver below.
//
// Abstract classes
//
// We also investigate the use of designing abstract
// classes with abstract methods as discussed below.
//
public class Shape2Driver {

	public static void main(String[] args) {

		// Create Rectangle objects and test for equality
		// Note that we have overridden the equals method
		Rectangle2 r1 = new Rectangle2(4,5);
		Rectangle2 r2 = new Rectangle2(4,5);
		Rectangle2 r3 = new Rectangle2(3,4);
		System.out.println("r1.equals(r2): " + r1.equals(r2));
		System.out.println("r1.equals(r3): " + r1.equals(r3));
		
		// Create Triangle objects and test for equality
		// Note that we have NOT overriden the equals method
		// Since we have NOT overriden the equals method
		// for the Triangle class, although it appears that
		// t1 and t2 would be equal, the result is false
		// since the default Object method simply compares
		// the address of t1 and the address of t2. Since 
		// they are different objects, their addresses will
		// be different and return false.
		Triangle2 t1 = new Triangle2(4,5);
		Triangle2 t2 = new Triangle2(4,5);
		Triangle2 t3 = new Triangle2(3,4);
		System.out.println("t1.equals(t2): " + t1.equals(t2));
		System.out.println("t1.equals(t3): " + t1.equals(t3));

		
		// Abstract classes
		//
		// When a class is abstract as our Shape class,
		// it often doesn't make sense to create objects
		// of this class type since some of its methods
		// are abstract and wouldn't perform any function
		// for us. For example, consider creating an object
		// of the Shape type below.
		Shape s1 = new Shape();
		// Although we can call methods that are not
		// abstract, such as the toString method
		System.out.println("s1:\n" + s1);
		// We CANNOT invoke an abstract method.
		// Note that if we did, Eclipse would give 
		// an error that this method is undefined.
		//s1.computeArea();
		
		// It is useful, on the other hand, to create
		// objects of types that are not abstract such
		// as our Rectangle and Triangle classes. Below
		// we create a Rectangle object and compute the area
		// using the abstract method defined in the Shape
		// class and overridden in the Rectangle class
		Rectangle2 r4 = new Rectangle2(4,5);
		r4.computeArea();
		System.out.println("r4:\n" + r4);
		
		// Create a Triangle object and compute the area
		// using the abstract method defined in the Shape
		// class and overriden in the Triangle class
		Triangle2 t4 = new Triangle2(4,5);
		t4.computeArea();
		System.out.println("t4:\n" + t4);
	}
}
