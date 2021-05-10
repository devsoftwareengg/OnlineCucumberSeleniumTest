
Feature: Registration 
Background: 
Given user on the homepage  
And user clicks on Sign in button
 
@RegressionTest
Scenario: Create a New User 
When user fills registration email textbox with "email_address"  
And user clicks create an account button
And user enters the following details
| FirstName | LastName | Password    | Address         | City     | Zip Code | MobilePhone | AddressAlias |
| Chitrali  | Sharma   | Inquiry@1234|Balagere, Varthur| Bangalore|00000    |8105839545   |My Address    |
And user clicks register button
Then validate user firstname and lastname is displayed in dashboard
And user click on signout

@RegressionTest
Scenario Outline: Login with user credentials 
When user enter "<email_address>" and "<password>"
And user click on Signin button.
And user move cursor over Womens link and click on sub menu T-shirts
And Get Name/Text of the first product displayed on the page
And click on Add product to the cart
And Proceed to the checkout page and continue till payments
Then Validate on the payments page if the product details are correct. 

Examples:
	|email_address             |password    |
	|firstname766@gmail.com    |Inquiry@1234|