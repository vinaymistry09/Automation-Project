package com.nbcc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nbcc.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Object Repository
	
	@FindBy(name="userid")
	WebElement username;
	
	@FindBy(name="pwd")
	WebElement password;
	
	//@FindBy(xpath="//input[@type='submit']")
	@FindBy(xpath="//body/div[@id='pswrapper']/form[@id='login']/div[1]/div[1]/div[7]/input[1]")
	WebElement SignIn;
	
	
	//@FindBy(xpath="//img[(@src='/selfsrv/images/OPSE_logo.gif\')]")
	@FindBy(xpath="//body/div[@id='pswrapper']/form[@id='login']/div[1]/h1[1]/img[1]")
	WebElement NbccLOGO;
	
	
	//Initializing the page Objects;
	public LoginPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	
	public String validateloginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateNbccLogo() {
		return NbccLOGO.isDisplayed();
	}
	
	public HomePage SignIn(String un, String pwd) throws InterruptedException {
		username.sendKeys("apanchal01");
		password.sendKeys("Akkibhiloda@3697");
		SignIn.click();
		
		Thread.sleep(60000);
		
		return new HomePage();
		
	}
	
	

}
