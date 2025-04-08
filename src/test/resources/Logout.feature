Feature: Logout Functionality

Background:

Given Launch browser and Navigate to url 'http://automationexercise.com'

Scenario: Verify that the logout fuction is working


Then Verify 'home page' is visible

When Click on 'Signup / Login' button

Then Verify 'Login to your account' is visible

When Enter "correct email address and password"

And Click on 'login' button

Then Verify 'Logged in as username' is visible

When Click on 'Logout' button

Then Verify "Login to your account" is visible


@CereateAccount @smoke
Scenario: Verify Register functionality

When Click on 'Signup / Login' button

Then Verify "New User Signup!" is visible

And Enter "name and email address"

And Click on "Signup" button

And Verify "ENTER ACCOUNT INFORMATION" is visible

And Fill details: Title, Name, Email, Password, Date of birth

And Select checkbox "Sign up for our newsletter!"

And Select checkbox "Receive special offers from our partners!"

And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number

And Click on "Create Account button" button

And Verify "ACCOUNT CREATED!" is visible






 
@Validlogin @smoke
Scenario: Verify Login User with correct email and password

Then Verify 'home page' is visible

When Click on 'Signup / Login' button

Then Verify 'Login to your account' is visible

When Enter "correct email address and password"

And Click on 'login' button

Then Verify 'Logged in as username' is visible

When Click on 'Delete Account' button

Then Verify "ACCOUNT DELETED!" is visible

And Click on 'Continue' button



@delete
Scenario: Delete existing accounts

Then Verify 'home page' is visible

When Click on 'Signup / Login' button

Then Verify 'Login to your account' is visible

When Enter "any email address and password"

And Click on 'login' button

Then Verify "invalid Credentials" is visible

And Click on 'Delete Account' button


