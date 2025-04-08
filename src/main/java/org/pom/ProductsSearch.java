package org.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class ProductsSearch extends BaseClass {
	
	public ProductsSearch()
{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//div[@class='container']//child::button[@id='submit_search']")
	private WebElement productSearchButton;
	
	@FindBy(xpath="//div[@class='container']//child::input[@id='search_product']")
	private WebElement productSearchBox;	
	
	@FindBy(xpath="//div[@class='col-sm-9 padding-right']//child::h2[text()='All Products']")
	private WebElement allProductsText;
	
	@FindBy(xpath="//div[@class='col-sm-9 padding-right']//child::h2[text()='Searched Products']")
	private WebElement searchedProductsText;
	
	@FindBys({@FindBy( xpath="//div[@class='productinfo text-center']//p" )})
	private List<WebElement> listofProducts;
	

	

	public List<WebElement> getListofProducts() {
		return listofProducts;
	}

	public WebElement getAllProductsText() {
		return allProductsText;
	}

	public WebElement getSearchedProductsText() {
		return searchedProductsText;
	}

	public WebElement getProductSearchButton() {
		return productSearchButton;
	}

	public WebElement getProductSearchBox() {
		return productSearchBox;
	}
	
	
	
}
