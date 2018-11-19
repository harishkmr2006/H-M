package com.edu.Test;

import static com.edu.Utilities.YamlReader.getYamlValue;

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.edu.CoreTestBase.TestSessionInitiator;
import com.edu.Utilities.YamlReader;

public class CastorProductDevlopmentTest {
	/** The test. */
	TestSessionInitiator test;
	/** The course key. */
	String courseKey;
	/** The environment. */
	String environment;
	/** The product. */
	String product;
	/** The activity name. */
	String activityName;

	/**
	 * Sets the up class.
	 */
	@BeforeClass
	public void setUpClass() {
		System.out.println("\n##############################################################################");
		System.out.println("################ Castor Product Devlopment Test #############");
		System.out.println("###########################################################################\n\n");
		System.out.println("Test Name: setUpClass");
		test = new TestSessionInitiator(System.getProperty("datafile", "EDU_TestDataQA.yml"));
	}

	// String productID = "0607540D";
	@Test
	public void TC001_loginToCastor() throws FileNotFoundException {
		test.launchUrl(getYamlValue("castorUrl"));
		test.castorHome.loginToCastor(getYamlValue("loginInfo.castorBuyer.username"),
				getYamlValue("loginInfo.castorBuyer.password"));
	}

//	@Test(dependsOnMethods = "TC001_loginToCastor")
//	public void TC002_CreateProductDevelopment() {
//		test.castorHome.switchToFrameToGetCreateProductDevelopment();
//		test.castorHome.clickOnProductDevelopment();
//		String productName = "Automation_Daisy_Lace_top"
//				+ new SimpleDateFormat("yyyyMMddHHmmss").format(Calendar.getInstance().getTime());
//		test.castorHome.switchToCreateProductDevelopmentPopUpAndEnterInformation(productName,
//				getYamlValue("productDevlopment.office"));
//	}
//
//	@Test(dependsOnMethods = "TC002_CreateProductDevelopment")
//	public void TC003_EditProductDevelopmentHeader() {
//		test.productDevlopmet.editProductDevelopment();
//		test.productDevlopmet.selectSeason(getYamlValue("productDevlopment.season"));
//		test.productDevlopmet.selectDepartment(getYamlValue("productDevlopment.department"));
//		test.productDevlopmet.selectProductType(getYamlValue("productDevlopment.ProductType"));
//		test.productDevlopmet.enterPurposeOfDevelopment(getYamlValue("productDevlopment.purposeOfDev"));
//		test.productDevlopmet.enterValueDriver(getYamlValue("productDevlopment.valueDriver"));
//		test.productDevlopmet.enterNotes(getYamlValue("productDevlopment.notes"));
//		test.productDevlopmet.selectPhase(getYamlValue("productDevlopment.phase"));
//		test.productDevlopmet.enterTargetPrice(getYamlValue("productDevlopment.targetPrice"));
//		test.productDevlopmet.selectCurrency(getYamlValue("productDevlopment.Currency"));
//		test.productDevlopmet.saveProductDevelopmentEdit(getYamlValue("productDevlopment.season"));
//	}
//
//	@Test(dependsOnMethods = "TC003_EditProductDevelopmentHeader")
//	public void TC004_PlanDeliverAddRowAndSave() {
//		test.productDevlopmet.planDeliveryAddRow();
//		test.productDevlopmet.enterInformationInNewRowPlanDelivery();
//		test.productDevlopmet.saveCreatedRowInPlanDelivery();
//		test.productDevlopmet.get_ProductID();
//	}
//
//	@Test(dependsOnMethods = "TC004_PlanDeliverAddRowAndSave")
//	public void TC005_FitDescriptionAddOrCopyMchart() {
//		test.productDevlopmet.navigateToDescriptionTab();
////		 test.productDevlopmet.addNewDocumentUnderActions();
////		 test.productDevlopmet.selectAndConvertImage();
//		// test.productDevlopmet.addMChart(getYamlValue("Mchart.ID"));
//	}
//
//	@Test(dependsOnMethods = "TC005_FitDescriptionAddOrCopyMchart")
//	public void TC006_addAppearance() {
//		test.productDevlopmet.create_Appearance((ArrayList) YamlReader.getMapValueArray("Appearance.List"),
//				getYamlValue("Appearance.GraphicalAppearance"));
//	}
//
//	@Test(dependsOnMethods = "TC006_addAppearance")
//	public void TC007_AddComponentDevelopment() {
//		//test.productDevlopmet.addComponentDevelopments(getYamlValue("ComponentDevelopment"));
//	}
//
//	@Test(dependsOnMethods = "TC007_AddComponentDevelopment")
//	public void TC008_addLabel() {
//		test.productDevlopmet.addLabel(getYamlValue("LabelID"));
//	}
//
//	@Test(dependsOnMethods = "TC008_addLabel")
//	public void TC009_addImages() {
////		test.productDevlopmet.addImageForProductDevelopment(getYamlValue("productDevlopment.season"),
////				getYamlValue("productDevlopment.department"), getYamlValue("Image"));
//	}
//
//	@Test(dependsOnMethods = "TC009_addImages")
//	public void TC010_addOffices() {
//		test.productDevlopmet.addOffice(getYamlValue("office"));
//	}
//
//	@Test(dependsOnMethods = "TC010_addOffices")
//	public void TC011_publishProduct() {
//		test.productDevlopmet.publishToMerchant(getYamlValue("userInfoToPublish"), "GPOO");
//	}
//
//	@Test(dependsOnMethods = "TC011_publishProduct")
//	public void TC012_LoginAsMerchant() {
//		try {
//			Thread.sleep((1000 * 60 * 3));
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	@Test(dependsOnMethods = "TC012_LoginAsMerchant")
//	// @Test
//	public void TC013_SearchProductID() {
//		test.castorHome.performProductIDSearch(System.getProperty("productID"), "GPOO");
//		// test.castorHome.performProductIDSearch("0608951D", "GPOO");
//	}
//
//	@Test(dependsOnMethods = "TC013_SearchProductID")
//	public void TC014_OptionsOpenOptionGrouplink() {
//		test.merchantProductDevelopment.openOptionGroupLink();
//	}
//
//	@Test(dependsOnMethods = "TC014_OptionsOpenOptionGrouplink")
//	public void TC015_EditOptionGroupHeaderAndSave() {
//		test.merchantProductDevelopment.editOptionGroupHeader(getYamlValue("Merchant.Options.ProductionGroup"),
//				getYamlValue("Merchant.Options.ProductionType"), getYamlValue("Merchant.Options.ProductionAppearance"),
//				getYamlValue("Merchant.Options.Country"));
//	}
//
//	@Test(dependsOnMethods = "TC015_EditOptionGroupHeaderAndSave")
//	public void TC016_AddBOMActionWoven() {
//		test.merchantProductDevelopment.addBOM(getYamlValue("Merchant.Options.ProductionGroup"),
//				getYamlValue("Merchant.Options.BOMSearchID"), getYamlValue("Merchant.Options.position"));
//	}
//
//	@Test(dependsOnMethods = "TC016_AddBOMActionWoven")
//	public void TC017_DisconnectAppearance() {
//		test.merchantProductDevelopment.diconnectAppearance((ArrayList) YamlReader.getMapValueArray("Disconnect.List"));
//	}
//
//	@Test(dependsOnMethods = "TC017_DisconnectAppearance")
//	public void TC018_createOptionGroup2ByCopy() {
//		test.merchantProductDevelopment.createOptionGroup2ByCopy(getYamlValue("Option.CopyName"),
//				getYamlValue("Merchant.Options.ProductionGroup"), getYamlValue("Merchant.Options.ProductionType"),
//				getYamlValue("Merchant.Options.ProductionAppearance"), getYamlValue("Merchant.Options.Country"));
//	}
//
//	@Test(dependsOnMethods = "TC018_createOptionGroup2ByCopy")
//	public void TC019_DisconnectAppearanceAndConnectApperancesAndSaveHeader() {
//		test.merchantProductDevelopment.connect("11-107", "connect");
//		test.merchantProductDevelopment.connect("10-201", "connect");
//		test.merchantProductDevelopment.disconnect("09-090");
//		test.merchantProductDevelopment.saveHeader();
//	}
//
//	@Test(dependsOnMethods = "TC019_DisconnectAppearanceAndConnectApperancesAndSaveHeader")
//	public void TC020_AddOffice() {
//		test.merchantProductDevelopment.addOffice(getYamlValue("Merchant.Options.office"));
//	}
//
//	@Test(dependsOnMethods = "TC020_AddOffice")
//	public void TC021_publish() {
//		test.productDevlopmet.publishToMerchant(getYamlValue("userInfoToPublish"),
//				getYamlValue("Merchant.Options.office"));
//	}

