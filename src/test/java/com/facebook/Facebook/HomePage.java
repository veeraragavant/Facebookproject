package com.facebook.Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass{

	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getMy_Account() {
		return My_Account;
	}

	public WebElement getLogo() {
		return Logo;
	}

	@FindBy(xpath = "//a[text()='My Account']")
	private WebElement My_Account;
	
	@FindBy(xpath = "//img[@src=\"https://practice.automationtesting.in/wp-content/uploads/2017/01/color-logo-original.png\"]")
	private WebElement Logo;
}
