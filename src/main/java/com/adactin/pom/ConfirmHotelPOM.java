package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmHotelPOM {
     public WebDriver driver;
	
	public ConfirmHotelPOM(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement confirmHotel;
	
	
	@FindBy(id = "continue")
	private WebElement continueNxtBTN;
	
	public WebElement getContinueNxtBTN() {
		return continueNxtBTN;
	}

	public WebElement getConfirmHotel() {
		return confirmHotel;
	}
	
	
}
