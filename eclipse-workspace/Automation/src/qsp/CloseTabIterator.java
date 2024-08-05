package qsp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTabIterator {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allwh = driver.getWindowHandles();
		Iterator<String> itr = allwh.iterator();
		String cwh = itr.next();
		String pwh = itr.next();
		Thread.sleep(2000);
		driver.switchTo().window(cwh);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(pwh);
		driver.close();
	}

}
