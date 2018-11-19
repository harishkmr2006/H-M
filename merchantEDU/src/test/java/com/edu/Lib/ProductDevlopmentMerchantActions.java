package com.edu.Lib;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.edu.PageObjects.ProductDevelopmentDetailPageUI;
import com.edu.PageObjects.ProductDevlopmentMerchantPageUI;

public class ProductDevlopmentMerchantActions {
	/** The driver. */
	WebDriver driver;
	ProductDevlopmentMerchantPageUI merchantProductDevelopmentPg;
	ProductDevelopmentDetailPageUI productDevelopmentPg;
	/** The parent window. */
	String parentWindow;
	String subWindow;

	/**
	 * Instantiates a new Product Development Detail Action action.
	 * 
	 * @param driver
	 *            the driver
	 */
	public ProductDevlopmentMerchantActions(WebDriver driver) {
		merchantProductDevelopmentPg = new ProductDevlopmentMerchantPageUI(driver);
		productDevelopmentPg = new ProductDevelopmentDetailPageUI(driver);
		this.driver = driver;
	}

	public void openOptionGroupLink() {
		merchantProductDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		merchantProductDevelopmentPg.get_Tab_Options().click();
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(merchantProductDevelopmentPg.get_FrameLevel2_Options());
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.switchToFrame("tableBodyRight");
		merchantProductDevelopmentPg.get_LinkoptionsTable_Options().click();
	}

	public void editOptionGroupHeader(String group, String type, String appearance, String Country) {
		parentWindow = merchantProductDevelopmentPg.get_CurrentWindowHandle();
		merchantProductDevelopmentPg.getWindowHandle();
		merchantProductDevelopmentPg.switchToDefaultContent();
		merchantProductDevelopmentPg.switchToFrame("content");
		merchantProductDevelopmentPg.switchToFrame("detailsDisplay");
		merchantProductDevelopmentPg.switchToFrame("TopPanelContentFrame");
		merchantProductDevelopmentPg.get_EnterEditMode_Options().click();
		// merchantProductDevelopmentPg.get_productionGroup_Options().isDisplayed();
		merchantProductDevelopmentPg.SelectElementFromDropdown(
				merchantProductDevelopmentPg.get_productionGroup_Options(), "visibleText", group);
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		merchantProductDevelopmentPg.SelectElementFromDropdown(
				merchantProductDevelopmentPg.get_productionType_Options(), "visibleText", type);
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
//		merchantProductDevelopmentPg.SelectElementFromDropdown(
//				merchantProductDevelopmentPg.get_productionAppearance_Options(), "visibleText", appearance);
////		merchantProductDevelopmentPg.get_productionAppearance_Options().sendKeys(appearance);
		
		merchantProductDevelopmentPg.SelectElementFromDropdown(
		merchantProductDevelopmentPg.get_productionAppearance_Options(), "value", merchantProductDevelopmentPg.get_productionAppearanceSection_Options(appearance).getAttribute("value"));
		
		
		merchantProductDevelopmentPg.get_productionAppearance_Options().sendKeys("sdf");
		merchantProductDevelopmentPg.SelectElementFromDropdown(
				merchantProductDevelopmentPg.get_CountryofProduction_Options(), "visibleText", Country);
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		merchantProductDevelopmentPg.get_EnterReadMode_Options().click();
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
	}

