package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private int rows = 20;
	private int cols = 12;
	private int [][] arrayOfStuff = new int[rows][cols];
	public String processCommand(String command)
	{
		return null;
	}

	@Override
	public int getRows()
	{
		return this.rows;
	}

	@Override
	public int getCols()
	{
		return this.cols;
	}

	@Override
	public Cell getCell(Location loc)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGridText()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
