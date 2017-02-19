package test;

import org.testng.annotations.Test;

import salfay.Common;

import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class CreateOfficeTest {
	FirefoxDriver ffd;
	WebElement el;
	ArrayList<String> coveredTags;
	int itemsCovered = 0;
	int totalElements = 0;
	
	@Test(priority=1)
	/**
	 * Login
	 */
	public void login() throws InterruptedException{
		ffd.findElementByName("login_userid").sendKeys("admin");
		ffd.findElementByName("login_password").sendKeys("pass");
		ffd.findElementByCssSelector("input[type='submit']").click();
		Thread.sleep(10000);
		String url = ffd.getCurrentUrl();
		Assert.assertEquals("http://salmansherin.com/timeclock/admin/index.php", url);
	}
	
	@Test(priority=2)
	/**
	 * Check if User Summary Link Exist
	 */
	public void testCreateNewOfficeLink() throws InterruptedException{
		totalElements = Common.getTotalElements(ffd);
		el = ffd.findElementByLinkText("Create New Office");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
		el.click();
		Thread.sleep(10000);
	}
	
	@Test(priority=3)
	public void testOfficeNameField(){
		totalElements = Common.getTotalElements(ffd);
		el = ffd.findElementByName("post_officename");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	@Test(priority=3)
	public void testCreateGroupField(){
		el = ffd.findElementsByName("create_groups").get(0);
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
		
		el = ffd.findElementsByName("create_groups").get(1);
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	@Test(priority=4)
	public void testHowManyField(){
		el = ffd.findElementByName("how_many");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	@Test(priority=5)
	public void testSubmitField(){
		el = ffd.findElementByName("submit");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	@Test(priority=6)
	/**
	 * Check if User Summary Link Exist
	 */
	public void testUserSummaryLink(){
		el = ffd.findElementByLinkText("User Summary");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	@Test(priority=7)
	/**
	 * Check if User Summary Link Exist
	 */
	public void testCreateNewUserLink(){
		el = ffd.findElementByLinkText("Create New User");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	@Test(priority=8)
	/**
	 * Check if User Summary Link Exist
	 */
	public void testUserSearchLink(){
		el = ffd.findElementByLinkText("User Search");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	@Test(priority=9)
	/**
	 * Check if User Summary Link Exist
	 */
	public void testOfficeSummaryLink(){
		el = ffd.findElementByLinkText("Office Summary");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	@Test(priority=10)
	/**
	 * Check if User Summary Link Exist
	 */
	public void testGroupSummaryLink(){
		el = ffd.findElementByLinkText("Group Summary");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	@Test(priority=11)
	/**
	 * Check if User Summary Link Exist
	 */
	public void testCreateNewGroupLink(){
		el = ffd.findElementByLinkText("Create New Group");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	@Test(priority=12)
	/**
	 * Check if User Summary Link Exist
	 */
	public void testStatusSummaryLink(){
		el = ffd.findElementByLinkText("Status Summary");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	@Test(priority=13)
	/**
	 * Check if User Summary Link Exist
	 */
	public void testCreateStatusLink(){
		el = ffd.findElementByLinkText("Create Status");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	@Test(priority=14)
	/**
	 * Check if User Summary Link Exist
	 */
	public void testAddEditDeleteTimeLink(){
		el = ffd.findElementByLinkText("Add/Edit/Delete Time");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	@Test(priority=15)
	/**
	 * Check if User Summary Link Exist
	 */
	public void testEditSystemSettingsLink(){
		el = ffd.findElementByLinkText("Edit System Settings");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	@Test(priority=16)
	/**
	 * Check if User Summary Link Exist
	 */
	public void testUpgradeDatabaseLink(){
		el = ffd.findElementByLinkText("Upgrade Database");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	@Test(priority=17)
	/**
	 * Check if User Summary Link Exist
	 */
	public void testLogoutLink(){
		el = ffd.findElementByPartialLinkText("Logout");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	// --------------------------------------------------------------------------
	// Header Links
	// --------------------------------------------------------------------------
	@Test(priority = 18)
	public void testLogoLink() {
		el = ffd.findElementByXPath("/html/body/table[1]/tbody/tr/td[1]/a");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}

	@Test(priority =19)
	public void testHomeLink() {
		el = ffd.findElementByXPath("/html/body/table[2]/tbody/tr/td[4]/a");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	@Test(priority = 20)
	public void testAdminLink() {
		el = ffd.findElementByXPath("/html/body/table[2]/tbody/tr/td[4]/a");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	@Test(priority = 21)
	public void testReportLink() {
		el = ffd.findElementByXPath("/html/body/table[2]/tbody/tr/td[6]/a");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	@Test(priority = 22)
	public void testDateLink() {
		el = ffd.findElementByXPath("/html/body/table[1]/tbody/tr/td[2]/a");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	@Test(priority = 23)
	public void testApacheLink() {
		el = ffd.findElementByXPath("/html/body/table[3]/tbody/tr/td[2]/table/tbody/tr[2]/td/a[1]");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	@Test(priority = 24)
	public void testMySQLLink() {
		el = ffd.findElementByXPath("/html/body/table[3]/tbody/tr/td[2]/table/tbody/tr[2]/td/a[2]");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	@Test(priority = 25)
	public void testPHPLink() {
		el = ffd.findElementByXPath("/html/body/table[3]/tbody/tr/td[2]/table/tbody/tr[2]/td/a[3]");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	@Test(priority = 26)
	public void testTimeClockLink() {
		el = ffd.findElementByXPath("/html/body/table[3]/tbody/tr/td[2]/table/tbody/tr[2]/td/a[4]");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	@Test(priority = 27)
	public void testCancelLink() {
		el = ffd.findElementByXPath("/html/body/table[3]/tbody/tr/td[2]/table/tbody/tr[1]/td/form/table[2]/tbody/tr[2]/td[2]/a");
		Assert.assertTrue(el.isDisplayed());
		itemsCovered++;
		coveredTags.add(Common.getElementXpath(ffd, el));
	}
	
	
	@Test(priority=28)
	public void testFillFields() throws InterruptedException{
		int rand = (int) (Math.random()*99999);
		ffd.findElementByName("post_officename").sendKeys("My Office "+rand);
		el = ffd.findElementByName("submit");
		el.click();
		Thread.sleep(10000);
		el = ffd.findElementByClassName("table_rows_green");
		Assert.assertTrue(el.isDisplayed());
	}
	
	@BeforeTest
	public void beforeTest() throws IOException {
		System.setProperty("webdriver.gecko.driver", "/Users/fayazk/Documents/Libraries/Java/selinium/geckodriver");
		ffd = new FirefoxDriver();
		coveredTags = new ArrayList<String>();

		ffd.get("http://salmansherin.com/timeclock/login.php");

		Common.captureScreen("01 - Test Start", ffd);
		totalElements = ffd.findElementsByCssSelector("body *").size();
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
