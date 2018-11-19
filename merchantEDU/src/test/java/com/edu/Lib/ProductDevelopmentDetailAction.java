package com.edu.Lib;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.List;

import org.hamcrest.core.Is;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.edu.PageObjects.CastorHomePageUI;
import com.edu.PageObjects.CastorLoginPageUI;
import com.edu.PageObjects.ProductDevelopmentDetailPageUI;

import junit.framework.Assert;

// TODO: Auto-generated Javadoc
/**
 * The Class ProductDevelopmentDetailAction.
 */
public class ProductDevelopmentDetailAction {
	/** The driver. */
	WebDriver driver;
	ProductDevelopmentDetailPageUI productDevelopmentPg;
	/** The parent window. */
	String parentWindow;

	/**
	 * Instantiates a new Product Development Detail Action action.
	 * 
	 * @param driver
	 *            the driver
	 */
	public ProductDevelopmentDetailAction(WebDriver driver) {
		productDevelopmentPg = new ProductDevelopmentDetailPageUI(driver);
		this.driver = driver;
	}

	public void editProductDevelopment() {
		productDevelopmentPg.switchToFrame("content");
		// productDevelopmentPg.get_EditProductDevlopment().isDisplayed();
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.get_EditProductDevlopment().click();
		try {
			productDevelopmentPg.get_Season_EditProductDevlopment().isDisplayed();
		} catch (Exception e) {
			productDevelopmentPg.get_EditProductDevlopment().click();
		}
		productDevelopmentPg.reportLog("Click on Product Development");
	}
	
	public void editProductDevelopmentCNGZ() {
		productDevelopmentPg.switchToFrame("content");
		// productDevelopmentPg.get_EditProductDevlopment().isDisplayed();
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.get_EditProductDevlopment().click();
		try {
			productDevelopmentPg.get_Weight_EditProductDevlopment().isDisplayed();
		} catch (Exception e) {
			productDevelopmentPg.get_EditProductDevlopment().click();
		}
		productDevelopmentPg.reportLog("Click on Product Development");
	}


	public void addWeight(String weight) {
		
		productDevelopmentPg.get_Weight_EditProductDevlopment().isEnabled();
		productDevelopmentPg.get_Weight_EditProductDevlopment().clear();
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.get_Weight_EditProductDevlopment().sendKeys(weight);
	}

	public void selectSeason(String season) {
		productDevelopmentPg.get_Season_EditProductDevlopment().click();
		productDevelopmentPg.get_Season_option_EditProductDevlopment(season).click();
		productDevelopmentPg.reportLog("Select season :" + season);
	}

	public void selectDepartment(String Department) {
		productDevelopmentPg.get_Department_EditProductDevlopment().click();
		productDevelopmentPg.get_Department_EditProductDevlopment().sendKeys(Department);
		productDevelopmentPg.get_Department_option_EditProductDevlopment(Department).click();
		productDevelopmentPg.reportLog("Select department :" + Department);
	}

	public void selectConcept(String Concept) {
		productDevelopmentPg.get_Concept_EditProductDevlopment().click();
		productDevelopmentPg.get_Concept_EditProductDevlopment().sendKeys(Concept);
		productDevelopmentPg.get_Concept_option_EditProductDevlopment(Concept).click();
		productDevelopmentPg.reportLog("Concept selected is :" + Concept);
	}

	public void selectProductType(String ProductType) {
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.get_ProductType_EditProductDevlopment().click();
		productDevelopmentPg.get_ProductType_EditProductDevlopment().sendKeys(ProductType);
		productDevelopmentPg.checkWeekSliderSpinnerToAppear();
		
		productDevelopmentPg.get_ProductType_option_EditProductDevlopment(ProductType).click();
		productDevelopmentPg.reportLog("Product Type selected is :" + ProductType);
	}

