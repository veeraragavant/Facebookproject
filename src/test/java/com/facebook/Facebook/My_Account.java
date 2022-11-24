package com.facebook.Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Account extends BaseClass{

	public My_Account(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	private WebElement UserName;
	
    @FindBy(id = "password")
    private WebElement PassWord;
    
    public WebElement getUserName() {
		return UserName;
	}

	public WebElement getPassWord() {
		return PassWord;
	}

	public WebElement getButton() {
		return Button;
	}

	public WebElement getLogo2() {
		return Logo2;
	}

	@FindBy(xpath = "//input[@value=\"Login\"]")
    private WebElement Button;
    
    @FindBy(xpath = "//h2[text()=\"Login\"]")
    private WebElement Logo2;
    
    public WebElement getErrormsg() {
		return errormsg;
	}

	public void setErrormsg(WebElement errormsg) {
		this.errormsg = errormsg;
	}

	@FindBy(xpath = "//strong[text()=\"Error\"]//parent::li")
    private WebElement errormsg;
}
