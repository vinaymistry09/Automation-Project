package com.nbcc.qa.testcases;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nbcc.qa.base.TestBase;
import com.nbcc.qa.pages.DocumentUploadPage;
import com.nbcc.qa.pages.HomePage;
import com.nbcc.qa.pages.LoginPage;
import com.nbcc.qa.pages.PaymentPage;
import com.nbcc.qa.pages.RefundPage;
import com.nbcc.qa.pages.StudentSelfService;



public class HomePageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homePage;
	RefundPage refundpage;
	PaymentPage paymentpage;
	StudentSelfService studentselfservice;
	DocumentUploadPage documentpage;

	public HomePageTest() {
		super();

	}
	
	//Test case should be separted-- independent each other
	//Before each test case --launch the browser and login
	//After each test case-- close the browser
	
	@BeforeMethod
	public void setUP() throws InterruptedException {
		initialization(); 
		loginpage = new LoginPage();
		refundpage= new RefundPage();
		paymentpage= new PaymentPage();
		studentselfservice= new StudentSelfService();
		documentpage= new DocumentUploadPage();
	    homePage =	loginpage.SignIn(prop.getProperty("username"), prop.getProperty("password"));
			
	}
	
	
	@Test (priority = 1)
	public void verifyHomePageTitleTest() {
		String homePageTitle= homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle,"Homepage");
	}
	
	@Test (priority = 2)
	public void verifyUserName() {
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}
	
	@Test (priority = 3)
	public void verifyRefundPagelink() {
		refundpage = homePage.clickOnRefundLink();
	}
	
	@Test(priority = 4)
	public void verifyPaymentPageLink() {
		paymentpage= homePage.clickOnPaymentLink();
	}
	
	@Test(priority = 5)
	public void verifyStudentSelfPageLink() {
		studentselfservice= homePage.clickOnStudentCenterLink();
	}
	
	@Test(priority = 6)
	public void verifyDocumentPageLink() {
		documentpage= homePage.clickOnDocumentLink();
	}
	
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
		
	
	
}
