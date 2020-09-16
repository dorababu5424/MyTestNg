package org.parameters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojoclass4 extends Baseclass {
	public Pojoclass4() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement  firstname;
	
	@FindBy(id = "last_name")
	private WebElement lname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement ccno;
	
	@FindBy(id="cc_type")
	private WebElement cctype;
	
	
	@FindBy(id="cc_exp_month")
	private WebElement exmont;
	
	@FindBy(id="cc_exp_year")
	private WebElement expyear;
	
	
	@FindBy(id="cc_cvv")
	private WebElement cccvno;
	
	
	@FindBy(id="book_now")
	private WebElement booknow;


	public WebElement getFirstname() {
		return firstname;
	}


	public void setFirstname(WebElement firstname) {
		this.firstname = firstname;
	}


	public WebElement getLname() {
		return lname;
	}


	public void setLname(WebElement lname) {
		this.lname = lname;
	}


	public WebElement getAddress() {
		return address;
	}


	public void setAddress(WebElement address) {
		this.address = address;
	}


	public WebElement getCcno() {
		return ccno;
	}


	public void setCcno(WebElement ccno) {
		this.ccno = ccno;
	}


	public WebElement getCctype() {
		return cctype;
	}


	public void setCctype(WebElement cctype) {
		this.cctype = cctype;
	}


	public WebElement getExmont() {
		return exmont;
	}


	public void setExmont(WebElement exmont) {
		this.exmont = exmont;
	}


	public WebElement getExpyear() {
		return expyear;
	}


	public void setExpyear(WebElement expyear) {
		this.expyear = expyear;
	}


	public WebElement getCccvno() {
		return cccvno;
	}


	public void setCccvno(WebElement cccvno) {
		this.cccvno = cccvno;
	}


	public WebElement getBooknow() {
		return booknow;
	}


	public void setBooknow(WebElement booknow) {
		this.booknow = booknow;
	}
	
	
	
	
	

}
