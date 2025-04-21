package com.nbcc.qa.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nbcc.qa.base.TestBase;

import com.nbcc.qa.pages.HomePage;
import com.nbcc.qa.pages.LoginPage;

import com.nbcc.qa.pages.RefundPage;
import com.nbcc.qa.util.TestUtil;





public class RefundPageTest extends TestBase{

	LoginPage loginpage;
	HomePage homePage;
	TestUtil testutil;
	RefundPage refundpage;
	
	
	
 
	public RefundPageTest() {
		super();

	}

	
	
	@BeforeMethod
	public void setUP() throws InterruptedException {
		initialization(); 
		loginpage = new LoginPage();
		refundpage= new RefundPage();

		testutil= new TestUtil();
		
	    homePage =	loginpage.SignIn(prop.getProperty("username"), prop.getProperty("password"));
	    refundpage=  homePage.clickOnRefundLink();
			
	}
	
	
	
	@Test(priority = 1)
	public void verifyRefundPageLabel() {
		testutil.switchToFrame();
		Assert.assertTrue(refundpage.verifyRefundpageText());
	}
	
	
	
	@Test(priority = 2)
	public void verifyRefundAmount() {
	testutil.switchToFrame();
	Assert.assertTrue(refundpage.verifyRefundamount());
	}
	
	@Test(priority = 3)
	public void verifyNewWindow() {
		testutil.switchToFrame();
		refundpage.verifynewwindowlink();
	}
	
	
	@Test(priority = 4)
	public void verifypersonalizepagelink() {
		testutil.switchToFrame();
		refundpage.verifyPersonalizePagelink();
	}
	
	
	
	
	
	
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
}
