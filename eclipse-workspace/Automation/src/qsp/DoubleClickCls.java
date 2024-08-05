package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickCls {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://vtiger.com");
		driver.manage().window().maximize();
		WebElement resource = driver.findElement(By.partialLinkText("Resources"));
		Actions a = new Actions(driver);
		a.moveToElement(resource).perform();
		driver.findElement(By.xpath("//a[contains(text(),'Customers')][1]")).click();
		Thread.sleep(3000);
		WebElement frs = driver.findElement(By.xpath("//a[text()='READ FULL STORY']"));
		a.doubleClick(frs).perform();
		String heading = driver.findElement(By.xpath("//h1")).getText();
		System.out.println(heading);
		driver.close();
	}
}
