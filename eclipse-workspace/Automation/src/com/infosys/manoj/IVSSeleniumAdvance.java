package com.infosys.manoj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IVSSeleniumAdvance extends OpenBrowser{
	@Test
	public void openApplication () throws EncryptedDocumentException, IOException {
		List<WebElement> hyperLinks = driver.findElements(By.xpath("//a"));
		int numberOfHyperlinks = hyperLinks.size();
		System.out.println(numberOfHyperlinks);
		WebElement findText = driver.findElement(By.linkText("Movies in the city"));
		String extText = findText.getText();
		String actText = "Movies in the city";
		if (extText.equals(actText)) {
			System.out.println("Movies in the city is present on the home page");
		} else {
			System.out.println("Movies in the city is not present on the home page");
		}
		findText.click();
		// I dont know what to print in Upcoming movies you have figure it out.
		// Then lick the that offer link (create that yourslf)
		FileInputStream  fis = new FileInputStream("./home/user/Desktop/user_repo/To_Participant/AdditionalSuppliedFiles/Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet("Offers").getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.id("Paste the id")).sendKeys(data);
		int count = 0; //dont know what is present in that page. So you count using same List function for that
		wb.getSheet("Offers").getRow(1).getCell(4).setCellValue(count);
		FileOutputStream fos = new FileOutputStream("./home/user/Desktop/user_repo/To_Participant/AdditionalSuppliedFiles/Data.xlsx");
		wb.write(fos);
		wb.close();
		driver.findElement(By.id("")).click();
		TakesScreenshot t =(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/ss.png");
		FileUtils.copyFile(src, dest);
	}
}
