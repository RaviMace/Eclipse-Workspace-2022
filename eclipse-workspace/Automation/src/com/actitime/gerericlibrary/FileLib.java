package com.actitime.gerericlibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**.
 * This is generic class for data driven testing
 * @author Ravi
 */
public class FileLib {
	/**
	 * This is generic method for reading the data from property file
	 * @param key
	 * @return String
	 * @throws IOException
	 */
	public String getProperty(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./data/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	/**
	 * This is generic method for reading the data from excel file
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return String, integer
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelData(String sheetName, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/testscripts.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	/**
	 * This is generic method for writing the data to excel file
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void setExcelData (String sheetName, int row, int cell, String value) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/testscripts.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(value);
		FileOutputStream fos = new FileOutputStream("./data/testscripts.xlsx");
		wb.write(fos);
		wb.close();
	}
}
