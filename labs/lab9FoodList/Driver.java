package lab9Pack;

import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;

public class FoodDriver {

	public static void main(String[] args) {
		try
		{
			FileReader fr = new FileReader("test.txt");
			BufferedReader br = new BufferedReader(fr);
			
			Scanner scan = new Scanner(br);
			FoodList flist = new FoodList();
			while (scan.hasNext())
			{
				String name = scan.next();
				String group = scan.next();
				int calorie = scan.nextInt();
				double percent = scan.nextDouble();				
				Food f = new Food(name, group, calorie, percent);
				//System.out.println(f);
				flist.add(f);
			}
			br.close();
			
			int option;
	        
	        do
	        {
				System.out.println();	
				System.out.println("======================================================");
				System.out.println("Welcome to Parkland Meal Selector");
				System.out.println("======================================================");
				System.out.println("Please select from the following:");
				System.out.println("\t1) List food database");
				System.out.println("\t2) Create meal by manual selection");
				System.out.println("\t3) Create meal by random selection");
				System.out.println("\t4) Remove foods high in calorie");
				System.out.println("\t5) Exit");
				Scanner scanNew = new Scanner(System.in);
				option = scanNew.nextInt();
				// Consume newline left-over
				scanNew.nextLine(); 
				switch(option)
					{
						case 1:
						{
							System.out.println("============================================================================");
							String result = String.format("%-20s", "Name");
							result += String.format("%-20s", "Food Group");
							result += String.format("%-15s", "Calories");
							result += String.format("%-15s", "Daily Percentage");							
							System.out.println(result);
							System.out.println("============================================================================");							
							System.out.print(flist);
							break;
						}
						case 2:
						{
							flist.manualMeal();
							break;
						}
						case 3:
						{
							flist.randomMeal();
							break;
						}
						case 4:							
						{
							System.out.println("Enter calorie limit: ");
							int calorieLimit = scanNew.nextInt();
							flist.remove(calorieLimit);
							//System.out.println(flist);
							//System.out.println(flist.size);		
							break;
						}
		                case 5:
		                {
		                    scan.close();
		                	break;
		                }
		                default:
		                    System.out.println("Choice must be a value between 1 and 5.");					
					}
	                
	        } while (option!=5);
	        System.out.println("Thank you for using Parkland Meal Selector!");
		}
	            
		catch(IOException e)
		{
			System.err.println("I/O EXCEPTION: " + e.getMessage());
		}
		
		
	}


}
