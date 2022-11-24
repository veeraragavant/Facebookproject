package com.facebook.Facebook;

import java.io.IOException;

import org.openqa.selenium.By;

public class Day_1 extends BaseClass{

	public static void main(String[] args) throws IOException {
		
		BrowserLaunch("chrome");
		
		getUrl("https://adactinhotelapp.com/");
		
		windowmax();
		
		//webelements(driver.findElement(By.id("username")), Readxl(2, 2));
		
	    //elementclick(driver.findElement(By.xpath("//span[text()='Search']//parent::button")));
	  
	 
		
	}
	
}
