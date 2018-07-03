package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;


public class InvokeTestListeners implements ITestListener {

	public WebDriver driver;
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(" test case started is " + result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println(  result.getTestName()+ " got successfully passed ");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
	 String filename = null;
		if (result.getStatus()== result.FAILURE) {
			
			TakesScreenshot snap = (TakesScreenshot) driver;
			File src = snap.getScreenshotAs(OutputType.FILE);
			File dest = new File("SnapsSecond\\" + filename);
			try {
				Files.move(src, dest);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println(result.getMethod()+ " got skipped ");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println(context.getStartDate());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getEndDate());
		System.out.println(" The test cases are executed" + context.getAllTestMethods());
		
	}

	
		
	

}
