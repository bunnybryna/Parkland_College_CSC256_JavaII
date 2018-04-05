package textbook10;

public class Firm {

	public static void main(String[] args) {
		Staff personnel = new Staff();
		personnel.payday();
	}

}

package textbook10;


public class Staff {
	private StaffMember[] staffList;
	
	public Staff()
	{
		staffList = new StaffMember[6];
		staffList[0] = new Executive("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
		staffList[1] = new Employee("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15);
		staffList[2] = new Employee("Woody", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23);
		staffList[3] = new Hourly("Diane", "678 Fifth Ave.", "555-0690", "958-47-3625", 10.55);
		staffList[4] = new Volunteer("Norm", "987 Suds Blvd.", "555-8374");
		staffList[5] = new Volunteer("Cliff", "321 Duds Lane", "555-7282");
		
		((Executive)staffList[0]).awardBonus(500.00);
		((Hourly)staffList[3]).addHours(40);
	}
	
	public void payday()
	{
		double amount;
		for (int count = 0; count < staffList.length; count ++)
		{
			System.out.println(staffList[count]);
			amount = staffList[count].pay();
			if (amount == 0.0)
				System.out.println("Thanks!");
			else
				System.out.println("Paid: " + amount);
			System.out.println("---------------------------------");
		}
	}

}

package textbook10;

public abstract class StaffMember {
	protected String name;
	protected String address;
	protected String phone;
	
	public StaffMember(String eName, String eAddress, String ePhone)
	{
		name = eName;
		address = eAddress;
		phone = ePhone;
	}
	
	public String toString()
	{
		String result = "Name: " + name + "\n";
		result += "Adress: " + address + "\n";
		result += "Phone: " + phone;
		return result;
	}
	
	public abstract double pay();

}

package textbook10;

public class Volunteer extends StaffMember {
	public Volunteer(String eName, String eAddress, String ePhone)
	{
		super(eName, eAddress, ePhone);
	}
	public double pay()
	{
		return 0.0;
	}

}
package textbook10;

public class Employee extends StaffMember{
	protected String socialSecurityNumber;
	protected double payRate;
	
	public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate)
	{
		super(eName, eAddress, ePhone);
		socialSecurityNumber = socSecNumber;
		payRate = rate;
	}
	
	public String toString()
	{
		String result = super.toString();
		result += "\nSocial Security Number: " + socialSecurityNumber;
		return result;
	}
	public double pay()
	{
		return payRate;
	}

}


package textbook10;

public class Hourly extends Employee {
	private int hoursWorked;
	public Hourly(String eName, String eAddress, String ePhone, String socSecNumber, double rate)
	{
		super(eName, eAddress, ePhone, socSecNumber, rate);
		hoursWorked = 0;
	}
	public void addHours(int moreHours)
	{
		hoursWorked += moreHours;
	}
	public double pay()
	{
		double payment = payRate * hoursWorked;
		hoursWorked = 0;
		return payment;
	}
	public String toString()
	{
		String result = super.toString();
		result += "\nCurrent hours: " + hoursWorked;
		return result;
	}

}

package textbook10;

public class Executive extends Employee {
	private double bonus;
	
	public Executive(String eName, String eAddress, String ePhone, String socSecNumber, double rate)
	{
		super(eName, eAddress, ePhone, socSecNumber, rate);
		bonus = 0;
	}

	public void awardBonus(double execBonus)
	{
		bonus = execBonus;
	}
	public double pay()
	{
		double payment = super.pay() + bonus;
		
		bonus = 0;
		return payment;
	}
}


public class PhoneList
{
    public static void main(String[] args)
    {
        Contact[] friends = new Contact[8];
        friends[0] = new Contact("John", "Smith", "610-55-7384");
        friends[1] = new Contact("Sarah", "Barnes", "215-555-3827");
        friends[2] = new Contact("Mark", "Riley", "733-555-2969");
        
        sorting.selectionSort(friends);
        for (Contact friend : friend)
            System.out.println(friend);
    }
}


public class Sorting 
{
    public static void selectionSort(Comparable<Object>[] list)
    {
        int min;
        Comparable<Object> temp;
        for (int index = 0;index < list.length-1; index ++)
        {
            min = index;
            for (int scan = index + 1; scan < list.length; scan ++)
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }
    
    public static void insertionSort(Comparable<Object>[] list)
    {
        for (int index = 1; index < list.length; index++)
        {
            Comparable<Object> key = list[index];
            int position = index;
            while (position > 0 && key.compareTo(list[position-1]) < 0)
            {
                list[position] = list[position-1];
                position--;
            }
            list[position] = key;
        }
    }
}


    

public class Contact implements Comparable
{
    private String firstName, lastName, phone;
    
    public Contact(String first, String last, String telephone)
    {
        firstName = first;
        lastName = last;
        phone = telephone;
    }
    public String toString()
    {
        return lastName + ", " + firstName + "\t" + phone;
    }
    public boolean equals(Object other)
    {
        return (lastName.equals(((Contact)other).getLastName()) && firstName.equals(((Contact)other).getFirstName()));
    }
    public int compareTo(Object other)
    {
        int result;
        String otherFirst = ((Contact)other).getFirstName();
        String otherLast = ((Contact)other).getLastName();
        if (lastName.equals(otherLast))
            result = firstName.compareTo(otherFirst);
        else
            result = lastName.compareTo(otherLast);
        return result;
    }
    
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }
    
}        


package textbook10;

public class PhoneList2 {

	public static void main(String[] args) {
		Contact test, found;
		Contact[] friends = new Contact[8];
		friends[0] = new Contact("J", "S", "610");
		friends[1] = new Contact("S", "B", "215");
		friends[2] = new Contact("M", "R", "733");
		friends[3] = new Contact("L", "G", "663");
		friends[4] = new Contact("L", "S", "464");
		friends[5] = new Contact("F", "P", "322");
		friends[6] = new Contact("M", "G", "804");
		friends[7] = new Contact("M", "G", "243");		
	
		test = new Contact("F", "P", "");
		found = (Contact)Searching.linearSearch(friends, test);
		if(found!=null)
			System.out.println("Found: " + found);
		else
			System.out.println("The contact was not found.");
		System.out.println();
		Sorting.selectionSort(friends);
		test = new Contact("M", "G", "");
		found = (Contact)Searching.binarySearch(friends, test);
		if(found != null)
			System.out.println("Found: " + found);
		else
			System.out.println("The contact was not found.");
	}

}

package textbook10;

public class Searching  {
	public static Comparable linearSearch(Comparable[] list, Comparable target)
	{
		int index = 0;
		boolean found = false;
		while (!found && index < list.length)
		{
			if(list[index].compareTo(target) == 0)
				found = true;
			else
				index++;
		}
		if (found)
			return list[index];
		else
			return null;
	}

	public static Comparable binarySearch(Comparable[] list, Comparable target)
	{
		int min = 0, max = list.length - 1, mid = 0;
		boolean found = false;
		while (!found && min <= max)
		{
			mid = (min + max) / 2;
			if (list[mid].compareTo(target) == 0)
				found = true;
			else
				if (target.compareTo(list[mid]) < 0)
					max = mid - 1;
				else
					min = mid + 1;
		}
		if(found)
			return list[mid];
		else
			return null;
	}

}

