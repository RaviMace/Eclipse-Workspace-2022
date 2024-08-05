package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupConfirmation {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//li[2]//a[@class='analystic']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert a = driver.switchTo().alert();
		a.dismiss();
		boolean text = driver.findElement(By.cssSelector("p[id='demo']")).isDisplayed();
		if (text==true) {
			System.out.println("You pressed cancel text is displayed");
		} else {
			System.out.println("You pressed cancel text is not displayed");
		}
		driver.close();
	}
}
