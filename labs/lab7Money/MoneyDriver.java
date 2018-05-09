package lab7Pack;

import java.util.Scanner;

public class MoneyDriver {

	public static void main(String[] args) {
		String input;
		double amount;
		System.out.println("How much do you have: ");
		Scanner scan = new Scanner(System.in);
		input = scan.nextLine();
		// use .equals() instead of == to compare String 
		while (!input.equals("quit"))
		{
			try 
			{
				// try to convert a String to a double
				amount = Double.parseDouble(input);
				Money m = new Money(amount);
				m.Print();
			}
			catch (NumberFormatException execption)
			{
				System.out.println("EXCEPTION: Invalid input");
			}
			System.out.println("How much do you have: ");
			input = scan.nextLine();
		}
		scan.close();

	}

}
