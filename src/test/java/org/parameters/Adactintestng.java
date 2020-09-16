package org.parameters;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Adactintestng extends Baseclass{
	@BeforeClass
	private void lunchbowser() {
		// TODO Auto-generated method stub
		WebDriver d = lunchBowser();
		url("http://adactinhotelapp.com/");
		maxwin();
	}
	
	@Parameters({ "username ","password"})
	@Test
	private void tc1(String uname,String pass) {
		// TODO Auto-generated method stub
		pojoclass1 p1 = new pojoclass1();
		sendkey(p1.getUsername(),"username");
		sendkey(p1.getPassword(), "password");
		click(p1.getLogin());	
	}
	
	@Test
	private void tc2() {
		// TODO Auto-generated method stub
		Pojoclass2 p2 = new Pojoclass2();
		select1(p2.getLocation(), 4);
		select1(p2.getHotel(), 2);
		select1(p2.getRoomt(), 2);
		select1(p2.getRoomno(), 3);
		sendkey(p2.getCheckin(), "19/09/2020");
		sendkey(p2.getCheckou(), "20/09/2020");
		select1(p2.getRoomno(), 2);
		select1(p2.getChildroom(), 2);
		click(p2.getSubmit());
	}

	@Test
	private void tc3() {
		// TODO Auto-generated method stub
		String text = driver.getCurrentUrl();
		Assert.assertTrue(text.contains("facebook"), text);
	}
	@Test
	private void tc4() {
		// TODO Auto-generated method stub
		Pojoclass3 p3 = new Pojoclass3();
		click(p3.getRadiobutton());
		click(p3.getContinu());
	}
	
	@Test
	private void tc5(String fname,String lname, String address, String ccno,String ccv) {
		// TODO Auto-generated method stub
		
		Pojoclass4 p4 = new Pojoclass4();
		sendkey(p4.getFirstname(), fname);
		sendkey(p4.getLname(), lname);
		sendkey(p4.getAddress(), address);
		sendkey(p4.getCcno(), ccno);
		select1(p4.getCctype(), 2);
		select1(p4.getExmont(), 3);
		select1(p4.getExpyear(), 4);
		sendkey(p4.getCccvno(),ccv );
		click(p4.getBooknow());
		
		
		
		
	}
	
	
	
	
	
	

}
