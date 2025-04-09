package org.step;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStep extends org.utility.BaseClass {



	public static String email;
	
	
	public static Map<String, String> mp = new HashMap();

	@Given("Launch browser and Navigate to url {string}")
	public void launch_browser_and_Navigate_to_url(String string) {

	

		launchURL("https://automationexercise.com/");
		
		
	     
	}

	@Then("Verify {string} is visible")
	public void verify_is_visible(String string) {
		
		

		if (string.equals("home page")) {

			Assert.assertTrue(webDriverWait(10, l.getLandedOnHomePage()).isDisplayed());

		} else if (string.equals("Login to your account")) {

			Assert.assertTrue(webDriverWait(10, l.getLoginToAccount()).isDisplayed());

		} else if (string.equals("Logged in as username")) {

			Assert.assertTrue(webDriverWait(10, l.getSingedAs()).isDisplayed());

		} else if (string.equals("ACCOUNT DELETED!")) {

			Assert.assertTrue(webDriverWait(10, l.getDeleteAccountConfirmationText()).isDisplayed());

		} else if (string.equalsIgnoreCase("ENTER ACCOUNT INFORMATION")) {

			int i = 0;

			while (i < 5) {

				try {

					Assert.assertTrue(r.getEnterAccountInformationText().isDisplayed());

//					if (webDriverWait(2, l.getEmailAlreadyExist()).isDisplayed()) {
//
//						System.out.println("Valid email is entered");
//
						break;

					//}

				} catch (Exception e) {

					Random r = new Random();

					email = "Arq" + r.nextInt(100) + "u@fas.com";

					Actions a = new Actions(driver);

					sleep(2);

					a.click(l.getEnterSignUpEmail()).keyDown(Keys.CONTROL).sendKeys("a").sendKeys(Keys.BACK_SPACE)
							.keyUp(Keys.CONTROL).perform();

					sendKeys(l.getEnterSignUpEmail(), email);

					Utility.writeProperty("email", email);

					click_on_button("Signup");

				}

				i++;

				if (i == 4) {

					System.out.println(" 4 attempts failed");
				}

			}

		} else if (string.equals("invalid Credentials")) {
			
				int i = 0;

			

					try {

						   while (l.getInvalidCredentialsText().isDisplayed()) {
							   
						   
							   Random r = new Random();

								email = "Arq" + r.nextInt(100) + "u@fas.com";

								Actions a = new Actions(driver);

								a.click(l.getLoginEmail()).keyDown(Keys.CONTROL).sendKeys("a").sendKeys(Keys.BACK_SPACE)
										.keyUp(Keys.CONTROL).perform();

								sendKeys(l.getLoginEmail(), email);
								
								System.out.println(email);

								a.click(l.getLoginPassword()).keyDown(Keys.CONTROL).sendKeys("a").sendKeys(Keys.BACK_SPACE)
								.keyUp(Keys.CONTROL).perform();
								
								sendKeys(l.getLoginPassword(), Utility.getProperty("password"));
								
								System.out.println(Utility.getProperty("password"));

								click_on_button("login");
							   
						   }

		

					} catch (Exception e) {

						
						

					}

//					i++;
//
//					if (i == 4) {
//
//						System.out.println(" 4 attempts failed");
//					}
				
				
				
		
			
		} else if (string.equals("SEARCHED PRODUCTS")) {

			
			Assert.assertTrue(p.getSearchedProductsText().isDisplayed());
			
			System.out.println("seaealskdj");
		
		}else if (string.equals("Cart page")) {
		
			System.out.println("cart page is visible");
			
			Assert.assertTrue(webDriverWait(10, l.getLandedOnCartPage()).isDisplayed());
			
		}else if (string.equals("Order Placed!")) {
		
			Assert.assertTrue(webDriverWait(10,checkout.getOrderPlacedMessage()).isDisplayed());
			
		}
	

	}

	@When("Click on {string} button")
	public void click_on_button(String string) {

		if (string.equalsIgnoreCase("Signup / Login")) {

			click(webDriverWait(10, l.getSingupButton()));

		} else if (string.equalsIgnoreCase("login")) {

			click(webDriverWait(10, l.getLoginButton()));

		} else if (string.equals("Logout")) {

			click(webDriverWait(10, l.getLogoutButton()));

		} else if (string.equals("Delete Account")) {

			click(webDriverWait(10, l.getDeleteAccount()));

		} else if (string.equals("Signup")) {

			click(webDriverWait(10, l.getEnterSignUpButton()));

		} else if (string.equals("Continue")) {

			click(webDriverWait(10, l.getContinueButton()));

		} else if (string.equals("Home")) {

			click(webDriverWait(10, l.getHomeButton()));
		} 
		
		else if (string.equals("Proceed To Checkout")) {
			
		

			click(webDriverWait(10, l.proceedToCheckout));
		} 

		 
		
		
		
		

	}

	@Then("Enter {string}")
	public void enter(String string) {

		if (string.equals("correct email address and password")) {

			sendKeys(l.getLoginEmail(), Utility.getProperty("email"));
			
			

			sendKeys(l.getLoginPassword(), Utility.getProperty("password"));

		} else if (string.equals("name and email address")) {

			Random r = new Random();

			try {

				email = "Arq" + r.nextInt(5) + "u@fas.com";

				sendKeys(l.getEnterSignUpEmail(), email);

				Utility.writeProperty("email", email);

				sendKeys(l.getEnterSignUpName(), "Arun");

				System.out.println("Arq" + r.nextInt(5) + "u@fas.com");

			} catch (Exception e) {

				System.out.println("Arq" + r.nextInt(5) + "u@fas.com" + "is already present");
			}

			// sendKeys(l.getEnterSignUpName(), "Arun");
			//
			// System.out.println("Arq" + r.nextInt(100) + "u@fas.com");

		} else if (string.equals("ENTER ACCOUNT INFORMATION")) {

			try {

				Assert.assertTrue(l.getEnterAccountInformationText().isDisplayed());

			} catch (Exception e) {

				System.out.println("Element not displayed");

			}

		}

		else if (string.equals("any email address and password")) {

			int i = 0;

			while (i < 5) {

				try {

					if (!l.getInvalidCredentialsText().isDisplayed())
						;

					// if (webDriverWait(2, l.getEmailAlreadyExist()).isDisplayed()) {
					//
					// System.out.println("Valid email is entered");
					//
					break;

					// }

				} catch (Exception e) {

					Random r = new Random();

					email = "Arq" + r.nextInt(100) + "u@fas.com";

					Actions a = new Actions(driver);

					a.click(l.getLoginEmail()).keyDown(Keys.CONTROL).sendKeys("a").sendKeys(Keys.BACK_SPACE)
							.keyUp(Keys.CONTROL).perform();

					sendKeys(l.getLoginEmail(), email);

					sendKeys(l.getLoginPassword(), Utility.getProperty("password"));

					click_on_button("login");

				}

				i++;

				if (i == 4) {

					System.out.println(" 4 attempts failed");
				}
			}
			
		} 

	}

	@Then("Select checkbox {string}")
	public void select_checkbox(String string) {

		if (string.equalsIgnoreCase("Sign up for our newsletter!")) {

			click(r.getSignUpForNewsLetter());

		}

		if (string.equalsIgnoreCase("Receive special offers from our partners!")) {

			click(r.getReceiveSpecialOffer());

		}

	}
	


	@Then("Fill details userDetails")
	public void fill_details_userDetails() throws IOException {

		String[][] readExcel = Utility.readExcel();
		
		for(int i=0; i<readExcel.length; i++) {
			
			click(r.getMale());
			
			selectByText(r.getDobDay(), readExcel[i][4]);

			selectByText(r.getDobMonth(),  readExcel[i][5]);

			selectByText(r.getDobYars(), readExcel[i][6]);
			
			sendKeys(r.getPassword(), readExcel[i][2]);
			
			Utility.writeProperty("password",  readExcel[i][2]);
		
		sendKeys(r.getFirst_name(), readExcel[i][7]);

		mp.put("first", getAttribute(r.getFirst_name(), readExcel[i][7]));

		sendKeys(r.getLast_name(), readExcel[i][8]);

		mp.put("last", getAttribute(r.getLast_name(), readExcel[i][8]));

		sendKeys(r.getCompany(), readExcel[i][9]);

		mp.put("Company", getAttribute(r.getCompany(), readExcel[i][9]));

		sendKeys(r.getAddress1(), readExcel[i][10]);

		mp.put("Address1", getAttribute(r.getAddress1(), readExcel[i][10]));

		sendKeys(r.getAddress2(), readExcel[i][11]);

		mp.put("Address2", getAttribute(r.getAddress2(), readExcel[i][11]));

		selectByText(r.getCountry(), readExcel[i][12]);

		mp.put("Country", getAttribute(r.getCountry(), readExcel[i][12]));

		sendKeys(r.getState(), readExcel[i][14]);

		mp.put("State", getAttribute(r.getState(), readExcel[i][14]));

		sendKeys(r.getCity(), readExcel[i][15]);

		mp.put("City", getAttribute(r.getCity(), readExcel[i][15]));

		sendKeys(r.getZipcode(), readExcel[i][13]);

		mp.put("Zip", getAttribute(r.getZipcode(), readExcel[i][13]));

		sendKeys(r.getMobile_number(), readExcel[i][16]);

		mp.put("MobileNumber", getAttribute(r.getMobile_number(), readExcel[i][16]));

		r.getMobile_number().submit();
		
		
		
		break;
		
		}

	}

	

}
