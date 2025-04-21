package com.nbcc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nbcc.qa.base.TestBase;

public class PaymentPage extends TestBase {
	
	//@FindBy(xpath= "//div[@id='win0divDERIVED_SSTSNAV_PERSON_NAME']")
	@FindBy(xpath= "//span[contains(text(),'Make a Payment')]")
	//@FindBy(xpath= "//span[contains(text(),'Make a Payment')]")
	WebElement PNameLabel;
	
	@FindBy(xpath= "//span[contains(text(),'Account Inquiry')]")
	WebElement AccountInquiry;
	
	@FindBy(xpath= "//span[contains(text(),'Electronic Payments/Purchases')]")
	WebElement electronicPurchase;
	
	//span[contains(text(),'Electronic Payments/Purchases')]
	//[@style='font-size:11px; white-space: nowrap;']
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	 public boolean verifynamelabel() {
		return PNameLabel.isDisplayed();
		//System.out.println("Make a Payment");
	} 
	/*public void  verifynamelabel() {
	     PNameLabel.isDisplayed();
		 System.out.println("Make a Payment");
	}*/
	
	public void verifyaccounttext() {
		AccountInquiry.isDisplayed();
		System.out.println("Account label");
	}
	
	public void clickonelectronicpurchaselink() {
		electronicPurchase.click();
		
	}

}
