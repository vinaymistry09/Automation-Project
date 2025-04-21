	package com.nbcc.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nbcc.qa.base.TestBase;
import com.nbcc.qa.pages.HomePage;
import com.nbcc.qa.pages.LoginPage;
import com.nbcc.qa.pages.RefundPage;
import com.nbcc.qa.pages.StudentSelfService;
import com.nbcc.qa.util.TestUtil;


public class StudentSelfSerivceTest extends TestBase {
	
	
	
	LoginPage loginpage;
	HomePage homePage;
	TestUtil testutil;
	RefundPage refundpage;
	StudentSelfService studentselfservice;
	
	
	
	public StudentSelfSerivceTest() {
		super();

	}

	
	
	@BeforeMethod
	public void setUP() throws InterruptedException {
		initialization(); 
		loginpage = new LoginPage();
		
		studentselfservice = new StudentSelfService();
		testutil= new TestUtil();
		homePage =	loginpage.SignIn(prop.getProperty("username"), prop.getProperty("password"));
		studentselfservice= homePage.clickOnStudentCenterLink();
	}
	
	
	@Test(priority = 1)
	public void verifyNotificationText() {
		testutil.switchToFrame();
		String Title= studentselfservice.verifynotificationTitle();
		Assert.assertEquals(Title, "If you have any questions regarding schedule, assignments or grades, please contact the Academic Department.");
		
	}
	
	@Test(priority = 2)
	public void verifyAcademicTitle() {
		testutil.switchToFrame();
		studentselfservice.verifyAcademicTitle();
		System.out.println("Academic");
	}
	
	@Test(priority = 3)
	public void verifyseachclassbutton() {
			testutil.switchToFrame();
		studentselfservice.verfiysearchbutton();
		
	
	
	}
	
	
	
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
