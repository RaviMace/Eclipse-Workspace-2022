package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PopupPolicyProgram {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.className("ui-datepicker-month"));
		Select s1 = new Select(month);
		s1.selectByValue("9");
		WebElement year = driver.findElement(By.className("ui-datepicker-year"));
		Select s2 = new Select(year);
		s2.selectByValue("1996");
		driver.findElement(By.xpath("//a[text()='4']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9444336666");
		driver.findElement(By.id("renew_policy_submit")).click();
		boolean text = driver.findElement(By.id("policynumberError")).isDisplayed();
		if (text==true) {
			System.out.println("is Displayed");
		} else {
			System.out.println("is not Displayed");
		}
		driver.close();
	}
}
