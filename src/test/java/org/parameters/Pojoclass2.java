package org.parameters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojoclass2 extends Baseclass {

	public Pojoclass2() {
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
	
	@FindBy(id ="adult_room")
	private WebElement aulroom;
	
	@FindBy(id="child_room")
	private WebElement childroom;
	
	@FindBy(id="Submit")
	private WebElement submit;

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

	public WebElement getAulroom() {
		return aulroom;
	}

	public void setAulroom(WebElement aulroom) {
		this.aulroom = aulroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public void setChildroom(WebElement childroom) {
		this.childroom = childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}
	
	
	
}
