package salfay;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common {
	public static void captureScreen(String fileName, FirefoxDriver ffd) throws IOException{
		File ssFile = ((TakesScreenshot) (ffd)).getScreenshotAs(OutputType.FILE);
		File hd = new File("screenshots/"+fileName+".jpg");
		FileUtils.copyFile(ssFile, hd);
	}
	
	public static String getElementXpath(FirefoxDriver ffd, WebElement el){
		String js = "function getPathTo(a){if(1==2)return\"//*[@id='\"+a.id+\"']\";if(a===document.body)return a.tagName.toLowerCase();for(var b=0,c=a.parentNode.childNodes,d=0;d<c.length;d++){var e=c[d];if(e===a)return getPathTo(a.parentNode)+\"//\"+a.tagName.toLowerCase()+\"[\"+(b+1)+\"]\";1===e.nodeType&&e.tagName===a.tagName&&b++}}";
		js += "return getPathTo(arguments[0])";
		return (String) ffd.executeScript(js, el);
	}
	
	public static int getTotalElements(FirefoxDriver ffd){
		return ffd.findElementsByCssSelector("a,input,textarea,select,button").size();
	}
}
