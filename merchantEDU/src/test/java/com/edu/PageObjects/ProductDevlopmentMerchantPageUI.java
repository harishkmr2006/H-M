package com.edu.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDevlopmentMerchantPageUI extends BasePage {
	/** The driver. */
	WebDriver driver;

	public ProductDevlopmentMerchantPageUI(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// ******************** Options Tab ********************
	public WebElement get_Tab_Options() {
		return expWait.getWhenClickable(By.xpath("//a[contains(.,'Options')]"), 30);
	}

	public WebElement get_FrameLevel2_Options() {
		return expWait.getWhenClickable(By.xpath("//iframe[contains(@src,'ReceivedOptionsOverviewGridBrowserConfig')]"),
				30);
	}

	public WebElement get_FrameLevel3_Options() {
		return expWait.getWhenClickable(By.xpath("//iframe[@data-config-id='appearances-list']"), 30);
	}

	public WebElement get_FrameLevel2_OptionsBOM() {
		return expWait.getWhenClickable(By.xpath("//iframe[contains(@src,'HMTVCBOM')]"), 30);
	}

	public WebElement get_LinkoptionsTable_Options() {
		return expWait.getWhenClickable(By.xpath("//*[@class='optionGroupHeader']//a"), 30);
	}

	public WebElement get_EnterEditMode_Options() {
		return expWait.getWhenClickable(By.xpath("//*[@title='Enter edit mode']"), 30);
	}

	public WebElement get_EnterReadMode_Options() {
		return expWait.getWhenClickable(By.xpath("//*[@title='Enter read mode']"), 30);
	}

	public WebElement get_productionGroup_Options() {
		return expWait.getWhenClickable(By.id("productionGroup"), 30);
	}

	public WebElement get_productionType_Options() {
		return expWait.getWhenClickable(By.id("productionType"), 30);
	}

	public WebElement get_productionAppearance_Options() {
		return expWait.getWhenClickable(By.id("productionAppearance"), 30);
	}
	
	public WebElement get_productionAppearanceSection_Options(String app) {
		return expWait.getWhenClickable(By.xpath("//*[@id='productionAppearance']//option[text()='"+app+"']"), 30);
	}
	
	
	public WebElement get_CountryofProduction_Options() {
		return expWait.getWhenClickable(By.xpath("//*[@label='Country of Production']"), 30);
	}

	// *************** BOM ***********************
	public WebElement get_Actions_OptionsBOM() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Action']"), 30);
	}

	public WebElement get_ActionsOptions_OptionsBOM(String group) {
		return expWait.getWhenClickable(By.xpath("//li//*[contains(text(),'Add " + group + "')]"), 30);
	}

	public WebElement get_position_OptionsBOM() {
		return expWait.getWhenClickable(By.id("position"), 30);
	}

	public WebElement get_AddBUtton_OptionsBOM() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Add']"), 30);
	}

	public WebElement get_disconnect_OptionsBOM() {
		return expWait.getWhenClickable(By.xpath("//td[text()='Disconnect']"), 30);
	}
	
	public WebElement get_connect_OptionsBOM() {
		return driver.findElement(By.xpath("//td[text()='Connect']"));
		//return expWait.getWhenClickable(By.xpath("//td[text()='Connect']"), 30);
	}

	public WebElement get_OptionDisconnectImage_OptionsBOM(String appID) {
		//return expWait.getWhenVisible(By.xpath("//div[contains(.,'" + appID + "') and @id='tbrc']//img"), 30);
		return expWait.getWhenVisible(By.xpath("//tr[contains(.,'"+appID+"')]//td[contains(@oncontextmenu,'return cellctxm')]/*"), 30);

	}
	
	public WebElement get_OptionDisconnect_OptionsBOM(String appID) {
		return expWait.getWhenVisible(By.xpath("//tr[contains(.,'"+appID+"')]//td[contains(@oncontextmenu,'return cellctxm')]//input"), 30);
	}
	
	public WebElement get_OptionDisconnect_OptionsBOM2(String appID) {
		return expWait.getWhenVisible(By.xpath("//tr[contains(.,'"+appID+"')]//td[contains(@oncontextmenu,'return cellctxm')]/*"), 30);
	}
	
	
	public WebElement get_CheckboxOptionCopy(){
		return expWait.getWhenClickable(By.xpath("//table//td//*[@type='checkbox']"), 30);
	}
	
	public WebElement get_Actions_OptionCopy(){
		return expWait.getWhenClickable(By.xpath("//*[text()='Actions']"), 30);
	}
	
	public WebElement get_OptionByCopy_CheckboxOptionCopy(){
		return expWait.getWhenClickable(By.xpath("//*[text()='Create Option Group (by copy)']"), 30);
	}
	
	public WebElement get_TextoptionGroupName_OptionCopy(){
		return expWait.getWhenClickable(By.id("optionGroupName"), 30);
	}
	
	public WebElement get_copyButton_OptionCopy(){
		return expWait.getWhenClickable(By.id("copyButton"), 30);
	}
	
	public WebElement get_IDTODisconnect(String appID){
		return expWait.getWhenVisible(By.xpath("//tr[contains(.,'"+appID+"')]//td[contains(@oncontextmenu,'return cellctxm')]"), 30);
	}
	
}
