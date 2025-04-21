package com.nbcc.qa.testcases;

import org.junit.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nbcc.qa.base.TestBase;
import com.nbcc.qa.pages.HomePage;
import com.nbcc.qa.pages.LoginPage;



public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();

	}
	
	
	@BeforeMethod
	public void setUP() {
		initialization(); 
		loginpage = new LoginPage();
			
	}
	
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginpage.validateloginPageTitle();
		Assert.assertEquals(title, "Oracle PeopleSoft Sign-in");
	}
	
	@Test (priority=2)
	public void NbccLogoImageTest() {
	Boolean flag = loginpage.validateNbccLogo();
	Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void signinTest() throws InterruptedException {
		homePage= loginpage.SignIn(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
