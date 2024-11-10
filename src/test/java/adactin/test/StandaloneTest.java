package adactin.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.adactin.pom.BookHotelPOM;
import com.adactin.pom.BookingConfirmationPOM;
import com.adactin.pom.ConfirmHotelPOM;
import com.adactin.pom.LoginPOM;
import com.adactin.pom.SearchHotelPOM;
import com.resources.Base_Class;

public class StandaloneTest extends Base_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		browserLaunch("chrome");

		getUrl("https://adactinhotelapp.com/index.php");
		// Login Page
		LoginPOM login = new LoginPOM(driver);
		sendKeys(login.getUserName(), "maran123");
		sendKeys(login.getPass(), "godisgreat@1");
		click(login.getLoginBtn());

		// Search Hotel Page
		SearchHotelPOM search = new SearchHotelPOM(driver);
		dropDown(search.getLocation(), "ByValue", "Brisbane");
		dropDown(search.getHotel(), "ByIndex", "2");
		dropDown(search.getRoomType(), "ByValue", "Standard");
		dropDown(search.getNumOfRooms(), "ByIndex", "2");
		sendKeys(search.getCheckInDate(), "05/03/2024");
		sendKeys(search.getCheckOutDate(), "08/03/2024");
		dropDown(search.getNumOfAdults(), "ByIndex", "2");
		click(search.getSubmitBtn());

		// Confirm Hotel
		ConfirmHotelPOM confirm = new ConfirmHotelPOM(driver);
		click(confirm.getConfirmHotel());
		click(confirm.getContinueNxtBTN());
		
		//Book Hotel
		BookHotelPOM book = new BookHotelPOM(driver);
		sendKeys(book.getFirstName(),"Raja");
		sendKeys(book.getLastName(),"R");
		sendKeys(book.getAddress(),"No20, Aishwarya Street, chennai:87");
		sendKeys(book.getCardNum(),"8918191898178917");
		dropDown(book.getCardType(),"byindex", "4");
		dropDown(book.getExpiryMonth(), "byindex","3");
		dropDown(book.getExpiryYear(),"byindex","2");
		sendKeys(book.getCvvNum(),"321");
		click(book.getBookHotelBtn());
	
		//Booking Confirmation
		BookingConfirmationPOM bookconfirm = new BookingConfirmationPOM(driver);
		getAttribute(bookconfirm.getOrderNum(),"value");
		
		
	}

}
