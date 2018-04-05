// A racing program where different kinds of vehicles 
// move differently during a race.

public class RacingDriver {
	
	public static void main(String[] args) {

		// Create a bike and test moving it
		Bike b = new Bike(2,32.5);
		System.out.println("===========");
		System.out.println("Moving bike");
		System.out.println("===========");
		b.start();
		b.reverse();
		b.forward(25);
		b.stop();
		
		// Create a car and test moving it
		Car c = new Car(6);
		System.out.println("==========");
		System.out.println("Moving car");
		System.out.println("==========");
		c.start();
		c.reverse();
		c.forward(55);
		c.stop();
	}
}
