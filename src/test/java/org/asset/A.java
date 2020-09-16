package org.asset;

import static org.testng.Assert.assertTrue;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class A {
	
	public static WebDriver driver;
	@BeforeClass
	private void bowserlunch() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-workspace\\Myselenium231\\drivers\\chromedriver.exe");
		driver  = new ChromeDriver();
		
	}
//
//	@AfterClass
//	private void quit() {
//		// TODO Auto-generated method stub
//		System.out.println("quit bowser");
//	}
//	
//	
//	@BeforeMethod
//	private void starttime() {
//		// TODO Auto-generated method stub
//		Date d = new Date();
//		System.err.println(d);
//	}
//	@AfterMethod
//	private void endtime() {
//		// TODO Auto-generated method stub
//		Date d = new Date();
//		System.out.println(d);
//	}
	
	@Test
	private void tc1()  {
		// TODO Auto-generated method stub
		System.out.println("test case 1");
	}
	
	//hard test
//	@Test
//	private void tc3() {
//		// TODO Auto-generated method stub
//		
//		
//		driver.get("https://www.facebook.com/");
//		String title = driver.getTitle();
//			Assert.assertTrue(title.contains("faebook"));
//			WebElement email = driver.findElement(By.id("email"));
//			email.sendKeys("dorababu");
//		System.out.println("test case 3");
//		
//		
//	}
	//softasset

	
	@Test
	private void tc2() {
		SoftAssert s = new SoftAssert();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
			s.assertTrue(title.contains("facook"));
		// TODO Auto-generated method stub
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys("dorababu");
			s.assertAll();
		System.out.println("test case 2");
		
	}
	
	


	
	
}
