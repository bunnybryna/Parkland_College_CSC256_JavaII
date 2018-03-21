import java.util.Scanner;

public class CommissionCalculator 
{
	// What the class knows
	// Note the use of the term "has a" in the description for this class
	// This represents the "aggregate" class relationship
	// CommissionCalculator "has a" auto, home, and life
	// As a result, we specify these class objects in what this class "knows"
	private Auto autoPolicy;
	private Home homePolicy;
	private Life lifePolicy;
	
	// What the class does
	// Constructor
	public CommissionCalculator()
	{
		// Create objects
		autoPolicy = new Auto();
		homePolicy = new Home();
		lifePolicy = new Life();
	}
	
	// Run the calculator
	public void Run()
	{
		// Scanners for input
		Scanner scanMenu = new Scanner(System.in);
		Scanner scanInput = new Scanner(System.in);
		
		// Loop until user done
		boolean done = false;
		while( !done )
		{
			// Menu
			System.out.println("-----------------------------");
			System.out.println("Welcome to Parkland Insurance");
			System.out.println("-----------------------------");
			System.out.println("Enter any of the following:");
			System.out.println("\t1) Enter auto insurance policy information");
			System.out.println("\t2) Enter home insurance policy information");
			System.out.println("\t3) Enter life insurance policy information");
			System.out.println("\t4) Compute commission and print auto policy");
			System.out.println("\t5) Compute commission and print home policy");
			System.out.println("\t6) Compute commission and print life policy");
			System.out.println("\t7) Quit");
			
			// User menu entry
			int choice = scanMenu.nextInt();
			
			// Process menu entry
			switch (choice) 
			{
			case 1:
				// Input auto information
				System.out.print("Enter first name of insured: ");
				autoPolicy.setFirstName(scanInput.next());
				System.out.print("Enter last name of insured: ");
				autoPolicy.setLastName(scanInput.next());
				System.out.print("Enter make of vehicle: ");
				autoPolicy.setMake(scanInput.next());
				System.out.print("Enter model of vehicle: ");
				autoPolicy.setModel(scanInput.next());
				System.out.print("Enter amount of liability: $");
				autoPolicy.setLiability(scanInput.nextDouble());
				System.out.print("Enter amount of collision: $");
				autoPolicy.setCollision(scanInput.nextDouble());
				break;
				
			case 2:
				// Input home information
				System.out.print("Enter first name of insured: ");
				homePolicy.setFirstName(scanInput.next());
				System.out.print("Enter last name of insured: ");
				homePolicy.setLastName(scanInput.next());
				System.out.print("Enter house square footage: ");
				homePolicy.setFootage(scanInput.nextInt());
				System.out.print("Enter amount of dwelling: $");
				homePolicy.setDwelling(scanInput.nextDouble());
				System.out.print("Enter amount of contents: $");
				homePolicy.setContents(scanInput.nextDouble());
				System.out.print("Enter amount of liability: $");
				homePolicy.setLiability(scanInput.nextDouble());
				break;
				
			case 3:
				// Input life information
				System.out.print("Enter first name of insured: ");
				lifePolicy.setFirstName(scanInput.next());
				System.out.print("Enter last name of insured: ");
				lifePolicy.setLastName(scanInput.next());
				System.out.print("Enter age of insured: ");
				lifePolicy.setAge(scanInput.nextInt());
				System.out.print("Enter amount of term: $");
				lifePolicy.setTerm(scanInput.nextDouble());
				break;
				
			case 4:
				// Compute commission and print auto policy
				autoPolicy.computeCommission();
				System.out.println(autoPolicy);
				break;
				
			case 5:
				// Compute commission and print home policy
				homePolicy.computeCommission();
				System.out.println(homePolicy);
				break;

			case 6:
				// Compute commission and print life policy
				lifePolicy.computeCommission();
				System.out.println(lifePolicy);
				break;
				
			case 7:
				done = true;
				break;
			}
		}
		
		// Close the scanners
		scanMenu.close();
		scanInput.close();
	}

	// Getters/setters
	public Auto getAutoPolicy() {
		return autoPolicy;
	}

	public void setAutoPolicy(Auto autoPolicy) {
		this.autoPolicy = autoPolicy;
	}

	public Home getHomePolicy() {
		return homePolicy;
	}

	public void setHomePolicy(Home homePolicy) {
		this.homePolicy = homePolicy;
	}

	public Life getLifePolicy() {
		return lifePolicy;
	}

	public void setLifePolicy(Life lifePolicy) {
		this.lifePolicy = lifePolicy;
	}
}
