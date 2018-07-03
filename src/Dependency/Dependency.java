package Dependency;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Dependency {
	
	WebDriver driver;

	
	@Test(groups={"smoke"})
	public void homepage(){
		System.out.println(" this is homepage ");
		
	}
	
	@Test(groups={"regression"})
	public void launchbrowser(){
		System.out.println(" this is launching browser");
		driver.navigate().to("");
		
	}
	
	@Test(groups={"functionality"})
	public void second(){
		System.out.println(" this is second");
		
		
	}
	@Test(groups={"regression"})
	public void third(){
		System.out.println(" this is third ");
		
		
	}
	@Test(groups={"regression"})
	public void fourth(){
		System.out.println(" this is fourth ");
		
		
	}
	@Test(groups={"regression", "functionality"})
	public void fifth(){
		System.out.println(" this is fifth ");
		
		
	}
}
