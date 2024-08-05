package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\Selenium Class files\\page1.html");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("JSP");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("QSP");
		driver.close();
	}

}
