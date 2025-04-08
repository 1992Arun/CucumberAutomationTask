package org.step;

import org.utility.BaseClass;

import io.cucumber.java.After;

public class HooksClass extends BaseClass {
	
	@After
	public void tearDown() {
		
//		if (driver != null) {
//	        driver.quit();
//	    }
		
	}

}
