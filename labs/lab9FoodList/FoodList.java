package lab9Pack;

import java.util.Scanner;
import java.util.ArrayList;
import java.text.NumberFormat;
import java.util.Random;

public class FoodList {
	
	// inner class
	private class FoodNode
	{
		public Food f;
		public FoodNode next;
		public FoodNode(Food f)
		{
			this.f = f;
			this.next = null;
		}
	}
	

	// knows
	private FoodNode head;
	private int size;

	// does
	// constructors
	public FoodList()
	{
		head = null;
		size = 0;
	}
	
	public void add(Food f)
	{
		FoodNode node = new FoodNode(f);
		if (head == null)
			head = node;
		else
		{
			FoodNode tmp = head;
			while(tmp.next != null)
				tmp = tmp.next;
			tmp.next = node;
		}
		size++ ;
	}
	
	// helper method
	private Food search(String foodName)
	{
		FoodNode tmp = head;
		while(tmp != null)
		{
			//if ((tmp.f).name == n) is wrong!!!
			if ((tmp.f.name).equals(foodName))
				return tmp.f;
			tmp = tmp.next;
		}
		return null;
	}
	
	public void manualMeal()
	{
		ArrayList<Food> meal = new ArrayList<Food>();
		for (int i=0; i<3; i++)
		{
			System.out.println("Enter food name: ");
			Scanner scan = new Scanner(System.in);
			String foodName = scan.nextLine();
			// not found
			if (search(foodName) != null)
			{
				Food f = search(foodName); 
				meal.add(f);
			}
			else
			{
				System.out.println(foodName + " not in database, try again!");
				i--;
			}
		}
		System.out.println("===============================");
		System.out.println("Your selected meal");
		int totalCal = 0;
		double totalP = 0.0;
		for (Food f: meal)
		{
			System.out.println(f.name);
			totalCal += f.calorie;
			totalP += f.percent;
		}
		System.out.println("Total calorie count: " + totalCal);
		NumberFormat percentFormater = NumberFormat.getPercentInstance();
		String percentOut = percentFormater.format(totalP); 
		System.out.println("Total daily percentage: " + percentOut);
		System.out.println("===============================");		
	}
	
	public void randomMeal()
	{
		int a, b, c;
		Random ran = new Random();
		a = ran.nextInt(size);
		//System.out.println(a);
		b = ran.nextInt(size);
		//System.out.println(b);
		c = ran.nextInt(size);
		//System.out.println(c);
		ArrayList<Food> meal = new ArrayList<Food>();
		FoodNode tmp=head;
		for (int i=0; i< size; i++)
		{
			if (i == a || i == b || i == c)
				meal.add(tmp.f);
			tmp = tmp.next;
		}
		System.out.println("===============================");
		System.out.println("Your selected meal");
		int totalCal = 0;
		double totalP = 0.0;
		for (Food f: meal)
		{
			System.out.println(f.name);
			totalCal += f.calorie;
			totalP += f.percent;
		}
		System.out.println("Total calorie count: " + totalCal);
		NumberFormat percentFormater = NumberFormat.getPercentInstance();
		String percentOut = percentFormater.format(totalP); 
		System.out.println("Total daily percentage: " + percentOut);
		System.out.println("===============================");
	}
	
	public void remove(int num)
	{
		FoodNode tmp = head, prev = null;
		// if is necessary to change the head
		while (tmp != null && tmp.f.calorie > num)
		{
			//System.out.println(tmp.f + " is out");	
			tmp = tmp.next;
			size--;
		}
		head = tmp;
		//System.out.println(tmp.f + " is now the head");		
		// then go through the entire list
		while (tmp !=  null)
		{
			if ( tmp.f.calorie <= num)
			{
				prev = tmp;
				tmp = tmp.next;
			}
			else
			{
				//System.out.println(tmp.f + " is out");
				tmp = prev.next = tmp.next;
				size--;
			}
		}
	}
	
	public String toString()
	{
		String result = "";
		FoodNode tmp;
		for (tmp = head; tmp != null; tmp = tmp.next)
		{
			result += tmp.f;
			result += "\n";
		}
		return result;
	}
}
