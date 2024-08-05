package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAllignment {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@role='button']/../../div[5]/a")).click();
		int x1 = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
		int x2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).getLocation().getY();
		int x3 = driver.findElement(By.xpath("(//input[@type='radio'])[3]")).getLocation().getY();
		if (x1==x2 && x1==x3) {
			System.out.println("Radio Button are alligned properly and pass");
		}
		else {
			System.out.println("Radio Button are not alligned properly and fail");
		}
		driver.close();
	}
}
