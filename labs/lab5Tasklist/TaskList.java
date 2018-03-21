package lab5Pack;

import java.util.ArrayList;

public class TaskList {

	public static void main(String[] args) {
		ArrayList<Task> taskList = new ArrayList<Task>();
		Task t1 = new Task("Make a to-do list");
		taskList.add(t1);
		Task t2 = new Task("Check off first thing on the list");
		taskList.add(t2);
		Task t3 = new Task("Realize you've accomplished 2 things on the list");
		taskList.add(t3);
		Task t4 = new Task("Reward yourself with a nap");
		taskList.add(t4);
		Task t5 = new Task("Wake up");
		taskList.add(t5);
		for (Task t : taskList)
		{
			int n = (int) (Math.random()* 5 ) + 1;
			t.setPriority(n);			
		}
		System.out.println("Priority Task List");
		System.out.println("-----------------------------------------------");
		for (Task t : taskList)
		{
			System.out.println(t);			
		}

	}

}
