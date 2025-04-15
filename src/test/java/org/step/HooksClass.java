package org.step;

import java.util.LinkedList;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.pom.CheckOutPage;
import org.pom.ContactUsPOM;
import org.pom.LoginPage;
import org.pom.ProductDetails;
import org.pom.ProductsSearch;
import org.pom.RegisterPOM;
import org.pom.TestCasedPagePOM;
import org.utility.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {

	@Before
	public void setUp() {

		driver = browserLaunch("Chrome");

		l = new LoginPage();
		
		checkout = new CheckOutPage();
		
		p = new ProductsSearch();
		
		r = new RegisterPOM();

		t = new TestCasedPagePOM();

		product = new ProductDetails();

		c = new ContactUsPOM();
		
		recit = new LinkedList();

		productName = new LinkedList();
		
		productPrice = new LinkedList();
	}

	@After
	public void tearDown(Scenario sc) {

		if(sc.isFailed()) {
			
			TakesScreenshot tk = (TakesScreenshot)driver;
			
			byte[] screenshotAs = tk.getScreenshotAs(OutputType.BYTES);
			
			sc.embed(screenshotAs, "images/png");
			
		}
		

		 if (driver != null) {
		 driver.quit();
		
		 }
		
		
	}

}
