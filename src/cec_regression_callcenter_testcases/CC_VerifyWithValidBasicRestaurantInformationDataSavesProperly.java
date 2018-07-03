package cec_regression_callcenter_testcases;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import cec_callcenter_pageobjects.RestaurantPage;
import utilities.DataProviders;
import utilities.InitiateIEDriver;

public class CC_VerifyWithValidBasicRestaurantInformationDataSavesProperly extends RestaurantPage{

	private static WebDriver driver = null;
	@Test(dataProvider=DataProviders.DP_RestaurantData,dataProviderClass= DataProviders.class)	
	public void  verifyBasicRestaurantInformationDataGetSavedProperly__384(String StoreNumber, String StoreName, String City, String State, String ZipCode,String Address, String ManagerName, String PublisherNumber, String IVRNumber, String PhoneNumber) throws Exception{
		System.setProperty("webdriver.ie.driver", "C:\\Workspace\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://test-rvcc.chuckecheese.com");
		InitiateIEDriver.WindowsAuthenticationlogin("cec\\achauhan","AC@cec2018");
		System.out.println("Logged in to application");	
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Restaurant")).click();
		RestaurantPage.lnk_New(driver).click();
	    RestaurantPage.txtbx_Storenumber(driver).sendKeys(StoreNumber);
		RestaurantPage.txtbx_Storename(driver).sendKeys(StoreName);
		RestaurantPage.txtbx_City(driver).sendKeys(City);
		RestaurantPage.txtbx_State(driver).sendKeys(State);
		WebElement elem = RestaurantPage.drpdown_country(driver);
		Select country = new Select(elem);
		country.selectByVisibleText("United States of America");
		RestaurantPage.txtbx_Zip(driver).sendKeys(ZipCode);
		RestaurantPage.txtbx_Address(driver).sendKeys(Address);
		RestaurantPage.txtbx_ManagerName(driver).sendKeys(ManagerName);
		//here we need to add two more element for Playpass and Store Overbook
		RestaurantPage.txtbx_PublishedNumber(driver).sendKeys(PublisherNumber);
		RestaurantPage.txtbx_IVRNumber(driver).sendKeys(IVRNumber);
		RestaurantPage.txtbx_Phonenumber(driver).sendKeys(PhoneNumber);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		RestaurantPage.drpdown_Paymentopt(driver).click();
		RestaurantPage.drpdown_Processor(driver).click();
		jse.executeScript("window.scrollBy(0,250)","");
		RestaurantPage.btn_Save(driver).click();
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(750,0)", "");
		String confmsg = driver.findElement(By.xpath("//*[@id='errMsg']")).getText();
		System.out.println(confmsg);
		assertEquals(confmsg, "Restaurant information saved successfully.", "the message displayed is not correct ");
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		
		driver.quit();
	}
	
	
}

