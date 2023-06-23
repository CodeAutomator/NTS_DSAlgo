@Signin
Feature: SignIn Action

  Scenario: Redirect to Register page
    Given User is on SignIn page
    When User Clicks on Register link
    Then User should be redirected to Register page

  Scenario: To verify SignIn with Empty fields
    Given User is on SignIn page
    When User clicks on login button with all empty field
    Then User verify the message at username as "Please fill out this field."

  Scenario: To verify SignIn with username only
    Given User is on SignIn page
    When User clicks on login button with username as "sdet108Ninja" only
    Then User verify the message at password as "Please fill out this field."

  Scenario: To verify SignIn with password only
    Given User is on SignIn page
    When User clicks on login button with password as "adgnsdet" only
    Then User verify the message at user as "Please fill out this field."

  Scenario Outline: To verify SignIn with invalid "<username>" and "<password>"
    Given User is on SignIn page
    When User enters username as "<username>"
    And User enters password as "<password>"
    And User clicks login button
    Then User verify the message as "Invalid Username and Password"

    Examples: 
      | username | password |
      | zxyu123 | zxyu1234 |
      | abc| 12345678 |
			| NinjaTest | testsquad@ |
			
  Scenario Outline: "User on login page and login with invalid and valid inputs from Excel"
Given The user is on login page
When The user enter sheet "<Sheetname>" and <RowNumber>
Then click login button

 Examples: 
      | Sheetname | RowNumber |
      | signin    |         0 |
      | signin    |         1 |
      | signin    |         2 |
      | signin    |         3 |
 


Scenario:  Verifying signout link
Given The user is in the Home page with valid  log in
When The user clicks "Sign out" 
Then The user redirected to homepage