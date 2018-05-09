package csc256;

public class Zero {

	public static void main(String[] args) {
		 int numerator = 10;
		 int denominator = 0;
		 System.out.println(numerator / denominator);
		 System.out.println("This text will not be printed.");

	}

}

package csc256;

import java.util.Scanner;

public class ProductCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String code;
		char zone;
		int district, valid = 0, banned = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter product code (XXX to quit): ");
		code = scan.nextLine();
		
		while (!code.equals("XXX"))
		{
			try
			{
				zone = code.charAt(9);
				district = Integer.parseInt(code.substring(3,7));
				valid++;
				// zone and district are tested only no exception is thrown
				if(zone == 'R' && district > 2000)
					banned++;
			}
			// works for both charAt and substring method
			catch(StringIndexOutOfBoundsException exception)
			{
				System.out.println("Improper code lengthL: " + code); 
			}
			// works for parseInt method
			catch(NumberFormatException exception)
			{
				System.out.println("District is not numeric: " + code);
			}
			System.out.println("Enter product code(XXX to quit):");
			code = scan.nextLine();
			
		}
		System.out.println("# of valid codes entered: " + valid);
		System.out.println("# of banned codes entered: " + banned);
		scan.close();
	}


}

package csc256;

public class ExceptionScope {

	public void level1()
	{
		System.out.println("Level 1 beginning.");
		try
		{
			level2();
		}
		catch(ArithmeticException problem)
		{
			System.out.println();
			System.out.println("The exception message is: "+ problem.getMessage());
			System.out.println();
			System.out.println("The call stack trace:");
			problem.printStackTrace();
			System.out.println();
		}
		System.out.println("Level 1 ending.");
	}
	
	public void level2()
	{
		System.out.println("Level 2 beginning.");
		level3();
		// this line was never executed, because an exception occurred had not yet been caught
		System.out.println("Level 2 ending.");
	}

	public void level3()
	{
		int numerator = 10, denominator = 0;
		System.out.println("Level 3 beginning.");
		int result = numerator / denominator ;
		// this line was never executed, because an exception occurred had not yet been caught
		System.out.println("Level 3 ending.");
	}
}

package csc256;

import java.util.Scanner;

public class CreatingExceptions {

	public static void main(String[] args) throws OutOfRangeException{
		// TODO Auto-generated method stub

		final int MIN = 25, MAX = 40;
		Scanner scan = new Scanner(System.in);
		OutOfRangeException problem = new OutOfRangeException("Input value is out of range.");
		System.out.println("Enter an integer value between " + MIN + " and " + MAX + ", invlusive: ");
		int value = scan.nextInt();
		if (value < MIN || value > MAX)
			throw problem;
		System.out.println("End of main method.");
		scan.close();
	}

}

package csc256;

import java.util.Random;
import java.io.*;

public class TestData {

	public static void main(String[] args) throws IOException {
		final int MAX = 10;
		int value;
		String fileName = "test.txt";
		PrintWriter outFile = new PrintWriter(fileName);
		Random rand = new Random();
		for (int line=1; line <=MAX; line++)
		{
			for(int num=1; num<=MAX; num++)
			{
				value = rand.nextInt(90)+10;
				outFile.print(value + " ");
			}
			outFile.println();
		}
		outFile.close();
		System.out.println("Output file has been created: " + fileName);

	}

}

