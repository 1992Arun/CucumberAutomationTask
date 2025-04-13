package org.step;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.utility.BaseClass;
import org.utility.Utility;

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
	
	@When("Enter {string} for login")
	public void enter_for_login(String string, io.cucumber.datatable.DataTable dataTable) {
		
		List<String> asList = dataTable.asList();
		
		sendKeys(l.getLoginEmail(), asList.get(0));

		sendKeys(l.getLoginPassword(), asList.get(1));
	   
	}

	@When("Enter Registration details")
	public void enter_Registration_details(io.cucumber.datatable.DataTable dataTable) {

		asMaps = dataTable.asMaps(String.class, String.class);

		sendKeys(l.getEnterSignUpEmail(), asMaps.get(0).get("Email"));
		
		Utility.writeProperty("email", asMaps.get(0).get("Email"));

		sendKeys(l.getEnterSignUpName(), asMaps.get(0).get("Name"));

		click(webDriverWait(10, l.getEnterSignUpButton()));

		sendKeys(r.getPassword(), asMaps.get(0).get("Password"));
		
		Utility.writeProperty("password", asMaps.get(0).get("Password"));

		selectByText(webDriverWait(10, r.getDobDay()), asMaps.get(0).get("Date"));

		selectByText(r.getDobMonth(), asMaps.get(0).get("Month"));

		selectByText(r.getDobYars(), asMaps.get(0).get("Year"));

		sendKeys(r.getFirst_name(), asMaps.get(0).get("First name"));
		
		Utility.writeProperty("Firstname", asMaps.get(0).get("First name"));

		sendKeys(r.getLast_name(), asMaps.get(0).get("Last name"));
		
		Utility.writeProperty("lastname", asMaps.get(0).get("Last name"));

		sendKeys(r.getCompany(), asMaps.get(0).get("Company"));
		
		Utility.writeProperty("Company", asMaps.get(0).get("Company"));

		sendKeys(r.getAddress1(), asMaps.get(0).get("Address"));
		
		Utility.writeProperty("Address", asMaps.get(0).get("Address"));

		sendKeys(r.getAddress2(), asMaps.get(0).get("Address2"));
		
		Utility.writeProperty("Address2", asMaps.get(0).get("Address2"));

		selectByText(r.getCountry(), asMaps.get(0).get("Country"));
		
		Utility.writeProperty("Country", asMaps.get(0).get("Country"));

		sendKeys(r.getState(), asMaps.get(0).get("State"));
		
		Utility.writeProperty("State", asMaps.get(0).get("State"));

		sendKeys(r.getCity(), asMaps.get(0).get("City"));
		
		Utility.writeProperty("City", asMaps.get(0).get("City"));

		sendKeys(r.getZipcode(), asMaps.get(0).get("Zipcode"));
		
		Utility.writeProperty("Zipcode", asMaps.get(0).get("Zipcode"));

		sendKeys(r.getMobile_number(), asMaps.get(0).get("Mobile Number"));
		
		Utility.writeProperty("MobileNumber", asMaps.get(0).get("Mobile Number"));

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

		Assert.assertTrue(getText(checkout.getDeliveryFirstName()).contains(Utility.getProperty("Firstname")));

		List<WebElement> address = checkout.getDeliveryAddress1();

		String company = getText(address.get(0));

		Assert.assertTrue(getText(address.get(0)).equals(Utility.getProperty("Company")));

		Assert.assertTrue(getText(address.get(1)).equals(Utility.getProperty("Address")));

		Assert.assertTrue(getText(address.get(2)).equals(Utility.getProperty("Address2")));

		Assert.assertTrue(getText(checkout.getCountry()).equals(Utility.getProperty("Country")));
		
		System.out.println(getText(checkout.getPhone()));
		
		System.out.println(Utility.getProperty("MobileNumber"));

		Assert.assertTrue(getText(checkout.getPhone()).equals(Utility.getProperty("MobileNumber")));

		String text = getText(checkout.getDeliveryStateCityZip());

		String[] split = text.split(" ");

		//System.out.println(split[0] + " " + asMaps.get(0).get("City"));

		Assert.assertTrue(split[1].contains(Utility.getProperty("State")));

		Assert.assertTrue((Utility.getProperty("City")).contains(split[0]));

		Assert.assertTrue(split[3].equals(Utility.getProperty("Zipcode")));

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
	
	@When("Scroll down to recommended items")
	public void scroll_down_to_recommended_items() {
	   
		scrollUp(l.getRecommendedItems());
	}
	
	@When("Scroll down page to bottom")
	public void scroll_down_page_to_bottom() {
		
		sleep(1);
	    
		scrollUp(l.getSubscriptionButton());
	}

	@When("Click on arrow at bottom right side to move upward")
	public void click_on_arrow_at_bottom_right_side_to_move_upward() {
		
		sleep(1);
	    
		click(l.getBottomUpArrowButton());
		
	}

	@Then("Verify that page is scrolled up and {string} text is visible on screen")
	public void verify_that_page_is_scrolled_up_and_text_is_visible_on_screen(String string) {
		
		sleep(1);
		
		getText(webDriverWait(10,l.getHeroImageText()));
		
		System.out.println(getText(webDriverWait(10,l.getHeroImageText())));
		
		
		Assert.assertTrue(string.equalsIgnoreCase(getText(webDriverWait(10,l.getHeroImageText()))));
		
		
	}

	
	@When("Click on {string} on Recommended product")
	public void click_on_on_Recommended_product(String string) {
		
		
	   
		List<WebElement> recommendedItemAddToCart = l.getRecommendedItemAddToCart();
		
		List<WebElement> recommendedItemName = l.getRecommendedItemName();
		
		
		
		for(int i=0;i<recommendedItemAddToCart.size();i++) {
			
			try {

		click(webDriverWait(5, recommendedItemAddToCart.get(i)));
		
		click(webDriverWait(5, l.getContinueShopping()));
			
		recit.add(getText(webDriverWait(5, recommendedItemName.get(i))));
				
       if(i==recommendedItemAddToCart.size()-1) {
    	      
			click(webDriverWait(5, l.getRecommendedProductForwardButton()));
			
			i=-1;
				
		}
       
			}
       
       catch(Exception e) {
       
    	   System.out.println(recit);
    	   
       
       }
			}
		
		

		}
		
		
		
		
	

	@Then("Verify that product is displayed in cart page")
	public void verify_that_product_is_displayed_in_cart_page() {
		
		List<WebElement> productsNameInCart = p.getProductsNameInCart();
		
		List<WebElement> productsPriceInCart = p.getProductsPriceInCart();
		
		for( int i=0; i<productsNameInCart.size();i++ ) {
			
			System.out.println("actutal: "+getText(productsNameInCart.get(i))); 
			
			System.out.println("expected: "+ recit.get(i));
			
			if (getText(productsNameInCart.get(i)).contains(recit.get(i))) {
			
		        Assert.assertTrue(getText(productsNameInCart.get(i)).contains(recit.get(i)));
		
			} else {
				
				Assert.assertTrue(getText(productsPriceInCart.get(i)).contains(recit.get(i)));
				
			}
		
		
			
		}
		
		
	    
		
	}






}
