package org.tesr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo1 extends B {
	public Pojo1() {
		
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id=	"username")
	private WebElement usernmae;
	
	@FindBy (id ="password")
	private WebElement password;

	@FindBy(xpath="//input[@id = 'login']")
	private WebElement click;

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
	

}
