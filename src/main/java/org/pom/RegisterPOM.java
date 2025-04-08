package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class RegisterPOM extends BaseClass {
	
	public RegisterPOM(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(css=".title.text-center>b")
	private WebElement EnterAccountInformationText;

	@FindBy(id="id_gender1")
	private WebElement male;
	
	@FindBy(id="id_gender2")
	private WebElement female;
		
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="days")
	private WebElement dobDay;
	
	@FindBy(id="months")
	private WebElement dobMonth;
	
	@FindBy(id="years")
	private WebElement dobYars;
	
	@FindBy(id="newsletter")
	private WebElement signUpForNewsLetter;
	
	@FindBy(id="optin")
	private WebElement receiveSpecialOffer;
	
	@FindBy(id="first_name")
	private WebElement first_name;
	
	@FindBy(id="last_name")
	private WebElement last_name;
	
	@FindBy(id="company")
	private WebElement company;
	
	@FindBy(id="address1")
	private WebElement address1;
	
	@FindBy(id="address2")
	private WebElement address2;
	
	@FindBy(id="country")
	private WebElement country;
		
	@FindBy(id="state")
	private WebElement state;
	
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(css="button[data-qa='signup-button']")
	private WebElement clickSignUp;
	
	
	@FindBy(id="zipcode")
	private WebElement zipcode;
	
	@FindBy(id="mobile_number")
	private WebElement mobile_number;	
	
	@FindBy(css="h2[data-qa='account-created']>b")
	private WebElement accountCreated;
	
	@FindBy(xpath="//div//div//a[@data-qa='continue-button']")
	private WebElement contiune;

	@FindBy(xpath="//form[@method='POST']//following::button[@data-qa='create-account']")
	private WebElement createAccount;
	
	
	
	public WebElement getCreateAccount() {
		return createAccount;
	}

	public WebElement getEnterAccountInformationText() {
		return EnterAccountInformationText;
	}

	public WebElement getMale() {
		return male;
	}

	public void setMale(WebElement male) {
		this.male = male;
	}

	public WebElement getFemale() {
		return female;
	}

	public void setFemale(WebElement female) {
		this.female = female;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getDobDay() {
		return dobDay;
	}

	public void setDobDay(WebElement dobDay) {
		this.dobDay = dobDay;
	}

	public WebElement getDobMonth() {
		return dobMonth;
	}

	public void setDobMonth(WebElement dobMonth) {
		this.dobMonth = dobMonth;
	}

	public WebElement getDobYars() {
		return dobYars;
	}

	public void setDobYars(WebElement dobYars) {
		this.dobYars = dobYars;
	}

	public WebElement getSignUpForNewsLetter() {
		return signUpForNewsLetter;
	}

	public void setSignUpForNewsLetter(WebElement signUpForNewsLetter) {
		this.signUpForNewsLetter = signUpForNewsLetter;
	}

	public WebElement getReceiveSpecialOffer() {
		return receiveSpecialOffer;
	}

	public void setReceiveSpecialOffer(WebElement receiveSpecialOffer) {
		this.receiveSpecialOffer = receiveSpecialOffer;
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public void setFirst_name(WebElement first_name) {
		this.first_name = first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public void setLast_name(WebElement last_name) {
		this.last_name = last_name;
	}

	public WebElement getCompany() {
		return company;
	}

	public void setCompany(WebElement company) {
		this.company = company;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public void setAddress1(WebElement address1) {
		this.address1 = address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public void setAddress2(WebElement address2) {
		this.address2 = address2;
	}

	public WebElement getCountry() {
		return country;
	}

	public void setCountry(WebElement country) {
		this.country = country;
	}

	public WebElement getState() {
		return state;
	}

	public void setState(WebElement state) {
		this.state = state;
	}

	public WebElement getCity() {
		return city;
	}

	public void setCity(WebElement city) {
		this.city = city;
	}

	public WebElement getClickSignUp() {
		return clickSignUp;
	}

	public void setClickSignUp(WebElement clickSignUp) {
		this.clickSignUp = clickSignUp;
	}

	public WebElement getZipcode() {
		return zipcode;
	}

	public void setZipcode(WebElement zipcode) {
		this.zipcode = zipcode;
	}

	public WebElement getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(WebElement mobile_number) {
		this.mobile_number = mobile_number;
	}

	public WebElement getAccountCreated() {
		return accountCreated;
	}

	public void setAccountCreated(WebElement accountCreated) {
		this.accountCreated = accountCreated;
	}

	public WebElement getContiune() {
		return contiune;
	}

	public void setContiune(WebElement contiune) {
		this.contiune = contiune;
	}
	
	
	

}
