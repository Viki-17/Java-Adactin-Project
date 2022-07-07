package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	public static Properties p;
	
	public ConfigurationReader() throws IOException {
		
		File f = new File("E:\\Eclipse Java\\Project\\src\\main\\java\\com\\properties\\Adactin.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);
	}
	
	public String getUrl() {
		
		String url = p.getProperty("url");
		
		return url;
		
	}
	
	public String getUsername() {
		
		String username = p.getProperty("username");
		
		return username;
	}
	
	public String getPassword() {
		
		String password = p.getProperty("password");
		
		return password;
	}
	
	public String getLocation() {
		
		String location = p.getProperty("location");
		
		return location;
	}
	
	public String getCheckInDate() {
		
		String checkindate = p.getProperty("checkindate");
		
		return checkindate;
	}
	
	public String getCheckOutDate() {
		
		String checkoutdate = p.getProperty("checkoutdate");
		
		return checkoutdate;
	}
	
	public String getFirstName() {
		
		String firstname = p.getProperty("firstname");
		
		return firstname;
	}
	
	public String getLastName() {
		
		String lastname = p.getProperty("lastname");
		
		return lastname;
	}
	
	public String getAddress() {
		
		String address = p.getProperty("address");
		
		return address;
	}
	
	public String getCcnum() {
		
		String ccnum = p.getProperty("ccnum");
		
		return ccnum;
	}
	
	public String cccvv() {
		
		String cccvv = p.getProperty("cccvv");
		
		return cccvv;
	}

}
