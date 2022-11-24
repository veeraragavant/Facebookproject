package com.facebook.Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NasaHomePage extends BaseClass{

	public NasaHomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLogo() {
		return logo;
	}

	@FindBy(xpath = "(//img[@src=\"/sites/all/themes/custom/nasatwo/images/nasa-logo.svg\"])[1]")
	private WebElement logo;
	
}
