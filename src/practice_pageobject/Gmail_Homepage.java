 package practice_pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Gmail_Homepage {

	// private static WebElement element =null;

	WebDriver driver;

	By createaccountlnk = By.xpath("//span[contains(text(),'Create account')]");

	By firstnametxtbx = By.id("firstName");

	By lastnametxtbx = By.id("lastName");

	By usernametxtbx = By.id("username");

	By pswrdtxtbx = By.name("Passwd");

	By confpwrdtxtbx = By.name("ConfirmPasswd");

	By nextbtn = By.xpath("//span[contains(text(),'Next')]");

	By phnnumbertxtbx = By.id("phoneNumberId");

	By backlnk = By.linkText("Back");

	By verifyphnnxtbtn = By.xpath("//span[contains(text(),'Next')]");
	
	By verificationcode = By.id("code");

	By verifybtn = By.xpath("//span[contains(text(),'Verify')]");

	public Gmail_Homepage(WebDriver driver) {

		this.driver = driver;
  //PageFactory.initElements(driver, this );
	}

	// click createbutton

	public void clickCreateAccount() {
		driver.findElement(createaccountlnk).click();
	}

	public void setFirstname(String firstname) {
		driver.findElement(firstnametxtbx).sendKeys(firstname);
	}

	public void setLastname(String lastname) {
		driver.findElement(lastnametxtbx).sendKeys(lastname);
	}

	public void setUsername(String username) {
		driver.findElement(usernametxtbx).sendKeys(username);
	}

	public void setPassword(String password) {
		driver.findElement(pswrdtxtbx).sendKeys(password);
	}

	public void setConfirmpassword(String confpassword) {
		driver.findElement(confpwrdtxtbx).sendKeys(confpassword);
	}
    public void clickNext(){
    	driver.findElement(nextbtn).click();
    }
    public void setPhonenumber(String phonenumber){
    	driver.findElement(phnnumbertxtbx).sendKeys(phonenumber);
    }
    public void clickNexttoverify(){
    	driver.findElement(nextbtn).click();
    }
    public void enterVerificationcode(String verifycode){
    	driver.findElement(verificationcode).sendKeys(verifycode);
    }
    
    public void clickVerify(){
    	driver.findElement(verifybtn).click();
    }
    
    
    
    
	/*
	 * public static WebElement lnk_Createaccount(WebDriver driver) {
	 * 
	 * element = driver.findElement(By.xpath(
	 * "//span[contains(text(),'Create account')]")); return element; }
	 */
}
