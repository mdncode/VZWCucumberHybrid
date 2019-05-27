package com.VZW.TestDefTestcases;

import org.junit.Assert;

import com.VZW.PageObjectClasses.Page123;
import com.VZW.base.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TEST123 extends Base{ 
//1.Launch website		
	Page123 objectPage123 = new Page123(); 
	
	@Given("^loginPageExists$")
	public void loginPageExists()	{
		logger.info("Step1 verifyLoginPageExists");
		objectPage123.launchWebsite();}
//2.FAILED LOGIN, (locate iFrame first)	
	@When("^enterWrongLogin$")
	public void enterWrongLogin()	{
		logger.info("Step2 enterWrongLogin");
		objectPage123.failLogin();}
//3.screenshot of Failed login (see base)
	@Then("^verifyLoginScreenshotIfFailed$")
	public void verifyLoginScreenshotIfFailed() {
		logger.info("Step3 verifyLoginResult");
		boolean bool = objectPage123.verifyLogin();
		System.out.println("Assertion = "+ !bool);
		Assert.assertTrue(!bool); 
	}
}

