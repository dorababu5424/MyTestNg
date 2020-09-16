package org.tesr;

import java.awt.AWTException;
import java.io.IOException;

import org.asset.pojousingasset;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class A extends B {

	
	public static WebDriver d = driver;
	@BeforeClass
	private void lunchbowser() throws IOException {
		// TODO Auto-generated method stub
		getdriver();
		url(excelread(1, 0));
		maxwindow();
	}
//	@AfterClass(enabled=false)
//	private void quitbowser() throws InterruptedException {
//		// TODO Auto-generated method stub
//		Thread.sleep(3000);
//		quitbower();
//	}
	
	@Test(groups="smoke")
	//login with invaild user with hard asset
	private void tc1 () throws IOException {
		// TODO Auto-generated method stub
		Pojo1 p1 = new Pojo1();
		sendkey(p1.getUsernmae(), excelread(1, 1));
		String text = p1.getUsernmae().getText();
		Assert.assertTrue(text.contains("dorbabu544"));
		sendkey(p1.getPassword(),excelread(1,2));
		click(p1.getClick());
	}
	
	@Test(groups ="sanity")
	//login with softest11
	private void tc2() throws IOException {
		// TODO Auto-generated method stub
		url(excelread(1, 0));
		Pojo1 p2 = new Pojo1();
		sendkey(p2.getUsernmae(), excelread(1, 1));
		String text1 = p2.getUsernmae().getText();
		SoftAssert s = new SoftAssert();
		s.assertTrue(text1.contains("dorababu"));
		sendkey(p2.getPassword(),excelread(1,2));
		click(p2.getClick());
		s.assertAll();
	}
	@Test(groups ="sanity")
	private void tc3() throws AWTException, IOException {
		// TODO Auto-generated method stub
		Pojo2 p3 = new Pojo2();
		select1(p3.getLocation(),2);
		select1(p3.getHotel(),2);
		select1(p3.getRoomt(), 1);
		select1(p3.getRoomno(), 1);
		keytab();
		keytab();
		keytab();
		keytab();
		keytab();
		keytab();
		keyenter();
	}
	
	
}
