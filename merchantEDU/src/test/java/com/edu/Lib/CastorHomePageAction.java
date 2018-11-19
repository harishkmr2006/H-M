package com.edu.Lib;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.edu.PageObjects.CastorHomePageUI;
import com.edu.PageObjects.CastorLoginPageUI;

// TODO: Auto-generated Javadoc
/**
 * The Class CastorHomePageAction.
 */
public class CastorHomePageAction {
	/** The castor page UI. */
	CastorLoginPageUI castorLoginPg;
	CastorHomePageUI castorHomePg;
	/** The driver. */
	WebDriver driver;
	String parentWindow;

	/**
	 * Instantiates a new Castor login page action.
	 * 
	 * @param driver
	 *            the driver
	 */
	public CastorHomePageAction(WebDriver driver) {
		castorLoginPg = new CastorLoginPageUI(driver);
		castorHomePg = new CastorHomePageUI(driver);
		this.driver = driver;
	}

	/**
	 * Login to castor.
	 *
	 * @param userName
	 *            the user name
	 * @param password
	 *            the password
	 */
	public void loginToCastor(String userName, String password) {
		castorLoginPg.get_Txt_Username().sendKeys(userName);
		castorLoginPg.get_Txt_Password().sendKeys(password);
		castorLoginPg.get_ButtonSignIN().click();
		castorLoginPg.reportLog("Login to application with " + userName + "/" + password);
	}

	/**
	 * Switch to frame to get create product development.
	 */
	public void switchToFrameToGetCreateProductDevelopment() {
		castorHomePg.switchToFrame("content");
		castorHomePg.switchToFrame(castorHomePg.get_FrameLevel2().getAttribute("name"));
		castorHomePg.switchToFrame(castorHomePg.get_FrameLevel3().getAttribute("name"));
		castorHomePg.switchToFrame("tableContentFrame");
		castorLoginPg.reportLog("Switch to frames to intercat with product devlopment");
	}

	public void clickOnProductDevelopment() {
		castorHomePg.get_Btn_ProductDevlopment().isEnabled();
		castorHomePg.checkWeekSliderSpinnerToDisappear();
		castorHomePg.get_Btn_ProductDevlopment().click();
		castorLoginPg.reportLog("Click on product devlopment link");
	}

	public void switchToCreateProductDevelopmentPopUpAndEnterInformation(String productName, String office) {
		parentWindow = castorHomePg.get_CurrentWindowHandle();
		castorHomePg.getWindowHandle();
		castorHomePg.txtBox_ProductDevelopmentName.sendKeys(productName);
		castorHomePg.SelectElementFromDropdown(castorHomePg.sel_owningOffice, "visibleText", office);
		//castorHomePg.SelectElementFromDropdown(castorHomePg.sel_Brand, "visibleText", "HM");
		castorHomePg.btn_Create.click();
		driver.switchTo().window(parentWindow);
		driver.switchTo().defaultContent();
		castorLoginPg.reportLog("Product Name :" + productName + " and office :" + office);
	}

	public void performProductIDSearch(String productID, String office) {
		castorHomePg.switchToDefaultContent();
		castorHomePg.get_TopSearch().clear();
		castorHomePg.get_TopSearch().click();
		castorHomePg.get_TopSearch().sendKeys(productID);
		castorHomePg.checkWeekSliderSpinnerToDisappear();
		castorHomePg.switchToFrame("gsFrame");
		castorHomePg.switchToFrame("tableContentFrame");
		castorHomePg.switchToFrame("tableBodyRight");
		for (WebElement result : castorHomePg.get_TopSearchResult()) {
			if (result.getText().contains(productID) && result.getText().contains(office)) {
				result.click();
			}
		}
		castorHomePg.switchToDefaultContent();
		castorHomePg.checkWeekSliderSpinnerToAppear();
		castorHomePg.executeJs("document.getElementById('closeTA').click();");
	}
	
	public void performProductIDSearchOther(String productID, String office) {
		castorHomePg.switchToDefaultContent();
		castorHomePg.get_TopSearch().clear();
		castorHomePg.get_TopSearch().click();
		castorHomePg.get_TopSearch().sendKeys(productID);
		castorHomePg.checkWeekSliderSpinnerToDisappear();
		castorHomePg.switchToFrame("gsFrame");
		castorHomePg.switchToFrame("tableContentFrame");
		castorHomePg.switchToFrame("tableBodyRight");
		castorHomePg.get_TopResult(office).click();
		castorHomePg.switchToDefaultContent();
		castorHomePg.checkWeekSliderSpinnerToAppear();
		castorHomePg.executeJs("document.getElementById('closeTA').click();");
	}
}
