package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Row_Count {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream f=new FileInputStream("C:/Study/Book1.xlsx");
		Workbook wb = WorkbookFactory.create(f);
      int rc = wb.getSheet("Sheet1").getLastRowNum();
      System.out.println(rc);
	}

}
