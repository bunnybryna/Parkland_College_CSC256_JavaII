package lab7Pack;

public class Money {

	// knows
	public double amount;

	// constructors
	public Money()
	{
		amount = 0.0;
	}
	public Money(double howmuch)
	{
		amount = howmuch;
	}
	// does
	public void Print()
	{
		System.out.println("The money is " + amount);
		String text;
		int indexOfPoint, integer, decimal, ten, five, one, quarter, dime, nickel, penny, rest;
		text = Double.toString(amount);
		indexOfPoint = text.indexOf('.');
		// slip the integer and decimal part
		integer = Integer.parseInt(text.substring(0, indexOfPoint));
		decimal = Integer.parseInt(text.substring(indexOfPoint+1,text.length()));
		// test case 0.90, nextDoulbe will read as 0.9 
		if (decimal < 10)
			decimal = decimal * 10;
		
		ten = integer / 10;
		rest = integer % 10;
		five = rest / 5;
		rest = rest % 5;
		one = rest;
		
		quarter = decimal / 25;
		rest = decimal % 25;
		dime = rest / 10;
		rest = rest % 10;
		nickel = rest / 5;
		rest = rest % 5;
		penny = rest;
		//print the amount
		//System.out.println("Integer part is " + integer);
		//System.out.println("Decimal part is " + decimal);
		System.out.println(ten + " ten dollar bils");
		System.out.println(five + " five dollar bills");
		System.out.println(one + " one dollar bils");
		System.out.println(quarter + " quarters");
		System.out.println(dime + " dimes");
		System.out.println(nickel + " nickels");
		System.out.println(penny + " pennies");
	}
}
