package pageobject_bbc.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class BBCOfficialSite {
	
	
	WebDriver driver;
	
	@Test
	public void test() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.bbc.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,550)", "");
		System.out.println("page scrolled down ");
		Thread.sleep(5000);
		
	}

}
