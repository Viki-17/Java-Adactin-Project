package com.PageObjectManager;

import org.openqa.selenium.WebDriver;

import com.PageObjectModel.SearchHotelPage;
import com.PageObjectModel.SearchHotelPage3;

import Maven.Project.LoginPage;

public class PageObjectManager {
	
	public WebDriver driver;
	
	private LoginPage lp;
	
	public PageObjectManager (WebDriver driver2) {
			
		this.driver = driver2;
	}
	
	public LoginPage getInstanceLogin() {
		
		if(lp==null) {
			
			lp = new LoginPage(driver);
		}
		
		return lp;
	}
	
	private SearchHotelPage shp;
	
	public SearchHotelPage getSearchHotelPage() {
		
		if (shp==null) {
			
			shp = new SearchHotelPage(driver);
			
		}
		return shp;
	}
	
	private SearchHotelPage3 shp3;
	
	public SearchHotelPage3 getSearchHotelPage3() {
		
		if (shp3==null) {
			
			shp3 = new SearchHotelPage3(driver);
			
		}
		return shp3;
	}

}
