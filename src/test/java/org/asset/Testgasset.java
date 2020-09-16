package org.asset;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.pojo2;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testgasset extends Baseclassusingasset {
	public static WebDriver d = driver;
	@BeforeClass
	private void lunchbowser() throws IOException {
		// TODO Auto-generated method stub
		getdriver();
		url(excelread(1, 0));
		maxwindow();
	}
	@AfterClass(enabled=false)
	private void quitbowser() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		quitbower();
	}
	
	@Test
	//login with invaild user with hard asset
	private void tc1 () throws IOException {
		// TODO Auto-generated method stub
		pojousingasset p1 = new pojousingasset();
		sendkey(p1.getUsernmae(), excelread(1, 1));
		String text = p1.getUsernmae().getText();
		Assert.assertTrue(text.contains("dorbabu544"));
		sendkey(p1.getPassword(),excelread(1,2));
		click(p1.getClick());
	}
	
	@Test
	//login with softest11
	private void tc2() throws IOException {
		// TODO Auto-generated method stub
		url(excelread(1, 0));
		pojousingasset p2 = new pojousingasset();
		sendkey(p2.getUsernmae(), excelread(1, 1));
		String text1 = p2.getUsernmae().getText();
		SoftAssert s = new SoftAssert();
		s.assertTrue(text1.contains("dorababu"));
		sendkey(p2.getPassword(),excelread(1,2));
		click(p2.getClick());
		s.assertAll();
	}
	@Test
	private void tc3() throws AWTException, IOException {
		// TODO Auto-generated method stub
		pojo2 p3 = new Pojo2();
		select1(p3.getLocation(), 3);
		select1(p3.getHotel(), 2);
		select1(p3.getRoomt(), 1);
		select1(p3.getRoomno(), 1);
		sendkey(p3.getCheckin(), excelread(1, 7));
		sendkey(p3.getCheckou(), excelread(1, 8));
		keytab();
		keytab();
		keytab();
		keyenter();
	}
	
	@Test
	private void tc4() {
		// TODO Auto-generated method stub
		pojo2 p = new pojo2();
		p.
		
	}
	
	@Test
	private void tc5() throws IOException {
		// TODO Auto-generated method stub
		pojousingasset p5 = new pojousingasset();
		sendkey(p5.getFname(), excelread(4, 0));
		sendkey(p5.getLname(), excelread(4, 1));
		sendkey(p5.getAddress(), excelread(4, 2));
		sendkey(p5.getCcnum(), "12345678912345678");
		select1(p5.getCtype(), 1);
		select1(p5.getMonth(), 2);
		select1(p5.getYear(), 3);
		sendkey(p5.getCvv(), "199");
		click(p5.getBooknow2());
	}
	
	

}
