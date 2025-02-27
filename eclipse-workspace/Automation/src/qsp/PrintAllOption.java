package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///D:/Selenium Class files/Hotel.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrListBox);
		List<WebElement> allOption = s.getOptions();
		for (WebElement op : allOption) {
			String text = op.getText();
			System.out.println(text);
		}	
		driver.close();
	}
}