	public void addBOM(String group, String BOMSearchID, String position) {
		merchantProductDevelopmentPg.switchToDefaultContent();
		merchantProductDevelopmentPg.switchToFrame("content");
		merchantProductDevelopmentPg.switchToFrame("detailsDisplay");
		merchantProductDevelopmentPg.switchToFrame("tvcTabs0_HMOptionGroupDescriptionTabcontentFrame");
		driver.switchTo().frame(merchantProductDevelopmentPg.get_FrameLevel2_OptionsBOM());
		merchantProductDevelopmentPg.switchToFrame("tableContentFrame");
		merchantProductDevelopmentPg.get_Actions_OptionsBOM().click();
		merchantProductDevelopmentPg.get_ActionsOptions_OptionsBOM(group).click();
		subWindow = merchantProductDevelopmentPg.get_CurrentWindowHandle();
		merchantProductDevelopmentPg.getWindowHandle();
		merchantProductDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.get_SearchBarOnChatPopUp().clear();
		productDevelopmentPg.get_SearchBarOnChatPopUp().sendKeys(BOMSearchID);
		productDevelopmentPg.reportLog("Search in pop up : " + BOMSearchID);
		productDevelopmentPg.get_SearchButtonOnChatPopUp().click();
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.switchToFrame("structure_browser");
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.switchToFrame("tableBodyRight");
		productDevelopmentPg.get_SearchResultLinkOnChatPopUp(BOMSearchID).isDisplayed();
		productDevelopmentPg.get_CheckBoxFromChartPopUp().get(1).click();
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("structure_browser");
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.get_AddSelectedOnChatPopUp().click();
		merchantProductDevelopmentPg.switchToDefaultContent();
		merchantProductDevelopmentPg.SelectElementFromDropdown(merchantProductDevelopmentPg.get_position_OptionsBOM(),
				"visibleText", position);
		merchantProductDevelopmentPg.get_AddBUtton_OptionsBOM().click();
		driver.switchTo().window(subWindow);
	}

	public void diconnectAppearance(List<String> diconnectList) {
		merchantProductDevelopmentPg.switchToDefaultContent();
		merchantProductDevelopmentPg.switchToFrame("content");
		merchantProductDevelopmentPg.switchToFrame("detailsDisplay");
		merchantProductDevelopmentPg.switchToFrame("tvcTabs0_HMOptionGroupDescriptionTabcontentFrame");
		driver.switchTo().frame(merchantProductDevelopmentPg.get_FrameLevel3_Options());
		merchantProductDevelopmentPg.switchToFrame("tableContentFrame");
		merchantProductDevelopmentPg.switchToFrame("tableBodyRight");
		for (String string : diconnectList) {
			merchantProductDevelopmentPg
					.scrollIntoView(merchantProductDevelopmentPg.get_OptionDisconnectImage_OptionsBOM(string));
			merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
			merchantProductDevelopmentPg.get_OptionDisconnectImage_OptionsBOM(string).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String javaScript = "var evt = document.createEvent('MouseEvents');" + "var RIGHT_CLICK_BUTTON_CODE = 2;"
					+ "evt.initMouseEvent('contextmenu', true, true, window, 1, 0, 0, 0, 0, false, false, false, false, RIGHT_CLICK_BUTTON_CODE, null);"
					+ "arguments[0].dispatchEvent(evt)";
			js.executeScript(javaScript, merchantProductDevelopmentPg.get_OptionDisconnectImage_OptionsBOM(string));
			merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
			merchantProductDevelopmentPg.switchToDefaultContent();
			merchantProductDevelopmentPg.switchToFrame("content");
			merchantProductDevelopmentPg.switchToFrame("detailsDisplay");
			merchantProductDevelopmentPg.switchToFrame("tvcTabs0_HMOptionGroupDescriptionTabcontentFrame");
			driver.switchTo().frame(merchantProductDevelopmentPg.get_FrameLevel3_Options());
			merchantProductDevelopmentPg.get_disconnect_OptionsBOM().click();
			merchantProductDevelopmentPg.switchToDefaultContent();
			merchantProductDevelopmentPg.switchToFrame("content");
			merchantProductDevelopmentPg.switchToFrame("detailsDisplay");
			merchantProductDevelopmentPg.switchToFrame("tvcTabs0_HMOptionGroupDescriptionTabcontentFrame");
			driver.switchTo().frame(merchantProductDevelopmentPg.get_FrameLevel3_Options());
			merchantProductDevelopmentPg.switchToFrame("tableContentFrame");
			merchantProductDevelopmentPg.switchToFrame("tableBodyRight");
		}
		driver.close();
		driver.switchTo().window(parentWindow);
	}

