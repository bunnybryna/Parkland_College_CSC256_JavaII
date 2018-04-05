package lab6Pack;

import java.util.Scanner;
public class Group {

	// knows
	private Student[] students;
	
	public Group()
	{
		students = new Student[5];
	}
	
	public void addStudent()
	{
		Scanner scan = new Scanner(System.in);
		for (int i=0;i<5;i++)
		{
			Student s = new Student();
			String first, last;
			int test;
			System.out.println();
			System.out.println("Please enter the first name: ");
			first = scan.nextLine();
			s.setFirstName(first);
			System.out.println("Please enter the last name: " );
			last = scan.nextLine();
			s.setLastName(last);
			System.out.println("Please enter the score: ");
			test = scan.nextInt();
			s.setScore(test);
			students[i] = s;
			// consume the newline left-over
	        scan.nextLine(); 
		}
		scan.close();	
	}
	
	public void sortScore()
	{
		Sorting.selectionSort(students);
	    for (Student s: students)
	          System.out.println (s);
		
	}
	
}
