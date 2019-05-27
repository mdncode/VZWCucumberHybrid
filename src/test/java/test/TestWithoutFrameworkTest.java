package test;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWithoutFrameworkTest {
	@Test
	public void Junit() {	
////1.Launch website		
//		System.setProperty("webdriver.chrome.driver","\\C:\\Driver\\chromedriver.exe\\");
//		WebDriver driver2 = new ChromeDriver(); 
//		driver2.get("https://www.verizonwireless.com/my-verizon/");
//		//driver2.manage().window().maximize();
//		driver2.manage().deleteAllCookies();
//		driver2.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
////2.FAILED LOGIN, (locate iFrame first)
//		int size = driver2.findElements(By.tagName("iframe")).size();
//		System.out.println("total iframes = "+size);
//		driver2.switchTo().frame(0);	
//		driver2.findElement(By.id("IDToken1")).sendKeys("WRONG");
//		driver2.findElement(By.name("IDToken2")).sendKeys("WRONG");
//		driver2.findElement(By.id("login-submit")).click();
//		driver2.quit();
////3.screenshot of Failed login
//
////4.login correct (use Dynamic elements this time)
//		System.setProperty("webdriver.chrome.driver","\\C:\\Driver\\chromedriver.exe\\");
//		WebDriver driver = new ChromeDriver(); 
//		driver.get("https://www.verizonwireless.com/my-verizon/");
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		
//		driver.switchTo().frame(0);	
//		driver.findElement(By.xpath("//*[@id='login-submit']//preceding::input[4]")).sendKeys("michael.minhtf@gmail.com");
//		driver.findElement(By.xpath("//*[@id='login-submit']//preceding::input[3]")).sendKeys("michael123#");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();	
//		boolean bool2=driver.findElement(By.xpath("//h3[text()='My Verizon Dashboard']")).isDisplayed();
//		System.out.println("Assertion = "+ bool2);
//		Assert.assertTrue(bool2); 
////4A. go to wireless (switch window first)
//		driver.findElement(By.xpath("//*[@id=\"vgn_wireless\"]/span")).click();	
//		driver.findElement(By.xpath("//span[@class='active-bar']")).click();	    
//		driver.findElement(By.xpath("//span[text()='Wireless']")).click();	    
////5.Go to Phones, select Smartphones
//		Actions actions = new Actions(driver);
//		actions.moveToElement(driver.findElement
//			(By.xpath("//span[@href='https://www.verizonwireless.com/smartphones/']"))).build().perform();	//go together	
//		driver.findElement(By.xpath("//a[@href='https://www.verizonwireless.com/smartphones/']")).click();
//		Thread.sleep(2000);
//		driver.quit();

//6.Select Galaxy S10+
		System.setProperty("webdriver.chrome.driver","\\C:\\Driver\\chromedriver.exe\\");
		WebDriver driver2 = new ChromeDriver(); 
		driver2.get("https://www.verizonwireless.com/smartphones/");
		driver2.manage().deleteAllCookies();
		driver2.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//String parentWindow	 = driver.getWindowHandle();
//		for(String subWindow : driver.getWindowHandles()){
//			driver.switchTo().window(subWindow);}		
		((JavascriptExecutor) driver2).executeScript ("scroll(0,2200)");
//		driver2.findElement(By.xpath("//img[@src='//ss7.vzw.com/is/image/VerizonWireless/SamsungGalaxy_S10PLUS_Blue?$png8alpha256$&hei=300&wid=280']")).click();
		driver2.findElement(By.xpath("//*[@id=\"tile_dev11280050\"]/div/div[2]/div/div/div/div[1]/img")).click();
												 //ss71.vzw.com/is/image/VerizonWireless/SamsungGalaxy_S10PLUS_Blue?$png8alpha256$&hei=300&wid=280
		//*[@id="tile_dev11280050"]/div/div[2]/div/div/div/div[1]/img
		//7.Pick flamingo pink		
		driver2.findElement(By.xpath("//*[@id=\"tile_container\"]/div[1]/div[2]/div/div/div[2]/div/div/div[1]/div/div[6]/div")).click();
//		driver.findElement(By.cssSelector("#tile_container > div.col-sm-6.col-lg-offset-2.col-lg-4 > div.deviceConfig.padTop6.padBottom24.border_bottomBlack > div > div > div.row.noSideMargin.colorStackTopPad.padTop15 > div > div > div.row.noSideMargin > div > div:nth-child(6) > div")).click();
//8.Add to cart		
		((JavascriptExecutor) driver2).executeScript ("scroll(0,1200)");
		driver2.findElement(By.xpath("//button[text()='Add to Cart']")).click();
	
		boolean bool= driver2.findElement(By.xpath("//h2[text()='Confirm Your Location']")).isDisplayed();	
		System.out.println("Assertion = "+ bool);
		Assert.assertTrue(bool); 
//		Thread.sleep(2000);
		driver2.quit();
	}
}

	







//9.confirm location
//10.click new customer
//11.want to use current number? no
//12.bottom, next
//13.would trade in? no
//14.total mobile
//15.next
//16.next
//17.above

