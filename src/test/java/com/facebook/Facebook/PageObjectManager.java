package com.facebook.Facebook;

import org.openqa.selenium.WebDriver;

public class PageObjectManager extends BaseClass{

	public PageObjectManager(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	private HomePage HomePage;

	public HomePage getHomePage() {
		if (HomePage==null) {
		HomePage=new HomePage(driver)	;
		}
		return HomePage;
	}
    
	
	private My_Account myaccount;

	public My_Account getMyaccount() {
		if (myaccount==null) {
			myaccount = new My_Account(driver);
		}
	
	return myaccount;
	}
	
}

