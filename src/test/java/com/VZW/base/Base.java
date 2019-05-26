package com.VZW.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;							//2 subclass of hash table communicate read/write with config.properties

import org.apache.log4j.Logger;							//12 import from Apache log4j
import org.apache.log4j.PropertyConfigurator;
import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;					//5 import Selenium WebDriver to launch web browsers
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static Properties prop;  					
	public static WebDriver driver;						
	public static Logger logger = Logger.getLogger(Base.class.getName());		
	
// READ PROPERIES FILE	
	public Base() {										//constructor
		prop = new Properties(); 						
		try {											
			FileInputStream fle=new FileInputStream		
			("C:\\Users\\Minh\\workspace\\VZWCucumberHybrid\\src\\test\\java\\com\\VZW\\config\\Config.properties");
			prop.load(fle); 							
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
// START WEBDRIVER	
	public static void startWebDriver() throws InterruptedException {   			
		String browser = prop.getProperty("browser");	
		if (browser.equalsIgnoreCase("Chrome")){		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Minh\\workspace\\VZWCucumberHybrid\\Driver\\chromedriver.exe\\");
			driver = new ChromeDriver();}	
		else if (browser.equalsIgnoreCase("FireFox")){
			System.setProperty("webdriver.gecko.driver","\\C:\\Driver\\geckodriver.exe\\");
			driver = new FirefoxDriver();}
		//driver2.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(Util.pageLoadWait, TimeUnit.SECONDS); 
	}
	
// LOG LOG4J											
	public void log() {
		String log4jPath = System.getProperty("user.dir")+"\\src\\main\\java\\log4j.properties";		
		PropertyConfigurator.configure(log4jPath);		//Allows config of log4j from external file
	}													
	
//Screenshot 
	public static void screenShot(WebDriver driver, String name, String status) throws IOException {
		File objectFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(objectFile, new File("errorScreenshots\\" +name+".jpg"));
		System.out.println("Test result = "+status+".  Screenshot captured");
	}	
}




