
@multiple
Feature: Verify Test Cases Page

Background:

Given Launch browser and Navigate to url 'http://automationexercise.com'

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


@subscription @sanity
Scenario: Verify Subscription functionality

When Scroll down to footer

Then Verify text 'SUBSCRIPTION'

When  Enter email address "arun@mial.com" in input and click arrow button

Then Verify success message 'You have been successfully subscribed!' is visible


@subscriptionAtCart @sanity
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
|Arun|Male|arun10@mail.com|pass123|23|June|1990|Arun|Sharma|TechCorp|123 Street| Apt 4|India|Delhi|New Delhi|110001|9876543210|

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


@logincheckout @sanity
Scenario: Verify End to End functionlity

When Add products to cart

And Click 'Cart' button

Then Verify 'Cart page' is visible

When  Click 'Proceed To Checkout' button

When Click 'Registe/Login' button

When Enter "correct email address and password" for login

|arun3@mail.com|
|pass123|

And Click on 'login' button

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






@remove @smoke
Scenario: Remove Products From Cart

When Add products to cart

And Click 'Cart' button

Then Verify 'Cart page' is visible

When Click X button and Verify that product is removed from the cart


@Catogoty @Women @Top
Scenario: Verify Women Catogory

And Click 'Products' button

Then Verify user is navigated to ALL PRODUCTS page successfully

And Click 'Women' button

And Click 'WomenTops' button

Then Verify 'Women - Tops Products' is visible

Then Verify 'Top' is visible



@Catogoty @Women @WomenDress
Scenario: Verify Women Catogory

And Click 'Products' button

Then Verify user is navigated to ALL PRODUCTS page successfully

And Click 'Women' button

And Click 'WomenDress' button

Then Verify 'Women - Dress Products' is visible

Then Verify 'Dress' is visible


@Catogoty @Women @Saree
Scenario: Verify Women Catogory

And Click 'Products' button

Then Verify user is navigated to ALL PRODUCTS page successfully

And Click 'Women' button

And Click 'WomenSaree' button

Then Verify 'Women - Saree Products' is visible

Then Verify 'Saree' is visible



@Catogoty @Men @Tshirts
Scenario: Verify Men Catogory

And Click 'Products' button

Then Verify user is navigated to ALL PRODUCTS page successfully

And Click 'Men' button

And Click 'MenTshirts' button

Then Verify 'Men - Tshirts Products' is visible

Then Verify 'Tshirts' is visible


@Catogoty @Men @Jeans
Scenario: Verify Men Catogory

And Click 'Products' button

Then Verify user is navigated to ALL PRODUCTS page successfully

And Click 'Men' button

And Click 'MenJeans' button

And Click 'Men - Jeans Products' button

Then Verify 'Jeans' is visible



@Catogoty @Kids @KidsDress
Scenario: Verify Kids Catogory

And Click 'Products' button

Then Verify user is navigated to ALL PRODUCTS page successfully

And Click 'Kids' button

And Click 'KidsDress' button

Then Verify 'Kids - Dress Products' is visible



@Catogoty @Kids @Shirts
Scenario: Verify Kids Catogory

And Click 'Products' button

Then Verify user is navigated to ALL PRODUCTS page successfully

And Click 'Kids' button

And Click 'KidsShirts' button

Then Verify 'Kids - Tops & Shirts Products' is visible



@Catogoty @Brands @POLO

Scenario: Verify POLO Catogory

And Click 'Products' button

Then Verify user is navigated to ALL PRODUCTS page successfully

And Click 'POLO' button

Then Verify 'Brand - Polo Products' is visible



@Catogoty @Brands @H&M

Scenario: Verify H&M Catogory

And Click 'Products' button

Then Verify user is navigated to ALL PRODUCTS page successfully

And Click 'H&M' button

Then Verify 'Brand - H&M Products' is visible



@Catogoty @Brands @Madame

Scenario: Verify MADAME Catogory

And Click 'Products' button

Then Verify user is navigated to ALL PRODUCTS page successfully

And Click 'MADAME' button

Then Verify 'Brand - Madame Products' is visible



@Catogoty @Brands @MastHarbour

Scenario: Verify Mast & Harbour Catogory

And Click 'Products' button

Then Verify user is navigated to ALL PRODUCTS page successfully

And Click 'Mast & Harbour' button

Then Verify 'Brand - Mast & Harbour Products' is visible


@Catogoty @Brands @BabyHug

Scenario: Verify BabyHug Catogory

And Click 'Products' button

Then Verify user is navigated to ALL PRODUCTS page successfully

And Click 'BabyHug' button

Then Verify 'Brand - Babyhug Products' is visible


@Catogoty @Brands @AllenSolly

Scenario: Verify AllenSolly Catogory

And Click 'Products' button

Then Verify user is navigated to ALL PRODUCTS page successfully

And Click 'AllenSolly' button

Then Verify 'Brand - Allen Solly Junior Products' is visible



@Catogoty @Brands @KookieKids

Scenario: Verify KookieKids Catogory

And Click 'Products' button

Then Verify user is navigated to ALL PRODUCTS page successfully

And Click 'KookieKids' button

Then Verify 'Brand - Kookie Kids Products' is visible


@Catogoty @Brands @Biba

Scenario: Verify Biba Catogory

And Click 'Products' button

Then Verify user is navigated to ALL PRODUCTS page successfully

And Click 'Biba' button

Then Verify 'Brand - Biba Products' is visible


@Review @smoke
Scenario: Verify writring Review functionality

When Click 'View Product' for any product on home page

Then Verify product detail is opened 

When Enter "Name" 

When Enter "emailAddress" 

And Enter "review"

And Click "SubmitReview" button

Then Verify "Thank you for your review." is visible



@ScrollArrowDown
Scenario: Verify ScrollDown with ARROW key

When Scroll down page to bottom

Then Verify "Subscription" is visible

When  Click on arrow at bottom right side to move upward

Then Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen




@AddRecommendedItems @smoke
Scenario: Verify Add to cart from Recommended items

When Scroll down to recommended items

Then Verify "RECOMMENDED ITEMS" is visible

When Click on 'Add To Cart' on Recommended product

And Click 'Cart' button

Then Verify that product is displayed in cart page









