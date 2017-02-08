package salfay;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common {
	public static void captureScreen(String fileName, FirefoxDriver ffd) throws IOException{
		File ssFile = ((TakesScreenshot) (ffd)).getScreenshotAs(OutputType.FILE);
		File hd = new File("screenshots/"+fileName+".jpg");
		FileUtils.copyFile(ssFile, hd);
	}
}
