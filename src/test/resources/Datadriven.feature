

Feature: Datadriven test

Background: 

Given  launch browser and Navigate to url 'http://automationexercise.com'

@Datadriven
Scenario: Create multiple accounts

Given  launch browser and Navigate to url 'http://automationexercise.com'

Then Verify 'home page' is there

When Click on 'Signup / Login'

Then Verify 'Login to your account' is there

When Enter "registration" detail




@DeleteAccounts
Scenario: Delete  accounts


Then Verify 'home page' is there

When Click on 'Signup / Login'

Then Verify 'Login to your account' is there

When Enter "login details" detail

And Click on 'Delete Account'



