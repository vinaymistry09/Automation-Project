package com.nbcc.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nbcc.qa.base.TestBase;
import com.nbcc.qa.pages.HomePage;
import com.nbcc.qa.pages.LoginPage;
import com.nbcc.qa.pages.PaymentPage;
import com.nbcc.qa.util.TestUtil;


public class PaymentPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homePage;
	PaymentPage paymentpage;
	TestUtil testUtil;
	
	
	public PaymentPageTest() {
		super();

	}

	
	
	@BeforeMethod
	public void setUP() throws InterruptedException {
		initialization(); 
		loginpage = new LoginPage();
		paymentpage= new PaymentPage();
		testUtil= new TestUtil();
		
	    homePage =	loginpage.SignIn(prop.getProperty("username"), prop.getProperty("password"));
	    paymentpage=  homePage.clickOnPaymentLink();
	    
	}
	   
	  @Test (priority = 1)
	  public void verifypaymentpageLabel() {
		  testUtil.switchToFrame();
			Assert.assertTrue(paymentpage.verifynamelabel());
		    paymentpage.verifynamelabel();
		}
	  
	 @Test(priority = 2)
	  public void verifyaccounttexttest() {
		 testUtil.switchToFrame();
		  paymentpage.verifyaccounttext();
	  }
	  
	 @Test(priority = 3)
	  public void verifyelectronicpurchaselink() {
		 testUtil.switchToFrame();
		 paymentpage.clickonelectronicpurchaselink();
	  }
	   
	    
	   
	  @AfterMethod
		public void tearDown() {
			driver.quit();
		}
			
		
	   
			
	

}
