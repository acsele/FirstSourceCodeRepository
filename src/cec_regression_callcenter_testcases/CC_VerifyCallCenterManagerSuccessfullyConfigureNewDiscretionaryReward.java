package cec_regression_callcenter_testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import cec_callcenter_pageobjects.DiscretionaryReward;
import utilities.InitiateIEDriver;

public class CC_VerifyCallCenterManagerSuccessfullyConfigureNewDiscretionaryReward  {

	WebDriver driver;
	
	@Test
	public void logIn() throws Exception{
		DiscretionaryReward dr= new DiscretionaryReward(driver); 
		
		System.setProperty("webdriver.ie.driver", "C:\\Workspace\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://test-rvcc.chuckecheese.com");
		InitiateIEDriver.WindowsAuthenticationlogin("cec\\achauhan", "AC@cec2018");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        dr.clickpromotionlink();
        dr.clickrewardlink();
        dr.clickcreatenewrewardlink();
       
		
		
		
		
	}
	
	
	
	
}
