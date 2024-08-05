package com.actitime.testscriptslibrary;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModule {
	@Test (priority = 1, invocationCount = 3)
	public void createTask() {
		Reporter.log("createTask",true);
	}
	
	@Test (priority = 2, dependsOnMethods = "createTask")
	public void modifyTask() {
		Reporter.log("modifyTask",true);
	}
	
	@Test (priority = 2, dependsOnMethods = {"createTask","modifyTask"})
	public void deleteTask() {
		Reporter.log("deleteTask",true);
	}
}
