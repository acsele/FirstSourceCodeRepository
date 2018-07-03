package utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyze implements IRetryAnalyzer {
   int retry=0; int retrycount = 2;
	@Override
	public boolean retry(ITestResult result) {
		
		if (retry < retrycount) {
		retry ++;	
		return true;
		}
		return false;
	}

}
