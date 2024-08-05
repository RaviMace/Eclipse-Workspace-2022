package com.testng.testannotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BankingApplication {
	
	@Test(priority = 1,enabled = false)
	public void launchApplication() {
		System.out.println("Applicaton is launched");
		//WebDriver driver = new ChromeDriver();
		//String actTitle = driver.getTitle();
		//String expTitle = "Demo Site – Registration Form – NxtGen A.I Academy";
		//if(actTitle.equals(expTitle)) {
			//System.out.println("Both the act and exp are same");
			//System.out.println("The title of the page is "+actTitle);
		//}
		//else {
			//System.out.println("Bothe the act and exp are not same");
			//System.out.println("Act is "+actTitle);
			//System.out.println("Exp is "+expTitle);
		//}
		
		//Assert.assertEquals(actTitle, expTitle,"Title is not same");
		Assert.assertEquals("Page Title","Page Title");
	}

	@Test(priority  = 2)
	public void userLogin() {
		System.out.println("Successful login");
		Assert.assertEquals("Login","Login");
	}

	@Test(priority = 3)
	public void checkSavingAccountBalance() {
		System.out.println("Saving account balance is displayed");
		Assert.assertEquals("Saving Account","Saving Account");
	}

	@Test(priority = 4)
	public void checkCurrentAccoutnBalance() {
		System.out.println("Current accoutn balance is displayed");
		Assert.assertEquals("Current Account","Current Account");
	}

	@Test(priority = 5)
	public void logout() {
		System.out.println("logout successfully");
		Assert.assertEquals("Logout","Logout");
	}

	@Test(priority = 6)
	public void closeApplication() {
		System.out.println("Applicaton is closed");
	}
}
