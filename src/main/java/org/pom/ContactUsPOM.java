package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class ContactUsPOM extends BaseClass{
	
	
	public ContactUsPOM() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[@class='contact-form']//child::h2[@class='title text-center']")
	public WebElement getinTouchText;
	
	@FindBy(xpath="//form[@id='contact-us-form']//following::input[@name='name']")
	public WebElement name;
	
	@FindBy(xpath="//form[@id='contact-us-form']//following::input[@name='email']")
	public WebElement email;
	
	@FindBy(xpath="//form[@id='contact-us-form']//following::input[@name='subject']")
	public WebElement subject;
	
	@FindBy(xpath="//div[@class='form-group col-md-12']//following::textarea[@name='message']")
	public WebElement message;	
	
	@FindBy(xpath="//div[@class='form-group col-md-12']//following::input[@name='upload_file']")
	public WebElement fileUpload;
	
	@FindBy(xpath="//div[@class='form-group col-md-12']//following::input[@name='submit']")
	public WebElement submit;
	
	@FindBy(xpath="//div[@class='contact-form']//div[@class='status alert alert-success']")
	public WebElement getSuccessMessageText;
	
	

	public WebElement getGetSuccessMessageText() {
		return getSuccessMessageText;
	}

	public WebElement getGetinTouchText() {
		return getinTouchText;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getSubject() {
		return subject;
	}

	public WebElement getMessage() {
		return message;
	}

	public WebElement getFileUpload() {
		return fileUpload;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
