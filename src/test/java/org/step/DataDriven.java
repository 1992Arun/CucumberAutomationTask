package org.step;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.utility.BaseClass;
import org.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataDriven extends BaseClass {

	
	
	public static Map<String, String> mp = new HashMap();


	@Given("launch browser and Navigate to url {string}")
	public void launch_browser_and_Navigate_to_url(String string) {

		launchURL(string);

	
	}

	@Then("Verify {string} is there")
	public void verify_is_there(String string) {

		if (string.equals("home page")) {

			Assert.assertTrue(webDriverWait(10, l.getLandedOnHomePage()).isDisplayed());

		}else if (string.equals("Login to your account")) {

			Assert.assertTrue(webDriverWait(10, l.getLoginToAccount()).isDisplayed());

		}
		
		
		

	}

	@When("Click on {string}")
	public void click_on(String string) {

		if (string.equalsIgnoreCase("Signup / Login")) {

			click(webDriverWait(10, l.getSingupButton()));

		}
	}

	@When("Enter {string} detail")
	public void enter_detail(String string) throws IOException {
	  	
   if(string.equals("registration")) {

		String[][] data = Utility.readExcel();
		
		for(int i=0; i<data.length;i++) {
			
			Actions a = new Actions(driver);

		sendKeys(l.getEnterSignUpEmail(), data[i][1]);

		sendKeys(l.getEnterSignUpName(), data[i][0]);
		
		click(l.getEnterSignUpButton());
		
		
		if(data[i][3].equals("Mr")) {
		
		click(r.getMale());
	
		}else if(data[i][3].equals("Ms")) {
			
			click(r.getFemale());
		
			}
		
		sendKeys(r.getPassword(), data[i][2]);
		
		selectByText(r.getDobDay(), data[i][4]);

		selectByText(r.getDobMonth(),  data[i][5]);

		selectByText(r.getDobYars(), data[i][6]);
	
	sendKeys(r.getFirst_name(), data[i][7]);

	mp.put("first", getAttribute(r.getFirst_name(), data[i][7]));

	sendKeys(r.getLast_name(), data[i][8]);

	mp.put("last", getAttribute(r.getLast_name(), data[i][8]));

	sendKeys(r.getCompany(), data[i][9]);

	mp.put("Company", getAttribute(r.getCompany(), data[i][9]));

	sendKeys(r.getAddress1(), data[i][10]);

	mp.put("Address1", getAttribute(r.getAddress1(), data[i][10]));

	sendKeys(r.getAddress2(), data[i][11]);

	mp.put("Address2", getAttribute(r.getAddress2(), data[i][11]));

	selectByText(r.getCountry(), data[i][12]);

	mp.put("Country", getAttribute(r.getCountry(), data[i][12]));

	sendKeys(r.getState(), data[i][14]);

	mp.put("State", getAttribute(r.getState(), data[i][14]));

	sendKeys(r.getCity(), data[i][15]);

	mp.put("City", getAttribute(r.getCity(), data[i][15]));

	sendKeys(r.getZipcode(), data[i][13]);

	mp.put("Zip", getAttribute(r.getZipcode(), data[i][13]));

	sendKeys(r.getMobile_number(), data[i][16]);

	mp.put("MobileNumber", getAttribute(r.getMobile_number(), data[i][16]));

	r.getMobile_number().submit();
	
	click(l.getHomeButton());
	
	click(l.getLogoutButton());
	
	click(l.getSingupButton());

		}
		
		
		
		}else if (string.equals("login details")) {
			

			String[][] data = Utility.readExcel();
			
			for(int i=0; i<data.length;i++) {
				
				sendKeys(l.getLoginEmail(), data[i][1]);
				
				sendKeys(l.getLoginPassword(), data[i][2]);
				
				click(l.getLoginButton());
				
				click(l.getDeleteAccount());
				
				click(l.getSingupButton());
				
				
			}
			
		}

	}

	

}
