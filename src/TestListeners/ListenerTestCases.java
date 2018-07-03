package TestListeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.InvokeTestListeners;

@Listeners(utilities.InvokeTestListeners.class)

public class ListenerTestCases extends InvokeTestListeners {
	
	public WebDriver driver;
	

	@Test(priority=0)
	public void testcase1(){
	System.out.println(" This is failed forcefully ");
		Assert.assertTrue(false);
	}
	@Test(priority=1)
	public void testcase2(){
		
		throw new SkipException("This testmethod is skipped");
	}
	@Test(priority=2)
	public void testcase3(){
		Assert.assertTrue(true);
	}
	@Test(priority=3)
	public void testcase4(){
		System.out.println("This is test case number four ");
	}
	@Test(priority=4)
	public void testcase5(){
		System.setProperty("webdriver.chrome.driver","C:\\Workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.bbc.com");
		driver.manage().window().maximize();
		driver.getTitle();
		driver.quit();
	}
	

}
