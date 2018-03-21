package lab1Pack;

import java.util.Scanner;
import java.util.ArrayList;

public class CommissionCalculator {

	// knows
	private ArrayList<Insurance> policies;
    
    
    // constructor
    public CommissionCalculator()
    {
    	policies = new ArrayList<Insurance>();
    }
    
    
    // does
    public void run()
    {
        int option;
        
        do
        {
        System.out.println();	
        System.out.println("-----------------------------");
        System.out.println("Welcome to Parkland Insurance");
        System.out.println("-----------------------------");
        System.out.println("Enter any of the following:");
        System.out.println("\t1) Enter auto insurance policy information");
        System.out.println("\t2) Enter home insurance policy information");
        System.out.println("\t3) Enter life insurance policy information");
        System.out.println("\t4) Print all sales entered");
        System.out.println("\t5) Quit");
        
        Scanner scan = new Scanner(System.in);
        option = scan.nextInt();
        // Consume newline left-over
        scan.nextLine(); 
        switch(option)
            {
                case 1:
                {
                    Insurance ai = new AutoInsurance();
                	String theName, theModel;
                    double theLiability, theCollison;
                    System.out.println("Enter the name of insured: ");
                    theName = scan.nextLine();
                    //System.out.println("name is " + theName);
                    ai.setName(theName);
                    
                    System.out.println("Enter the make and model of automobile: ");
                    theModel = scan.nextLine();
                    // cast into an AutoInsurance referece to invoke setModel method
                    ((AutoInsurance)ai).setModel(theModel);
                    
                    System.out.println("Enter the amount of liability coverage in dollars: ");
                    theLiability = scan.nextDouble();
                    ((AutoInsurance)ai).setLiability(theLiability);
                    
                    System.out.println("Enter the amount of collision coverage in dollars: ");
                    theCollison = scan.nextDouble();
                    ((AutoInsurance)ai).setCollision(theCollison);
                    
                    policies.add(ai);
                    
                    break;
                }
                case 2:
                {
                    Insurance hi = new HomeInsurance();
                	String theName;
                    double theFootage, theDwelling, theContents, theLiability;
                    
                    System.out.println("Enter the name of insured: ");
                    theName = scan.nextLine();
                    hi.setName(theName);
                    
                    System.out.println("Enter the house square footage: ");
                    theFootage = scan.nextDouble();
                    ((HomeInsurance)hi).setFootage(theFootage);
                    
                    System.out.println("Enter the amount of dwelling coverage in dollars: ");
                    theDwelling = scan.nextDouble();
                    ((HomeInsurance)hi).setDwelling(theDwelling);
                    
                    System.out.println("Enter the amount of contents coverage in dollars: ");
                    theContents = scan.nextDouble();
                    ((HomeInsurance)hi).setContents(theContents);
                    
                    System.out.println("Enter the amount of liability coverage in dollars: ");
                    theLiability = scan.nextDouble();
                    ((HomeInsurance)hi).setLiability(theLiability);
                    
                    policies.add(hi);
                    
                    break;
                }
                case 3:
                {
                    Insurance li = new LifeInsurance();
                	String theName;
                    int theAge;
                    double theLife;
                    
                    System.out.println("Enter the name of insured: ");
                    theName = scan.nextLine();
                    li.setName(theName);
                    
                    System.out.println("Enter the age of insured: ");
                    theAge = scan.nextInt();
                    ((LifeInsurance)li).setAge(theAge);
                    
                    System.out.println("Enter the  amount of term life coverage in dollars: "); 
                    theLife = scan.nextDouble();
                    ((LifeInsurance)li).setLife(theLife);
                    
                    policies.add(li);
                    
                    break;
                    
                }
                case 4:
                {
                	for (Insurance i : policies)
                	{
                		//System.out.println(i.getCommission());
                		System.out.print(i);
                		System.out.println("");
                		System.out.println("-----------------------------");
                	}
                	break;
                }
                case 5:
                {
                    scan.close();
                	break;
                }
                default:
                    System.out.println("Choice must be a value between 1 and 7.");
                
            }    
               
        }while (option != 5);
        System.out.println("Thank you for using Parkland Insurance!");
    	
    }
}
