package Maven.Project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.PageObjectManager.PageObjectManager;
import com.properties.FileReaderManager;

public class Runner extends BaseClass {
	
	public static WebDriver driver = launchbrowser("chrome");
	
	public static PageObjectManager pom = new PageObjectManager(driver);
	
	public static void main(String[] args) throws IOException {
		
		
		String url = FileReaderManager.getInstanceFMR().getInstanceCR().getUrl();
		
		gettingUrl(url);
		
		//Login Page
		
		//WebElement username = driver.findElement(By.id("username"));
		
		//LoginPage lp = new LoginPage(driver); // Page object model
		
		String username = FileReaderManager.getInstanceFMR().getInstanceCR().getUsername();
		
		passInput(pom.getInstanceLogin().getUser(), username);		
		
		
		//WebElement password = driver.findElement(By.id("password"));
		
		String password = FileReaderManager.getInstanceFMR().getInstanceCR().getPassword();
		
		passInput(pom.getInstanceLogin().getPass(), password);
		
		//Login
		//WebElement loginbutton = driver.findElement(By.id("login"));
		
		clickOnElement(pom.getInstanceLogin().getLogin());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Search Hotel Page
		//Location
		
		String location = FileReaderManager.getInstanceFMR().getInstanceCR().getLocation();
		
		selectByValue(pom.getSearchHotelPage().getLocation(), location);
		
		//Hotels
		
		selectByIndex(pom.getSearchHotelPage().getHotels() , 3);
		
		//Room Type
		
		selectByIndex( pom.getSearchHotelPage().getRoomtype() , 4);
		
		//Number of rooms

		selectByIndex(pom.getSearchHotelPage().getRoomnumber(), 1);
		
		//Check In date
		
		String checkindate = FileReaderManager.getInstanceFMR().getInstanceCR().getCheckInDate();
		
		passInput(pom.getSearchHotelPage().getDatein(), checkindate);
		
		//Check out date
		
		String checkoutdate = FileReaderManager.getInstanceFMR().getInstanceCR().getCheckOutDate();
		
		passInput(pom.getSearchHotelPage().getDateout(), checkoutdate);
		
		//Adults per room
		
		selectByIndex(pom.getSearchHotelPage().getAdultroom(), 2);
		
		//Childern per room
		
		selectByIndex(pom.getSearchHotelPage().getChildroom(), 1);
		
		//Search
		
		clickOnElement(pom.getSearchHotelPage().getSubmit());
		
		//Search Hotel Page 2
		
		clickOnElement(pom.getSearchHotelPage().getRadiobutton());
		
		clickOnElement(pom.getSearchHotelPage().getContinue());
		
		//Book a hotel page 3
		
		String firstname = FileReaderManager.getInstanceFMR().getInstanceCR().getFirstName();
		
		passInput(pom.getSearchHotelPage3().getFirstname(), firstname);
		
		String lastname = FileReaderManager.getInstanceFMR().getInstanceCR().getLastName();
		
		passInput(pom.getSearchHotelPage3().getLastname(), lastname);
		
		String address = FileReaderManager.getInstanceFMR().getInstanceCR().getAddress();
		
		passInput(pom.getSearchHotelPage3().getAddress(), address);
		
		String ccnum = FileReaderManager.getInstanceFMR().getInstanceCR().getCcnum();
		
		passInput(pom.getSearchHotelPage3().getCcnum(), ccnum);
		
		//Credit card
		
		selectByIndex(pom.getSearchHotelPage3().getCctype(), 1);
		
		//select Month
		
		selectByIndex(pom.getSearchHotelPage3().getCcexpmonth(), 12);
		
		//Select Year
		
		selectByIndex(pom.getSearchHotelPage3().getCcexpyear(), 12);
		
		String cccvv = FileReaderManager.getInstanceFMR().getInstanceCR().cccvv();
		
		passInput(pom.getSearchHotelPage3().getCccvv(), cccvv);
				
		
		//book
		
		clickOnElement(pom.getSearchHotelPage3().getBooknow());
		
		//itinerary
		
		driver.findElement(By.id("my_itinerary")).click();

	}


	

}
