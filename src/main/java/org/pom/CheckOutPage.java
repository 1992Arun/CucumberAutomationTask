package org.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class CheckOutPage extends BaseClass {
	
	public CheckOutPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//ul[@id='address_delivery']//child::li[@class='address_firstname address_lastname']")
	private WebElement deliveryFirstName;
	
	@FindBys({@FindBy(xpath="//ul[@id='address_delivery']//child::li[@class='address_address1 address_address2']")})
	private List<WebElement> deliveryAddress1;
	
	@FindBy(xpath="//div[@class='col-sm-9 col-sm-offset-1']//following::h2[@data-qa='order-placed']")
	public WebElement orderPlacedText;	
	
	@FindBy(xpath="//ul[@id='address_delivery']//child::li[@class='address_city address_state_name address_postcode']")
	private WebElement deliveryStateCityZip;
	
	@FindBy(xpath="//ul[@id='address_delivery']//child::li[@class='address_country_name']")
	private WebElement country;
	
	@FindBy(xpath="//ul[@id='address_delivery']//child::li[@class='address_phone']")
	private WebElement phone;
	
	@FindBys({@FindBy(xpath="//tr//td[@class='cart_description']//child::a[not(@class='google-anno')]")})
	private List<WebElement> cartProductName;
	
	@FindBys({@FindBy(xpath="//tr//td[@class='cart_price']//child::p")})
	private List<WebElement> cartProductPrice;
	
	
	@FindBy(xpath="//div[@id='ordermsg']//following::textarea")
	private WebElement checkoutComment;
	
	@FindBy(xpath="//div[@id='ordermsg']//following::a[text()='Place Order']")
	private WebElement placeOrder;
	
	
	@FindBy(xpath="//form[@id='payment-form']//following::input[@name='name_on_card']")
	private WebElement CardName;
	
	@FindBy(xpath="//form[@id='payment-form']//following::input[@name='card_number']")
	private WebElement CardNumber;
	
	@FindBy(xpath="//form[@id='payment-form']//following::input[@name='cvc']")
	private WebElement cVC;
	
	@FindBy(xpath="//form[@id='payment-form']//following::input[@name='expiry_month']")
	private WebElement expiryMonth;
	
	@FindBy(xpath="//form[@id='payment-form']//following::input[@name='expiry_year']")
	private WebElement expiryYear;
	
	@FindBy(xpath="//div[@class='form-row']//following::button[@id='submit']")
	private WebElement payAndConfirmOrder;
	
	
	@FindBy(xpath="//div[@class='form-row']//child::div[@class='alert-success alert']")
	private WebElement orderSuccessMessage;
	
	@FindBy(xpath="//div[@class='col-sm-9 col-sm-offset-1']//following::b[normalize-space()='Order Placed!']")
	private WebElement orderPlacedMessage;
	
	@FindBy(xpath="//div[@class='col-sm-9 col-sm-offset-1']//following::a[normalize-space()='Download Invoice']")
	private WebElement downloadInvoiceButton;
	
	@FindBy(xpath="//div[@class='col-sm-9 col-sm-offset-1']//following::a[normalize-space()='Continue']")
	private WebElement continueButton;
	
	@FindBy(xpath="(//td[@class='cart_delete']//following::a[@class='cart_quantity_delete'])[position()=1]")
	private WebElement removeFromCart;
	
	@FindBy(xpath="//span[@id='empty_cart']//following::b")
	private WebElement cartIsEmpty;
	
	

	public WebElement getCartIsEmpty() {
		return cartIsEmpty;
	}

	public WebElement getOrderPlacedText() {
		return orderPlacedText;
	}

	public WebElement getRemoveFromCart() {
		return removeFromCart;
	}

	public WebElement getOrderPlacedMessage() {
		return orderPlacedMessage;
	}

	public WebElement getDownloadInvoiceButton() {
		return downloadInvoiceButton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getCardName() {
		return CardName;
	}

	public WebElement getCardNumber() {
		return CardNumber;
	}

	public WebElement getcVC() {
		return cVC;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getPayAndConfirmOrder() {
		return payAndConfirmOrder;
	}

	public WebElement getOrderSuccessMessage() {
		return orderSuccessMessage;
	}

	public WebElement getCheckoutComment() {
		return checkoutComment;
	}

	public WebElement getPlaceOrder() {
		return placeOrder;
	}

	public List<WebElement> getCartProductName() {
		return cartProductName;
	}

	public List<WebElement> getCartProductPrice() {
		return cartProductPrice;
	}

	public WebElement getDeliveryFirstName() {
		return deliveryFirstName;
	}

	public List<WebElement> getDeliveryAddress1() {
		return deliveryAddress1;
	}

	

	public WebElement getDeliveryStateCityZip() {
		return deliveryStateCityZip;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getPhone() {
		return phone;
	}

	
	
	

}
