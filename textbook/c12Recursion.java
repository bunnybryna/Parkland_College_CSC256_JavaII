package csc256;

public class MazeSearch {

	public static void main(String[] args) {
		Maze labyrinth  = new Maze();
		System.out.println(labyrinth);
		if(labyrinth.traverse(0,0))
			System.out.println("The maze was succesffully traversed!");
		else
			System.out.println("There is no possible path.");
		System.out.println(labyrinth);

	}

}
package csc256;

public class Maze {
	private final int TRIED = 3;
	private final int PATH = 7;
	
	private int[][] grid = { {1,1,1,0,1,1,0,0,0,1,1,1,1},
							 {1,0,1,1,1,0,1,1,1,1,0,0,1},
							 {0,0,0,0,1,0,1,0,1,0,1,0,0},
							 {1,1,1,0,1,1,1,0,1,0,1,1,1},
							 {1,0,1,0,0,0,0,1,1,1,0,0,1},
							 {1,0,1,1,1,1,1,1,0,1,1,1,1},
							 {1,0,0,0,0,0,0,0,0,0,0,0,0},
							 {1,1,1,1,1,1,1,1,1,1,1,1,1} };
	
	public boolean traverse(int row, int column)
	{
		boolean done = false;
		if(valid(row, column))
		{
			grid[row][column] = TRIED;
			if (row == grid.length-1 && column == grid[0].length-1)
				done = true;
			else
			{
				// down
				done = traverse(row+1, column);
				// right
				if(!done)
					done = traverse(row, column+1);
				// up
				if(!done)
					done = traverse(row-1, column);
				// left
				if(!done)
					done = traverse(row, column-1);
			}
			if (done)
				grid[row][column] = PATH;

		}
		return done;
	}
		
	private boolean valid(int row, int column)
		{
			boolean result = false;
			if (row >= 0 && row <grid.length && column >= 0 && column < grid[row].length)
				if (grid[row][column] == 1)
					result = true;
			return result;
		}
		
	public String toString()
		{
			String result = "\n";
			for (int row=0; row< grid.length; row++)
			{
				for (int column = 0;column < grid[row].length;column++)
				{
					result += grid[row][column] + "";
				}
				result += "\n";
			}
			return result;
		}
}

package csc256;

public class SolveTowers {

	public static void main(String[] args) {
		TowersOfHanoi towers = new TowersOfHanoi(4);
		towers.solve();

	}

}

package csc256;

public class TowersOfHanoi {

	private int totalDisks;
	
	public TowersOfHanoi(int disks)
	{
		totalDisks = disks;
	}
	public void solve()
	{
		moveTower(totalDisks, 1, 3, 2);
	}
	private void moveTower(int numDisks, int start, int end, int temp)
	{
		if (numDisks == 1)
			moveOneDisk(start, end);
		else
		{
			moveTower(numDisks-1, start, temp, end);
			moveOneDisk(start, end);
			moveTower(numDisks-1, temp, end, start);
		}
	}
	
	private void moveOneDisk(int start, int end)
	{
		System.out.println("Move one disk from " + start + " to " + end);
	}
}

