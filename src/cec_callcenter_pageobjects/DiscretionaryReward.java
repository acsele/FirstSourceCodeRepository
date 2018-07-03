package cec_callcenter_pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiscretionaryReward {
	
	WebDriver driver=null;
	
	@FindBy(linkText ="Promotion/Upsell ")
	WebElement promotionlink;

	@FindBy(linkText="Reward")
	WebElement rewardlink;
	
	@FindBy(linkText="Create New Reward")
	WebElement createnewrewardlink;
	
	
  public DiscretionaryReward(WebDriver driver){
	    this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  
  public void clickpromotionlink(){
	  promotionlink.click();
  }
 
  public void clickrewardlink(){
	  rewardlink.click();
  }
  public void clickcreatenewrewardlink(){
	  createnewrewardlink.click();
  }
}