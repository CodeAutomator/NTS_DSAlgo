package utilities;
import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook; 
import org.apache.poi.ss.usermodel.WorkbookFactory;

//Excelreader class that is responsible for reading data from an Excel file. 

public class ExcelReader {
	public static int totalRow;



	/*
	 * This method getData takes the path of the Excel file and the name of the
	 * sheet as input parameters. It creates a workbook object using the WorkbookFactory.create method
	 *  by passing the Excel file, then retrieves the  sheet object by name. 
	 *After that, it calls the readSheet method to read the
	 * data from the sheet and returns a list of maps containing the data.
	 */
	
	public List<Map<String, String>> getData(String excelFilePath, String sheetName) throws EncryptedDocumentException, IOException
		{
					
					Workbook workbook = WorkbookFactory.create(new File(excelFilePath));
					Sheet sheet = workbook.getSheet(sheetName);
					workbook.close();
					return readSheet(sheet);
				
		}

	//This method takes a Sheet object as a parameter and reads the data from the sheet. 
	
	private List<Map<String, String>> readSheet(Sheet sheet) {

		Row row;
		Cell cell;

		totalRow = sheet.getLastRowNum();

		List<Map<String, String>> excelRows = new ArrayList<Map<String, String>>();

		for (int currentRow = 1; currentRow <= totalRow; currentRow++) {

			row = sheet.getRow(currentRow);

			int totalColumn = row.getLastCellNum();

			LinkedHashMap<String, String> columnMapdata = new LinkedHashMap<String, String>();

			for (int currentColumn = 0; currentColumn < totalColumn; currentColumn++) {

				cell = row.getCell(currentColumn);

				String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(currentColumn)
						.getStringCellValue();

				columnMapdata.put(columnHeaderName, cell.getStringCellValue());
			}

			excelRows.add(columnMapdata);
		}

		return excelRows;
	}
	
	//Define the countRow method:
		//This method returns the total number of rows in the Excel sheet.
	

	public int countRow() {

		return totalRow;
	}

}
