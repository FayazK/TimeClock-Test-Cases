package test;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import salfay.Common;

public class LoginTest {
	 
	FirefoxDriver ffd;
	WebElement el;
	ArrayList<String> coveredTags;
	int itemsCovered = 0;
	
	@BeforeTest
	public void beforeTest() throws IOException{
		System.setProperty("webdriver.gecko.driver", "/Users/fayazk/Documents/Libraries/Java/selinium/geckodriver");
		ffd = new FirefoxDriver();
		coveredTags = new ArrayList<String>();
		
		ffd.get("http://salmansherin.com");
		
		Common.captureScreen("01 - Test Start", ffd);
	}
	
	@AfterTest
	public void afterSuite() throws IOException {
		Common.captureScreen("Test End", ffd);
		ffd.quit();
		
		System.out.println("=============================");
		System.out.println("Total Covered Elements: " + itemsCovered);
		System.out.println("------------------------------");
		System.out.println("Elements Covered:");
		for(int i = 0; i < coveredTags.size(); i++){
			System.out.println(coveredTags.get(i));
		}
		System.out.println("=============================");
	}
}
