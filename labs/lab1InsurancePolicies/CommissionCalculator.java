package lab1Pack;

import java.util.Scanner;

public class CommissionCalculator {

	public static void main(String[] args) {
		AutoInsurance ai = new AutoInsurance();
        HomeInsurance hi = new HomeInsurance();
        LifeInsurance li = new LifeInsurance();

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
        System.out.println("\t4) Compute commission and print auto policy");
        System.out.println("\t5) Compute commission and print home policy");
        System.out.println("\t6) Compute commission and print life policy");
        System.out.println("\t7) Quit");
        
        Scanner scan = new Scanner(System.in);
        option = scan.nextInt();
        // Consume newline left-over
        scan.nextLine(); 
        switch(option)
            {
                case 1:
                {
                    String theName, theModel;
                    double theLiability, theCollison;
                    System.out.println("Enter the name of insured: ");
                    theName = scan.nextLine();
                    //System.out.println("name is " + theName);
                    ai.setName(theName);
                    
                    System.out.println("Enter the make and model of automobile: ");
                    theModel = scan.nextLine();
                    ai.setModel(theModel);
                    
                    System.out.println("Enter the amount of liability coverage in dollars: ");
                    theLiability = scan.nextDouble();
                    ai.setLiability(theLiability);
                    
                    System.out.println("Enter the amount of collision coverage in dollars: ");
                    theCollison = scan.nextDouble();
                    ai.setCollision(theCollison);
                    
                    break;
                }
                case 2:
                {
                    String theName;
                    double theFootage, theDwelling, theContents, theLiability;
                    
                    System.out.println("Enter the name of insured: ");
                    theName = scan.nextLine();
                    hi.setName(theName);
                    
                    System.out.println("Enter the house square footage: ");
                    theFootage = scan.nextDouble();
                    hi.setFootage(theFootage);
                    
                    System.out.println("Enter the amount of dwelling coverage in dollars: ");
                    theDwelling = scan.nextDouble();
                    hi.setDwelling(theDwelling);
                    
                    System.out.println("Enter the amount of contents coverage in dollars: ");
                    theContents = scan.nextDouble();
                    hi.setContents(theContents);
                    
                    System.out.println("Enter the amount of liability coverage in dollars: ");
                    theLiability = scan.nextDouble();
                    hi.setLiability(theLiability);
                    
                    break;
                }
                case 3:
                {
                    String theName;
                    int theAge;
                    double theLife;
                    
                    System.out.println("Enter the name of insured: ");
                    theName = scan.nextLine();
                    li.setName(theName);
                    
                    System.out.println("Enter the age of insured: ");
                    theAge = scan.nextInt();
                    li.setAge(theAge);
                    
                    System.out.println("Enter the  amount of term life coverage in dollars: "); 
                    theLife = scan.nextDouble();
                    li.setLife(theLife);
                    
                    break;
                    
                }
                case 4:
                {
                    System.out.println("The auto insurance commission is "+ai.getCommission());
                    System.out.print(ai);
                    break;
                }
                case 5:
                {
                    System.out.println("The home insurance commission is "+hi.getCommission());
                    System.out.print(hi);
                    break;
                }
                case 6:
                {
                    System.out.println("The life insurance commission is "+li.getCommission());
                    System.out.print(li);
                    break;
                }
                case 7:
                {
                    scan.close();
                	break;
                }
                default:
                    System.out.println("Choice must be a value between 1 and 7.");
                
            }    
               
        }while (option != 7);
        System.out.println("Thank you for using Parkland Insurance!");


	}

}


