@StackPage
Feature: performing Stack

Scenario: user is on homepage
Given The user opens Home Page and try enter stack page
When The user clicks stack
Then The user should be redirected stackpage

Scenario: The user is able to navigate to "Operations in Stack" page
Given The user is on the Stack page after logged in
When The user clicks on the Operations in Stack link
Then The user should then be directed to "Operations in Stack" Page

Scenario: The user is able to navigate to a page having an tryEditor
Given The user is on the "Operations in Stack page" after logged in
When The user clicks "Try Here" button in "stack" page
Then The user should be redirected to a page having an tryEditor with a Run button to test

Scenario: The user is able to run code in tryEditor
Given The user is in the Stack page after having an tryEditor with a Run button to test
When user enter the Python code | print"stack" |
And The user clicks on Run button after Entering valid python code in stack tryEditor	
Then The user should be presented with Run output of stack page

Scenario: The user is able to run code in tryEditor
Given The user is in the Stack page 
When user enter the invalidpython code | print stack" |
And The user clicks on Run button after Entering invalid python code in stack tryEditor	
Then The user should get the error message

Scenario: The user is able to navigate to "Practice Questions" in stack Page
Given The user is on the Stack  after logged in
When The user clicks on the Practice Questions button
Then The user should be redirected to Practice Questions page