package org.projecttasks;

import java.awt.RenderingHints.Key;
import java.sql.Driver;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.apache.poi.ss.usermodel.PrintCellComments;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.collect.Multiset.Entry;

public class Ptask1 {
	
	public static WebDriver driver;
	@BeforeClass
	private void getbowser () {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-workspace\\Myselenium231\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	
//	private void quitbowser() {
//		// TODO Auto-generated method stub
//		driver.quit();
//	}

	@Test
	
	private void tc1() {
		// TODO Auto-generated method stub
		WebElement serch = driver.findElement(By.id("twotabsearchtextbox"));
		serch.sendKeys("iphone 11");
		driver.findElement(By.className("nav-input")).click();
	}
	
	
	@Test
	private void tc2() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		List<WebElement> iphone = driver.findElements(By.xpath("class=\"a-size-medium a-color-base a-text-normal\""));
		for(WebElement iphonelist : iphone) {
			int i = iphone.size();
			System.out.println(i);
		}
		Set<WebElement> s1  = new TreeSet<WebElement>();
		s1.addAll(iphone);
		for(WebElement s2 : s1) {
			String text2 = s2.getText();
			System.out.println(text2);
		}
		
		
	}
	
	
	
}