	//@Test(dependsOnMethods = "TC021_publish")
	@Test(dependsOnMethods="TC001_loginToCastor")
	public void TC022_SearchProductID() {
//		try {
//			Thread.sleep((1000 * 60 * 5));
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		//test.castorHome.performProductIDSearchOther(System.getProperty("productID"), "CNGZ");
		test.castorHome.performProductIDSearchOther("0649147D", "CNGZ");
		
	}

	@Test(dependsOnMethods = "TC022_SearchProductID")
	public void TC023_EditProductDevelopmentHeaderAddWeight() {
		test.productDevlopmet.editProductDevelopmentCNGZ();
		test.productDevlopmet.addWeight(getYamlValue("CNGZMerchant.Header.Weight"));
		test.productDevlopmet.saveProductDevelopmentEditCNGZ(getYamlValue("productDevlopment.season"));
	}

	@Test(dependsOnMethods = "TC023_EditProductDevelopmentHeaderAddWeight")
	public void TC024_addSupplierAndRequest() {
		test.cngzProductDevlopment.addSupplierAndRequest();
		test.cngzProductDevlopment.addSupplier(getYamlValue("CNGZMerchant.Header.Supplier1"));
		test.cngzProductDevlopment.addSupplierAndRequest();
		test.cngzProductDevlopment.addSupplier(getYamlValue("CNGZMerchant.Header.Supplier2"));
	}

