@HomePage
Feature: Launch Start page and Test Home Page

  Scenario: launch the home page of dsalgo portal
    Given user opens the dsalgo portal link
    When user clicks on "Get Started" button
    Then user redirected to home page
    
   Scenario Outline: user is on home page 
   When The user click any of the Get started button "<value>" in home page
   Then It should Alert the user with the message "You are not logged in"
   Examples: 
      | value |  
      | Data Structures-Introduction|
      | Linked List|
      | Stack|
     	| Queue|
      | Tree|
      
	Scenario Outline: User is on Home page and click on dropdown without sign in
	Given The user is on Home page
	When The user clicks on data structure dropdown
	When  The user clicks on dropdown "<option>" without login
	Then The user get warning message "You are not logged in"
	 Examples: 
	      | option|
	      | Arrays|
	      | Linked list|
	      | Stack|
	      | Queue|
	      | Tree|
	      | Graph|

Scenario: User is on Home page and click on sign in
Given The user opens Home Page
When The user clicks Sign in
Then The user should be redirected to Sign in page

Scenario:  User is on Home page and click on Register
Given The user opens Home Page
When The user clicks Register
Then The user should be redirected to Register form

