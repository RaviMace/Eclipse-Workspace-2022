package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Magen");
		driver.findElement(By.name("lastname")).sendKeys("Roy");
		driver.findElement(By.name("reg_email__")).sendKeys("987654321");
		driver.findElement(By.name("reg_passwd__")).sendKeys("MR123456@");
		WebElement d = driver.findElement(By.id("day"));
		WebElement m = driver.findElement(By.id("month"));
		WebElement y = driver.findElement(By.id("year"));
		Select dd = new Select(d);
		Select mm = new Select(m);
		Select yy = new Select(y);
		dd.selectByValue("22");
		mm.selectByIndex(4);
		yy.selectByVisibleText("1994");
		WebElement gender = driver.findElement(By.xpath("//input[@name='sex']/../../../span/span[2]/input"));
		gender.click();
		driver.close();
	}

}