	@Test(dependsOnMethods = "TC024_addSupplierAndRequest")
	public void TC025_Option_CreateOption() {
		test.cngzProductDevlopment.addOptions();
	}

	@Test(dependsOnMethods = "TC025_Option_CreateOption")
	public void TC026_editDetailsAddInformationAndSave() {
		test.cngzProductDevlopment.editDetailsAddInformationAndSave(getYamlValue("CNGZMerchant.options.country"));
	}

	@Test(dependsOnMethods = "TC026_editDetailsAddInformationAndSave")
	public void TC027_addBOM() {
		test.cngzProductDevlopment.addBOMCNGZ(getYamlValue("CNGZMerchant.BOM.placement"),
				getYamlValue("CNGZMerchant.BOM.OriginCountry"));
	}

	@Test(dependsOnMethods = "TC027_addBOM")
	public void TC028_addCost() {
		test.cngzProductDevlopment.addCost();
	}

	@Test(dependsOnMethods = "TC028_addCost")
	public void TC029_LockWithpadlock() {
		test.cngzProductDevlopment.LockWithpadlock();
	}

	@Test(dependsOnMethods = "TC029_LockWithpadlock")
	public void TC030_SelectAndHandoverOptionk() {
		test.cngzProductDevlopment.SelectAndHandoverOption();
	}

