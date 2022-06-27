package Utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readExcel(String fileName) throws IOException {
		
		XSSFWorkbook wbook = new XSSFWorkbook("./Data/" + fileName + ".xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		int rowNum = sheet.getLastRowNum();
		short cellNum = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowNum][cellNum];
		
		for(int i=1; i<=rowNum; i++)
		{
			XSSFRow row = sheet.getRow(i); 
			for (int j = 0; j < cellNum; j++) 
			{
				XSSFCell cell = row.getCell(j);
				DataFormatter df = new DataFormatter();
				String value = df.formatCellValue(cell);
				data[i-1][j] = value;
			
			}
		}
		
	wbook.close();
	return data;
	
	}
	
}
