
public class PolyInterfaceDriver1 {

	public static void main(String[] args) {
	
		// Create dog and cat objects
		PolyInterfaceDog dog = new PolyInterfaceDog();
		PolyInterfaceCat cat = new PolyInterfaceCat();
		
		// Demonstrate polymorphism with interfaces
		
		// Interface reference variable
		PolyInterfaceSpeaking speak;
		
		// Store address of dog object
		speak = dog;
		
		// Calls dog's speak method
		speak.speak();
		
		// Store address of cat object
		speak = cat;
		
		// Calls cat's speak method
		speak.speak();
		
		// Notice how different invocations of the 
		// same method (speak.speak()) from the 
		// interface reference variable resulted in
		// different results! 
		// This is polymorphism!
	}

}