	public void disconnect(String colorID) {
		merchantProductDevelopmentPg.switchToDefaultContent();
		merchantProductDevelopmentPg.switchToFrame("content");
		merchantProductDevelopmentPg.switchToFrame("detailsDisplay");
		merchantProductDevelopmentPg.switchToFrame("tvcTabs0_HMOptionGroupDescriptionTabcontentFrame");
		driver.switchTo().frame(merchantProductDevelopmentPg.get_FrameLevel3_Options());
		merchantProductDevelopmentPg.switchToFrame("tableContentFrame");
		merchantProductDevelopmentPg.switchToFrame("tableBodyRight");
		merchantProductDevelopmentPg
				.scrollIntoView(merchantProductDevelopmentPg.get_OptionDisconnectImage_OptionsBOM(colorID));
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		merchantProductDevelopmentPg.get_OptionDisconnectImage_OptionsBOM(colorID).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String javaScript = "var evt = document.createEvent('MouseEvents');" + "var RIGHT_CLICK_BUTTON_CODE = 2;"
				+ "evt.initMouseEvent('contextmenu', true, true, window, 1, 0, 0, 0, 0, false, false, false, false, RIGHT_CLICK_BUTTON_CODE, null);"
				+ "arguments[0].dispatchEvent(evt)";
		js.executeScript(javaScript, merchantProductDevelopmentPg.get_OptionDisconnectImage_OptionsBOM(colorID));
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		merchantProductDevelopmentPg.switchToDefaultContent();
		merchantProductDevelopmentPg.switchToFrame("content");
		merchantProductDevelopmentPg.switchToFrame("detailsDisplay");
		merchantProductDevelopmentPg.switchToFrame("tvcTabs0_HMOptionGroupDescriptionTabcontentFrame");
		driver.switchTo().frame(merchantProductDevelopmentPg.get_FrameLevel3_Options());
		merchantProductDevelopmentPg.executeJs("document.getElementsByClassName('menu-item-label')[1].click();");
//		merchantProductDevelopmentPg.get_disconnect_OptionsBOM().click();
		merchantProductDevelopmentPg.switchToDefaultContent();
	}

