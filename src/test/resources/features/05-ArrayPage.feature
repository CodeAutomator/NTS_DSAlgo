@ArrayPage
Feature: validating Array Page

Scenario: user is on homepage
Given The user opens Home Page and enter array page
When The user clicks array
Then The user should be redirected arraypage

Scenario: Validation of Arrays in Python link 
	Given User is on "Array page" after logged in 
	When User clicks on Arrays in Python link 
	Then User should be redirected to "Arrays in Python" page 
	
	Scenario: Validation of Try Here button 
	Given User is on Arrays in Python page after logged in 
	When User clicks on Try Here button in Arrays in Python page 
	Then User should be redirected to a page having an tryEditor with a Run button to test 
	
Scenario: The user is able to run code in tryEditor
Given The user is in the array page after having an tryEditor with a Run button to test
When user enter the Python code | print"array" |
And The user clicks on Run button after Entering valid python code in array tryEditor	
Then The user should be presented with Run output of array page

Scenario: The user is able to run code in tryEditor
Given The user is in the array page 
When user enter the invalidpython code | print array" |
And The user clicks on Run button after Entering invalid python code in array tryEditor	
Then The user should get the error message in array

Scenario: Validation of Arrays Using List link 
	Given User is on Array page after logged in 
	When Clicks on Arrays Using List link 
	Then User should be redirected to Arrays Using List page 
	
	Scenario: Validation of Try Here button 
	Given User is on Arrays Using List after logged in 
	When User clicks on Try Here button in Arrays Using List
	Then User should be redirected to a page having an tryEditor 
	
	Scenario: Validation of valid python code in TryEditor page using Arrays Using List 
	Given User is on Try Editor Page  of phythonlist
	When User enters valid Python code from sheet | print"phython list" |
	And User clicks on Run button for phythonlist
	Then User should be able to see the output of phython list
	
	Scenario: The user is able to run code in tryEditor
Given The user is in the array page array list
When user enter the invalidpython code | print negative array list" |
And The user clicks on Run button after Entering invalid python code for phythonlist
Then The user should get the error message in array list

Scenario: Validation of Basic Operations in Lists link 
	Given User is on Array page after logged in  Basic Operations 
	When User clicks on Basic Operations 
	Then User should be redirected to Basic Operations in Lists page 
	
	Scenario: Validation of valid python code in TryEditor page for Basic Operations in Lists 
	Given User is on Try Editor Page of basic operation in list after logged in 
	When User enters valid Python code from sheet | print"user work on basic operation of list" |
	And User clicks on Run button  of basic operation in list
	Then User should be able to see the output of basic operation in list
	
	Scenario: Validation of valid python code in TryEditor page for Basic Operations in Lists 
	Given User is on Try Editor Page of basic operation in list 
	When User enters valid Python code from sheet | print user work on basic operation of list negative test" |
	And User clicks on Run button  of basic operation 
	Then User should be able to see the output of basic operation 
	
	Scenario: Validation of Applications of Arrays link 
	Given User is on Array  after logged in 
	When User clicks on Applications of Array 
	Then User should be redirected to Applications of Array page 
	
	Scenario: Validation of Practice Questions link 
	Given User is on Application of array page after logged in 
	When User clicks on Practice Questions 
	Then User should be redirected to Practice Questions page
	
	Scenario: Validation of Search the Array link 
	Given User is on Practice page after logged in 
	When User clicks on Search the Array  
	Then User should be redirected to Questions page contains a tryEditor with Run and Submit buttons
	
	Scenario: Validation of valid python code in Practice Questions page for Search for Array link 
	Given User is on Question page of Search the array after logged in 
	When User enters valid Python code from sheet "print”array = array(‘i’,[5,10,15,20,5])”"
	And User clicks on Run button of Practice Questions
	Then User should be able to see the Result Practice Questions
	
	Scenario: Validation of Find Numbers with Even Number of Digits link 
	Given User is on Practice page  after logged in  Find Numbers with Even Number
	When User clicks on Find Numbers with Even Number of Digits link 
	Then User should be redirected to Questions page contains a tryEditor with Run and Submit buttons on Find Numbers with Even Number
	
	Scenario: Validation of Submit button in Practice Questions page for Find Numbers with Even Numbers of Digits link  
	Given User is on Question page of FindNumberswithEvenNumberofDigits after logged in 
	When User enters valid Python code from sheet "print(FindNumberswithEvenNumberofDigits)"
	And User clicks on Submit button for FindNumberswithEvenNumberofDigits
	Then User should get success submission message FindNumberswithEvenNumberofDigits
	
	Scenario: Validation of Squares of a Sorted Array link Squares of a Sorted Array link 
	Given User is on Practice page after logged in Squares of a Sorted Array
	When User clicks on Squares of a Sorted Array link 
	Then User should be redirected to Questions page contains a tryEditor with Run and Submit buttons of Squares of a Sorted Array
	
	Scenario: Validation of Submit button in Practice Questions page for Find Numbers with Even Numbers of Digits link  
	Given User is on "Question" page of "Squares of a Sorted Array" after logged in 
	When User enters valid Python code from sheet "print(Squares of a Sorted Array link )" for the PracticeQuestions	
	And User clicks on Submit button
	Then User should get success submission message