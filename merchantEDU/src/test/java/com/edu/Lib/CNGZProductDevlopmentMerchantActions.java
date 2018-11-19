package com.edu.Lib;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.edu.PageObjects.CNGZProductDevlopmentMerchantPageUI;
import com.edu.PageObjects.ProductDevelopmentDetailPageUI;

public class CNGZProductDevlopmentMerchantActions {
	/** The driver. */
	WebDriver driver;
	CNGZProductDevlopmentMerchantPageUI cngzProductDevelopmentPg;
	ProductDevelopmentDetailPageUI productDevelopmentPg;
	/** The parent window. */
	String parentWindow;
	String childWindow;

	/**
	 * Instantiates a new Product Development Detail Action action.
	 * 
	 * @param driver
	 *            the driver
	 */
	public CNGZProductDevlopmentMerchantActions(WebDriver driver) {
		cngzProductDevelopmentPg = new CNGZProductDevlopmentMerchantPageUI(driver);
		productDevelopmentPg = new ProductDevelopmentDetailPageUI(driver);
		this.driver = driver;
	}

	public void addSupplierAndRequest() {
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.get_Tab_SupplierAndRequest().click();
	}

	public void addSupplier(String supplierID) {
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.waitLong(5);
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel2_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.get_AddSupplier_SupplierAndRequest().isEnabled();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.get_AddSupplier_SupplierAndRequest().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		parentWindow = cngzProductDevelopmentPg.get_CurrentWindowHandle();
		cngzProductDevelopmentPg.getWindowHandle();
		driver.switchTo().defaultContent();
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.get_SearchBarOnChatPopUp().isDisplayed();
		productDevelopmentPg.get_SearchBarOnChatPopUp().clear();
		productDevelopmentPg.get_SearchBarOnChatPopUp().sendKeys(supplierID);
		productDevelopmentPg.reportLog("Search in pop up : " + supplierID);
		productDevelopmentPg.get_SearchButtonOnChatPopUp().click();
		productDevelopmentPg.checkWeekSliderSpinnerToAppear();
		productDevelopmentPg.get_SearchButtonOnChatPopUp().click();
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.switchToFrame("structure_browser");
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.switchToFrame("tableBodyRight");
		productDevelopmentPg.get_SearchResultLinkOnChatPopUpCNGZ(supplierID).isDisplayed();
		productDevelopmentPg.get_CheckBoxFromChartPopUp().get(1).click();
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("structure_browser");
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.get_AddSelectedOnChatPopUp().click();
		productDevelopmentPg.reportLog("Add selected Machat");
		driver.switchTo().window(parentWindow);
	}

	public void addOptions() {
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.get_Tab_Options().click();
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.get_CheckBox_Options().isDisplayed();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_CheckBox_Options());
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String javaScript = "var evt = document.createEvent('MouseEvents');" + "var RIGHT_CLICK_BUTTON_CODE = 2;"
				+ "evt.initMouseEvent('contextmenu', true, true, window, 1, 0, 0, 0, 0, false, false, false, false, RIGHT_CLICK_BUTTON_CODE, null);"
				+ "arguments[0].dispatchEvent(evt)";
		js.executeScript(javaScript, cngzProductDevelopmentPg.get_CheckBox_Options());
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.get_CreateOption_Options().click();
	}

	public void editDetailsAddInformationAndSave(String country) {
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		parentWindow = cngzProductDevelopmentPg.get_CurrentWindowHandle();
		cngzProductDevelopmentPg.getWindowHandle();
		cngzProductDevelopmentPg.switchToDefaultContent();
		driver.manage().window().maximize();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel_SupplierPopUp());
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel1_SupplierPopUp());
		cngzProductDevelopmentPg.switchToFrame("TopPanelContentFrame");
		cngzProductDevelopmentPg.get_edit_Options().click();
		cngzProductDevelopmentPg.get_SMV_Options().isDisplayed();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		
		
		
//		cngzProductDevelopmentPg.get_CountryDropDown_Options().get(0).click();
//		cngzProductDevelopmentPg.get_CountryDropDown_Options().get(0).sendKeys("China");
//		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
//		cngzProductDevelopmentPg.get_CountryDropDown_Options().get(1).click();
//		cngzProductDevelopmentPg.get_CountryDropDown_Options().get(1).sendKeys("China");
//		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
//		cngzProductDevelopmentPg.get_CountryDropDown_Options().get(2).click();
//		cngzProductDevelopmentPg.get_CountryDropDown_Options().get(2).sendKeys("China");
		
