package com.edu.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CNGZProductDevlopmentMerchantPageUI extends BasePage{
	WebDriver driver;

	public CNGZProductDevlopmentMerchantPageUI(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public WebElement get_Tab_SupplierAndRequest() {
		return expWait.getWhenClickable(By.xpath("//a[contains(.,'Supplier and Request')]"), 30);
	}
	
	public WebElement get_FrameLevel2_Supplier() {
		return expWait.getWhenClickable(By.xpath("//iframe[contains(@src,'AssignedProductDevelopmentSupplierPageConfig')]"), 30);
	}
	
	public WebElement get_FrameLevel3_Supplier() {
		return expWait.getWhenClickable(By.xpath("//iframe[contains(@src,'ReceivedOptionsOverviewGridBrowserConfig')]"), 30);
	}
	
	public WebElement get_FrameLevelBOM_Supplier() {
		return expWait.getWhenClickable(By.xpath("//iframe[contains(@src,'3Aproductdevelopment')]"), 30);
	}
	
	
	public WebElement get_FrameLevelCost_Supplier() {
		return expWait.getWhenClickable(By.xpath("//iframe[contains(@src,'2FProductOptionCostInquiry')]"), 30);
	}
	
	
	
	public WebElement get_FrameLevel1_SupplierPopUp() {
		return expWait.getWhenClickable(By.xpath("//iframe[contains(@src,'2FProductOptionTopPanel')]"), 30);
	}
	
	public WebElement get_FrameLevel_SupplierPopUp() {
		return expWait.getWhenClickable(By.xpath("//iframe[contains(@src,'ApparelAccelerator&StringResourceFileId')]"), 30);
	}
	
	public WebElement get_AddSupplier_SupplierAndRequest() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Add Supplier']"), 30);
	}
	
	public WebElement get_Tab_Options() {
		return expWait.getWhenClickable(By.xpath("//a[contains(.,'Options')]"), 30);
	}
	
	public WebElement get_CheckBox_Options() {
		return expWait.getWhenClickable(By.xpath("(//div[contains(.,'Automation_Daisy_Lace')]/following-sibling::*//table//tr//td[3]//input)[1]"), 30);
	}
	
	
	public WebElement get_CheckBox_OptionsExtraLine() {
		return expWait.getWhenClickable(By.xpath("(//div[contains(.,'Automation_Daisy_Lace')]/following-sibling::*//table//tr//td[3]//input)[2]"), 30);
	}
	
	
	public WebElement get_CheckBox_OptionsExtraLineSupplier() {
		return expWait.getWhenClickable(By.xpath("(//div[contains(.,'Automation_Daisy_Lace')]/following-sibling::*//table//tr//td[4]//input)[1]"), 30);
	}
	
	public WebElement get_CreateOption_Options() {
		return expWait.getWhenClickable(By.xpath("//td[text()='Create Option']"), 30);
	}
	
	public WebElement get_edit_Options() {
		return expWait.getWhenVisible(By.xpath("//*[@title='Enter edit mode']"), 30);
	}
	
	public WebElement get_editreadmode_Options() {
		return expWait.getWhenClickable(By.xpath("//*[@title='Enter read mode']"), 30);
	}
	
	public WebElement get_SMV_Options() {
		return expWait.getWhenClickable(By.xpath(".//input[@id='minutesToProduce']"), 30);
	}
	
	
	public List<WebElement> get_CountryDropDown_Options() {
		return expWait.getWhenVisibleList(By.xpath("//select"), 30);
	}
	
	public WebElement get_CheckBox_BOM_Options() {
		return expWait.getWhenClickable(By.xpath("//input[@name='emxTableRowId']"), 30);
	}

	public WebElement get_Action_BOM_Options() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Action']"), 30);
	}
	

	public WebElement get_ActionEdit_BOM_Options() {
		return expWait.getWhenClickable(By.xpath("//li//*[text()='Edit']"), 30);
	}
	
	public WebElement get_placement_BOM_Options() {
		return expWait.getWhenClickable(By.id("placement"), 30);
	}
	
	public WebElement get_countryOfOrigin_BOM_Options() {
		return expWait.getWhenClickable(By.id("countryOfOrigin"), 30);
	}
	
	
	public WebElement get_Update_BOM_Options() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Update']"), 30);
	}
	
	public WebElement get_AddCost_Options() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Add Cost']"), 30);
	}
	
	
	
	public WebElement get_Date_OptionsCost() {
		return expWait.getWhenClickable(By.xpath("//*[@class='opdDiv notDelivery']//*[@class='ui-datepicker-trigger']"), 30);
	}
	
	
	public WebElement get_Aggregated_OptionsCost() {
		return expWait.getWhenClickable(By.xpath("//*[@id='costTypeAggregatedId']"), 30);
	}

	public WebElement get_SumTotal_OptionsCost() {
		return expWait.getWhenClickable(By.xpath("//*[@id='totalSumId']"), 30);
	}
	

	public WebElement get_SaveCost_OptionsCost() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Save Cost']"), 30);
	}
	
	

	public WebElement get_IMGLock_OptionsCost() {
		return expWait.getWhenClickable(By.xpath("//*[@id='TopPanelControl_3']/img"), 30);
	}
	
	public WebElement get_SecuredRadio() {
		return expWait.getWhenClickable(By.xpath("//*[@value='Secured']"), 30);
	}
	
	
	public WebElement get_QuotationRadio() {
		return expWait.getWhenClickable(By.xpath("//*[@value='Quotation']"), 30);
	}
	
	public WebElement get_Change() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Change']"), 30);
	}
	
	public WebElement get_Lock() {
		return expWait.getWhenClickable(By.xpath("//*[@title='Lock Option Version']"), 30);
	}
	
	public WebElement get_LockVersionNew() {
		return expWait.getWhenClickable(By.xpath("//*[@title='Create New Option Version']"), 30);
	}
	
	public WebElement get_saveButton_Handover() {
		return expWait.getWhenClickable(By.id("saveButton"), 30);
	}
	

	public WebElement get_HandoverVerify() {
		return expWait.getWhenClickable(By.xpath("(//div[contains(.,'Automation_Daisy_Lace')]/following-sibling::*//table//tr//td[3]//input)[1]/../../following-sibling::*//*[@title='Handover Received']"), 30);
	}
	
	public WebElement get_HandoverVerifyExtraLine() {
		return expWait.getWhenClickable(By.xpath("(//div[contains(.,'Automation_Daisy_Lace')]/following-sibling::*//table//tr//td[3]//input)[2]/../../following-sibling::*//*[@title='Handover Received']"), 30);
	}
	
	public WebElement get_HandoverVerifyExtraLineSupplier() {
		return expWait.getWhenClickable(By.xpath("(//div[contains(.,'Automation_Daisy_Lace')]/following-sibling::*//table//tr//td[4]//input)[1]/../../following-sibling::*//*[@title='Handover Received']"), 30);
	}
	public WebElement get_HandOverOption() {
		return expWait.getWhenClickable(By.xpath("//li//*[text()='Handover Option']"), 30);
	}
	
	public WebElement get_ProductionDropDown(){
		return expWait.getWhenClickable(By.xpath("//*[text()='Country of Production']/following-sibling::*/select"), 30);
	}
	
	public WebElement get_ProductionDropDown1(){
		return expWait.getWhenClickable(By.xpath("//*[text()='Country of Delivery']/following-sibling::*/select"), 30);
	}
	
	public WebElement get_ProductionDropDown2(){
		return expWait.getWhenClickable(By.xpath("//*[text()='Country of Origin']/following-sibling::*/select"), 30);
	}
	
	public WebElement get_ProductionDropDownOptions(){
		return expWait.getWhenClickable(By.xpath("//*[text()='Country of Production']/following-sibling::*/select/*[text()='China']"), 30);
	}
	
	
	public WebElement get_ProductionDropDownOptions1(){
		return expWait.getWhenClickable(By.xpath("//*[text()='Country of Delivery']/following-sibling::*/select/*[text()='China']"), 30);
	}
	
	
	public WebElement get_ProductionDropDownOptions2(){
		return expWait.getWhenClickable(By.xpath("//*[text()='Country of Origin']/following-sibling::*/select/*[text()='China']"), 30);
	}
	
	
	
	
	
}
