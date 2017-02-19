package test;

import org.testng.annotations.Test;

import salfay.Common;

import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class LoginTest {
	FirefoxDriver ffd;
	WebElement el;
	ArrayList<String> coveredTags;
	int itemsCovered = 0;
	int totalElements = 0;

	@Test(priority = 1)
	/**
	 * Test UserName Field Exist or not
	 */
	public void testUserNameField() {
		el = ffd.findElementByName("login_userid");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}

	@Test(priority = 2)
	/**
	 * Test Password Field Exist or not
	 */
	public void testPasswordField() {
		el = ffd.findElementByName("login_password");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}

	@Test(priority = 3)
	/**
	 * Test Password Field Exist or not
	 */
	public void testSubmitField() {
		el = ffd.findElementByCssSelector("input[type='submit']");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}

	// --------------------------------------------------------------------------
	// Header Links
	// --------------------------------------------------------------------------
	@Test(priority = 4)
	public void testLogoLink() {
		el = ffd.findElementByXPath("/html/body/table[1]/tbody/tr/td[1]/a");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}

	@Test(priority = 5)
	public void testHomeLink() {
		el = ffd.findElementByXPath("/html/body/table[2]/tbody/tr/td[2]/a");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	@Test(priority = 6)
	public void testAdminLink() {
		el = ffd.findElementByXPath("/html/body/table[2]/tbody/tr/td[4]/a");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	@Test(priority = 7)
	public void testReportLink() {
		el = ffd.findElementByXPath("/html/body/table[2]/tbody/tr/td[6]/a");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	@Test(priority = 8)
	public void testDateLink() {
		el = ffd.findElementByXPath("/html/body/table[1]/tbody/tr/td[2]/a");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}

	@Test(priority = 9)
	/**
	 * Test Entering info into login credentials
	 */
	public void testCredentials() {
		el = ffd.findElementByName("login_userid");
		el.sendKeys("admin");

		el = ffd.findElementByName("login_password");
		el.sendKeys("pass");

		Assert.assertEquals("admin", ffd.findElementByName("login_userid").getAttribute("value"));
		Assert.assertEquals("pass", ffd.findElementByName("login_password").getAttribute("value"));

		ffd.findElementByCssSelector("input[type='submit']").click();
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		System.setProperty("webdriver.gecko.driver", "/Users/fayazk/Documents/Libraries/Java/selinium/geckodriver");
		ffd = new FirefoxDriver();
		coveredTags = new ArrayList<String>();

		ffd.get("http://salmansherin.com/timeclock/login.php");

		Common.captureScreen("01 - Test Start", ffd);
		totalElements = Common.getTotalElements(ffd);
	}

	@AfterTest
	public void afterTest() throws IOException {
		Common.captureScreen("Test End", ffd);
		ffd.quit();
		System.out.println("=============================");
		System.out.println("Total Page Elements: " + totalElements);
		System.out.println("------------------------------");
		System.out.println("Total Covered Elements: " + itemsCovered);
		System.out.println("------------------------------");
		System.out.println("Elements Covered:");
		for (int i = 0; i < coveredTags.size(); i++) {
			System.out.println(coveredTags.get(i));
		}
		System.out.println("=============================");
	}

}
