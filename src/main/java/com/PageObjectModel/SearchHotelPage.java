package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage {
	
	public WebDriver driver;
	
	@FindBy(id ="location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnumber() {
		return roomnumber;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	public WebElement getRadiobutton() {
		
		return radiobutton;
	}
	
	public WebElement getContinue() {
		
		return Continue;
	}

	@FindBy (id = "hotels")
	private WebElement hotels;
	
	@FindBy (id = "room_type")
	private WebElement roomtype;
	
	@FindBy (id ="room_nos")
	private WebElement roomnumber;
	
	@FindBy (id = "datepick_in")
	private WebElement datein;
	
	@FindBy (id = "datepick_out")
	private WebElement dateout;
	
	@FindBy (id = "adult_room")
	private WebElement adultroom;
	
	@FindBy(id = "child_room")
	private WebElement childroom;
	
	@FindBy (id = "Submit")
	private WebElement submit;
	
	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id = "continue")
	private WebElement Continue;
	
	public SearchHotelPage(WebDriver driver1) {
		
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}

}
