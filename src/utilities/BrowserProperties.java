package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserProperties {

	static WebDriver driver = null;
	public static void properties() throws Exception{
		
		System.setProperty("webdriver.ie.driver", "C:\\Workspace\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://test-rvcc.chuckecheese.com");
		InitiateIEDriver.WindowsAuthenticationlogin("cec\\achauhan","AC@cec2018");
		System.out.println("Logged in to application");		
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Promotion / Upsell")).click();
		driver.findElement(By.linkText("Reward")).click();
		driver.findElement(By.linkText("Create New Reward")).click();
	}
}
