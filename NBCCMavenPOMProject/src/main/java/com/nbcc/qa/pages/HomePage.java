package com.nbcc.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nbcc.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(xpath="//p[contains(text(),'APANCHAL01 on NBCCCPRD (Axay Dineshkumar Panchal - ID # 5073298)')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//span[contains(text(),'Refund Passcode')]")
	WebElement refundLink;
	
	@FindBy(xpath="//span[contains(text(),'Make a Payment')]")
	WebElement paymentLink;
	
	@FindBy(xpath="//span[contains(text(),'Student Self-Service Center')]")
	WebElement studentcenterLink;
	
	@FindBy(xpath="//span[contains(text(),'Document Upload')]")
	WebElement documentLink;
	
	
	//Initializing the page Objects;
		public HomePage()
		{
			PageFactory.initElements(driver, this);
		}
	
		
   //Methods;
		public String verifyHomePageTitle() {
			return driver.getTitle();
		}
		
		public boolean verifyCorrectUserName() {
			return userNameLabel.isDisplayed();
		}
		
		
		public RefundPage clickOnRefundLink() {
			refundLink.click();
			return new RefundPage();
		}
		
		public PaymentPage clickOnPaymentLink() {
			paymentLink.click();
			return new PaymentPage();
		}
	
	
		public StudentSelfService clickOnStudentCenterLink() {
			studentcenterLink.click();
			return new StudentSelfService();
		}
		
		public DocumentUploadPage clickOnDocumentLink() {
			documentLink.click();
			return new DocumentUploadPage();
		
	 
		
	
 
		}

}
