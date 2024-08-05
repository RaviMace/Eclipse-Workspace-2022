package com.actitime.testscriptslibrary;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.gerericlibrary.BaseClassList;

@Listeners(com.actitime.gerericlibrary.ListenerImplementation.class)
public class CustomerModuleList extends BaseClassList {
	@Test 
	public void createCustomer() throws InterruptedException {
		Reporter.log("createCustomer",true);
		Assert.fail();
		 
	}
}
