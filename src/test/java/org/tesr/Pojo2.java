
package org.tesr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.BaseClass;

public class Pojo2 extends B {
	
	public Pojo2() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="location")
	private WebElement location;

	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomt;
	
	@FindBy(id="room_nos")
	private WebElement roomno;
	
	@FindBy(id="datepick_in")
	private WebElement checkin;
	
	@FindBy(id="datepick_out")
	private WebElement checkou;

	public WebElement getLocation() {
		return location;
	}

	public void setLocation(WebElement location) {
		this.location = location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public void setHotel(WebElement hotel) {
		this.hotel = hotel;
	}

	public WebElement getRoomt() {
		return roomt;
	}

	public void setRoomt(WebElement roomt) {
		this.roomt = roomt;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public void setRoomno(WebElement roomno) {
		this.roomno = roomno;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public void setCheckin(WebElement checkin) {
		this.checkin = checkin;
	}

	public WebElement getCheckou() {
		return checkou;
	}

	public void setCheckou(WebElement checkou) {
		this.checkou = checkou;
	}
	
	
}