//		cngzProductDevelopmentPg.SelectElementFromDropdown(cngzProductDevelopmentPg.get_ProductionDropDown(), "visibleText", country);
//		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
//		cngzProductDevelopmentPg.SelectElementFromDropdown(cngzProductDevelopmentPg.get_ProductionDropDown1(), "visibleText", country);
//		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
//		cngzProductDevelopmentPg.SelectElementFromDropdown(cngzProductDevelopmentPg.get_ProductionDropDown2(), "visibleText", country);
		
		cngzProductDevelopmentPg.get_ProductionDropDown().click();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_ProductionDropDownOptions());
		cngzProductDevelopmentPg.get_ProductionDropDownOptions().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		
		cngzProductDevelopmentPg.get_ProductionDropDown1().click();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_ProductionDropDownOptions1());
		cngzProductDevelopmentPg.get_ProductionDropDownOptions1().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		
		cngzProductDevelopmentPg.get_ProductionDropDown2().click();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_ProductionDropDownOptions2());
		cngzProductDevelopmentPg.get_ProductionDropDownOptions2().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_ProductionDropDown());
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_editreadmode_Options());
		
		cngzProductDevelopmentPg.get_editreadmode_Options().click();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.equals("frames[2].frames[0].frames[2].frames[0].document.getElementsByClassName('actions')[0].children[1].click();");
		
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel_SupplierPopUp());
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel1_SupplierPopUp());
		cngzProductDevelopmentPg.switchToFrame("TopPanelContentFrame");
		
		
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.get_edit_Options().isDisplayed();
		cngzProductDevelopmentPg.switchToDefaultContent();
	}

	public void addBOMCNGZ(String placement, String country) {
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.switchToFrame("detailsDisplay");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevelBOM_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.get_CheckBox_BOM_Options().click();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.switchToFrame("detailsDisplay");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevelBOM_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.get_Action_BOM_Options().click();
		cngzProductDevelopmentPg.get_ActionEdit_BOM_Options().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		childWindow = cngzProductDevelopmentPg.get_CurrentWindowHandle();
		cngzProductDevelopmentPg.getWindowHandle();
		cngzProductDevelopmentPg.switchToDefaultContent();
		driver.manage().window().maximize();
		cngzProductDevelopmentPg.SelectElementFromDropdown(cngzProductDevelopmentPg.get_placement_BOM_Options(),
				"visibleText", placement);
		cngzProductDevelopmentPg.SelectElementFromDropdown(cngzProductDevelopmentPg.get_countryOfOrigin_BOM_Options(),
				"visibleText", country);
		cngzProductDevelopmentPg.get_Update_BOM_Options().click();
		driver.switchTo().alert().accept();
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
	}

	public void addCost() {
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.switchToFrame("detailsDisplay");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevelCost_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.get_AddCost_Options().isEnabled();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.get_AddCost_Options().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		childWindow = cngzProductDevelopmentPg.get_CurrentWindowHandle();
		cngzProductDevelopmentPg.getWindowHandle();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.get_Date_OptionsCost().click();
		productDevelopmentPg.checkWeekSliderSpinnerToAppear();
		productDevelopmentPg.SelectElementFromDropdown(productDevelopmentPg.get_DatePickerDropDown().get(1),
				"visibleText", "" + (Calendar.getInstance().get(Calendar.YEAR) + 1));
		productDevelopmentPg.SelectElementFromDropdown(productDevelopmentPg.get_DatePickerDropDown().get(1), "index",
				"" + Calendar.getInstance().get(Calendar.MONTH));
		productDevelopmentPg.get_DatefromCal().click();
		productDevelopmentPg.reportLog("Enter information in created row under plan delivery");
		cngzProductDevelopmentPg.get_Aggregated_OptionsCost().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.executeJs("document.getElementById('totalSumId').value='';");
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.get_SumTotal_OptionsCost().sendKeys("10");
		cngzProductDevelopmentPg.get_SaveCost_OptionsCost().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		driver.switchTo().window(childWindow);
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
	}

	public void LockWithpadlock() {
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame("detailsDisplay");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel1_SupplierPopUp());
		cngzProductDevelopmentPg.get_IMGLock_OptionsCost().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("overlayContentFrame");
		cngzProductDevelopmentPg.get_SecuredRadio().click();
		cngzProductDevelopmentPg.get_Change().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame("detailsDisplay");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel1_SupplierPopUp());
		cngzProductDevelopmentPg.get_Lock().click();
		cngzProductDevelopmentPg.waitLong(8);
		cngzProductDevelopmentPg.switchToDefaultContent();
		driver.close();
		driver.switchTo().window(parentWindow);
	}
	
	public void LockWithpadlockQutioned() {
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame("detailsDisplay");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel1_SupplierPopUp());
		cngzProductDevelopmentPg.get_IMGLock_OptionsCost().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("overlayContentFrame");
		cngzProductDevelopmentPg.get_QuotationRadio().click();
		cngzProductDevelopmentPg.get_Change().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame("detailsDisplay");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel1_SupplierPopUp());
		cngzProductDevelopmentPg.get_Lock().click();
		cngzProductDevelopmentPg.waitLong(8);
		cngzProductDevelopmentPg.switchToDefaultContent();
		driver.close();
		driver.switchTo().window(parentWindow);
	}

	public void SelectAndHandoverOption() {
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.get_CheckBox_Options().isDisplayed();
		cngzProductDevelopmentPg.get_CheckBox_Options().click();
		cngzProductDevelopmentPg.waitLong(4);
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.get_HandOverOption().click();
		cngzProductDevelopmentPg.waitLong(2);
	}

	public void HandOverPublish() {
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.switchToFrame("overlayContentFrame");
		cngzProductDevelopmentPg.get_saveButton_Handover().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.get_HandoverVerify().isDisplayed();
	}
	
	
	//********************  Adding option 2 ************************
	
	public void addOptionsExtraLine() {
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.get_Tab_Options().click();
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.get_CheckBox_OptionsExtraLine().isDisplayed();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_CheckBox_OptionsExtraLine());
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String javaScript = "var evt = document.createEvent('MouseEvents');" + "var RIGHT_CLICK_BUTTON_CODE = 2;"
				+ "evt.initMouseEvent('contextmenu', true, true, window, 1, 0, 0, 0, 0, false, false, false, false, RIGHT_CLICK_BUTTON_CODE, null);"
				+ "arguments[0].dispatchEvent(evt)";
		js.executeScript(javaScript, cngzProductDevelopmentPg.get_CheckBox_OptionsExtraLine());
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.get_CreateOption_Options().click();
	}
	
	public void SelectAndHandoverOptionExtraLine() {
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.get_CheckBox_OptionsExtraLine().isDisplayed();
		cngzProductDevelopmentPg.get_CheckBox_OptionsExtraLine().click();
		cngzProductDevelopmentPg.waitLong(4);
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.get_HandOverOption().click();
		cngzProductDevelopmentPg.waitLong(2);
	}
	
	public void HandOverPublishExtraLine() {
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.switchToFrame("overlayContentFrame");
		cngzProductDevelopmentPg.get_saveButton_Handover().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.get_HandoverVerifyExtraLine().isDisplayed();
	}
	
	//********************  Adding option 3 ************************
	
	public void addOptionsExtraLineSupplier() {
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.get_Tab_Options().click();
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.get_CheckBox_OptionsExtraLineSupplier().isDisplayed();
		cngzProductDevelopmentPg.scrollIntoView(cngzProductDevelopmentPg.get_CheckBox_OptionsExtraLineSupplier());
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String javaScript = "var evt = document.createEvent('MouseEvents');" + "var RIGHT_CLICK_BUTTON_CODE = 2;"
				+ "evt.initMouseEvent('contextmenu', true, true, window, 1, 0, 0, 0, 0, false, false, false, false, RIGHT_CLICK_BUTTON_CODE, null);"
				+ "arguments[0].dispatchEvent(evt)";
		js.executeScript(javaScript, cngzProductDevelopmentPg.get_CheckBox_OptionsExtraLineSupplier());
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.get_CreateOption_Options().click();
	}
	
	public void SelectAndHandoverOptionExtraLineSupplier() {
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.get_CheckBox_OptionsExtraLineSupplier().isDisplayed();
		cngzProductDevelopmentPg.get_CheckBox_OptionsExtraLineSupplier().click();
		cngzProductDevelopmentPg.waitLong(4);
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.get_HandOverOption().click();
		cngzProductDevelopmentPg.waitLong(2);
	}
	
	public void HandOverPublishExtraLineSupplier() {
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		cngzProductDevelopmentPg.switchToFrame("overlayContentFrame");
		cngzProductDevelopmentPg.get_saveButton_Handover().click();
		cngzProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		cngzProductDevelopmentPg.switchToDefaultContent();
		cngzProductDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(cngzProductDevelopmentPg.get_FrameLevel3_Supplier());
		cngzProductDevelopmentPg.switchToFrame("tableContentFrame");
		cngzProductDevelopmentPg.switchToFrame("tableBodyRight");
		cngzProductDevelopmentPg.get_HandoverVerifyExtraLineSupplier().isDisplayed();
	}
	

	
}
