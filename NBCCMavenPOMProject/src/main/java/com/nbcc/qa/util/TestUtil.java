package com.nbcc.qa.util;

import com.nbcc.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	
	public  static long PAGE_LOAD_TIMEOUTS= 20;
	public  static long IMPLICIT_WAIT = 10;
 
	
	public void switchToFrame() {
		driver.switchTo().frame("TargetContent");
	}
	

}