	public void enterPurposeOfDevelopment(String purposeOfDev) {
		// productDevelopmentPg.get_PurposeofDevelopment_EditProductDevlopment().click();
		// productDevelopmentPg.get_PurposeofDevelopment_EditProductDevlopment().sendKeys(purposeOfDev);
		// productDevelopmentPg.reportLog("Enter purpose of development
		// :"+purposeOfDev);
	}

	public void enterValueDriver(String valueDriver) {
		// productDevelopmentPg.get_valueDriver_EditProductDevlopment().sendKeys(valueDriver);
		// productDevelopmentPg.reportLog("Enter value driver :"+valueDriver);
	}

	public void enterNotes(String notes) {
		productDevelopmentPg.get_notes_EditProductDevlopment().sendKeys(notes);
		productDevelopmentPg.reportLog("Enter notes: " + notes);
	}

	public void selectPhase(String phase) {
		productDevelopmentPg.get_Phase_EditProductDevlopment().click();
		productDevelopmentPg.get_Phase_option_EditProductDevlopment(phase).click();
		productDevelopmentPg.reportLog("Select phase : " + phase);
	}

	public void enterTargetPrice(String targetPrice) {
		productDevelopmentPg.get_TargetPrice_EditProductDevlopment().sendKeys(targetPrice);
		productDevelopmentPg.reportLog("Enter target price : " + targetPrice);
	}

	public void selectCurrency(String currency) {
		productDevelopmentPg.get_Currency_EditProductDevlopment().click();
		productDevelopmentPg.get_Currency_option_EditProductDevlopment(currency).click();
		productDevelopmentPg.reportLog("Select currency : " + currency);
	}

	public void saveProductDevelopmentEdit(String season) {
		productDevelopmentPg.get_Save_EditProductDevlopment().click();
		productDevelopmentPg.get_SeasonInfo(season).isDisplayed();
		productDevelopmentPg.reportLog("Save product development information");
	}
	
	public void saveProductDevelopmentEditCNGZ(String season) {
		productDevelopmentPg.get_Save_EditProductDevlopment().click();
		productDevelopmentPg.get_SeasonInfoCNZG(season).isDisplayed();
		productDevelopmentPg.reportLog("Save product development information");
	}

	public void planDeliveryAddRow() {
		productDevelopmentPg.get_Tab_PlanDelivery().click();
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(productDevelopmentPg.get_FrameLevel2_PlanDelivery());
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.get_AddRow_Tab_PlanDelivery().click();
		productDevelopmentPg.reportLog("Click on plan delivery and click on add row");
	}

	public void enterInformationInNewRowPlanDelivery() {
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(productDevelopmentPg.get_FrameLevel2_PlanDelivery());
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.switchToFrame("tableBodyRight");
		// productDevelopmentPg.get_NewRowTextAraes().get(1).isDisplayed();
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		;
		productDevelopmentPg.get_NewRowTextAraes().get(1).clear();
		productDevelopmentPg.get_NewRowTextAraes().get(1).sendKeys("9000");
		productDevelopmentPg.get_CalanderIcon().click();
		productDevelopmentPg.checkWeekSliderSpinnerToAppear();
		productDevelopmentPg.SelectElementFromDropdown(productDevelopmentPg.get_DatePickerDropDown().get(1),
				"visibleText", "" + (Calendar.getInstance().get(Calendar.YEAR) + 1));
		productDevelopmentPg.SelectElementFromDropdown(productDevelopmentPg.get_DatePickerDropDown().get(1), "index",
				"" + Calendar.getInstance().get(Calendar.MONTH));
		productDevelopmentPg.get_DatefromCal().click();
		productDevelopmentPg.reportLog("Enter information in created row under plan delivery");
	}

	public void saveCreatedRowInPlanDelivery() {
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(productDevelopmentPg.get_FrameLevel2_PlanDelivery());
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.checkWeekSliderSpinnerToAppear();
		Actions ob = new Actions(driver);
		ob.click(productDevelopmentPg.get_SavePlanDelivery());
		productDevelopmentPg.get_SavePlanDelivery().click();
		productDevelopmentPg.reportLog("Save created row under plan delivery");
	}

