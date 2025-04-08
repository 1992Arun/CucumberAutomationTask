
@multiple
Feature: Verify Test Cases Page

Background:

Given Launch browser and Navigate to 'http://automationexercise.com'

And Verify that home page is visible successfully

@TestCases
Scenario: Verify Test Cases Page options are available

And Click 'Test Cases' button

Then  Verify user is navigated to test cases page successfully



@productsSearch
Scenario: Verify product search functionality

And Click 'Products' button

Then Verify user is navigated to ALL PRODUCTS page successfully

When Enter product "Top" in search box and click search button

And Verify 'SEARCHED PRODUCTS' is visible

And Verify all the products related to search are visible


@subscription
Scenario: Verify Subscription functionality

When Scroll down to footer

Then Verify text 'SUBSCRIPTION'

When  Enter email address "arun@mial.com" in input and click arrow button

Then Verify success message 'You have been successfully subscribed!' is visible


@subscriptionAtCart
Scenario: Verify Subscription functionality

When Click 'Cart' button

When Scroll down to footer

Then Verify text 'SUBSCRIPTION'

When  Enter email address "arun@mial.com" in input and click arrow button

Then Verify success message 'You have been successfully subscribed!' is visible


@AddtoCartQuantity @sanity
Scenario: Verify AddTocart product quantity

When Click 'View Product' for any product on home page

Then Verify product detail is opened

When Increase quantity to 4

And Click 'Add to cart' button

And Click 'View Cart' button

Then Verify that product is displayed in cart page with exact quantity



@registercheckout @sanity
Scenario: Verify End to End functionlity

When Add products to cart

And Click 'Cart' button

Then Verify 'Cart page' is visible

When  Click 'Proceed To Checkout' button

When Click 'Registe/Login' button

And Enter Registration details

|Name|Gender| Email| Password| Date|Month|Year|First name|Last name|Company|Address|Address2|Country|State|City|Zipcode|Mobile Number|
|Arun|Male|arun3@mail.com|pass123|23|June|1990|Arun|Sharma|TechCorp|123 Street| Apt 4|India|Delhi|New Delhi|110001|9876543210|

And Verify "ACCOUNT CREATED!" is visible

When Click 'Continue' button  

Then Verify 'Logged in as username' at top

When Click 'Cart' button

And  Click 'Proceed To Checkout' button

Then Verify Address Details and Review Your Order

And Enter description in comment text area and 

When Click 'Place Order' button

And Enter payment details: Name on Card, Card Number, CVC, Expiration date

And  Click 'Pay and Confirm Order' button and Verify success message 'Your order has been placed successfully!' is visible

When Verify "Order Placed!" is visible

And Click 'Download Invoice' button

And Click 'Continue' button

When Click on 'Delete Account' button

Then Verify "ACCOUNT DELETED!" is visible

And Click on 'Continue' button

