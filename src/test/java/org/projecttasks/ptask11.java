package org.projecttasks;

import java.awt.RenderingHints.Key;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ptask11 {
	
	public static WebDriver driver;
	@BeforeClass
	private void getbowser () {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-workspace\\Myselenium231\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	
	@Test
	private void tc1() {
		// TODO Auto-generated method stub
		WebElement serch = driver.findElement(By.id("twotabsearchtextbox"));
		serch.sendKeys("iphone 11",Keys.ENTER);
//		WebElement clic = driver.findElement(By.xpath("//input[@class='nav-input']"));
//		clic.click();
	}
	
	@Test
	
	private void tc2() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		List<WebElement> iphone = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		Set<String> s1 = new TreeSet<String>();
		int size = iphone.size();
		System.out.println("count of iphones  in this page   "  + size);
		for(WebElement iphonelist : iphone) {
			String text = iphonelist.getText();
		System.out.println(text);
		}}
		@Test
		private void tc3() {
			// TODO Auto-generated method stub
			List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
			int size = price.size();
			System.out.println("count of prices for phone   "+ size);
			for(WebElement iphoneprice : price) {
				String text = iphoneprice.getText();
				System.out.println(text);
			}
		}
		
		
		
	
			
		
	
	}





	


