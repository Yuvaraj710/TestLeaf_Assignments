package week5.day2.assignment;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RealExcel {

	public static String[][] readExcel(String fileName) throws IOException {
		
		XSSFWorkbook wbook = new XSSFWorkbook("./Data/"+fileName+".xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[lastRowNum][lastCellNum];
		
		for(int i=1; i<=lastRowNum; i++)
		{
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0; j<lastCellNum; j++)
			{
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				data[i-1][j] = value;
				
			}
			
	    }
		
	wbook.close();
	return data;
	
	}
}
