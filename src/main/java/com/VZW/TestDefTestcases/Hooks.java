package com.VZW.TestDefTestcases;
import java.io.IOException;

import com.VZW.base.Base;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base{ 
	@Before												
	public void before() throws InterruptedException {
		logger.info("Begin Test StartWebDriver");
		startWebDriver();
	}
	
	@After 
	public void screenShotIfFailed(Scenario scenario) throws IOException {
		logger.info("End of Test");
		if(scenario.isFailed()){
			screenShot(driver,scenario.getName(),scenario.getStatus());}
			else {System.out.println("All Tests Passed, No screenshot");}	 
		driver.quit();
	}
}

