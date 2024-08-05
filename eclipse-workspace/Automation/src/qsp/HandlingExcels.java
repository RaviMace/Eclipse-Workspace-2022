package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcels {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/testscripts.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("Customers").getRow(1).getCell(4).setCellValue("Fail");
		FileOutputStream fos = new FileOutputStream("./data/testscripts.xlsx");
		wb.write(fos);
		wb.close();
	}

}
