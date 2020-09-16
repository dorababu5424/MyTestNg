package org.testng;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Date;

import javax.security.auth.kerberos.KeyTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Loginbase extends BaseClass {
	
	@BeforeClass
	private void lunchbower() {
		// TODO Auto-generated method stub
		WebDriver d = getdriver();
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
	private void tc1() throws IOException {
		// TODO Auto-generated method stub
		url(excelread(1, 0));
	}
	@Test
	private void tc2() {
		// TODO Auto-generated method stub
		maxwindow();
	}
	
	@Test
	private void tc3() throws IOException {
		// TODO Auto-generated method stub
		pojoclass p1 = new pojoclass();
		sendkey(p1.getUsernmae(), excelread(1,1));
		sendkey(p1.getPassword(), excelread(1, 2));
		click(p1.getClick());
	}
	
	@Test
	private void tc4() throws AWTException {
		// TODO Auto-generated method stub
		pojoclass p2 = new pojoclass();
		select1(p2.getLocation(), 2);
		select1(p2.getHotel(),2);
		select1(p2.getRoomt(), 2);
		keytab();
		keytab();
		keytab();
		keytab();
		keytab();
		keytab();
		keyenter();
		
			}
	
	@Test
	private void tc5() {
		// TODO Auto-generated method stub
		pojoclass p4 = new pojoclass();
		click(p4.getRadiobtn());
		click(p4.getContinu());
		
	}
	
	@Test
	private void tc6() throws IOException {
		// TODO Auto-generated method stub
		
	pojoclass p3 = new pojoclass();
	
	sendkey(p3.getFname(), excelread(4, 0));
	sendkey(p3.getLname(), excelread(4, 1));
	sendkey(p3.getAddress(), excelread(4, 2));
	sendkey(p3.getCcnum(),"1234567891234567");
	select1(p3.getCtype(),2);
	select1(p3.getMonth(), 3);
	select1(p3.getYear(), 4);
	sendkey(p3.getCcv().get(0), excelread(8, 4));
	click(p3.getBooknow());
	
	
		
		
	}
	
	
	
	
	
	
}
