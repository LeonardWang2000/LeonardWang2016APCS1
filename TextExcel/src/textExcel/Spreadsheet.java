package textExcel;


public class Spreadsheet implements Grid
{
	public Spreadsheet(){
		 Cell [][] arrayOfStuff = new EmptyCell[rows][cols];
	}
	private int rows = 20;
	private int cols = 12;
	private String wholeSpreadsheet = "";
	//2d array for rows and columns
	public String processCommand(String command)
	{
		System.out.println(command);
		return command;
	}
	public int getRows()
	{
		return this.rows;
	}


	public int getCols()
	{
		return this.cols;
	}

	public Cell getCell(Location loc)
	{
		return null;
	}

	public String getGridText()
	{
		for(char a = 'A'; a < 'L'; a++){
			System.out.print(a + "          ");
		}
		for(int i = 0; i < 20; i++){
			System.out.println(i);
		}
		return wholeSpreadsheet;
		
	}
	public String cellInspection(String cell){
		SpreadsheetLocation a = new SpreadsheetLocation(cell);
		EmptyCell result = arrayOfStuff[a.getRow()][a.getCol()];
		return result + "";
	}
	public String cellAssignment(String str, Cell cell){
		(TextCell) cell = 
		SpreadsheetLocation b = new SpreadsheetLocation(cell);
		arrayOfStuff[b.getRow()][b.getCol()] = str;
	}

}
