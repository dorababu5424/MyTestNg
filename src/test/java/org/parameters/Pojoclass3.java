package org.parameters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojoclass3 extends Baseclass {

	public Pojoclass3() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id="continue")
	private WebElement continu;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public void setRadiobutton(WebElement radiobutton) {
		this.radiobutton = radiobutton;
	}

	public WebElement getContinu() {
		return continu;
	}

	public void setContinu(WebElement continu) {
		this.continu = continu;
	}
	
	
}
