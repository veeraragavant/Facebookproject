package com.facebook.Facebook;

import java.io.IOException;

import org.openqa.selenium.support.ui.ISelect;

public class Automationtesting1  extends BaseClass {
	
	static PageObjectManager pom = new PageObjectManager(driver);
	
    public static void main(String[] args) throws IOException, InterruptedException {
		
    	BrowserLaunch("chrome");
    	windowmax();
    	Thread.sleep(4000);
    	getUrl(Readxl(4, 0));
    	
    	System.out.println("Page Opened Exactly :"+ elementisdisplayed(pom.getHomePage().getLogo()));
    	
    	elementclick(pom.getHomePage().getMy_Account());
    	System.out.println("Page Opened Exactly :"+ elementisdisplayed(pom.getMyaccount().getLogo2()));
    	
    	elementsend(pom.getMyaccount().getUserName(), Read_property().get("Username2"));
    	elementsend(pom.getMyaccount().getPassWord(), Read_property().get("Password2"));
    	elementclick(pom.getMyaccount().getButton());
    	
    	String text = pom.getMyaccount().getErrormsg().getText();
    	boolean contains = text.contains(Read_property().get("Error"));
    	System.out.println("IS WEBSITE REPORT SUCCESS :" + contains);
//   	System.out.println(text);   	
//    	System.out.println("Validation Completed");
//    	
	}
	
}
 