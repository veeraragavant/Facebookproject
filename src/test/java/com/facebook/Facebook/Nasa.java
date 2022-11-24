package com.facebook.Facebook;

import java.io.IOException;

import org.openqa.selenium.support.ui.ISelect;

public class Nasa extends BaseClass{

	static NasaPOM pom =new NasaPOM(driver);
	
	public static void main(String[] args) throws IOException {
		
		BrowserLaunch(Read_property().get("Browser"));
		getUrl(Read_property().get("URL"));
		windowmax();
		System.out.println("WebPage Opened Exactly "+ elementisdisplayed(pom.getNasahomepage().getLogo()));
	}
	
}
