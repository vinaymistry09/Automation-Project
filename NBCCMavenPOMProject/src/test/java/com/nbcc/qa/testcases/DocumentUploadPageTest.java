package com.nbcc.qa.testcases;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nbcc.qa.base.TestBase;
import com.nbcc.qa.pages.DocumentUploadPage;
import com.nbcc.qa.pages.HomePage;
import com.nbcc.qa.pages.LoginPage;

import com.nbcc.qa.util.TestUtil;

public class DocumentUploadPageTest extends TestBase {

	
	LoginPage loginpage;
	HomePage homePage;
	TestUtil testutil;
	DocumentUploadPage documentuploadpage;
	

	public DocumentUploadPageTest() {
		super();

	}
	
	@BeforeMethod
	public void setUP() throws InterruptedException {
		initialization(); 
		loginpage = new LoginPage();
		documentuploadpage= new DocumentUploadPage();
		testutil= new TestUtil();
		homePage =	loginpage.SignIn(prop.getProperty("username"), prop.getProperty("password"));
		documentuploadpage= homePage.clickOnDocumentLink();
		
	}
	
	@Test(priority = 1)
		public void verifyDocumentPageTitle() {
		testutil.switchToFrame();
		Assert.assertTrue(documentuploadpage.verifyDocumentUploadTitle());
	}
	
	@Test(priority = 2)
	 public void verifyAddAttachment() {
		testutil.switchToFrame();
		 documentuploadpage.AddAttachFile();
	}
	
	
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
