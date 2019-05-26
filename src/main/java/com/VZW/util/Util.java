package com.VZW.util;

import java.io.File;
import java.io.IOException;

import org.apache.maven.shared.utils.io.FileUtils;		//from apache Maven
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.VZW.base.Base;

public class Util extends Base{

	public static long pageLoadWait = 20000; 
	public static long implicitWait = 30000; 
	
// SCREENSHOT	
	public static void screenShot(WebDriver driver, String name, String status) {
		try {
			File objectFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(objectFile, new File("errorScreenshots\\" +name+".jpg"));
			System.out.println("Test status = "+status+" : Failed.  Screenshot captured");
		}
		catch (IOException e){
			e.printStackTrace();	
			System.out.println("Screenshot error"+ e.getMessage());
		}
	}	
}



//// SCREENSHOT	
////	public static void screenShot(WebDriver driver, String name, int status, Object[] obj ) {// static to access everywhere
//	public static void screenShot(WebDriver driver, String name, String status) {// static to access everywhere
//		try {
//			File objectFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(objectFile, new File("errorScreenshots\\" + name + "-" 
//					+ Arrays.toString(obj) +".jpg"));
//			System.out.println("Test status = "+status+" : Failed.  Screenshot captured");
//		}
//		catch (IOException e){
//			e.printStackTrace();	
//			System.out.println("Screenshot error"+ e.getMessage());
//		}
//	}	
//}



//	static Workbook book;
//	static Sheet sheet;
//	public static String excelPath ="C:\\Users\\Minh\\workspace\\dell.qa\\src\\main\\java\\com\\TestData\\test.xls"; 
//
//// READ FROM EXCEL POI FOR PRODUCTS and SERVICES	
//	public static Object [][] getTestData(String sheetName){
//		FileInputStream file = null;
//		try {
//			file = new FileInputStream(excelPath);
//			book=WorkbookFactory.create(file);
//		} catch (EncryptedDocumentException e) {
//			e.printStackTrace();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		sheet = book.getSheet(sheetName);
//		Object [][] data = new Object [sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
//		for (int i =0; i<sheet.getLastRowNum();i++) {
//			for (int k =0;k<sheet.getRow(0).getLastCellNum();k++) {
//				data[i][k]=sheet.getRow(i+1).getCell(k).toString();	
//			}	
//		}
//		return data;	
//	}


