package com.actitime.testscriptslibrary;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.gerericlibrary.BaseClassAnn;

public class CustomerModuleAnn extends BaseClassAnn {
	@Test (groups = {"smokeTest","regressionTest"})
	public void createCustomer() {
		Reporter.log("createCustomer",true);
		Assert.fail();
	}
	
	@Test (groups = "regressionTest")
	public void modifyCustomer() {
		Reporter.log("modifyCustomer",true);
	}
	
	@Test (groups = "regressionTest")
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}
}
