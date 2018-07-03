package cec_callcenter_pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RestaurantPage {

	
	
	private static WebElement element = null;
	
	
	public static  WebElement lnk_New(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='submenu']/li[1]/a"));
		return element;
	}
	
	public static WebElement txtbx_Storenumber(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='StoreNumber']"));
		return element;
	}
	public static WebElement txtbx_Storename(WebDriver driver){
		element= driver.findElement(By.xpath(".//*[@id='StoreName']"));
		return element;
	}
	public static WebElement txtbx_City(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='City']"));
		return element;
	}
	public static WebElement txtbx_State(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='State']"));
		return element;
	}
	public static WebElement drpdown_country(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='drpCountry']"));
		return element;
		
	}
	public static WebElement txtbx_Zip(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='ZipCode']"));
		return element;
	}
	public static WebElement txtbx_Address(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='Address']"));
		return element;
	}
	public static WebElement txtbx_ManagerName(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='ManagerName']"));
		return element;
	}
	public static WebElement txtbx_PublishedNumber(WebDriver driver){
		element= driver.findElement(By.xpath(".//*[@id='PublishedNumber']"));
		return element;
	}
	public static WebElement txtbx_IVRNumber(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='IVRNumber']"));
		return element;
	}
	public static WebElement txtbx_Phonenumber(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='PhoneNumber']"));
		return element;
	}
	public static WebElement drpdown_Paymentopt(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='PaymentGatewayId']/option[3]"));
		return element;
	}
	public static WebElement drpdown_Processor(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='ProcessorId']/option[3]"));
		return element;
	}
	public static WebElement btn_Save(WebDriver driver){
		element= driver.findElement(By.xpath(".//*[@id='btnSave']"));
		return element;
				
	}
}