	public void get_ProductID() {
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		String productId = productDevelopmentPg.get_ProductID().getText();
		System.setProperty("productID", productId);
		productDevelopmentPg.reportLog("Product ID : " + productId);
		System.setProperty("productID", productId);
	}

	public void navigateToDescriptionTab() {
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		productDevelopmentPg.get_Tab_Description().click();
		productDevelopmentPg.reportLog("Click on description tab");
	}

	public void addNewDocumentUnderActions() {
		productDevelopmentPg.get_Actions_DescriptionActions().click();
		productDevelopmentPg.get_AddDocuments_DescriptionActions().click();
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		Robot r;
		try {
			r = new Robot();
			r.keyPress(KeyEvent.VK_ESCAPE);
		} catch (AWTException e) {
			e.printStackTrace();
		}
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		WebElement ele = driver.findElement(By.xpath(
				"//header[contains(.,'Attachments - Active')]/following-sibling::*//a[contains(.,'Add Document')]/following-sibling::input"));
		ele.sendKeys("C:\\java\\code to commit\\edu\\src\\test\\resources\\testdata\\testImage.jpg");
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.reportLog("Click on Actions and then click on add new description");
	}

	public void selectAndConvertImage() {
		productDevelopmentPg.get_ConvertDocumentDescriptionActions().isEnabled();
		productDevelopmentPg.checkWeekSliderSpinnerToAppear();
		productDevelopmentPg.get_CheckBox_DescriptionActions().isDisplayed();
		productDevelopmentPg.get_CheckBox_DescriptionActions().click();
		productDevelopmentPg.checkWeekSliderSpinnerToAppear();
		productDevelopmentPg.get_ConvertDocumentDescriptionActions().click();
		try {
			productDevelopmentPg.get_ImageAdded_DescriptionActions().isDisplayed();
		} catch (Exception e) {
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			productDevelopmentPg.executeJs(
					"document.getElementsByTagName('table')[0].getElementsByClassName('select-row dt-head-left wrap')[1].click();");
			productDevelopmentPg.checkWeekSliderSpinnerToAppear();
			productDevelopmentPg.get_ConvertDocumentDescriptionActions().click();
			productDevelopmentPg.get_ImageAdded_DescriptionActions().isDisplayed();
		}
		productDevelopmentPg.reportLog("Select Image and convert");
	}

	public void addMChart(String chartID) {
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		productDevelopmentPg.get_FitDescriptions_DescriptionActions().click();
		productDevelopmentPg.get_AddOrCopyMChart_DescriptionActions().click();
		productDevelopmentPg.reportLog("Click on Fit Descriptions");
		productDevelopmentPg.reportLog("Click on Add Or Copy MChart");
		parentWindow = productDevelopmentPg.get_CurrentWindowHandle();
		productDevelopmentPg.getWindowHandle();
		driver.switchTo().defaultContent();
		productDevelopmentPg.get_SearchBarOnChatPopUp().clear();
		productDevelopmentPg.get_SearchBarOnChatPopUp().sendKeys(chartID);
		productDevelopmentPg.reportLog("Search in pop up : " + chartID);
		productDevelopmentPg.get_SearchButtonOnChatPopUp().click();
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.switchToFrame("structure_browser");
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.switchToFrame("tableBodyRight");
		productDevelopmentPg.get_SearchResultLinkOnChatPopUp(chartID).isDisplayed();
		productDevelopmentPg.get_CheckBoxFromChartPopUp().get(1).click();
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("structure_browser");
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.get_AddSelectedOnChatPopUp().click();
		productDevelopmentPg.reportLog("Add selected Machat");
		driver.switchTo().window(parentWindow);
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.get_DetailsTableAttachments(chartID).isDisplayed();
		Assert.assertTrue(productDevelopmentPg.get_ListImageAdded_DescriptionActions().size() == 2);
		productDevelopmentPg.reportLog("Chart added display under Mchat");
	}

