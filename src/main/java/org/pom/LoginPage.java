package org.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends org.utility.BaseClass {

	public LoginPage(){

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//div[@class='signup-form']//child::h2[text()='New User Signup!']")
	public WebElement signupToAccountisVisible;
	
	
	@FindBys({@FindBy(xpath="//div[@id='recommended-item-carousel']//following::div[@class='item active']//following::i[@class='fa fa-shopping-cart'] ")})
	public List<WebElement> recommendedItemAddToCart;
	
	@FindBys({@FindBy(xpath="//div[@class='item active']//child::div[ @class ='col-sm-4']//p")})
	public List<WebElement> recommendedItemName;

	@FindBy(xpath="//div[@class='form-row']//following::div[@class='alert-success alert']")
	public WebElement subscriptionSuccessText;

	@FindBy(xpath="//div[@class='login-form']//child::h2[text()='Login to your account']")
	public WebElement LoginToAccount;

	@FindBy(xpath="//ul[@class='nav navbar-nav']//following::a[contains(@style,'orange')]")
	public WebElement LandedOnHomePage;

	@FindBy(xpath="//ul[@class='nav navbar-nav']//following::a[contains(@href,'cart') and @style='color: orange;']")
	public WebElement LandedOnCartPage;	
	
	@FindBy(xpath="//ul[@class='nav navbar-nav']//following::a[contains(text(),'Test Cases')]")
	public WebElement testCasesButton;

	@FindBy(xpath="//ul[@class='nav navbar-nav']//following::a[contains(text(),' Products')]")
	public WebElement productsButton;

	@FindBy(xpath="//ul[@class='nav navbar-nav']//following::a[contains(text(),'Cart')]")
	public WebElement cartButton;

	@FindBy(xpath="//ul[@class='nav navbar-nav']//following::a[contains(text(),'Signup / Login')]")
	public WebElement singupButton;

	@FindBy(xpath="//ul[@class='nav navbar-nav']//following::a[contains(text(),' Contact us')]")
	public WebElement contactUs;

	@FindBy(xpath="//ul[@class='nav navbar-nav']//following::a[contains(text(),'Signup / Login')]")
	public WebElement singinButton;

	@FindBy(xpath="//ul[@class='nav navbar-nav']//following::a[contains(text(),' Logged in as ')]")
	public WebElement singedAs;

	@FindBy(xpath="//form[@method='POST']//child::input[@data-qa='login-email']")
	public WebElement loginEmail;

	@FindBy(xpath="//form[@method='POST']//child::input[@data-qa='login-password']")
	public WebElement loginPassword;

	@FindBy(xpath="//form[@method='POST']//child::button[@data-qa='login-button']")
	public WebElement loginButton;

	@FindBy(xpath="//ul[@class='nav navbar-nav']//following::a[contains(text(),' Logout')]")
	public WebElement logoutButton;

	@FindBy(xpath="//ul[@class='nav navbar-nav']//following::a[contains(text(),'Home')]")
	public WebElement homeButton;

	public WebElement getHomeButton() {
		return homeButton;
	}


	@FindBy(xpath="//ul[@class='nav navbar-nav']//following::a[contains(text(),' Delete Account')]")
	public WebElement deleteAccount;

	@FindBy(xpath="//div[@class='col-sm-9 col-sm-offset-1']//child::b[text()='Account Deleted!']")
	public WebElement deleteAccountConfirmationText;	

	@FindBy(xpath="//div[@class='signup-form']//child::input[@data-qa='signup-name']")
	public WebElement enterSignUpName;

	@FindBy(xpath="//div[@class='signup-form']//child::input[@data-qa='signup-email']")
	public WebElement enterSignUpEmail;

	@FindBy(xpath="//div[@class='signup-form']//child::button[@data-qa='signup-button']")
	public WebElement enterSignUpButton;

	@FindBy(xpath="//div[@class='pull-right']//child::a[@data-qa='continue-button']")
	public WebElement continueButton;

	@FindBy(xpath="//div[@class='modal-footer']//child::button[@data-dismiss='modal']")
	public WebElement continueShopping;

	@FindBy(xpath="//input[@name='form_type']//following::p[contains(text(),'Email Address already exist!')]")
	public WebElement emailAlreadyExist;

	@FindBy(xpath="//div[@class='login-form']//following::p[contains(text(),'Your email or password is ')]")
	public WebElement invalidCredentialsText;

	@FindBy(xpath="//div[@class='login-form']//following::b[contains(text(),'Enter Account Information')]")
	public WebElement enterAccountInformationText;


	@FindBy(xpath="//div[@class='single-widget']//h2")
	public WebElement subscriptionText;

	@FindBy(xpath="//section[@id='do_action']//following::a[contains(text(),'Proceed To Checkout')]")
	public WebElement proceedToCheckout;

	@FindBy(xpath="//form[@class='searchform']//following::input[@id='susbscribe_email']")
	public WebElement subscriptionemailTextBox;


	@FindBy(xpath="//form[@class='searchform']//descendant::button[@id='subscribe']")
	public WebElement subscriptionButton;

	@FindBy(xpath="//div[@id='cartModal']//following::div[@class='product-information']")
	public WebElement productInformation;
	
	@FindBy(css="div[class='adpub-drawer-root']")
	public static WebElement parentShadowRoot;
	
	@FindBy(css="div[@id='hd-control-bar']>button[id='hd-close-button']")
	public WebElement addCloseButton;
	
	@FindBy(xpath="//a[@id='scrollUp']//child::i[@class='fa fa-angle-up']")
	public WebElement bottomUpArrowButton;

	
	@FindBy(xpath="//div[@class='item active']//following::h2[contains(text(),'Full-Fledged')]")
	public WebElement heroImageText;
	
	@FindBy(xpath="//a[@class='right recommended-item-control']//following::i[@class='fa fa-angle-right']")
	public WebElement recommendedProductForwardButton;
	
	@FindBy(xpath="//div[@class='recommended_items']//following::h2[text()='recommended items']")
	public WebElement recommendedItems;
	
	@FindBys({@FindBy(xpath="//button[@type]")})
	public List<WebElement> loginPageButton;
	

	public WebElement getRecommendedItems() {
		return recommendedItems;
	}


	public WebElement getRecommendedProductForwardButton() {
		return recommendedProductForwardButton;
	}


	public List<WebElement> getLoginPageButton() {
		return loginPageButton;
	}


	
	public List<WebElement> getRecommendedItemAddToCart() {
		return recommendedItemAddToCart;
	}


	public WebElement getHeroImageText() {
		return heroImageText;
	}


	public WebElement getBottomUpArrowButton() {
		return bottomUpArrowButton;
	}


	public List<WebElement> getRecommendedItemName() {
		return recommendedItemName;
	}


	public static WebElement addCloseButton() {
		
		WebElement parentShadowRoot2 = getParentShadowRoot();
		
		SearchContext shadowRoot = parentShadowRoot2.getShadowRoot();
		
		return shadowRoot.findElement(By.cssSelector("button[id='hd-close-button']"));
		
	}

	@FindBys({@FindBy(xpath="//div[@class='choose']//following::a")})
	private List<WebElement> ViewProduct;

	@FindBys({@FindBy(xpath="//div[@class='productinfo text-center']//descendant::a [not (ancestor::div[@class='product-overlay'])]")})
	private List<WebElement> ProductsaddtoCart;

	@FindBys({@FindBy(xpath="//div[@class='productinfo text-center']//descendant::a [not (ancestor::div[@class='product-overlay'])]//parent::div//p")})
	private List<WebElement> Productname;
	
	
	
	

	public static List<WebElement> product(String value) {

		String path="";

		List<WebElement> findElements = null ;

		if(value.contentEquals("cart")) {

			path = "//div[@class='productinfo text-center']//descendant::a [(ancestor::div[@class='product-overlay'])]";

				findElements = driver.findElements(By.xpath(path));

		} else if(value.contentEquals("price")){

			findElements = driver.findElements(By.xpath("//div[@class='productinfo text-center']//h2"));

		} else if(value.contentEquals("name")){

			findElements = driver.findElements(By.xpath("//div[@class='productinfo text-center']//p[normalize-space()]"));

		}

		return findElements;
	}


	public static WebElement selectproduct(int num) {

		return driver.findElement(By.xpath("//div[@class='productinfo text-center']//child::a[@data-product-id='"+num+"']"));
	}



	public static String getproductText(int num, String value) {


		if(value.equalsIgnoreCase("price")) {

			String st1 = driver.findElement(By.xpath( "((//div[@class='productinfo text-center'])//h2[1])["+num+"]")).getText();

			String[] split = st1.split(" ");

			value = split[1];

		} else if(value.equalsIgnoreCase("name")) {

			value = driver.findElement(By.xpath( "((//div[@class='productinfo text-center'])//p[1])["+num+"]")).getText();



		}




		return value;
	}



	@FindBy(xpath="//div[@class='modal-content']//following::a[normalize-space()='Register / Login']")
	public WebElement CartregisterLogin;
	
	
	


	public List<WebElement> getProductname() {
		return Productname;
	}

	public static WebElement getParentShadowRoot() {
		return parentShadowRoot;
	}


	public WebElement getAddCloseButton() {
		return addCloseButton;
	}


	public WebElement getCartregisterLogin() {
		return CartregisterLogin;
	}

	public List<WebElement> getProductsaddtoCart() {
		return ProductsaddtoCart;
	}

	public WebElement getContinueShopping() {
		return continueShopping;
	}

	public WebElement getProceedToCheckout() {
		return proceedToCheckout;
	}

	public WebElement getProductInformation() {
		return productInformation;
	}

	public List<WebElement> getViewProduct() {
		return ViewProduct;
	}

	public WebElement getSubscriptionText() {
		return subscriptionText;
	}

	public WebElement getSubscriptionemailTextBox() {
		return subscriptionemailTextBox;
	}

	public WebElement getCartButton() {
		return cartButton;
	}

	public WebElement getSubscriptionButton() {
		return subscriptionButton;
	}

	public WebElement getTestCasesButton() {
		return testCasesButton;
	}

	
	public WebElement getInvalidCredentialsText() {
		return invalidCredentialsText;
	}

	public WebElement getProductsButton() {
		return productsButton;
	}

	public WebElement getEnterAccountInformationText() {
		return enterAccountInformationText;
	}

	public WebElement getEmailAlreadyExist() {
		return emailAlreadyExist;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getEnterSignUpButton() {
		return enterSignUpButton;
	}

	public WebElement getEnterSignUpName() {
		return enterSignUpName;
	}

	public WebElement getEnterSignUpEmail() {
		return enterSignUpEmail;
	}



	public WebElement getSubscriptionSuccessText() {
		return subscriptionSuccessText;
	}

	public WebElement getSignupToAccountisVisible() {
		return signupToAccountisVisible;
	}

	public WebElement getDeleteAccountConfirmationText() {
		return deleteAccountConfirmationText;
	}

	public WebElement getDeleteAccount() {
		return deleteAccount;
	}


	public WebElement getLandedOnCartPage() {
		return LandedOnCartPage;
	}

	public WebElement getContactUs() {
		return contactUs;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getSingedAs() {
		return singedAs;
	}

	public WebElement getLoginToAccount() {
		return LoginToAccount;
	}

	public WebElement getLandedOnHomePage() {
		return LandedOnHomePage;
	}

	public void setLandedOnHomePage(WebElement landedOnHomePage) {
		LandedOnHomePage = landedOnHomePage;
	}

	public WebElement getSingupButton() {
		return singupButton;
	}

	public void setSingupButton(WebElement singupButton) {
		this.singupButton = singupButton;
	}

	public WebElement getSinginButton() {
		return singinButton;
	}

	public void setSinginButton(WebElement singinButton) {
		this.singinButton = singinButton;
	}

	public WebElement getLoginEmail() {
		return loginEmail;
	}

	public void setLoginEmail(WebElement loginEmail) {
		this.loginEmail = loginEmail;
	}

	public WebElement getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(WebElement loginPassword) {
		this.loginPassword = loginPassword;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}




}
