package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class TestCasedPagePOM extends BaseClass {
	
	public TestCasedPagePOM() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//div[@class='col-sm-9 col-sm-offset-1']//child::b[normalize-space()='Test Cases']")
	private WebElement LandedonTestCasedPage;
	
	@FindBy(xpath="//section[@id='form']//following::u[contains(text(),'Test Case')]")
	private WebElement TestCases;
	


	public WebElement getLandedonTestCasedPage() {
		return LandedonTestCasedPage;
	}

	public WebElement getTestCases() {
		return TestCases;
	}
	
	


}
