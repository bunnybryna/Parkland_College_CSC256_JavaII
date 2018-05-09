package lab8Pack;

public class RationalNumber {

	// knows
	public int numerator, denominator;
	
	// does
	// constructors
	public RationalNumber()
	{
		numerator = 0;
		denominator = 1;
	}
	public RationalNumber(int n, int d)
	{
		numerator = n;
		denominator = d;
	}
	
	// setters and getters
	public void setNumer(int n)
	{
		numerator = n;
	}
	
	public void setDenom(int d)
	{
		denominator = d;
	}
	
	public int getNumer(int n)
	{
		return numerator;
	}
	public int getDenom(int d)
	{
		return denominator;
	}
	
	public String toString()
	{
		String result;
		if (numerator == 0)
			result = "0";
		else
			if (denominator == 1)
				result = numerator + "";
			else
				result = numerator + "/" + denominator;
		return result;
	}
	/*iterative gcd 
	public int gcd(int num1, int num2)
	{
		while(num1 != num2)
			if (num1 > num2)
				num1 = num1 - num2;
			else
				num2 = num2 - num1;
		return num1;
	}*/
	public int gcd(int num1, int num2)
	{
		// base case
		if (num1 == num2)
			return num1;
		// recursive step
		else if (num1 > num2)
		{
			num1 = num1 - num2;
			// for efficiency, if one of the numbers is 1, gcd is 1
			// avoid unnecessary recursion
			if (num1 == 1)
				return 1;
			return gcd(num1, num2);
		}
		else
		{
			num2 = num2 - num1;
			if (num2 == 1)
				return 1;
			return gcd(num1, num2);
		}

	}
	
	// this way is faster :)
	public int gcd2(int num1, int num2)
	{
		if (num1 >= num2)
		{
			// base case
			if (num2 == 0)
				return num1;
			// recursive step
			else
			{
				int num3 = num1 % num2;
				return gcd2(num3, num2);
			}
		}
		else
			return gcd2(num2, num1);

	}
}
