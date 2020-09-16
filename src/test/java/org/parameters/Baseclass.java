package org.parameters;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	
	public static WebDriver driver;
	
	public static WebDriver lunchBowser() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-workspace\\Myselenium231\\drivers\\chromedriver.exe");
		driver  = new ChromeDriver();
		
		return driver;
	}
	public static void url(String url) {
		// TODO Auto-generated method stub
		driver.get(url);
	}
	
	public static void sendkey(WebElement e2,   String data) {
		// TODO Auto-generated method stub
		e2.sendKeys(data);
	}
	public static void click(WebElement e3) {
		// TODO Auto-generated method stub
		e3.click();
	}
	public static void select1(WebElement e5,int i) {
		// TODO Auto-generated method stub
		Select s =new Select(e5);
		List<WebElement> options = s.getOptions();
		WebElement alloptions = options.get(i);
		String text = alloptions.getText();
		s.selectByVisibleText(text);
	}
	public static void maxwin() {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
	}
	
	
	
	
	
	

}
