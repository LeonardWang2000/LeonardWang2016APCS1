package textExcel;

public class EmptyCell implements Cell {
	//emptycell returns empty strings for the cells
	public String abbreviatedCellText() {
		return "";
	}

	@Override
	public String fullCellText() {
		return "";
	}

}