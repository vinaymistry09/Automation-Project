package com.nbcc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nbcc.qa.base.TestBase;

public class RefundPage extends TestBase {
	
	
	
	@FindBy(id="win0divZ_DERIVED_WRK_DESCR254")
	WebElement RefundpageTextLabel;
	
	@FindBy(xpath="/a[@name=\"Z_DERIVED_WRK$srt4$0\"]")
	WebElement RefundAmount;
	
	@FindBy(linkText = "New Window")
	WebElement Newwindowlink;
	
	
	@FindBy(linkText = "Personalize Page")
	WebElement PersonalizePage;
	
	
	
	public RefundPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Method
	
	
	public boolean verifyRefundpageText() {
		return RefundpageTextLabel.isDisplayed();
	}
	
	
	public boolean verifyRefundamount() {
		return RefundAmount.isDisplayed();
	}
	
	
	public void verifynewwindowlink() {
		Newwindowlink.click();
	}
	
	
	public void verifyPersonalizePagelink() {
		PersonalizePage.click();
	}
}





