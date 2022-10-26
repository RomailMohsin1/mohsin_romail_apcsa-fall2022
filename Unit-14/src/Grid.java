//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String [rows][cols];
		for (int i = 0; i < rows; i ++) {
			for (int c = 0; i < cols; c++) {
				String randVal = vals[(int)(Math.random()*vals.length)];
				grid[i][c] = randVal;
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		String[] maxVal = new String[10];
		int maxCount = 0;
		int count = 0;
		for (int i = 0; i < grid.length; i ++) {
			for (int c = 0; c <vals.length; c++) {
				if (grid[i] == grid[c]) {
					count++;
				}
				if (count > maxCount) {
					maxCount = count;
					maxVal = grid[i];
				}
			}
		}
		return "Most frequent val is" + maxVal;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int c = 0; c < grid[i].length; c++) {
				if ( grid[i][c] == val) {
					count++;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		return output;
	}
}