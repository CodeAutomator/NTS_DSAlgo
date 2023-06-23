@DataStructurePage
Feature: performing Data Structures-Introduction

	Scenario: The user is logged in to DS Algo portal
	
	    Given The user is on Signin page of DS Algo portal
	    Then The user click on signinbtn
	    When The user enter valid "NinjaTestSquad" and "adgn-stars"
	    And The user click on login button
	    Then The user redirected to homepage
	    
	Scenario: The user is able to navigate to Data Structure introduction page
	When  The user clicks the "Getting Started" button in Data Structure Page introduction Panel
	
	Scenario: The user is able to navigate to Time Complexity page
	Given  The user is on the "Data Structures Introduction" after logged in
	When The user clicks Time Complexity link
	Then The user should be redirected to "Time Complexity" page
	
	Scenario: The user is able to navigate to a page having an tryEditor from Time Complexity page
	Given The user is on the "Time Complexity" after logged in
	When The user clicks "Try Here" button on "Time Complexity" page
	
	Scenario: The user is able to run code in tryEditor for Time Complexity page
    Given The user is in page having an tryEditor with a Run button to test
   	When user enter the Python code | print"DataStructure Introduction" |
    And The user clicks on Run button
    Then The user should be presented with Run output
    
  Scenario: The user is presented with error message for code with invalid syntax in tryEditor for Time Complexity page
  Given The user is in a page having an tryEditor 
  When  user enter the  code | print DataStructure Introduction" |
  And The user clicks on button
  Then The user should be presented with error message