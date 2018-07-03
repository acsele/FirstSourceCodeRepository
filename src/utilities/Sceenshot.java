package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Sceenshot {
	
	public static void capturesnap(WebDriver driver, String Filename){
		
		TakesScreenshot snap = (TakesScreenshot) driver;
		File src = snap.getScreenshotAs(OutputType.FILE);
		System.out.println(src.getAbsolutePath());
		File dest = new File("E:\\Snapshot" +Filename);
		try {
			Files.move(src, dest);
			
			System.out.println(dest.getAbsolutePath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

