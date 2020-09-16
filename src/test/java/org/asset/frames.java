package org.asset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-workspace\\Myselenium231\\drivers\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.get("http://www.way2automation.com/software-testing-training/software-manual-testing-training-noida.html#");
		driver.switchTo().frame("iframe");
		
		WebElement email = driver.findElement(By.xpath("[//input[text()=Your email address]"));
		email.sendKeys("dorababu@gamil.com");
	}
}
