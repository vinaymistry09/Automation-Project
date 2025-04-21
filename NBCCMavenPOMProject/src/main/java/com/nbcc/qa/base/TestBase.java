package com.nbcc.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;

import com.nbcc.qa.util.TestUtil;

public class TestBase {
	
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() {
		
		
		try {

			FileInputStream fi = new FileInputStream("C:\\Users\\vinay.mistry\\eclipse-workspace\\NbccMavenAutomationTest\\src\\"
					+"main\\java\\com\\nbcc\\qa\\config\\config.properties");
		
		prop = new Properties();
		prop.load(fi);	
				
		}
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
	}
		
	public static void initialization() {
		
		//String browser= prop.getProperty("browser");
		
		String browserName =  prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver12.exe");
		    driver=new ChromeDriver();
		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver","C:\\Selenium Webdriver\\FirefoxDriver\\geckodriver-v0.35.0-win64\\geckodriver.exe");		
			 driver=new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUTS, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	
		
	}

}
