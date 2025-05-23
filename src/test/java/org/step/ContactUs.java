package org.step;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utility.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUs extends BaseClass {

	public static int productCount;

	public static String productName;

	@Given("Launch browser and navigate to {string}")
	public void launch_browser_and_navigate_to(String string) {

		launchURL(string);

	}

	@When("Verify that home page is visible successfully")
	public void verify_that_home_page_is_visible_successfully() {

		Assert.assertTrue(webDriverWait(10, l.getLandedOnHomePage()).isDisplayed());

	}

	@Then("Verify landed on form and {string} is visible")
	public void verify_landed_on_form_and_is_visible(String string) {

		if (string.equals("GET IN TOUCH")) {

			Assert.assertTrue(webDriverWait(10, c.getinTouchText).isDisplayed());

		}
	}

	@When("Click {string} button")
	public void click_button(String string) {

		if (string.equals("Contact Us")) {

			click(webDriverWait(10, l.getContactUs()));

		} else if (string.equals("Submit")) {

			click(webDriverWait(10, c.getSubmit()));

		} else if (string.equals("OK")) {

			accepteAlert();

		} else if (string.equals("Test Cases")) {

			click(l.getTestCasesButton());

		} else if (string.equals("Products")) {

			click(l.getProductsButton());

		} else if (string.equals("Cart")) {
			
			click(webDriverWait(10, l.getCartButton()));

		} else if (string.equals("Add to cart")) {

			click(product.getAddToCart());

		} else if (string.equals("View Cart")) {

			click(webDriverWait(10, product.getProductAddedViewCart()));
		}

		else if (string.equals("Continue")) {

			click(webDriverWait(10, l.getContinueButton()));
		}

		else if (string.equals("Proceed To Checkout")) {

			click(webDriverWait(10, l.proceedToCheckout));
		}

		else if (string.equals("Registe/Login")) {

			click(webDriverWait(10, l.getCartregisterLogin()));

		} else if (string.equals("Place Order")) {

			click(webDriverWait(10, checkout.getPlaceOrder()));

		} else if (string.equals("Download Invoice")) {

			click(webDriverWait(10, checkout.getDownloadInvoiceButton()));
		}

		else if (string.equals("Continue")) {

			click(webDriverWait(10, checkout.getContinueButton()));
		}

		else if (string.equals("Continue")) {

			click(webDriverWait(10, checkout.getContinueButton()));
		}

		else if (string.equals("Women")) {

			click(webDriverWait(10, p.getCategoryWomen()));
		}

		else if (string.equals("WomenTops")) {

			click(webDriverWait(10, p.getCategoryWomenTops()));
		}


		else if (string.equals("WomenDress")) {

			click(webDriverWait(10, p.getCategoryWomenDress()));
		}


		else if (string.equals("WomenSaree")) {

			click(webDriverWait(10, p.getCategoryWomenSaree()));
		}


		else if (string.equals("Men")) {

			click(webDriverWait(10, p.getCategoryMen()));
		}

		else if (string.equals("MenTshirts")) {

			click(webDriverWait(10, p.getCategoryMenTshirts()));
		}

		else if (string.equals("MenJeans")) {

			click(webDriverWait(10, p.getCategoryMenJeans()));
		}

		else if (string.equals("Kids")) {

			click(webDriverWait(10, p.getCategoryKids()));
		}

		else if (string.equals("KidsDress")) {

			click(webDriverWait(10, p.getCategoryKidsDress()));
		}

		else if (string.equals("KidsShirts")) {

			click(webDriverWait(10, p.getCategoryKidsShirts()));
		}

		else if (string.equals("MenJeans")) {

			click(webDriverWait(10, p.getCategoryMenJeans()));
		}

		else if (string.equals("Kids")) {

			click(webDriverWait(10, p.getCategoryKids()));
		}

		else if (string.equals("KidsShirts")) {

			click(webDriverWait(10, p.getCategoryKidsShirts()));
		}

		else if (string.equals("KidsDress")) {

			click(webDriverWait(10, p.getCategoryKidsDress()));
		}

		else if (string.equals("POLO")) {

			click(webDriverWait(10, p.getCategoryPOLO()));
		}

		else if (string.equals("H&M")) {

			click(webDriverWait(10, p.getCategoryH_M()));
		}

		else if (string.equals("MADAME")) {

			click(webDriverWait(10, p.getCategoryMadame()));
		}

		else if (string.equals("Mast & Harbour")) {

			click(webDriverWait(10, p.getCategoryMastandHarbour()));
		}

		else if (string.equals("BabyHug")) {

			click(webDriverWait(10, p.getCategoryBabyhug()));
		}

		else if (string.equals("AllenSolly")) {

			click(webDriverWait(10, p.getCategoryAllenSollyJunior()));
		}

		else if (string.equals("KookieKids")) {

			click(webDriverWait(10, p.getCategoryKookieKids()));
		}

		else if (string.equals("Biba")) {

			click(webDriverWait(10, p.getCategoryBiba()));
		}

		else if (string.equals("SubmitReview")) {

			click(webDriverWait(10, product.getReviewSubmit()));
		}

		else if (string.equals("DownArrow")) {

			List<WebElement> loginpage = l.getLoginPageButton();
				
			for(WebElement x: loginpage ) {
				
				if(!x.getAttribute("type").equals("submit")) {
					
					Actions a = new Actions(driver);

					a.sendKeys(Keys.ARROW_DOWN).perform();

					
				}
				
			}
			

				
				
		

		}





	}


	@When("Enter {string}, {string}, {string} and {string} details")
	public void enter_and_details(String string, String string2, String string3, String string4) {

		sendKeys(c.getName(), string);

		sendKeys(c.getEmail(), string2);

		sendKeys(c.getSubject(), string3);

		sendKeys(c.getMessage(), string4);

	}

	@When("Upload file")
	public void upload_file() {

		sendKeys(c.getFileUpload(), "C:\\Users\\Arun\\Downloads\\Sale.png");

	}

	@Then("Verify success message {string} is visible")
	public void verify_success_message_is_visible(String string) {

		if (string.equals("Success! Your details have been submitted successfully.")) {

			Assert.assertTrue(c.getGetSuccessMessageText().isDisplayed());

		} else if (string.equals("You have been successfully subscribed!")) {

			Assert.assertTrue((getText(l.getSubscriptionSuccessText()).equals(string)));
		}

	}

	@Then("Click {string} button and verify that landed to home page successfully")
	public void click_button_and_verify_that_landed_to_home_page_successfully(String string) {

		click(l.getHomeButton());

		Assert.assertTrue(l.getLandedOnHomePage().isDisplayed());

	}

	@Then("Verify user is navigated to test cases page successfully")
	public void verify_user_is_navigated_to_test_cases_page_successfully() {

		Assert.assertTrue(t.getLandedonTestCasedPage().isDisplayed());

		Assert.assertTrue(t.getTestCases().isDisplayed());
	}

	@Then("Verify user is navigated to ALL PRODUCTS page successfully")
	public void verify_user_is_navigated_to_ALL_PRODUCTS_page_successfully() {

		Assert.assertTrue(p.getAllProductsText().isDisplayed());
	}

	@When("Enter product {string} in search box and click search button")
	public void enter_product_in_search_box_and_click_search_button(String string) {

		productName = string;

		sendKeys(p.getProductSearchBox(), string);

		click(p.getProductSearchButton());
	}

	@When("Verify all the products related to search are visible")
	public void verify_all_the_products_related_to_search_are_visible() {

		List<WebElement> listofProducts = p.getListofProducts();

		for (WebElement x : listofProducts) {

			x.getText().matches(("(?i).*\\b(shirt|t-shirt)\\b.*"));

		}

	}

	@When("Scroll down to footer")
	public void scroll_down_to_footer() {

		scrollDown(l.getSubscriptionText());

	}

	@Then("Verify text {string}")
	public void verify_text(String string) {

		if (string.equals("SUBSCRIPTION")) {

			Assert.assertTrue((getText(l.getSubscriptionText()).equals(string)));

		}

	}

	@When("Enter email address {string} in input and click arrow button")
	public void enter_email_address_in_input_and_click_arrow_button(String string) {

		sendKeys(l.getSubscriptionemailTextBox(), string);

		click(l.getSubscriptionButton());
	}

	@When("Click {string} for any product on home page")
	public void click_for_any_product_on_home_page(String string) {

		click(l.getViewProduct().get(0));

	}

	@Then("Verify product detail is opened")
	public void verify_product_detail_is_opened() {

		Assert.assertTrue(product.getProductInformation().isDisplayed());
	}

	@When("Increase quantity to {int}")
	public void increase_quantity_to(int int1) {

		productCount = int1;

		ActionSendKeys(product.getProductQuantity(), String.valueOf(int1));

	}

	@Then("Verify that product is displayed in cart page with exact quantity")
	public void verify_that_product_is_displayed_in_cart_page_with_exact_quantity() {

		String text = getText(product.getCartproductQuanity());

		int valueOf = Integer.valueOf(text);

		Assert.assertTrue(valueOf == productCount);

	}

}
