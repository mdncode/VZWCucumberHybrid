package test;
import org.junit.Assert;

import com.VZW.PageObjectClasses.Page4;
import com.VZW.base.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
public class TEST4Test extends Base{

//4.login correct (use Dynamic elements this time)	
	Page4 objectPage4 = new Page4(); 
	@Given("^loginPageExists4$")
	public void loginPageExists4()	{
		logger.info("Step4.1 verifyLoginPageExists4");
		objectPage4.launchWebsite();}
	
	@Then("^enterCorrectLogin$")
	public void enterCorrectLogin()	{
		logger.info("Step4.2 enterCorrectLogin");
		objectPage4.correctLogin();}

	@Then("^verifyLoginScreenshotIfFailed4$")
	public void verifyLoginScreenshotIfFailed4() {
		logger.info("Step4.3 verifyLoginResult4");
		boolean bool = objectPage4.verifyLogin();
		System.out.println("Assertion = "+ bool);
		Assert.assertTrue(bool); 
	}
}

