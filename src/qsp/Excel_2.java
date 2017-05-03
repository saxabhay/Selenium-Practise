package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_2 {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream f=new FileInputStream("C:/Study/Book1.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		Cell c = wb.getSheet("Sheet1").getRow(0).getCell(0);
		String val = c.toString();
        System.out.println(val);
        c.setCellValue("admin");
        FileOutputStream fos=new FileOutputStream("C:/Study/Book1.xlsx");
        wb.write(fos);
	}

}
