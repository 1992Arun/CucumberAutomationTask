
@FeebackForm
Feature: Contact us form 

Scenario Outline: Submit query

Given Launch browser and navigate to 'http://automationexercise.com'

When Verify that home page is visible successfully

And Click 'Contact Us' button

Then Verify landed on form and 'GET IN TOUCH' is visible

When Enter "<name>", "<email>", "<subject>" and "<message>" details

And Upload file

And  Click 'Submit' button

And Click 'OK' button

Then Verify success message 'Success! Your details have been submitted successfully.' is visible

And Click 'Home' button and verify that landed to home page successfully

Examples:
|name|email|subject|message|
|John Doe|john.doe@example.com	|Inquiry|I would like more details about your services.|
|Alice Smith|alice.smith@test.com|Feedback|Your website is very user-friendly!|
|Bob Martin|bob.martin@demo.com	|Support Request|	I'm having trouble logging into my account.|
|Emily Brown|emily.brown@mail.com|	Feature Request	|Could you add a dark mode feature?|





