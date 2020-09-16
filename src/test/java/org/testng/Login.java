package org.testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
	public static WebDriver driver;
@BeforeClass
	
	private void LunchBrower() {
		// TODO Auto-generated method stub
	// TODO Auto-generated method stub

	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-workspace\\Myselenium231\\drivers\\chromedriver.exe");
	driver  = new ChromeDriver();
	System.out.println("lunchbrower");
	}
@AfterClass
private void quitbrower() {
//	driver.quit();
	System.out.println("quitbrower");
}

@BeforeMethod
private void starttime() {
	// TODO Auto-generated method stub
	
	Date d = new Date();
	System.out.println(d);
}
@AfterMethod
private void endtime() {
	// TODO Auto-generated method stub
	
	Date d = new Date();
	System.out.println(d);
}
@Test
private void tc1() {
	// TODO Auto-generated method stub
	driver.get("http://adactinhotelapp.com/");
	driver.manage().window().maximize();
	System.out.println("test one");
}

}
