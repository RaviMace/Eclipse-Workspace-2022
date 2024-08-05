package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelSheet {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream  fis = new FileInputStream("./data/testscripts.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet("Customers").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data);
	}

}
