package com.VZW.PageObjectClasses;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.VZW.base.Base;
import com.VZW.util.Util;
public class Page456 extends Base{

//4.Positive Login with Dynamic Xpath	
	public void launchWebsite() {driver.get(prop.getProperty("urlMain"));
	driver.manage().timeouts().pageLoadTimeout(Util.pageLoadWait, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait (Util.implicitWait, TimeUnit.SECONDS);}
	
	public void correctLogin() {
		driver.switchTo().frame(0);	
		driver.findElement(By.xpath("//*[@id='login-submit']//preceding::input[4]")).sendKeys("michael.minhtf@gmail.com");
		driver.findElement(By.xpath("//*[@id='login-submit']//preceding::input[3]")).sendKeys("michael123#");
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
	}
	
	public boolean verifyLogin() {
		return driver.findElement(By.xpath("//h3[text()='My Verizon Dashboard']")).isDisplayed();}
	
//5. go to wireless
	public void clickWireless() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"vgn_wireless\"]/span")).click();}	

//6.Go to Phones, select Smartphones
	public void clickSmartphones() throws InterruptedException {
	Actions actions = new Actions(driver);
	actions.moveToElement(driver.findElement
		(By.xpath("//span[@href='https://www.verizonwireless.com/smartphones/']"))).build().perform();	//go together	
	driver.findElement(By.xpath("//a[@href='https://www.verizonwireless.com/smartphones/']")).click();
	}	
	
	public boolean verifyResult() {						//both work
//		return driver.findElement(By.xpath("//*[@id=\"main-message\"]/h1/span")).isDisplayed();}	
		return driver.findElement(By.xpath("//span[text()='This page isn’t working']")).isDisplayed();}	

}