	@Test(dependsOnMethods = "TC030_SelectAndHandoverOptionk")
	public void TC031_HandOverPublish() {
		test.cngzProductDevlopment.HandOverPublish();
	}

	@Test(dependsOnMethods = "TC031_HandOverPublish")
	public void TC032_Option_CreateOption() {
		test.cngzProductDevlopment.addOptionsExtraLine();
	}

	@Test(dependsOnMethods = "TC032_Option_CreateOption")
	public void TC033_editDetailsAddInformationAndSave() {
		test.cngzProductDevlopment.editDetailsAddInformationAndSave(getYamlValue("CNGZMerchant.options.country"));
	}

	@Test(dependsOnMethods = "TC033_editDetailsAddInformationAndSave")
	public void TC034_addBOM() {
		test.cngzProductDevlopment.addBOMCNGZ(getYamlValue("CNGZMerchant.BOM.placement"),
				getYamlValue("CNGZMerchant.BOM.OriginCountry"));
	}

	@Test(dependsOnMethods = "TC034_addBOM")
	public void TC035_addCost() {
		test.cngzProductDevlopment.addCost();
	}

	@Test(dependsOnMethods = "TC035_addCost")
	public void TC036_LockWithpadlock() {
		test.cngzProductDevlopment.LockWithpadlock();
	}

	@Test(dependsOnMethods = "TC036_LockWithpadlock")
	public void TC037_SelectAndHandoverOptionk() {
		test.cngzProductDevlopment.SelectAndHandoverOptionExtraLine();
	}

	@Test(dependsOnMethods = "TC037_SelectAndHandoverOptionk")
	public void TC038_HandOverPublish() {
		test.cngzProductDevlopment.HandOverPublishExtraLine();
	}

	@Test(dependsOnMethods = "TC038_HandOverPublish")
	public void TC039_Option_CreateOption() {
		test.cngzProductDevlopment.addOptionsExtraLineSupplier();
	}

	@Test(dependsOnMethods = "TC039_Option_CreateOption")
	public void TC040_editDetailsAddInformationAndSave() {
		test.cngzProductDevlopment.editDetailsAddInformationAndSave(getYamlValue("CNGZMerchant.options.country"));
	}

	@Test(dependsOnMethods = "TC040_editDetailsAddInformationAndSave")
	public void TC041_addBOM() {
		test.cngzProductDevlopment.addBOMCNGZ(getYamlValue("CNGZMerchant.BOM.placement"),
				getYamlValue("CNGZMerchant.BOM.OriginCountry"));
	}

	@Test(dependsOnMethods = "TC041_addBOM")
	public void TC042_addCost() {
		test.cngzProductDevlopment.addCost();
	}

	@Test(dependsOnMethods = "TC042_addCost")
	public void TC043_LockWithpadlock() {
		test.cngzProductDevlopment.LockWithpadlockQutioned();
	}

	@Test(dependsOnMethods = "TC043_LockWithpadlock")
	public void TC044_SelectAndHandoverOptionk() {
		test.cngzProductDevlopment.SelectAndHandoverOptionExtraLineSupplier();
	}

