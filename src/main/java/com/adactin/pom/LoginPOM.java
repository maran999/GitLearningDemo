package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	public WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement userName;

	@FindBy(id = "password")
	private WebElement pass;

	@FindBy(id = "login")
	private WebElement loginBtn;

	

	public LoginPOM(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	

}
