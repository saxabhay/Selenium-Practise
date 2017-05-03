package qsp;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_read {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		//open excel file
		File f=new File("C:/Study/Book1.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		
		//go to sheet 1 row 0  cell 0
		Cell c = wb.getSheet("Sheet1").getRow(0).getCell(0);
		
		// get value present in the sheet & print it
		String val = c.getStringCellValue();
        System.out.println(val);
	}

}
