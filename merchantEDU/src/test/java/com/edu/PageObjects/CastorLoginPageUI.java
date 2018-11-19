package com.edu.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CastorLoginPageUI extends BasePage {

	/** The driver. */
	WebDriver driver;

	
	public CastorLoginPageUI(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(id = "example")
	public WebElement Drpdwn_exm;

	@FindBy(xpath = "//*[@id='columnMain']//a")
	public List<WebElement> lnk_down;
	



	@FindBy(xpath = "//a[contains(@class,'ngCellText ') and contains(@ng-click,'navigateToSpecificStudent')]")
	public List<WebElement> lnk_studname;
	
	public WebElement get_ButtonSignIN(){
		return expWait.getWhenClickable(By.xpath("//*[@value='Log in']"), 10);
	}
	
	public WebElement get_Txt_Username(){
		return expWait.getWhenClickable(By.xpath("//*[@name='username']"), 120);
	}
	
	public WebElement get_Txt_Password(){
		return expWait.getWhenClickable(By.xpath("//*[@name='password']"), 60);
	}
	
	
	
}
