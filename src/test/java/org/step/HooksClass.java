package org.step;

import org.pom.CheckOutPage;
import org.pom.ContactUsPOM;
import org.pom.LoginPage;
import org.pom.ProductDetails;
import org.pom.ProductsSearch;
import org.pom.RegisterPOM;
import org.pom.TestCasedPagePOM;
import org.utility.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	
	
	@Before
    public void setUp() {
       
		
		 driver = browserLaunch("Chrome");

        l = new LoginPage();
       checkout = new CheckOutPage();
        p = new ProductsSearch();
       r  = new RegisterPOM();
    	
    	t= new TestCasedPagePOM();
    	
    	product = new ProductDetails() ;
    	
    	 c = new ContactUsPOM();
    	 
    }
	
	
	@After
	public void tearDown() {
		
		if (driver != null) {
	        driver.quit();
	   
		}
	}

}
