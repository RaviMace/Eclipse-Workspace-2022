package com.actitime.testscriptslibrary;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {
	@Test (priority = 1, invocationCount = 3)
	public void createProject() {
		Reporter.log("createProject",true);
	}
	
	@Test (priority = 2, dependsOnMethods = "createProject")
	public void modifyProject() {
		Reporter.log("modifyProject",true);
	}
	
	@Test (priority = 2, dependsOnMethods = {"createProject","modifyProject"})
	public void deleteProject() {
		Reporter.log("deleteProject",true);
	}
}