	public void create_Appearance(List<String> apprance, String graphicalAppearance) {
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		productDevelopmentPg.get_AppearanceTab().click();
		productDevelopmentPg.reportLog("Click on Appearance");
		parentWindow = productDevelopmentPg.get_CurrentWindowHandle();
		productDevelopmentPg.getWindowHandle();
		productDevelopmentPg.get_numberOfAppearances().clear();
		productDevelopmentPg.get_numberOfAppearances().sendKeys("" + (apprance.size() - 1));
		productDevelopmentPg.get_numberOfAppearances_AddRow().click();
		productDevelopmentPg.checkWeekSliderSpinnerToAppear();
		for (int i = 0; i < apprance.size(); i++) {
			productDevelopmentPg.get_CodeTextBox_AppearancePopUp().get(i).sendKeys(apprance.get(i).toString());
			productDevelopmentPg.get_CodeTextBox_AutoCompleteText_AppearancePopUp(apprance.get(i).toString()).click();
			productDevelopmentPg.SelectElementFromDropdown(
					productDevelopmentPg.get_GraphicalAppearance_AppearancePopUp().get(i), "visibleText",
					graphicalAppearance);
		}
		productDevelopmentPg.get_CreateButton_AppearanceTab().click();
		for (String str : apprance) {
			productDevelopmentPg.reportLog("apprance added : " + str);
		}
		productDevelopmentPg.reportLog("click on create button");
		driver.switchTo().window(parentWindow);
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.get_ColorCode_AppearanceTab(apprance.get(0)).isDisplayed();
		productDevelopmentPg.reportLog("Verify Appearance displays");
	}

	public void addComponentDevelopments(String componentDevelopment) {
		productDevelopmentPg.get_Actions_ComponentDevelopmentsTab().click();
		productDevelopmentPg.reportLog("Component Development actions");
		productDevelopmentPg.get_AddComponentDevelopment_ComponentDevelopmentsTab().click();
		parentWindow = productDevelopmentPg.get_CurrentWindowHandle();
		productDevelopmentPg.getWindowHandle();
		productDevelopmentPg.get_txtTextSearchBox().clear();
		productDevelopmentPg.get_txtTextSearchBox().sendKeys(componentDevelopment);
		productDevelopmentPg.reportLog("Component Development to search : " + componentDevelopment);
		productDevelopmentPg.reportLog("Component Development search");
		productDevelopmentPg.checkWeekSliderSpinnerToAppear();
		productDevelopmentPg.get_SearchButton().click();
		productDevelopmentPg.reportLog("Component Development search");
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.switchToFrame("structure_browser");
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.switchToFrame("tableBodyRight");
		productDevelopmentPg.get_SearchResultLinkOnChatPopUp(componentDevelopment).isDisplayed();
		productDevelopmentPg.get_CheckBoxFromChartPopUp().get(1).click();
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("structure_browser");
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.get_AddSelectedOnChatPopUp().click();
		driver.switchTo().window(parentWindow);
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.get_ComponentDevelopmentsTabTabelContent(componentDevelopment).isDisplayed();
		productDevelopmentPg.reportLog("Verify Component Development Added");
	}

	public void addLabel(String labelID) {
		productDevelopmentPg.get_Tab_LabelandPackaging().click();
		productDevelopmentPg.reportLog("Label and Packaging navigate");
		productDevelopmentPg.get_Actions_Tab_LabelandPackaging().click();
		productDevelopmentPg.get_AddLabel_Tab_LabelandPackaging().click();
		productDevelopmentPg.reportLog("Add Label and Packaging");
		productDevelopmentPg.getWindowHandle();
		driver.switchTo().defaultContent();
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.get_SearchBarOnChatPopUp().clear();
		productDevelopmentPg.get_SearchBarOnChatPopUp().sendKeys(labelID);
		productDevelopmentPg.reportLog("Label and Packaging to search : " + labelID);
		productDevelopmentPg.reportLog("Label and Packaging search");
		productDevelopmentPg.get_SearchButtonOnChatPopUp().click();
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.switchToFrame("structure_browser");
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.switchToFrame("tableBodyRight");
		productDevelopmentPg.get_SearchResultLinkOnLabelPopUp(labelID).isDisplayed();
		productDevelopmentPg.get_CheckBoxFromChartPopUp().get(1).click();
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("structure_browser");
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.get_AddSelectedOnChatPopUp().click();
		productDevelopmentPg.reportLog(" Add selected link on Label and Packaging clicked");
		driver.switchTo().window(parentWindow);
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.get_LabelandPackagingTabTabelContent(labelID).isDisplayed();
		productDevelopmentPg.reportLog("Verify Label and Packaging added");
	}

