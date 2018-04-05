// Suppose we are designing a racing program where different
// kinds of vehicles move differently during a race.
// In our design of different vehicle types (e.g. Car, Bike),
// we realize that we have the same method names under 
// what each class "does" (e.g start, stop, forward, reverse).
// When we have operations (functionality) that we know several 
// different classes may implement, we can use a construct in
// Java known as an "interface". An interface simply contains
// a list of operations describing some kind of functionality
// The list is simply the method header WITHOUT a method body
// of statements. We call such a method an "abstract" method.  
// The actual body of statements to put in the method to 
// "implement" the operation is done in the class that uses
// such an interface. When a class uses an interface, we say
// it "implements" the "interface". Below is an example of 
// an interface defining functionality describing how a 
// vehicle would move. Note there are no method bodies, only
// the method headers followed by a semi-colon. All of these
// methods are "abstract" and we could optionally include
// the "abstract" keyword if we'd like as shown below although
// by default all methods in an interface are abstract.

public interface Moveable {
	
	public abstract boolean start();
	public abstract void stop();
	public abstract void forward(double speed);
	public abstract void reverse();
	
}