	public void connect(String string, String action) {
		merchantProductDevelopmentPg.switchToDefaultContent();
		merchantProductDevelopmentPg.switchToFrame("content");
		merchantProductDevelopmentPg.switchToFrame("detailsDisplay");
		merchantProductDevelopmentPg.switchToFrame("tvcTabs0_HMOptionGroupDescriptionTabcontentFrame");
		driver.switchTo().frame(merchantProductDevelopmentPg.get_FrameLevel3_Options());
		merchantProductDevelopmentPg.switchToFrame("tableContentFrame");
		merchantProductDevelopmentPg.switchToFrame("tableBodyRight");
		merchantProductDevelopmentPg
				.scrollIntoView(merchantProductDevelopmentPg.get_OptionDisconnect_OptionsBOM2(string));
		merchantProductDevelopmentPg.waitLong(8);
		// merchantProductDevelopmentPg.get_OptionDisconnect_OptionsBOM(string).click();
		String id;
		try {
			id = merchantProductDevelopmentPg.get_IDTODisconnect(string).getAttribute("id");
		} catch (Exception e) {
			merchantProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
			id = merchantProductDevelopmentPg.get_IDTODisconnect(string).getAttribute("id");
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var para = document.createElement(\"input\"); "
				+ "var node = document.createTextNode(\"This is new\"); "
				+ "para.appendChild(node); var element = document.getElementById('" + id + "');"
				+ " element.appendChild(para);");
		String javaScript = "var evt = document.createEvent('MouseEvents');" + "var RIGHT_CLICK_BUTTON_CODE = 2;"
				+ "evt.initMouseEvent('contextmenu', true, true, window, 1, 0, 0, 0, 0, false, false, false, false, RIGHT_CLICK_BUTTON_CODE, null);"
				+ "arguments[0].dispatchEvent(evt)";
		js.executeScript(javaScript, merchantProductDevelopmentPg.get_OptionDisconnect_OptionsBOM(string));
		js.executeScript(javaScript, merchantProductDevelopmentPg.get_OptionDisconnect_OptionsBOM(string));
		js.executeScript(javaScript, merchantProductDevelopmentPg.get_OptionDisconnect_OptionsBOM(string));
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		merchantProductDevelopmentPg.switchToDefaultContent();
		merchantProductDevelopmentPg.switchToFrame("content");
		merchantProductDevelopmentPg.switchToFrame("detailsDisplay");
		merchantProductDevelopmentPg.switchToFrame("tvcTabs0_HMOptionGroupDescriptionTabcontentFrame");
		driver.switchTo().frame(merchantProductDevelopmentPg.get_FrameLevel3_Options());
		merchantProductDevelopmentPg.executeJs("document.getElementsByClassName('menu-item-label')[0].click();");
		merchantProductDevelopmentPg.switchToDefaultContent();
		merchantProductDevelopmentPg.waitLong(10);
	}

	public void createOptionGroup2ByCopy(String optionGroupCopyName, String group, String type, String appearance,
			String Country) {
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(merchantProductDevelopmentPg.get_FrameLevel2_Options());
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.switchToFrame("tableBodyRight");
		merchantProductDevelopmentPg.get_CheckboxOptionCopy().click();
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(merchantProductDevelopmentPg.get_FrameLevel2_Options());
		productDevelopmentPg.switchToFrame("tableContentFrame");
		merchantProductDevelopmentPg.get_Actions_OptionCopy().click();
		merchantProductDevelopmentPg.get_OptionByCopy_CheckboxOptionCopy().click();
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(merchantProductDevelopmentPg.get_FrameLevel2_Options());
		productDevelopmentPg.switchToFrame("tvcInlineFrame_0");
		merchantProductDevelopmentPg.get_TextoptionGroupName_OptionCopy().sendKeys(optionGroupCopyName);
		merchantProductDevelopmentPg.get_copyButton_OptionCopy().click();
		parentWindow = merchantProductDevelopmentPg.get_CurrentWindowHandle();
		merchantProductDevelopmentPg.getWindowHandle();
		merchantProductDevelopmentPg.switchToDefaultContent();
		driver.manage().window().maximize();
		merchantProductDevelopmentPg.switchToFrame("content");
		merchantProductDevelopmentPg.switchToFrame("detailsDisplay");
		merchantProductDevelopmentPg.switchToFrame("TopPanelContentFrame");
		// merchantProductDevelopmentPg.get_productionGroup_Options().isDisplayed();
		merchantProductDevelopmentPg.SelectElementFromDropdown(
				merchantProductDevelopmentPg.get_productionGroup_Options(), "visibleText", group);
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		merchantProductDevelopmentPg.SelectElementFromDropdown(
				merchantProductDevelopmentPg.get_productionType_Options(), "visibleText", type);
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		merchantProductDevelopmentPg.SelectElementFromDropdown(
				merchantProductDevelopmentPg.get_productionAppearance_Options(), "visibleText", appearance);
		merchantProductDevelopmentPg.SelectElementFromDropdown(
				merchantProductDevelopmentPg.get_CountryofProduction_Options(), "visibleText", Country);
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
	}

	public void saveHeader() {
		merchantProductDevelopmentPg.switchToDefaultContent();
		merchantProductDevelopmentPg.switchToFrame("content");
		merchantProductDevelopmentPg.switchToFrame("detailsDisplay");
		merchantProductDevelopmentPg.switchToFrame("TopPanelContentFrame");
		merchantProductDevelopmentPg.get_EnterReadMode_Options().click();
		merchantProductDevelopmentPg.checkWeekSliderSpinnerToAppear();
		driver.close();
		driver.switchTo().window(parentWindow);
		merchantProductDevelopmentPg.switchToDefaultContent();
	}

	public void addOffice(String office) {
		productDevelopmentPg.switchToFrame("content");
		productDevelopmentPg.get_Tab_Office().click();
		productDevelopmentPg.reportLog("Add office clicked");
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(productDevelopmentPg.get_FrameLevel2_OfficeGoal());
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.get_AddOffice_Tab_Office().click();
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(productDevelopmentPg.get_FrameLevel2_OfficeGoal());
		productDevelopmentPg.switchToFrame("tvcInlineFrame_0");
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.switchToFrame("tableBodyRight");
		productDevelopmentPg.executeJs("document.getElementById('"
				+ productDevelopmentPg.get_AddOfficeTextID(office).getAttribute("id").replaceAll("r", "l")
				+ "').childNodes[0].childNodes[0].click();");
		productDevelopmentPg.reportLog("Select office check box checked :" + office);
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(productDevelopmentPg.get_FrameLevel2_OfficeGoal());
		productDevelopmentPg.switchToFrame("tvcInlineFrame_0");
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.get_AddSelected_OfficeGoal().click();
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(productDevelopmentPg.get_FrameLevel2_OfficeGoal());
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.switchToFrame("tableBodyRight");
		productDevelopmentPg.get_AddOfficeTabelContent_OfficeGoal(office).isDisplayed();
		productDevelopmentPg.reportLog("Verify office Added");
	}
}
