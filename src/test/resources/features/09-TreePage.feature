@treePage
Feature: User tests the Tree page on the Ds algo application

#Background: The user is logged in to DS Algo portal
  # Given user is on Signin of DS Algo portal
  # When user enters "NinjaTestSquad" and "adgn-stars"  	
  # And  user clicks on login button
  #Then user redirected to Home Page of DsAlgo Portal

  Scenario: User should be able to navigate to Tree Page
Given User is on Home Page of DsAlgo Portal
When User clicks on Tree Get started button
Then User re-directed to Tree Page


  Scenario: The user is able to navigate to "Overview of Trees" page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Overview of Trees link
    Then The user should be directed to the "Overview of Trees" of tree Page


  Scenario: The user is able to navigate to a page having an tryEditor from Overview of Trees page
    Given The user is on the "overview of trees" after logged in
    When The user clicks "Try Here" button in a "tree" page
    Then The user should be redirected to a page having tryEditor with a Run button to test


 Scenario: User enters valid Python code and Presented with Result
Given User is on tryEditor Page
When User enters Valid Python code "print('Hello, World!')" 
And clicks on Run button
Then User is presented with the Result


  Scenario: The user is able to navigate to "Terminologies" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Terminologies button
    Then The user should be directed to the "Terminologies" of tree Page


  Scenario: The user is able to navigate to Terminologies page having an tryEditor
    Given The user is on the "terminologies page" after logged in
    When The user clicks "Try Here" button in a "Terminologies" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test


Scenario: User should be able to enter a invalid Python code and Presented with Error Message
Given User is on tryEditor Page
When User enters  code "print(Tree Terminologies)"
And clicks on Run button 
Then User is presented with Error Message

  Scenario: The user is able to navigate to "Types of Trees" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Types of Trees button
    Then The user should be directed to the "Types of Trees" of tree Page

 
  Scenario: The user is able to navigate to a page having an tryEditor from Types of Trees page
    Given The user is on the "types of trees" after logged in
    When The user clicks "Try Here" button in a "types of tree" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

 

Scenario: User enters valid Python code and Presented with Result
Given User is on tryEditor Page
When User enters Valid Python code "print('Hello, Ninja!')" 
And clicks on Run button
Then User is presented with the Result

 


  Scenario: The user is able to navigate to "Tree Traversals" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Tree Traversals button
    Then The user should be directed to the "Tree Traversals" of tree Page


  Scenario: The user is able to navigate to a page having an tryEditor from Tree Traversals Page
    Given The user is on the "tree traversals" after logged in
    When The user clicks "Try Here" button in a "tree traversals" page 
    Then The user should be redirected to a page having an tryEditor with a Run button to test



Scenario: User should be able to enter a invalid Python code and Presented with Error Message
Given User is on tryEditor Page
When User enters  code "print(Tree Traversals)"
And clicks on Run button 
Then User is presented with Error Message

 
  Scenario: The user is able to navigate to "Traversals illustration" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Traversal illustration button
    Then The user should be directed to the "Traversals-Illustration" of tree Page


  Scenario: The user is able to navigate to a page having an tryEditor from Traversals-Illustration Page
    Given The user is on the "traversal illustration" after logged in
    When The user clicks "Try Here" button in a "traversal illustration" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

 

Scenario: User enters valid Python code and Presented with Result
Given User is on tryEditor Page
When User enters Valid Python code  "print('Tree Traversals-Illustration ')" 
And clicks on Run button
Then User is presented with the Result



  Scenario: The user is able to navigate to "Binary Trees" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Binary Trees button
    Then The user should be directed to the "Binary Trees" of tree Page


  Scenario: The user is able to navigate to a page having an tryEditor from Binary Trees Page
    Given The user is on the "Binary Trees" after logged in
    When The user clicks "Try Here" button in a "Binary Trees" page 
    Then The user should be redirected to a page having an tryEditor with a Run button to test



Scenario: User should be able to enter a invalid Python code and Presented with Error Message
Given User is on tryEditor Page
When User enters  code "print(Binary Trees)"
And clicks on Run button 
Then User is presented with Error Message

 
  Scenario: The user is able to navigate to "Types of Binary Trees" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Types of Binary Trees button
    Then The user should be directed to the "Types of Binary Trees" of tree Page


  Scenario: The user is able to navigate to a page having an tryEditor from Types of Binary Trees Page
    Given The user is on the "Types of Binary Trees" after logged in
    When The user clicks "Try Here" button in a "Types of Binary Trees" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

 

Scenario: User enters valid Python code and Presented with Result
Given User is on tryEditor Page
When User enters Valid Python code  "print('Types of Binary Trees ')" 
And clicks on Run button
Then User is presented with the Result

Scenario: The user is able to navigate to "Practice Questions" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Types of Practice Questions button
    Then The user should be directed to the "Practice Questions" of tree Page
    
