package com.nbcc.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.nbcc.qa.base.TestBase;

public class StudentSelfService extends TestBase {
	
	
	@FindBy(xpath= "//li[contains(text(),'If you have any questions regarding schedule, assi')]")
	WebElement NotificationText;
	
	@FindBy(xpath= "//div[@id='win0divDERIVED_SSS_SCL_SS_ACAD_INFO_LINKGP']")
	WebElement AcademicsText;
	
	@FindBy(xpath = "//div[@class='ps_pspagecontainer']")
	WebElement SearchClassClick; 
	
	//input[@id='DERIVED_SSS_SCL_SSS_GO_4$83$']
	
	
	public StudentSelfService() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifynotificationTitle() {
		return driver.getTitle();
	}
	
	
	public void verifyAcademicTitle() {
		AcademicsText.isDisplayed();
	}
	
	public void verfiysearchbutton() {
		SearchClassClick.click();
	}
	
	public void selectPIDropdown(String DERIVED_SSS_SCL_SSS_MORE_PROFILE) {
		Select select= new Select(driver.findElement(By.name("DERIVED_SSS_SCL_SSS_MORE_PROFILE")));
		select.selectByVisibleText("DERIVED_SSS_SCL_SSS_MORE_PROFILE");
	}
	
}