	public void addImageForProductDevelopment(String season, String department, String imageName) {
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		productDevelopmentPg.get_AddIcon_Image().click();
		productDevelopmentPg.reportLog("Add image clicked");
		productDevelopmentPg.switchToFrame("overlayContentFrame");
		productDevelopmentPg.SelectElementFromDropdown(productDevelopmentPg.get_imageSeasonDropdown_ImagePopUp(),
				"visibleText", season);
		productDevelopmentPg.SelectElementFromDropdown(productDevelopmentPg.get_imageDepartmentDropdown_ImagePopUp(),
				"visibleText", department);
		productDevelopmentPg.get_imageName_ImagePopUp().clear();
		productDevelopmentPg.get_imageName_ImagePopUp().click();
		productDevelopmentPg.get_imageName_ImagePopUp().sendKeys(imageName);
		productDevelopmentPg.reportLog("Add image search by season : " + season);
		productDevelopmentPg.reportLog("Add image search by department : " + department);
		productDevelopmentPg.reportLog("Add image search by imageName : " + imageName);
		productDevelopmentPg.get_searchButton_ImagePopUp().click();
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.get_ImageSearchResult_Image().click();
		productDevelopmentPg.get_ApplyButton_ImagePopUp().click();
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.checkWeekSliderSpinnerToAppear();
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		productDevelopmentPg.get_ImageOnDiscription_Image().isDisplayed();
		productDevelopmentPg.reportLog("Verify image Added");
	}

	public void addOffice(String office) {
		productDevelopmentPg.switchToDefaultContent();
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

	public void publishToMerchant(String userInfoToPublish, String office) {
		productDevelopmentPg.get_OfficeCheckbox().click();
		productDevelopmentPg.reportLog("Select added office to publish");
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(productDevelopmentPg.get_FrameLevel2_OfficeGoal());
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.get_Publish_Tab_Office().click();
		productDevelopmentPg.checkWeekSliderSpinnerToDisappear();
		productDevelopmentPg.reportLog("click publish");
		productDevelopmentPg.checkWeekSliderSpinnerToAppear();
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		productDevelopmentPg.switchToFrame("overlayContentFrame");
//		productDevelopmentPg.waitLong(8);
//		driver.switchTo().frame("overlayContentFrame");
		productDevelopmentPg.get_ToTextBoxPublish_Tab_Office().get(0).clear();
		productDevelopmentPg.get_ToTextBoxPublish_Tab_Office().get(0).sendKeys(userInfoToPublish);
		productDevelopmentPg.reportLog("User information enter in TO section in pop up :" + userInfoToPublish);
		productDevelopmentPg.get_Suggestions_OfficePopUp(office).click();
		productDevelopmentPg.get_PublishButton().click();
		productDevelopmentPg.switchToDefaultContent();
		productDevelopmentPg.switchToFrame("content");
		driver.switchTo().frame(productDevelopmentPg.get_FrameLevel2_OfficeGoal());
		productDevelopmentPg.switchToFrame("tableContentFrame");
		productDevelopmentPg.switchToFrame("tableBodyRight");
		productDevelopmentPg.get_PublishStatus_Tab_Office().isDisplayed();
	}
}
