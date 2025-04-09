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
	
	@FindBy(xpath="//div[@class='panel-group category-products']//following::a[normalize-space()='Women']")
	private WebElement categoryWomen;
	
	
	@FindBy(xpath="//div[@class='panel-group category-products']//following::a[normalize-space()='Men']")
	private WebElement categoryMen;
	
	@FindBy(xpath="//div[@class='panel-group category-products']//following::a[normalize-space()='Kids']")
	private WebElement categoryKids;
	
	@FindBy(xpath="//div[@id='Women']//descendant::a[normalize-space()='Dress']")
	private WebElement categoryWomenDress;
	
	@FindBy(xpath="//div[@id='Women']//descendant::a[normalize-space()='Tops']")
	private WebElement categoryWomenTops;

	@FindBy(xpath="//div[@id='Women']//descendant::a[normalize-space()='Saree']")
	private WebElement categoryWomenSaree;
	
	@FindBy(xpath="//div[@id='Men']//descendant::a[normalize-space()='Tshirts']")
	private WebElement categoryMenTshirts;
	
	@FindBy(xpath="//div[@id='Men']//descendant::a[normalize-space()='Jeans']")
	private WebElement categoryMenJeans;
	
	
	@FindBy(xpath="//div[@id='Kids']//descendant::a[normalize-space()='Dress']")
	private WebElement categoryKidsDress;
	
	@FindBy(xpath="//div[@id='Kids']//descendant::a[normalize-space()='Tops & Shirts']")
	private WebElement categoryKidsShirts;
	
	@FindBy(xpath="//div[@class='features_items']//following::h2")
	private WebElement WomenDressProductsText;
	
	@FindBy(xpath="//div[@class='features_items']//following::h2[normalize-space()='Women - Tops Products']")
	private WebElement WomenTopsProductsText;
	
	@FindBy(xpath="//div[@class='features_items']//following::h2[contains(text(),'Women')]")
	private WebElement WomenTopsSareeText;
	
	
	@FindBy(xpath="//div[@class='features_items']//following::h2[normalize-space()='Men - Jeans Products']")
	private WebElement MenJeansProductText;
	
	
	@FindBy(xpath="//div[@class='features_items']//following::h2[normalize-space()='Men - Tshirts Products']")
	private WebElement MenTShirtProductText;
	
	
	@FindBy(xpath="//div[@class='features_items']//child::h2[normalize-space()='Kids - Tops & Shirts Products']")
	private WebElement KidsTopsShirtsProducts;
	
	@FindBy(xpath="//div[@class='features_items']//child::h2[normalize-space()='Kids - Dress Products']")
	private WebElement KidsDressProducts;
	
	
	
	public WebElement getKidsTopsShirtsProducts() {
		return KidsTopsShirtsProducts;
	}

	public WebElement getKidsDressProducts() {
		return KidsDressProducts;
	}

	public WebElement getMenJeansProductText() {
		return MenJeansProductText;
	}

	public WebElement getMenTShirtProductText() {
		return MenTShirtProductText;
	}

	public WebElement getWomenDressProductsText() {
		return WomenDressProductsText;
	}

	public WebElement getWomenTopsProductsText() {
		return WomenTopsProductsText;
	}

	public WebElement getWomenTopsSareeText() {
		return WomenTopsSareeText;
	}

	public WebElement getCategoryKidsDress() {
		return categoryKidsDress;
	}

	public WebElement getCategoryKidsShirts() {
		return categoryKidsShirts;
	}

	public WebElement getCategoryMenTshirts() {
		return categoryMenTshirts;
	}

	public WebElement getCategoryMenJeans() {
		return categoryMenJeans;
	}

	public WebElement getCategoryWomenDress() {
		return categoryWomenDress;
	}

	public WebElement getCategoryWomenTops() {
		return categoryWomenTops;
	}

	public WebElement getCategoryWomenSaree() {
		return categoryWomenSaree;
	}

	public WebElement getCategoryWomen() {
		return categoryWomen;
	}

	public WebElement getCategoryMen() {
		return categoryMen;
	}

	public WebElement getCategoryKids() {
		return categoryKids;
	}

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
