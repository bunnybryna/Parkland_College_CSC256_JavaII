package csc256;

public class MagazineRack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MagazineList rack = new MagazineList();
		rack.add(new Magazine("Time"));
		rack.add(new Magazine("Woodworing Today"));
		rack.add(new Magazine("Communications of the ACM"));
		rack.add(new Magazine("House and Garden"));
		rack.add(new Magazine("GQ"));
		
		System.out.println(rack);
	}

}

package csc256;

public class Magazine {

	private String title;
	public Magazine(String newTitle)
	{
		title = newTitle;
	}
	public String toString()
	{
		return title;
	}
}

package csc256;

public class MagazineList {

	private MagazineNode list;
	
	private class MagazineNode
	{
		public Magazine magazine;
		public MagazineNode next;
		
		public MagazineNode(Magazine mag)
		{
			magazine = mag;
			next = null;
		}
	}
	
	public MagazineList()
	{
		list = null;
	}
	public void add(Magazine mag)
	{
		MagazineNode node = new MagazineNode(mag);
		MagazineNode current;
		if(list == null)
			list = node;
		else
		{
			current = list;
			while(current.next != null)
				current = current.next;
			current.next = node;
		}
	}
	public String toString()
	{
		String result = "";
		MagazineNode current = list;
		while (current != null)
		{
			result += current.magazine + "\n";
			current = current.next;
		}
		return result;
	}
}

package csc256;

import java.util.*;

public class Decode {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		Stack word = new Stack();
		String message;
		int index = 0;
		System.out.println("Enter the coded message:");
		message = scan.nextLine();
		System.out.println("The decoded message is :");
		while (index < message.length())
		{
			while (index <message.length() && message.charAt(index) != ' ')
			{
				word.push(new Character(message.charAt(index)));
				index ++;
			}
			while (!word.empty())
			{
				System.out.print(((Character)word.pop()).charValue());
			}
			System.out.print(" ");
			index ++;
		}

		System.out.println();
	}

}
