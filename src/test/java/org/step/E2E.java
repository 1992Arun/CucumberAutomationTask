package org.step;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.utility.BaseClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class E2E extends BaseClass {

	

	public static List<Map<String, String>> asMaps;

	public static List<String> productName = new LinkedList();

	public static List<String> productPrice = new LinkedList();

	public static int numberOfProducts;

	public static int productCount;

	@When("Add products to cart")
	public void add_products_to_cart() {

	

		numberOfProducts = 6;

		int k = 0;

		for (int i = 1; i <= numberOfProducts; i++) {

			try {

				movetoElement(l.selectproduct(i));

				productName.add(l.getproductText(i, "name"));

				productPrice.add(l.getproductText(i, "price"));

				click(webDriverWait(2, l.selectproduct(i)));

				click(webDriverWait(2, l.getContinueShopping()));

			}

			catch (Exception e) {

				webDriverWait(2, l.addCloseButton()).isDisplayed();

				click(l.addCloseButton());

			}

		}

	}

	@When("Enter Registration details")
	public void enter_Registration_details(io.cucumber.datatable.DataTable dataTable) {

		asMaps = dataTable.asMaps(String.class, String.class);

		sendKeys(l.getEnterSignUpEmail(), asMaps.get(0).get("Email"));

		sendKeys(l.getEnterSignUpName(), asMaps.get(0).get("Name"));

		click(webDriverWait(10, l.getEnterSignUpButton()));

		sendKeys(r.getPassword(), asMaps.get(0).get("Password"));

		selectByText(webDriverWait(10, r.getDobDay()), asMaps.get(0).get("Date"));

		selectByText(r.getDobMonth(), asMaps.get(0).get("Month"));

		selectByText(r.getDobYars(), asMaps.get(0).get("Year"));

		sendKeys(r.getFirst_name(), asMaps.get(0).get("First name"));

		sendKeys(r.getLast_name(), asMaps.get(0).get("Last name"));

		sendKeys(r.getCompany(), asMaps.get(0).get("Company"));

		sendKeys(r.getAddress1(), asMaps.get(0).get("Address"));

		sendKeys(r.getAddress2(), asMaps.get(0).get("Address2"));

		selectByText(r.getCountry(), asMaps.get(0).get("Country"));

		sendKeys(r.getState(), asMaps.get(0).get("State"));

		sendKeys(r.getCity(), asMaps.get(0).get("City"));

		sendKeys(r.getZipcode(), asMaps.get(0).get("Zipcode"));

		sendKeys(r.getMobile_number(), asMaps.get(0).get("Mobile Number"));

		r.getMobile_number();

		click(r.getCreateAccount());

	}

	@Then("Verify {string} at top")
	public void verify_at_top(String string) {

		int y = l.getSingedAs().getLocation().getY();

		System.out.println(y);

		Assert.assertTrue(y <= 100);

	}

	@Then("Verify Address Details and Review Your Order")
	public void verify_Address_Details_and_Review_Your_Order() {

		Assert.assertTrue(getText(checkout.getDeliveryFirstName()).contains(asMaps.get(0).get("First name")));

		List<WebElement> address = checkout.getDeliveryAddress1();

		String company = getText(address.get(0));

		Assert.assertTrue(getText(address.get(0)).equals(asMaps.get(0).get("Company")));

		Assert.assertTrue(getText(address.get(1)).equals(asMaps.get(0).get("Address")));

		Assert.assertTrue(getText(address.get(2)).equals(asMaps.get(0).get("Address2")));

		Assert.assertTrue(getText(checkout.getCountry()).equals(asMaps.get(0).get("Country")));

		Assert.assertTrue(getText(checkout.getPhone()).equals(asMaps.get(0).get("Mobile Number")));

		String text = getText(checkout.getDeliveryStateCityZip());

		String[] split = text.split(" ");

		System.out.println(split[0] + " " + asMaps.get(0).get("City"));

		Assert.assertTrue(split[1].contains(asMaps.get(0).get("State")));

		Assert.assertTrue((asMaps.get(0).get("City")).contains(split[0]));

		Assert.assertTrue(split[3].equals(asMaps.get(0).get("Zipcode")));

		for (int i = 0; i < productName.size(); i++) {

			String cartProduct = getText(checkout.getCartProductName().get(i)).replaceAll("\\s+", " ").trim();
			String expectedProduct = productName.get(i).replaceAll("\\s+", " ").trim();

			Assert.assertEquals(cartProduct, expectedProduct);

		}

		for (int i = 0; i < productPrice.size(); i++) {

			String[] split2 = getText(checkout.getCartProductPrice().get(i)).split(" ");

			Assert.assertTrue(productPrice.get(i).equals(split2[1]));

		}

	}

	@Then("Enter description in comment text area and")
	public void enter_description_in_comment_text_area_and() {

		sendKeys(checkout.getCheckoutComment(), "Gift to my Love");
	}

	@When("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
	public void enter_payment_details_Name_on_Card_Card_Number_CVC_Expiration_date() {

		sendKeys(checkout.getCardName(), "Arun");

		sendKeys(checkout.getCardNumber(), "3654899012374685");

		sendKeys(checkout.getcVC(), "129");

		sendKeys(checkout.getExpiryMonth(), "03");

		sendKeys(checkout.getExpiryYear(), "2030");

	}

	@Then("Verify {string}")
	public void verify(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@When("Enter email address and password")
	public void enter_email_address_and_password() {

		sendKeys(l.getLoginEmail(), asMaps.get(0).get("Email"));

		sendKeys(l.getLoginPassword(), asMaps.get(0).get("Password"));

		click(l.getLoginButton());
	}

	@When("Click {string} button and Verify success message {string} is visible")
	public void click_button_and_Verify_success_message_is_visible(String string, String string2) {

		click(checkout.getPayAndConfirmOrder());

		
	}
	
	
	@When("Click X button and Verify that product is removed from the cart")
	public void click_X_button_and_Verify_that_product_is_removed_from_the_cart() {
		
		
		for (int i = 1; i <= numberOfProducts; i++) {
			   
			 click(webDriverWait(10, checkout.getRemoveFromCart()));
			 
			 driver.navigate().refresh();
				
				}
		
	}

	@When("Verify that product is removed from the cart")
	public void verify_that_product_is_removed_from_the_cart() {
		
		
	   Assert.assertTrue(checkout.getCartIsEmpty().isDisplayed());
		
		
	}



}
