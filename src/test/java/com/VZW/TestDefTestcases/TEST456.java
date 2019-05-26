package com.VZW.TestDefTestcases;
import com.VZW.PageObjectClasses.Page456;
import com.VZW.base.Base;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
public class TEST456 extends Base{

//4.login correct (use Dynamic elements this time)
	Page456 object456 = new Page456(); 
	
	@Given("^loginPageExists456$")
	public void loginPageExists456()	{
		logger.info("Step4.1 verifyLoginPageExists456");
		object456.launchWebsite();}
	
	@When("^enterCorrectLogin456$")
	public void enterCorrectLogin456()	{
		logger.info("Step4.2 enterCorrectLogin456");
		object456.correctLogin();}

//	@When("^verifyLoginScreenshotIfFailed456$")
//	public void verifyLoginScreenshotIfFailed456() {
//		logger.info("Step4.3 verifyLoginResult456");
//		boolean bool = object456.verifyLogin();
//		System.out.println("Assertion = "+ bool);
//		Assert.assertTrue(bool); 
//	}
	
//5. go to wireless
	@When("^gotoWireless$")
	public void gotoWireless() throws InterruptedException {
		logger.info("Step5 gotoWireless");
		object456.clickWireless();}
	
//6.Go to Phones, select Smartphones
	@And("^selectSmartphones$")
	public void selectSmartphones() throws InterruptedException {
		logger.info("Step6 selectSmartphones");
		object456.clickSmartphones();}	
	
	@And("^verifyResult456$")
	public void verifyResult456() {
		logger.info("Step6 verifyResult456");
		object456.verifyResult();}	
}




