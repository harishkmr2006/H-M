package com.edu.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CastorHomePageUI extends BasePage{
	
	/** The driver. */
	WebDriver driver;

	
	public CastorHomePageUI(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(id = "example")
	public WebElement Drpdwn_exm;
	
	@FindBy(id = "txtProductName")
	public WebElement txtBox_ProductDevelopmentName;
	
	@FindBy(id = "owningOffice")
	public WebElement sel_owningOffice;
	
	@FindBy(id = "txtCompanyId")
	public WebElement sel_Brand;
	
	
	
	@FindBy(xpath = "//a[text()='Create']")
	public WebElement btn_Create;
	
	

	public WebElement get_Btn_ProductDevlopment(){
		return expWait.getWhenClickable(By.xpath("//*[text()='Create Product Development']"), 10);
	}
	
	public WebElement get_TopResult(String office){
		return expWait.getWhenClickable(By.xpath("//a[contains(@href,'emxTree.jsp') and contains(text(),'"+office+"')]"), 10);
	}

	public WebElement get_TopSearch(){
		return expWait.getWhenClickable(By.id("GlobalNewTEXT"), 30);
	}
	

	public WebElement get_TopSearchClose(){
		return expWait.getWhenClickable(By.id("closeTA"), 30);
	}
	
	public List<WebElement> get_TopSearchResult(){
		return expWait.getWhenVisibleList(By.xpath("//a[contains(@href,'emxTree.jsp')]"), 60);
	}
	
	
	
	
	public WebElement get_FrameLevel2(){
		return expWait.getWhenVisible(By.xpath("//*[contains(@name,'HMProductDevelopmentBuyerStartPageTabcontentFrame')]"), 90);
	}
	
	
	public WebElement get_FrameLevel3(){
		return expWait.getWhenVisible(By.xpath("//*[contains(@name,'HMProductDevelopmentBuyerStartPagecontentFrame')]"), 90);
	}
	
	
}
