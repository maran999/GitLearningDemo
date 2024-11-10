package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmationPOM {
	public WebDriver driver;
	@FindBy(id = "order_no")
	private WebElement orderNum;
	
	@FindBy(id = "logout")
	private WebElement logoutBtn;

	
	public BookingConfirmationPOM(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	public WebElement getOrderNum() {
		return orderNum;
	}

    public WebElement getLogoutBtn() {
		return logoutBtn;
	}
}
