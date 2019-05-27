package test;
import org.junit.Assert;

import com.VZW.PageObjectClasses.Page789;
import com.VZW.base.Base;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Test789Test extends Base{

//7.Select Galaxy S10+
	Page789 object789 = new Page789(); 
	
	@Given("^smartphonesPageExists$")
	public void smartphonesPageExists()	{
		logger.info("Step7 smartphonesPageExists");
		object789.launchWebsite();}
	
	@When("^selectGalaxy10SPlus$")
	public void selectGalaxy10SPlus()	{
		logger.info("Step7.2 selectGalaxy10SPlus");
		object789.selectS10Plus();}

//8.Pick flamingo pink	
	@And("^pickColor$")
	public void pickColor() throws InterruptedException {
		logger.info("Step8 pickColor");
		object789.selectColor();}
	
//9.Add to cart	
	@And("^addtoCart$")
	public void addtoCart() throws InterruptedException {
		logger.info("Step9 addToCart");
		object789.addtoCart();}	
	
	@Then("^verifyResult789$")
	public void verifyResult789() {
		logger.info("Step9 VerifyResult789");
		boolean bool = object789.verifyResult();
		System.out.println("Assertion = "+ bool);
		Assert.assertTrue(bool); 
	}	
}









