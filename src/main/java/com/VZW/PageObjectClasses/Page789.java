package com.VZW.PageObjectClasses;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.VZW.base.Base;
import com.VZW.util.Util;
public class Page789 extends Base{	

//7.Select Galaxy S10+
	public void launchWebsite() {driver.get(prop.getProperty("url789"));
	driver.manage().timeouts().pageLoadTimeout(Util.pageLoadWait, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait (Util.implicitWait, TimeUnit.SECONDS);}

	public void selectS10Plus() {	
		((JavascriptExecutor) driver).executeScript ("scroll(0,2200)");
		driver.findElement(By.xpath("//*[@id=\"tile_dev11280050\"]/div/div[2]/div/div/div/div[1]/img")).click();
	}
//8.Pick flamingo pink		
	public void selectColor() {	
		driver.findElement(By.xpath("//*[@id=\"tile_container\"]/div[1]/div[2]/div/div/div[2]/div/div/div[1]/div/div[6]/div")).click();
	}
//9.Add to cart		
	public void addtoCart() throws InterruptedException {		
		((JavascriptExecutor) driver).executeScript ("scroll(0,1200)");
		driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();	
	}
	public boolean verifyResult() {
		return driver.findElement(By.xpath("//h2[text()='Confirm Your Location']")).isDisplayed();}	
}


//10.confirm location
//11.click new customer
//12.want to use current number? no
//13.bottom, next
//14.would trade in? no
//15.total mobile
//16.next
//17.next
//18.above

