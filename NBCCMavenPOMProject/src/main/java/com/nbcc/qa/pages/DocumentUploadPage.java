package com.nbcc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nbcc.qa.base.TestBase;

public class DocumentUploadPage extends TestBase {
	
	
    @FindBy(xpath="//b[contains(@style,'display: block;')]")
	WebElement DocumentUploadTitle;
	
	
	@FindBy(id="ATTACHADD$0")
	WebElement AddAttachment;
	
	
	public DocumentUploadPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyDocumentUploadTitle() {
		return DocumentUploadTitle.isDisplayed();
	}
	
	public void AddAttachFile() {
		AddAttachment.click();
	}
	
	

}
