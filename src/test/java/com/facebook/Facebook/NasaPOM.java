package com.facebook.Facebook;

import org.apache.commons.collections4.functors.IfClosure;
import org.openqa.selenium.WebDriver;

public class NasaPOM extends BaseClass{

	public NasaPOM(WebDriver driver) {
		this.driver=driver;
	}
	private NasaHomePage nasahomepage;
	public NasaHomePage getNasahomepage() {
		if (nasahomepage==null) {
			nasahomepage=new NasaHomePage(driver);
		}
	
	return nasahomepage;
	
}
}