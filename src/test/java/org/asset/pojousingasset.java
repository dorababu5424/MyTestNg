package org.asset;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class pojousingasset extends Baseclassusingasset {
	
	public pojousingasset() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id=	"username")
	private WebElement usernmae;
	
	@FindBy (id ="password")
	private WebElement password;

	@FindBy(xpath="//input[@id = 'login']")
	private WebElement click;
	
	
	
	
	@FindBy(id="first_name")
	private WebElement fname;
	
	@FindBy(id="last_name")
	private WebElement lname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement ccnum;
	
	@FindBy(id="cc_type")
	private WebElement ctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement month;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement booknow2;
	
	public WebElement getBooknow2() {
		return booknow2;
	}

	public void setBooknow2(WebElement booknow2) {
		this.booknow2 = booknow2;
	}

	

	public WebElement getUsernmae() {
		return usernmae;
	}

	public void setUsernmae(WebElement usernmae) {
		this.usernmae = usernmae;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getClick() {
		return click;
	}

	public void setClick(WebElement click) {
		this.click = click;
	}

	

	public WebElement getFname() {
		return fname;
	}

	public void setFname(WebElement fname) {
		this.fname = fname;
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

	public WebElement getCcnum() {
		return ccnum;
	}

	public void setCcnum(WebElement ccnum) {
		this.ccnum = ccnum;
	}

	public WebElement getCtype() {
		return ctype;
	}

	public void setCtype(WebElement ctype) {
		this.ctype = ctype;
	}

	public WebElement getMonth() {
		return month;
	}

	public void setMonth(WebElement month) {
		this.month = month;
	}

	public WebElement getYear() {
		return year;
	}

	public void setYear(WebElement year) {
		this.year = year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public void setCvv(WebElement cvv) {
		this.cvv = cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public void setBooknow(WebElement booknow) {
		this.booknow = booknow;
	}

	@FindBy(id="book_now")
	private WebElement booknow;

}
