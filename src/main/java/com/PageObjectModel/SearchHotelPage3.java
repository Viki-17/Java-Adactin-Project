package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage3 {
	
	public WebDriver driver;
	
	@FindBy (id = "first_name")
	private WebElement firstname;
	
	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcexpmonth() {
		return ccexpmonth;
	}

	public WebElement getCcexpyear() {
		return ccexpyear;
	}

	public WebElement getCccvv() {
		return cccvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	@FindBy (id = "last_name")
	private WebElement lastname;
	
	@FindBy (id = "address")
	private WebElement address;
	
	@FindBy (id = "cc_num")
	private WebElement ccnum;
	
	@FindBy (id = "cc_type")
	private WebElement cctype;
	
	@FindBy (id = "cc_exp_month")
	private WebElement ccexpmonth;
	
	@FindBy (id = "cc_exp_year")
	private WebElement ccexpyear;
	
	@FindBy (id = "cc_cvv")
	private WebElement cccvv;
	
	@FindBy (id = "book_now")
	private WebElement booknow;
	
	public SearchHotelPage3 (WebDriver driver1) {
		
		this.driver = driver1;
		
		PageFactory.initElements(driver, this);
	}
	
	
}
