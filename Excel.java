import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	
	
	public  ArrayList<String> getData (String test) throws IOException {
		// accepts file input stream object
		
		ArrayList<String> list= new ArrayList<String>();
		FileInputStream file = new FileInputStream("C:\\Users\\super\\Google Drive\\workspace\\SeleniumTraining\\src\\auto.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);
		// read first sheet
		int sheetCnt = workbook.getNumberOfSheets();
		for (int i = 0; i < sheetCnt; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("create")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				// Make sure you have the right column with the test case labels
				Iterator<Row> rows = sheet.iterator();
				Row first = rows.next();
				// Read each cell to find the right column
				Iterator<Cell> cell = first.cellIterator();
				int j = 0;
				int column = 0;
				while (cell.hasNext()) {
					Cell value = cell.next();

					if (value.getStringCellValue().equalsIgnoreCase("Test")) {
						column = j;
					}
					j++;
				}
				System.out.println(column);
				
				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(test) ) {
						Iterator<Cell> c = r.cellIterator();
						while ( c.hasNext() ) {
							Cell cl = c.next();
							//list.add(cl.getStringCellValue()); 
							
							  if (cl.getCellType() == CellType.STRING ) {
							  list.add(cl.getStringCellValue()); } else {
							  list.add(NumberToTextConverter.toText(cl.getNumericCellValue())); }
							 
						}
					}
				}
			}
			//System.out.println(list);
		}
		return list;
	}

	public static void main(String[] args) throws IOException {
		Excel e = new Excel();
		ArrayList<String>  data = e.getData("Test2");
		System.out.println(data.get(0));
	}

}