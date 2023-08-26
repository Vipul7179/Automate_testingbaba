package pages;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutility extends Baselibrary_utility {

	public static String getReaddata(String path, int rownum, int columnno)

	{
		String value = "";
		try {
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheetno = wb.getSheetAt(0);
			value = sheetno.getRow(rownum).getCell(columnno).getStringCellValue();
			System.out.println("This is  the value"+value);

		} catch (Exception e) {
			System.out.println("Issue in getReaddata" + e);
		}
		return value;

	}
}
