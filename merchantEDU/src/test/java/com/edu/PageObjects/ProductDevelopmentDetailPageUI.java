package com.edu.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDevelopmentDetailPageUI extends BasePage {
	/** The driver. */
	WebDriver driver;

	public ProductDevelopmentDetailPageUI(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public WebElement get_EditProductDevlopment() {
		return expWait.getWhenClickable(By.xpath("//*[@title='Edit']//a"), 30);
	}

	public WebElement get_Weight_EditProductDevlopment() {
		return expWait.getWhenClickable(By.xpath("//*[contains(@name,'Weight')]"), 15);
	}
	
	public WebElement get_Season_EditProductDevlopment() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Season']/following-sibling::div"), 15);
	}

	public WebElement get_Season_option_EditProductDevlopment(String season) {
		return expWait.getWhenClickable(By.xpath("//*[@class='option' and text()='" + season + "']"), 30);
	}

	public WebElement get_Department_EditProductDevlopment() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Department']/following-sibling::div"), 30);
	}

	public WebElement get_Department_option_EditProductDevlopment(String Department) {
		return expWait.getWhenClickable(By.xpath("//*[@class='option active']"), 30);
		// return
		// expWait.getWhenClickable(By.xpath("//*[contains(@class,'option')]//*[text()='"+Department+"']"),
		// 30);
	}

	public WebElement get_Concept_EditProductDevlopment() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Concept']/following-sibling::div"), 30);
	}

	public WebElement get_Concept_option_EditProductDevlopment(String Concept) {
		checkWeekSliderSpinnerToAppear();
		return driver.findElement(By.xpath("//*[@class='option active']/*"));
		// return expWait.getWhenVisible(By.xpath("//*[@class='option
		// active']/*"), 30);
		// return
		// expWait.getWhenClickable(By.xpath("//*[contains(@class,'option')]//*[text()='"+Concept+"']"),
		// 30);
	}

	public WebElement get_ProductType_EditProductDevlopment() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Product Type']/following-sibling::div"), 30);
	}

	public WebElement get_ProductType_option_EditProductDevlopment(String ProductType) {
		return expWait.getWhenClickable(By.xpath("//*[@class='option active']"), 30);
//		 return
//		 expWait.getWhenClickable(By.xpath("//*[contains(@class,'option')]//*[text()='"+Concept+"']"),
//		 30);
	}

	public WebElement get_PurposeofDevelopment_EditProductDevlopment() {
		return expWait.getWhenClickable(By.xpath("//textarea[contains(@name,'purpose')]"), 30);
	}

	public WebElement get_valueDriver_EditProductDevlopment() {
		return expWait.getWhenClickable(By.xpath("//textarea[contains(@name,'value')]"), 30);
	}

	public WebElement get_notes_EditProductDevlopment() {
		return expWait.getWhenClickable(By.xpath("//textarea[contains(@name,'notes')]"), 30);
	}

	public WebElement get_Phase_EditProductDevlopment() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Phase']/following-sibling::div"), 30);
	}

	public WebElement get_Phase_option_EditProductDevlopment(String Phase) {
		return expWait.getWhenClickable(By.xpath("//*[@class='option' and text()='" + Phase + "']"), 30);
	}

	public WebElement get_TargetPrice_EditProductDevlopment() {
		return expWait.getWhenClickable(By.xpath("//*[contains(@name,'targetPrice')]"), 30);
	}

	public WebElement get_Currency_EditProductDevlopment() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Currency']/following-sibling::div"), 30);
	}

	public WebElement get_Currency_option_EditProductDevlopment(String currency) {
		return expWait.getWhenClickable(By.xpath("//*[@class='option' and text()='" + currency + "']"), 30);
	}

	public WebElement get_Save_EditProductDevlopment() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Save']"), 30);
	}

	public WebElement get_SeasonInfo(String season) {
		return expWait.getWhenVisible(By.xpath("//span[text()='" + season + "']"), 30);
	}
	
	public WebElement get_SeasonInfoCNZG(String season) {
		return expWait.getWhenVisible(By.xpath("//*[text()='" + season + "']"), 30);
	}

	// **************************Plan / Delivery
	// ***********************************************************
	public WebElement get_Tab_PlanDelivery() {
		return expWait.getWhenClickable(By.xpath("//a[contains(.,'Plan/Delivery')]"), 30);
	}

	public WebElement get_FrameLevel2_PlanDelivery() {
		return expWait.getWhenClickable(By.xpath("//iframe[contains(@src,'ProductDeliveryDynamicColumnsPageConfig')]"),
				30);
	}

	public WebElement get_AddRow_Tab_PlanDelivery() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Add Row']"), 30);
	}

	public List<WebElement> get_NewRowTextAraes() {
		return expWait.getWhenVisibleList(By.xpath("//table//input[@type='text']"), 60);
	}

	public List<WebElement> get_DatePickerDropDown() {
		return expWait.getWhenVisibleList(By.xpath("//*[@id='ui-datepicker-div']//select"), 60);
	}

	public WebElement get_DatefromCal() {
		return expWait.getWhenVisible(By.xpath(".//*[@id='ui-datepicker-div']//a[text()='3']"), 10);
	}

	public WebElement get_CalanderIcon() {
		return expWait.getWhenClickable(By.xpath("//*[@class='ui-datepicker-trigger']"), 30);
	}

	public WebElement get_SavePlanDelivery() {
		return expWait.getWhenVisible(By.xpath("//img[contains(@src,'toreadmode')]"), 10);
	}
	
	public WebElement get_ProductID() {
		return expWait.getWhenVisible(By.xpath("//label[text()='ID']/following-sibling::*"), 30);
	}
	
	
	
	// ******************** Description Tab ********************

	public WebElement get_Tab_Description() {
		return expWait.getWhenClickable(By.xpath("//a[contains(.,'Description')]"), 30);
	}

	public WebElement get_Actions_DescriptionActions() {
		return expWait.getWhenClickable(
				By.xpath("//header[contains(.,'Attachments - Active')]/following-sibling::*//*[text()='Actions']"),
				30);
	}

	public WebElement get_AddDocuments_DescriptionActions() {
		return expWait.getWhenClickable(
				By.xpath(
						"//header[contains(.,'Attachments - Active')]/following-sibling::*//*[contains(text(),'Add Document')]"),
				30);
	}

	public WebElement get_CheckBox_DescriptionActions() {
		return expWait.getWhenClickable(By.xpath("//tbody//*[contains(@class,'select-row')]"), 30);
	}

	public WebElement get_ConvertDocumentDescriptionActions() {
		return expWait.getWhenClickable(
				By.xpath(
						"//header[contains(.,'Attachments - Active')]/following-sibling::*//*[text()='Convert Document']"),
				30);
	}

	public WebElement get_ImageAdded_DescriptionActions() {
		return expWait.getWhenClickable(By.xpath("//*[@class='tile']/img"), 30);
	}
	// ***************** Fit Descriptions **********************************

	public WebElement get_FitDescriptions_DescriptionActions() {
		return expWait.getWhenClickable(
				By.xpath(
						"//header[contains(.,'Attachments - Active')]/following-sibling::*//*[text()='Fit Descriptions']"),
				30);
	}

	public WebElement get_AddOrCopyMChart_DescriptionActions() {
		return expWait.getWhenClickable(
				By.xpath(
						"//header[contains(.,'Attachments - Active')]/following-sibling::*//*[contains(text(),'Add or Copy M-chart')]"),
				30);
	}

	public WebElement get_SearchBarOnChatPopUp() {
		return expWait.getWhenClickable(By.id("txtTextSearch"), 30);
	}

	public WebElement get_SearchButtonOnChatPopUp() {
		return expWait.getWhenClickable(By.className("btn-search"), 30);
	}

	public WebElement get_SearchResultLinkOnChatPopUp(String chartID) {
		return expWait.getWhenClickable(By.xpath("//a[contains(text(),'" + chartID + "')]"), 30);
	}
	
	public WebElement get_SearchResultLinkOnChatPopUpCNGZ(String chartID) {
		return expWait.getWhenClickable(By.xpath("//*[contains(text(),'" + chartID + "')]"), 30);
	}

	public List<WebElement> get_CheckBoxFromChartPopUp() {
		return expWait.getWhenVisibleList(By.xpath("//*[@type='checkbox']"), 60);
	}

	public WebElement get_AddSelectedOnChatPopUp() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Add Selected']"), 30);
	}

	public WebElement get_DetailsTableAttachments(String chartID) {
		return expWait.getWhenClickable(By.xpath("//tbody//*[contains(text(),'" + chartID + "')]"), 30);
	}

	public List<WebElement> get_ListImageAdded_DescriptionActions() {
		return expWait.getWhenVisibleList(By.xpath("//*[@class='tile']/img"), 30);
	}

	// ******************** Create Appearance ********************************
	public WebElement get_AppearanceTab() {
		return expWait.getWhenClickable(By.xpath("//*[contains(text(),'Create Appearance')]"), 30);
	}

	public WebElement get_numberOfAppearances() {
		return expWait.getWhenClickable(By.id("numberOfAppearances"), 30);
	}

	public WebElement get_numberOfAppearances_AddRow() {
		return expWait.getWhenClickable(By.id("addRow"), 30);
	}

	public List<WebElement> get_CodeTextBox_AppearancePopUp() {
		return expWait.getWhenVisibleList(By.xpath("//*[contains(@id,'colorName') and @type='text']"), 30);
	}

	public WebElement get_CodeTextBox_AutoCompleteText_AppearancePopUp(String appCode) {
		return expWait
				.getWhenClickable(By.xpath("//*[contains(@style,'color') and contains(text(),'" + appCode + "')]"), 30);
	}

	public List<WebElement> get_GraphicalAppearance_AppearancePopUp() {
		return expWait.getWhenVisibleList(By.xpath("//*[@name='graphicalAppearanceId']"), 30);
	}

	public WebElement get_CreateButton_AppearanceTab() {
		return expWait.getWhenClickable(By.xpath("//a[text()='Create']"), 30);
	}

	public WebElement get_ColorCode_AppearanceTab(String colorID) {
		return expWait.getWhenClickable(By.xpath("//div[@id='Appearances']//*[contains(text(),'" + colorID + "')]"),
				30);
	}

	// ******************** Component Developments
	// ********************************
	public WebElement get_Actions_ComponentDevelopmentsTab() {
		return expWait.getWhenClickable(By.xpath("//*[@data-title='Component Developments']//*[text()='Actions']"), 30);
	}

	public WebElement get_AddComponentDevelopment_ComponentDevelopmentsTab() {
		return expWait.getWhenClickable(
				By.xpath("	//*[@data-title='Component Developments']//*[text()='Add Component Development']"), 30);
	}

	public WebElement get_txtTextSearchBox() {
		return expWait.getWhenClickable(By.id("txtTextSearch"), 30);
	}

	public WebElement get_SearchButton() {
		return expWait.getWhenClickable(By.id("mx_btn-search"), 30);
	}

	public WebElement get_ComponentDevelopmentsTabTabelContent(String componentDevelopment) {
		return expWait.getWhenClickable(
				By.xpath("//*[@data-title='Component Developments']//*[text()='" + componentDevelopment + "']"), 30);
	}

	// *********************** addLabel
	// *******************************************
	public WebElement get_Tab_LabelandPackaging() {
		return expWait.getWhenClickable(By.xpath("//a[contains(.,'Label and Packaging')]"), 30);
	}

	public WebElement get_Actions_Tab_LabelandPackaging() {
		return expWait.getWhenClickable(By.xpath("//*[@data-title='Label and Packaging']//*[text()='Actions']"), 30);
	}

	public WebElement get_AddLabel_Tab_LabelandPackaging() {
		return expWait.getWhenClickable(By.xpath("//*[@data-title='Label and Packaging']//*[text()='Add Label']"), 30);
	}

	public WebElement get_LabelandPackagingTabTabelContent(String labelID) {
		return expWait.getWhenClickable(
				By.xpath("//*[@data-title='Label and Packaging']//*[contains(text(),'" + labelID + "')]"), 30);
	}

	public WebElement get_SearchResultLinkOnLabelPopUp(String labelID) {
		return expWait.getWhenClickable(By.xpath("//td[text()='" + labelID + "']"), 30);
	}

	// ************ Add Image *****************
	public WebElement get_AddIcon_Image() {
		return expWait.getWhenClickable(By.xpath("//*[@title='Manage Images']/a"), 30);
	}

	public WebElement get_imageSeasonDropdown_ImagePopUp() {
		return expWait.getWhenClickable(By.id("imageSeasonId"), 30);
	}

	public WebElement get_imageDepartmentDropdown_ImagePopUp() {
		return expWait.getWhenClickable(By.id("imageDepartmentId"), 30);
	}

	public WebElement get_imageName_ImagePopUp() {
		return expWait.getWhenClickable(By.id("imageNameId"), 30);
	}

	public WebElement get_ApplyButton_ImagePopUp() {
		return expWait.getWhenClickable(By.id("applyProductDevelopmentButton"), 30);
	}

	public WebElement get_searchButton_ImagePopUp() {
		return expWait.getWhenClickable(By.id("searchButton"), 30);
	}

	public WebElement get_ImageSearchResult_Image() {
		return expWait.getWhenClickable(By.xpath("//img[@class='SetImageOverlayBackgroundImage']"), 30);
	}

	public WebElement get_ImageOnDiscription_Image() {
		return expWait.getWhenClickable(By.xpath("//*[@class='primaryImage']//img"), 30);
	}

	// ***************************office *********************
	public WebElement get_Tab_Office() {
		return expWait.getWhenClickable(By.xpath("//a[contains(.,'Office')]"), 30);
	}

	public WebElement get_AddOffice_Tab_Office() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Add Office']"), 30);
	}

	public WebElement get_AddOfficeText(String office) {
		return expWait.getWhenClickable(By.xpath("//*[text()='Name: " + office + "']"), 30);
	}

	public WebElement get_AddOfficeTextID(String office) {
		return expWait.getWhenClickable(By.xpath("//*[text()='Name: " + office + "']/../.."), 30);
	}

	public WebElement get_AddOfficeTextIDCheckBox(String officeID) {
		return driver.findElement(By.xpath(".//*[@id='" + officeID + "']/td"));
	}

	public WebElement get_FrameLevel2_OfficeGoal() {
		return expWait.getWhenClickable(By.xpath("//iframe[contains(@src,'OfficeGoalOverviewPageConfig')]"), 30);
	}

	public WebElement get_AddSelected_OfficeGoal() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Add Selected']"), 30);
	}

	public WebElement get_AddOfficeTabelContent_OfficeGoal(String office) {
		return expWait.getWhenClickable(By.xpath("//table//td[text()='" + office + "']"), 30);
	}
	// *******publishToMerchant*************************************
	
	public WebElement get_OfficeCheckbox(){
		return expWait.getWhenClickable(By.xpath("//input[@name='emxTableRowId']"), 20);
	}
	
	public WebElement get_Publish_Tab_Office() {
		return expWait.getWhenClickable(By.xpath("//*[text()='Publish']"), 30);
	}
	
	public List<WebElement> get_ToTextBoxPublish_Tab_Office() {
		return expWait.getWhenVisibleList(By.xpath("//input[contains(@class,'ui-select-search')]"), 30);
	}
	
	public WebElement get_Suggestions_OfficePopUp(String office){
		return expWait.getWhenClickable(By.xpath("//span[contains(text(),'("+office+")')]"), 20);
	}
	
	public WebElement get_PublishButton() {
		return expWait.getWhenClickable(By.id("saveButton"), 30);
	}
	
	public WebElement get_PublishStatus_Tab_Office() {
		return expWait.getWhenClickable(By.xpath("//table//*[contains(text(),'Initiated')]"), 30);
	}
	
}