	@Test(dependsOnMethods = "TC044_SelectAndHandoverOptionk")
	public void TC045_HandOverPublish() {
		test.cngzProductDevlopment.HandOverPublishExtraLineSupplier();
	}
	
//	@Test(dependsOnMethods = "TC021_publish")
//	@Test
//	public void TC022_SearchProductID() {
//		try {
//			Thread.sleep((1000 * 60 * 5));
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		test.castorHome.performProductIDSearchOther(System.getProperty("productID"), "CNGZ");
//		 test.castorHome.performProductIDSearch("0648799D", "CNGZ");
//		// ************************************************************
//		 test.productDevlopmet.editProductDevelopmentCNGZ();
//		 test.productDevlopmet.addWeight(getYamlValue("CNGZMerchant.Header.Weight"));
//		 test.productDevlopmet.saveProductDevelopmentEditCNGZ(getYamlValue("productDevlopment.season"));
//		 test.cngzProductDevlopment.addSupplierAndRequest();
//		 test.cngzProductDevlopment.addSupplier(getYamlValue("CNGZMerchant.Header.Supplier1"));
//		
//		 test.cngzProductDevlopment.addSupplierAndRequest();
//		 test.cngzProductDevlopment.addSupplier(getYamlValue("CNGZMerchant.Header.Supplier2"));
//		
//		 test.cngzProductDevlopment.addOptions();
//		
//		 test.cngzProductDevlopment.editDetailsAddInformationAndSave(getYamlValue("CNGZMerchant.options.country"));
//		
//		 test.cngzProductDevlopment.addBOMCNGZ(getYamlValue("CNGZMerchant.BOM.placement"),
//		 getYamlValue("CNGZMerchant.BOM.OriginCountry"));
//		 test.cngzProductDevlopment.addCost();
//		 test.cngzProductDevlopment.LockWithpadlock();
//		 test.cngzProductDevlopment.SelectAndHandoverOption();
//		 test.cngzProductDevlopment.HandOverPublish();
//	}

	
//	
//	@Test
//	public void TC032_Test(){
//		test.cngzProductDevlopment.addOptionsExtraLine();
//		test.cngzProductDevlopment.editDetailsAddInformationAndSave(getYamlValue("CNGZMerchant.options.country"));
//		test.cngzProductDevlopment.addBOMCNGZ(getYamlValue("CNGZMerchant.BOM.placement"),
//				getYamlValue("CNGZMerchant.BOM.OriginCountry"));
//		test.cngzProductDevlopment.addCost();
//		 test.cngzProductDevlopment.LockWithpadlock();
//				 test.cngzProductDevlopment.SelectAndHandoverOptionExtraLine();
//				 test.cngzProductDevlopment.HandOverPublishExtraLine();
//			}
//	
//	@Test
//	public void TC033_Test(){
//		test.cngzProductDevlopment.addOptionsExtraLineSupplier();
//		test.cngzProductDevlopment.editDetailsAddInformationAndSave(getYamlValue("CNGZMerchant.options.country"));
//		test.cngzProductDevlopment.addBOMCNGZ(getYamlValue("CNGZMerchant.BOM.placement"),
//				getYamlValue("CNGZMerchant.BOM.OriginCountry"));
//		test.cngzProductDevlopment.addCost();
//		 test.cngzProductDevlopment.LockWithpadlock();
//				 test.cngzProductDevlopment.SelectAndHandoverOptionExtraLineSupplier();
//				 test.cngzProductDevlopment.HandOverPublishExtraLineSupplier();
//			}

	@BeforeMethod
	public void init() {
		System.out.println("\n\n__________________________________________________________________________");
	}

	/**
	 * Capture screen shot on failure.
	 * 
	 * @param result
	 *            the result
	 */
	@AfterMethod
	public void captureScreenShotOnFailure(ITestResult result) {
		System.out.println("******************************************************");
		System.out.println("Test Name: " + result.getName());
		if (!result.isSuccess()) {
			System.out.println("Test Result: FAIL");
			if (getYamlValue("selenium.server").equalsIgnoreCase("remote")) {
				test.takeScreenshotOfFailure(result);
			} else {
				test.takeScreenshotOfFailureFromLocalMachine(result);
			}
		} else {
			System.out.println("Test Result: PASS");
		}
		System.out.println("******************************************************");
		System.out.println("__________________________________________________________________________");
	}

	/**
	 * Tear down class.
	 * 
	 * @throws Exception
	 *             the exception
	 */
	@AfterClass
	public void tearDownClass() throws Exception {
		// test.closeBrowserSession();
		System.out.println("###############################################################################");
		System.out.println("############################################################################### \n\n");
	}
}
