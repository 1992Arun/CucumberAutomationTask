package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class ProductDetails extends BaseClass {
	
	public ProductDetails() {
		
		PageFactory.initElements(driver, this);

	}

	
	@FindBy(xpath="//div[@id='cartModal']//following::div[@class='product-information']")
	public WebElement productInformation;
	
	
	@FindBy(xpath="//span//button[@class='btn btn-default cart']")
	public WebElement addToCart;
	
	
	@FindBy(xpath="//div[@class='modal-content']//following::u[contains(text(),'View Cart')]")
	public WebElement productAddedViewCart;
	
	@FindBy(xpath="//tr[@id='product-1']//following::button[@class='disabled']")
	public WebElement CartproductQuanity;
	
	
	public WebElement getCartproductQuanity() {
		return CartproductQuanity;
	}


	@FindBy(xpath="//span//input[@id='quantity']")
	public WebElement productQuantity;
	
	
	
	public WebElement getProductAddedViewCart() {
		return productAddedViewCart;
	}



	public WebElement getProductQuantity() {
		return productQuantity;
	}



	public WebElement getAddToCart() {
		return addToCart;
	}



	public WebElement getProductInformation() {
		return productInformation;
	}
	
}
